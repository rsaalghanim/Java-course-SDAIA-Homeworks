package HW4;

import HW4.Employee;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeDAO {

    private static final   String URL = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\untitled9\\src\\main\\java\\HW4\\hr.db";
    private static final String INSERT_EMP = "insert into employees values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SELECT_ONE_EMP = "select * from employees where employee_id = ?";
    private static final String SELECT_ALL_EMPS = "select * from employees";
    private static final String UPDATE_EMP = "update employees set email = ?, salary = ? where employee_id = ?";
    private static final String DELETE_EMP = "delete from employees where employee_id = ?";


    public void InsertEmp(Employee e) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(INSERT_EMP);
        st.setInt(1, e.getEmployee_id());
        st.setString(2, e.getFirst_name());
        st.setString(3, e.getLast_name());
        st.setString(4, e.getEmail());
        st.setString(5, e.getNumber());
        st.setString(6, e.getHire_date());
        st.setInt(7, e.getJob_id());
        st.setDouble(8,e.getSalary());
        st.setInt(9, e.getManager_id());
        st.setInt(7, e.getDepartment_id());
        st.executeUpdate();
    }

    public void updateEmp(Employee e) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(UPDATE_EMP);
        st.setInt(1, e.getEmployee_id());
        st.setString(2, e.getEmail());
        st.setDouble(3, e.getSalary());
        st.executeUpdate();
    }

    public void deleteEmp(int employee_id) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(DELETE_EMP);
        st.setInt(1, employee_id);
        st.executeUpdate();
    }

    public Employee selectDept(int employee_id) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(SELECT_ONE_EMP);
        st.setInt(1, employee_id);
        ResultSet rs = st.executeQuery();
        if(rs.next()) {
            return new Employee(rs);
        }
        else {
            return null;
        }
    }

    public ArrayList<Employee> selectAllDepts() throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(SELECT_ALL_EMPS);
        ResultSet rs = st.executeQuery();
        ArrayList<Employee> emps = new ArrayList<>();
        while (rs.next()) {
            emps.add(new Employee(rs));
        }

        return emps;
    }

}

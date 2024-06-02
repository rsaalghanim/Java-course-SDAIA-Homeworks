package HW4;

import java.sql.*;

public class EmpolyeeDBDemo {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\untitled9\\src\\main\\java\\HW4\\hr.db";
        String query = "select * from employees";

        try (Connection conn = DriverManager.getConnection(url); ){

            Statement st =conn.createStatement();
            ResultSet rs = st.executeQuery(query);


            while (rs.next()){
                Employee e = new Employee (rs);
                System.out.println(e);
            }
        }catch (SQLException e){
            throw  new RuntimeException(e);
        }
    }
}

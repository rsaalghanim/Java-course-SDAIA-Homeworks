package HW2;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList <Student> students;

    public void addStudent (Student student){
        students.add(student);
    }

    public Student getStudentById (int id){
       for (Student student : students ){
           if (student.getId() == id) {
               return student;
           }
        }
        return  null;
    }


}

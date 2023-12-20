package jpa.dao;

import jpa.entitymodels.Student;

public interface StudentDAO {
    public Student getAllStudents();
   // public Student getStudentByEmail();

    String getStudentByEmail (String sEmail);

    public  void validateStudent();

    void validateStudent (String sEmail, String sPassword);

    public void registerStudentToCourse();
    public Student getStudentCourses();
}

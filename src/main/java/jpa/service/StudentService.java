package jpa.service;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.ConnectionFactory;

import javax.persistence.TypedQuery;
import java.util.List;

public class StudentService implements StudentDAO {
    ConnectionFactory connectionFactory = ConnectionFactory.GET_SESSION.getInstance();
    @Override
    public Student getAllStudents () {
        TypedQuery<Student> typedQuery = connectionFactory.getSession().getNamedQuery("findAllStudents");
        //typedQuery.setParameter("login",login);
        List<Student> students = typedQuery.getResultList();
        return (Student) students;//List<student>
    }


    @Override
    public String getStudentByEmail (String sEmail) {






return null;





    }


    @Override
    public void validateStudent () {

    }

    @Override
    public void validateStudent (String sEmail, String sPassword) {

    }

    @Override
    public void registerStudentToCourse () {

    }

    @Override
    public Student getStudentCourses () {
        return null;//List<course>
    }
}

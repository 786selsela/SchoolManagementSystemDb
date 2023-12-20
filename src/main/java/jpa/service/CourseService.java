package jpa.service;

import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;
import org.hibernate.HibernateError;
import org.hibernate.HibernateException;
import org.hibernate.query.Query;
import util.ConnectionFactory;

import javax.persistence.TypedQuery;
import java.util.List;
public class CourseService implements CourseDAO {
    ConnectionFactory connectionFactory = ConnectionFactory.GET_SESSION.getInstance();
    @Override
    public List<Course> getAllCourses () {

       String hql="from course";
           TypedQuery<Course> typedQuery = connectionFactory.getSession().createQuery(hql,Course.class);
           //typedQuery.setParameter("login",login);
           List<Course> courses = typedQuery.getResultList();
           return courses;}


}





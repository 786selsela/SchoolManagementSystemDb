package jpa;

import jpa.entitymodels.Course;
import jpa.service.CourseService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CourseServiceTest {
    private final CourseService courseService=new CourseService();


    @Test
    public void testGetAllCourses(){
        List<Course> courses=courseService.getAllCourses();
       // Assertions.assertFalse(courses.isEmpty());
        Assertions.assertTrue(courses.size() > 0);

    }












}

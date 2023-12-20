package jpa.entitymodels;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    @Column(name = "email")
    private String sEmail;

    @Column(name = "name")
    private String sName;

    @Column(name = "password")
    private String sPass;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Course> Courses;

    public Student () {
    }


    public Student (String sEmail, String sName, String sPass, List sCourses) {
        this.sEmail = sEmail;
        this.sName = sName;
        this.sPass = sPass;

    }

    public String getsEmail () {
        return sEmail;
    }

    public void setsEmail (String sEmail) {
        this.sEmail = sEmail;
    }

    public String getsName () {
        return sName;
    }

    public void setsName (String sName) {
        this.sName = sName;
    }

    public String getsPass () {
        return sPass;
    }

    public List<Course> getCourses () {
        return Courses;
    }

    public void setCourses (List<Course> courses) {
        Courses = courses;
    }

    public void setsPass (String sPass) {
        this.sPass = sPass;
    }



}

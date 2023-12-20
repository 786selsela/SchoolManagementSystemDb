package jpa.mainrunner;

import jpa.dao.CourseDAO;
import jpa.dao.StudentDAO;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class SMSRunner {
    public static void main (String[] args) {
        System.out.println("We are working on SMS db");
        // Create a Hibernate configuration
         final SessionFactory sessionFactory;
        CourseDAO cdao=new CourseService();
        cdao.getAllCourses();




       /* Scanner scanner =new Scanner(System.in);
        do{
            System.out.println("______________");
            System.out.println("__USER MANAGEMENT__");
            System.out.println("1.Add User");
            System.out.println("2 List Users");
            System.out.println("3 Find User By Login");
            System.out.println("9 Quit");

            System.out.println("Choose Option: ");

            choose = scanner.nextInt();
            scanner.nextLine();
            if(choose == 1){
                String login = null;
                String password = null;
                String email = null;


                System.out.println("______________");
                System.out.println("Provide Login");
                login = scanner.nextLine();

                do {
                    System.out.println("Provide password");
                    password = scanner.nextLine();
                }while (checkPassword(password));

                System.out.println("Provide email");
                email = scanner.nextLine();
              Student student = new Student(email,name,password);
                studentDAO.createUser(user);

            }
            else if(choose == 3){
                System.out.println("______________");
                System.out.println("Provide Login to Find user");
                String login = scanner.nextLine();
              Student student = StudentService.findUserByLogin(login);

                System.out.println("User with login found " + user.getUserLogin());
                System.out.println("User with email found " + user.getEmail());
            }
        }while(choose != 9);

        connectionFactory.commit();
        connectionFactory.closeSession();
    }

    public static boolean checkPassword(String password){
        if(ValidPassword.isValid(password))
            return false;
        else
        {
            return true;*/
        }

    }







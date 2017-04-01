/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectone.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import projectone.dao.Student;
import projectone.dao.StudentDAO;

/**
 * 
 *
 * @author gustavo
 */
public class StudentManager {

    public void display() {
        
        ConfigurableApplicationContext appContext = new ClassPathXmlApplicationContext("SpringXMLConfig.xml");
        StudentDAO studentDAO = (StudentDAO) appContext.getBean("studentDAO");
        Student student2 = studentDAO.findByFirstName("Roberto");
        System.out.println(student2);
        appContext.close();
        
//        System.out.println();
//        System.out.println(student.getFirstName() + " " + student.getLastName());
//        System.out.println("Date of birth: " + student.getDateOfBirth());
//        System.out.println("Street: " + student.getAddress().getStreet());
//        System.out.println("City: " + student.getAddress().getCity());
//        System.out.println("Zip: " + student.getAddress().getZip());
//        System.out.println("Subject: " + student.getGrade().getSubject());
//        System.out.println("Grade: " + student.getGrade().getLetterGrade());
 
    }
   
}

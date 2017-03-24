/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectone.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import projectone.dao.Student;

/**
 *
 * @author gustavo
 */
public class AppMain {
    
    public static void main(String[] args) {
        
        StudentManager sm = new StudentManager();
        sm.display();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectone.restservice;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import projectone.assign3.DAOController;
import projectone.assign3.Students;

/**
 *
 * @author gusta
 */
@RestController
public class StudentController {

    ApplicationContext context = new ClassPathXmlApplicationContext("restSpringXMLConfig.xml");
    DAOController bean = (DAOController) context.getBean("daoController");

    @RequestMapping("/students")
    public List<Students> getStudents() {
        return bean.getAllStudents();
    }

    @RequestMapping("/post")
    public Students addStudent(@RequestParam(value = "firstName") String firstName, @RequestParam(value = "lastName") String lastName) {
        return bean.addStudent();
    }
    
    @RequestMapping("/delete")
    public Students remove(@RequestParam(value = "id") int id) {
        return bean.delete();
    }
}

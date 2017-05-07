/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectone.assign3;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author gusta
 */
public class DAOController {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence"); 
    private EntityManager em = emf.createEntityManager(); 
    private ApplicationContext context = new ClassPathXmlApplicationContext("SpringXMLConfig.xml"); 
    private Students bean = (Students) context.getBean("students");
    

    public void getAllStudents() {
        TypedQuery<Students> query = em.createQuery(
                "SELECT s FROM Students s", Students.class);
        
        List<Students> listStudents = query.getResultList();
        for (Students entity : listStudents) {
            System.out.println(entity.getFirstname() + " " 
                             + entity.getLastname() + " " 
                             + entity.getDateofbirth() + " "
                             + entity.getAddress() + " "
                             + entity.getGrade());
        }
    }

    public void addStudent(Students bean) {
        em.getTransaction().begin();
        em.persist(bean);
        em.getTransaction().commit();
    }

    public static void main(String[] args) {
        
        DAOController std = new DAOController();
//        std.bean.setFirstname("Pete");
//        std.bean.setLastname("Rose");
//        std.bean.setDateofbirth("08/12/62");
//        std.bean.setAddress("1700 HallOfFame");
//        std.bean.setGrade("A");
//        std.addStudent(std.bean);
        std.getAllStudents();       
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectone.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
import projectone.dao.Student;

/**
 *
 * @author W207282211
 */
public class JdbcTemp {
    
    private JdbcTemplate JdbcTemplate;
    private DataSource dataSource;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.JdbcTemplate = jdbcTemplate;
    }
    
   public void insert(Student student){
       
       String sql = "INSERT INTO STUDENT " + 
               "(firstName, lastName, dateOfBirth) VALUES (?,?,?)";
   
       JdbcTemplate = new JdbcTemplate(dataSource);
       
       JdbcTemplate.update(sql,new Object[]{ student.getFirstName(),
           student.getLastName(), student.getDateOfBirth()});
       
   }
      
}

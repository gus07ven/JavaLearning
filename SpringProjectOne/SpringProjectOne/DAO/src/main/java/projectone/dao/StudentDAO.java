/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectone.dao;

/**
 *
 * @author W207282211
 */
public interface StudentDAO {
    
    public void insert(Student student);
    public Student findByFirstName(String firstName);
    
}

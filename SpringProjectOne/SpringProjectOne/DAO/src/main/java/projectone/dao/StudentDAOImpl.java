/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

/**
 *
 * @author W207282211
 */
public class StudentDAOImpl implements StudentDAO {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void insert(Student student) {

        String sql = "INSERT INTO STUDENT"
                + "(firstName, lastName, dateOfBirth) VALUES (?,?,?)";
        Connection conn = null;

        try {

            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());
            ps.setString(3, student.getDateOfBirth());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }
    
    @Override
    public Student findByFirstName(String firstName) {
        
        String sql = "SELECT * FROM STUDENT WHERE firstName= ?";
        
        Connection conn = null;
        
        try{
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Roberto");
            Student student = null;
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                student = new Student(
                    rs.getString("firstName"),
                    rs.getString("lastName"),
                    rs.getString("dateOfBirth"));
            }
            rs.close();
            ps.close();
            return student;
        } catch (SQLException e){
            throw new RuntimeException(e);
        } finally {
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e){}
            }
        }   
    }
}

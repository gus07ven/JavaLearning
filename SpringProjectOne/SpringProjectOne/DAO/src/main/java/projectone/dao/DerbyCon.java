/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectone.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;


/**
 *
 * @author W207282211
 */
public class DerbyCon {
    
    private String dbURL = "jdbc:derby://localhost:1527/DbOne;user=gustavo;password=gustavo"; //;user=gustavo;password=gustavo
    private String tableName = "Student";
    //JDBC Connection
    private Connection conn = null;
    private Statement stmt = null;
    
    public void createConnection()
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            //Get a connection
            conn = DriverManager.getConnection(dbURL); 
        }
        catch (Exception except)
        {
            except.printStackTrace();
        }
    }
    
    public void insertStudent(String firstName, String lastName, String dateOfBirth )
    {
        try
        {
            stmt = conn.createStatement();
            stmt.execute("insert into " + tableName + " (FIRSTNAME, LASTNAME, DATEOFBIRTH) values ('" +
                     firstName + "','" + lastName + "','" + dateOfBirth + "')" );
            stmt.close();
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
    }
    
    public void selectStudents()
    {
        try
        {
            stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("select * from " + tableName);
            ResultSetMetaData rsmd = results.getMetaData();
            int numberCols = rsmd.getColumnCount();
            for (int i=1; i<=numberCols; i++)
            {
                //print Column Names
                System.out.print(rsmd.getColumnLabel(i)+"\t\t");  
            }

            System.out.println("\n-------------------------------------------------");

            while(results.next())
            {
                int id = results.getInt(1);
                String firstName = results.getString(2);
                String lastName = results.getString(3);
                String dateOfBirth = results.getString(4);
                System.out.println(id + "\t\t" + firstName + "\t\t" + lastName + "\t\t" + dateOfBirth );
            }
            results.close();
            stmt.close();
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
    }
    
    public void shutdown()
    {
        try
        {
            if (stmt != null)
            {
                stmt.close();
            }
            if (conn != null)
            {
                DriverManager.getConnection(dbURL + ";shutdown=true");
                conn.close();
            }           
        }
        catch (SQLException sqlExcept)
        {
            
        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.designacouch.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Siyanda
 */
public class DatabaseConnection {
    
    public void initDatabase() {
        
      String jdbcDriver = "com.mysql.jdbc.Driver";
      String dbURL = "jdbc:mysql://localhost/";
      String dbUserId = "csc2720";
      String dbPassword = "csc2720";
      Connection c = null;
      
      try {    
        Class.forName(jdbcDriver);
      } catch (ClassNotFoundException exp) {
        System.err.println("Could not load the JDBC driver " + jdbcDriver);
        return;
      }
        
      try {
        c = DriverManager.getConnection(dbURL, dbUserId, dbPassword);
                
        try {
            
          Statement s = c.createStatement();
        
          s.addBatch("USE DesignACouchDB");
          s.addBatch("select * from Customer");

                
          // In case you want to see the update results from each statement
          // Normally not needed to store the results.
          int results[] = s.executeBatch();  
          System.out.println(results);
        } catch (SQLException sqlexp) {
            System.err.println("Failed to execute one of the statements.");
            System.err.println(sqlexp.getMessage());
        }
        
        c.close();
        
      } catch (SQLException sqlexp) {
        System.err.println("Failed to connect to the database.");
        System.err.println(sqlexp.getMessage());
      }
    }
}

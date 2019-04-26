/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Alvaro
 */
public class ConnectionFactory {

    private static Connection Con;

    public static Connection getConnection() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            ConnectionFactory.Con = DriverManager.getConnection("jdbc:mysql://localhost/mydb?user=root&password=1234");
            return ConnectionFactory.Con;
        } catch (Exception e) {
            throw new Exception("Erro em ConnectionFactory: " + e.getMessage());
        }
    }
    
    /*
        public static Connection getConnection(String user, String pswd) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            ConnectionFactory.Con = DriverManager.getConnection("jdbc:mysql://localhost/mydb?user=" + user + "password=" + pswd);
            return ConnectionFactory.Con;
        } catch (Exception e) {
            throw new Exception("Erro em ConnectionFactory: " + e.getMessage());
        }
    }
    */
  

    public static void closeConnection() throws Exception {
        try {
            Con.close();
        } catch (Exception e) {
            throw new Exception("Erro em ConnectionFactory: " + e.getMessage());
        }
    }

    public static void closeConnection(Statement stm) throws Exception {
        try {
            stm.close();
            Con.close();
        } catch (Exception e) {
            throw new Exception("Erro em ConnectionFactory: " + e.getMessage());
        }
    }
    
    public static void closeConnection(PreparedStatement pstm) throws Exception {
        try {
            pstm.close();
            Con.close();
        } catch (Exception e) {
            throw new Exception("Erro em ConnectionFactory: " + e.getMessage());
        }
    }
    
    public static void closeConnection(PreparedStatement pstm, ResultSet rs) throws Exception {
        try {
            rs.close();
            pstm.close();
            Con.close();
        } catch (Exception e) {
            throw new Exception("Erro em ConnectionFactory: " + e.getMessage());
        }
    }
    
     public static void closeConnection(Statement stm, ResultSet rs) throws Exception {
        try {
            rs.close();
            stm.close();
            Con.close();
        } catch (Exception e) {
            throw new Exception("Erro em ConnectionFactory: " + e.getMessage());
        }
    }
     
}

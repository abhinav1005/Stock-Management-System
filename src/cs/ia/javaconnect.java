package cs.ia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Abhinav
 */
public class javaconnect {
Connection conn = null;

public static Connection connecrDb(){
    try{
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Abhinav\\Desktop\\apple.db");
        
         return conn;
       
    } catch (Exception e){
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
    
}
public static void main(String[] args){
    
}

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

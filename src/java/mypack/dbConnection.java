/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
package mypack;
import java.sql.*;
import javax.swing.JOptionPane;
public class dbConnection {
    Connection con;
    ResultSet rs;
     Statement stmt;
   public void updateData(String dbName,String query)
    {
        try {
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/"+dbName, "root", "");
            stmt= con.createStatement();
            stmt.executeUpdate(query);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }

    }
     
     
    public  ResultSet selectData(String dbName, String query) {
        ResultSet rs = null;
        try {
            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/"+ dbName, "root", "");
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return rs;
    }
}

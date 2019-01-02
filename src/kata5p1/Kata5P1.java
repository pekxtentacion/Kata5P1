/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Kata5P1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:Kata5.db");
        
        Statement st = con.createStatement();
        String query = "SELECT * FROM PEOPLE";
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
            System.out.println(rs.getInt("ID") + "\t" +
                               rs.getString("Name") + "\t" +
                               rs.getString("Apellidos") + "\t" +
                               rs.getString("Departamento") + "\t");
        }
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class DBConnect {

    Connection c = null;

    public DBConnect(String URL, String username, String pass) {
        try {
            //get driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //get connection
            c = DriverManager.getConnection(URL, username, pass);
            System.out.println("Connected");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public DBConnect() {
        this("jdbc:sqlserver://localhost:1433;databaseName=BugerKingW","sa","123456");
    }
    public Connection getConnection(){
        new DBConnect();
        return c;
    }
}

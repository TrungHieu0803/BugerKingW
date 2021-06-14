/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class DAOAdmin {
    Connection c = null;
    PreparedStatement ps = null;
    ResultSet  rs = null;
    
    public boolean login(String username,String password){
        String getUN = username.substring(0, username.length()-6);
        String query = "select username from admin where [username]=? and password =?";
        String un=null;
        try {
            c = new DBConnect().getConnection();
            ps = c.prepareStatement(query);
            ps.setString(1,getUN);
            ps.setString(2,password);
            rs = ps.executeQuery();
            while (rs.next()) {
                un = rs.getString(1);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return un==null?false:true;
    }
    public static void main(String[] args) {
        DAOAdmin da = new DAOAdmin();
        if(da.login("hieu@admin","12345678" ))
            System.out.println("11");
        else
            System.out.println("222");
    }
           
    
}

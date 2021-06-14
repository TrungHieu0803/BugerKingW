/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import entity.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DAOCategory {
    Connection c = null;
    PreparedStatement ps = null;
    ResultSet  rs = null;
    public ArrayList<Category> getAllProduct(){
        ArrayList<Category> list = new ArrayList<>();
        String query = "select * from  Category";
        try {
            c = new DBConnect().getConnection();
            ps = c.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Category(rs.getInt(1),rs.getString(2)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.OrderDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class DAOOrderDetail {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet  rs = null;
    
    public void addOrderDetail(String pid,int oid,int quantity,double total){
        String query = "insert into OrderDetail(pid,oid,quantity,total) values(?,?,?,?)";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.setInt(2, oid);
            ps.setInt(3, quantity);
            ps.setDouble(4, total);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        DAOOrderDetail o = new DAOOrderDetail();
        o.addOrderDetail("B02", 4,10 ,23);
    }
        
}

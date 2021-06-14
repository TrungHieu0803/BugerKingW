/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DAOOrder {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet  rs = null;
    
    public Order getOrder(int cid){
        Order o = new Order();
        String query = "select top 1*from [Order] where cid = ? order by dateCreate asc";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, cid);
            rs = ps.executeQuery();
            while(rs.next()){
                o = new Order(rs.getInt(1),
                        rs.getDate(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getDouble(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9)                     
                              );
            }
        } catch (Exception e) {
        }
        return o;
    }
    public void addOrder(Order o){
        String query = "insert into [Order](cname,cphone,cAddress,total,cid,payID) values(?,?,?,?,?,?)";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, o.getCname());
            ps.setString(2, o.getCphone());
            ps.setString(3, o.getcAddress());
            ps.setDouble(4, o.getTotal());
            ps.setInt(5,o.getCid() );
            ps.setInt(6, o.getPayid());
            ps.executeQuery();
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) {
        DAOOrder o = new DAOOrder();
        o.addOrder(new Order("qwerty", "123456", "djf", 12, 12, 1));
        
    }
}

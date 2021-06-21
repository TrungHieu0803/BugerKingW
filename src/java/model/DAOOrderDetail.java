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
import java.util.ArrayList;

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
    public ArrayList<OrderDetail> getOdByOid(int oid){
        ArrayList<OrderDetail> od = new ArrayList<>();
        String query = "select b.pname,b.price,a.quantity,a.total from OrderDetail as a inner join Product as b on a.pid=b.pid  where oid = ?";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, oid);
            rs = ps.executeQuery();
            while(rs.next()){
                od.add(new OrderDetail(rs.getString(1), rs.getInt(3), rs.getDouble(2), rs.getDouble(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return od;
    }
    
    public static void main(String[] args) {
        DAOOrderDetail o = new DAOOrderDetail();
    //    o.addOrderDetail("B02", 4,10 ,23);
        System.out.println(o.getOdByOid(8));
    }
        
}

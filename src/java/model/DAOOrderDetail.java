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
    
    public void addOrderDetail(OrderDetail od){
        String query = "insert into OrderDetil(pid,oid,quantity,total) values(?,?,?,?)";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, od.getPid());
            ps.setInt(2, od.getOid());
            ps.setInt(3, od.getQuantity());
            ps.setDouble(4, od.getTotal());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

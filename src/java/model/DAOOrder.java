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
    ResultSet rs = null;

    public ArrayList<Order> getAllOrder() {
        ArrayList<Order> order = new ArrayList<>();
        String query = "select*from [Order] order by dateCreate desc";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                order.add(new Order(rs.getInt(1),
                        rs.getDate(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getDouble(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return order;
    }
    public ArrayList<Order> searchOrderByStatus(int status,int currentPage) {
        ArrayList<Order> order = new ArrayList<>();
        int startIndex = currentPage*10 - 9;
        int endIndex = currentPage*10;
        String query = "select*from (select ROW_NUMBER() over (order by dateCreate desc) as r, *from [Order] where status =?) as x where r between ? and ? ";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, status);
            ps.setInt(2, startIndex);
            ps.setInt(3, endIndex);
            rs = ps.executeQuery();
            while (rs.next()) {
                order.add(new Order(rs.getInt(2),
                        rs.getDate(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getDouble(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return order;
    }
    public ArrayList<Order> searchOrderByS(int status) {
        ArrayList<Order> order = new ArrayList<>();     
        String query = "select*from [Order] where status = ? order by dateCreate desc";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, status);
           
            rs = ps.executeQuery();
            while (rs.next()) {
                order.add(new Order(rs.getInt(1),
                        rs.getDate(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getDouble(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return order;
    }

    public ArrayList<Order> getOrderPage(int currentPage) {
        int startIndex = currentPage*10 - 9;
        int endIndex = currentPage*10;
        ArrayList<Order> order = new ArrayList<>();
        String query = "select*from (select ROW_NUMBER() over (order by dateCreate desc) as r, *from [Order] ) as x where r between ? and ?";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, startIndex);
            ps.setInt(2, endIndex);
            rs = ps.executeQuery();
            while (rs.next()) {
                order.add(new Order(rs.getInt(2),
                        rs.getDate(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getDouble(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return order;
    }

    public int getOrderID(int cid) {
        int orderID = 0;
        String query = "select top 1*from [Order] where cid = ? order by dateCreate desc";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                orderID = rs.getInt(1);

            }
        } catch (Exception e) {
        }
        return orderID;
    }

    public void addOrder(Order o) {
        String query = "insert into [Order](cname,cphone,cAddress,total,cid,payID) values(?,?,?,?,?,?)";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, o.getCname());
            ps.setString(2, o.getCphone());
            ps.setString(3, o.getcAddress());
            ps.setDouble(4, o.getTotal());
            ps.setInt(5, o.getCid());
            ps.setInt(6, o.getPayid());
            ps.executeQuery();
        } catch (Exception e) {
        }
    }
    public void changeStatus(int oid,int status){
        String query = "update [Order] set status = ? where oID = ?";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, status);
            ps.setInt(2, oid);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteOrder(int oid){
        String query = "DELETE FROM [OrderDetail] WHERE oID=?";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, oid);           
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DAOOrder o = new DAOOrder();
        // o.addOrder(new Order("hieu","123","sdsd",20,11,1));
       
        o.deleteOrder(3023);

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DAOCustomer {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet  rs = null;
    
    public int addCustomer(Customer c){
        String query = "insert into Customer(cname,cphone,cAddress,cEmail,username,password) values (?,?,?,?,?,?)";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, c.getCname());
            ps.setString(2, c.getCphone());
            ps.setString(3, c.getcAddress());
            ps.setString(4, c.getcEmail());
            ps.setString(5, c.getUsername());
            ps.setString(6, c.getPassword());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public ArrayList<Customer> getAllCustomer(){
        ArrayList<Customer> c = new ArrayList<>();
        String query = "select*from Customer";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                
                c.add(new Customer(rs.getInt(1),
                                   rs.getString(2),
                                   rs.getString(3),
                                   rs.getString(4),
                                   rs.getString(5),
                                   rs.getString(6),
                                   rs.getInt(8)));
            }
        } catch (Exception e) {
        }
        return c;
    }
    public boolean checkUserName(String username){
        String query = "select username from Customer where username = ?";
        String result = null;
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while(rs.next()){
                result = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result==null? true : false;
    }
    public boolean login(String username,String password){
        String query = "select [username] from Customer where [username] = ? and password = ?";
        String un = null;
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                un= rs.getString(1);                       
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
       
        return un==null?false:true ; 
    }
    public void changeStatusToOnl(String username){
        String query = "update Customer set status = 1 where username = ?";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public void changeStatusToOff(String username){
        String query = "update Customer set status = 0 where username = ?";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public Customer getCustomerByUN(String username){
        Customer c = new Customer();
        String query = "select*from Customer where username = ?";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while(rs.next()){
                c = new Customer(rs.getInt(1), 
                                rs.getString(2), 
                                rs.getString(3), 
                                rs.getString(4), 
                                rs.getString(5), 
                                rs.getString(6), 
                                rs.getInt(8));
            }
        } catch (Exception e) {
        }
        return c;
    }
    public void updateInformation(Customer c){
        String query = "update Customer set cname = ? ,cphone = ?, cEmail = ?, cAddress = ? where cid = ?";
         try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, c.getCname());
            ps.setString(2, c.getCphone());
            ps.setString(3, c.getcEmail());
            ps.setString(4, c.getcAddress());
            ps.setInt(5, c.getCid());
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    public void updatePassWord(int cid,String passWord){
        String query = "update Customer set password = ? where cid = ?";
         try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, passWord);  
            ps.setInt(2, cid);
            ps.executeUpdate();          
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
        DAOCustomer c = new DAOCustomer();
        
    }
    
}

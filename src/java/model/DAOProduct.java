/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DAOProduct {

    Connection c = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void insertNewProduct(Product p) {
        String query = "insert into Product(pid,pname,price,image,description,cateID) values(?,?,?,?,?,?)";
        try {
            c = new DBConnect().getConnection();
            ps = c.prepareStatement(query);
            ps.setString(1, p.getPid());
            ps.setString(2, p.getPname());
            ps.setDouble(3, p.getPrice());
            ps.setString(4, p.getImage());
            ps.setString(5, p.getDescription());
            ps.setInt(6, p.getCateID());
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

    public ArrayList<Product> getAllProduct() {
        ArrayList<Product> list = new ArrayList<>();
        String query = "select * from  Product ";
        try {
            c = new DBConnect().getConnection();
            ps = c.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6), rs.getInt(7)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Product> getAllProductBuger() {
        ArrayList<Product> list = new ArrayList<>();
        String query = "select * from  Product where cateID = 1 and status=1";
        try {
            c = new DBConnect().getConnection();
            ps = c.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6), rs.getInt(7)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Product> getAllProductSnack() {
        ArrayList<Product> list = new ArrayList<>();
        String query = "select * from  Product where cateID = 2 and status=1";
        try {
            c = new DBConnect().getConnection();
            ps = c.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6), rs.getInt(7)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Product> getAllProductDrink() {
        ArrayList<Product> list = new ArrayList<>();
        String query = "select * from  Product where cateID = 3 and status=1";
        try {
            c = new DBConnect().getConnection();
            ps = c.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6), rs.getInt(7)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Product getByID(String pid) {
        ArrayList<Product> list = new ArrayList<>();
        String query = "select * from  Product where pid = ? ";
        Product p = new Product();
        try {
            c = new DBConnect().getConnection();
            ps = c.prepareStatement(query);
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                p = new Product(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6), rs.getInt(7));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }

    public void deleteProduct(String pid) {
        String query = "delete from Product where pid = ?";
        try {
            c = new DBConnect().getConnection();
            ps = c.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateProduct(Product p){
        String query = "update Product set pname = ?,price = ?, image = ?, description = ?, cateID = ? where pid=?";
        try {
            c = new DBConnect().getConnection();
            ps = c.prepareStatement(query);
            ps.setString(1, p.getPname());
            ps.setDouble(2, p.getPrice());
            ps.setString(3, p.getImage());
            ps.setString(4, p.getDescription());
            ps.setInt(5, p.getCateID());
            ps.setString(6, p.getPid());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public void updateProductStatus(String pid, int status){
        String query = "update Product set status =? where pid =?";
        try {
            c = new DBConnect().getConnection();
            ps = c.prepareStatement(query);
            ps.setInt(1, status);
            ps.setString(2, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        DAOProduct dp = new DAOProduct();
        dp.insertNewProduct(new Product("B09", "hiuie", 0, "none", "none", 1));
    }
}

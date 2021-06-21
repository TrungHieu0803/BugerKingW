/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Administrator
 */
public class OrderDetail {
    String pid, pname;
    int oid,quantity;
    double price,total;

    public OrderDetail() {
    }

    public OrderDetail(String pname, int quantity, double price, double total) {
        this.pname = pname;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }

    public OrderDetail(String pid, int oid, int quantity, double total) {
        this.pid = pid;
        this.oid = oid;
        this.quantity = quantity;
        this.total = total;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "pid=" + pid + ", pname=" + pname + ", oid=" + oid + ", quantity=" + quantity + ", price=" + price + ", total=" + total + '}';
    }
    
    

    
    
}

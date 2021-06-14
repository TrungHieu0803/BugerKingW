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
    int pid,oid,quantity;
    double total;

    public OrderDetail() {
    }

    public OrderDetail(int pid, int oid, int quantity, double total) {
        this.pid = pid;
        this.oid = oid;
        this.quantity = quantity;
        this.total = total;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
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
        return "OrderDetail{" + "pid=" + pid + ", oid=" + oid + ", quantity=" + quantity + ", total=" + total + '}';
    }
    
}

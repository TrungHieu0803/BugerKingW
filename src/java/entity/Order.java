/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author Administrator
 */
public class Order {
    int oid;
    Date date;
    String cname,cphone,cAddress;
    double total;
    int status, cid, payid;

    public Order() {
    }

    public Order(int oid, Date date, String cname, String cphone, String cAddress, double total, int status, int cid, int payid) {
        this.oid = oid;
        this.date = date;
        this.cname = cname;
        this.cphone = cphone;
        this.cAddress = cAddress;
        this.total = total;
        this.status = status;
        this.cid = cid;
        this.payid = payid;
    }

    public Order(String cname, String cphone, String cAddress, double total, int cid, int payid) {
        this.cname = cname;
        this.cphone = cphone;
        this.cAddress = cAddress;
        this.total = total;
        this.cid = cid;
        this.payid = payid;
    }
    

    public Order(int oid) {
        this.oid = oid;
    }
    
    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getPayid() {
        return payid;
    }

    public void setPayid(int payid) {
        this.payid = payid;
    }

    @Override
    public String toString() {
        return "Order{" + "oid=" + oid + ", date=" + date + ", cname=" + cname + ", cphone=" + cphone + ", cAddress=" + cAddress + ", total=" + total + ", status=" + status + ", cid=" + cid + ", payid=" + payid + '}';
    }
    
   
}

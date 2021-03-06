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
public class Product {
    String pid,pname;
    double price;
    String image;
    String description;
    int status, cateID;
    int amount;
    public Product() {
    }

    public Product(String pid, String pname, double price, String image, String description, int status, int cateID, int amount) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.image = image;
        this.description = description;
        this.status = status;
        this.cateID = cateID;
        this.amount = amount;
    }

    public Product(String pid, String pname, double price, String image, int amount) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.image = image;
        this.amount = amount;
    }

    
    

    public Product(String pid, String pname, double price, String image, String description, int cateID) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.image = image;
        this.description = description;
        this.cateID = cateID;
    }

    public Product(String pname, double price, String image, String description, int cateID) {
        this.pname = pname;
        this.price = price;
        this.image = image;
        this.description = description;
        this.cateID = cateID;
    }

    public Product(String pid, String pname, double price, String image, String description, int status, int cateID) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.image = image;
        this.description = description;
        this.status = status;
        this.cateID = cateID;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCateID() {
        return cateID;
    }

    public void setCateID(int cateID) {
        this.cateID = cateID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public double total(){
        return (double)amount*price;
    }
    

    @Override
    public String toString() {
        return "Product{" + "pid=" + pid + ", pname=" + pname + ", price=" + price + ", image=" + image + ", description=" + description + ", status=" + status + ", cateID=" + cateID + '}';
    }
    
}

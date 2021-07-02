/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Customer;
import entity.Order;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DAOOrder;
import model.DAOOrderDetail;
import model.DAOProduct;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "CartControl", urlPatterns = {"/CartControl"})

public class CartControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        DAOProduct dao = new DAOProduct();
        String service = request.getParameter("service");
        HttpSession session = request.getSession();
        String pid = request.getParameter("pid");
        try {
            if (service.equals("addToCart")) {
                Product productFromDB = dao.getByID(pid);
                int totalAmount = 0;
                if (session.getAttribute("order") == null) {
                    ArrayList<Product> p = new ArrayList<>();
                    p.add(new Product(pid, productFromDB.getPname(), productFromDB.getPrice(), productFromDB.getImage(), 1));
                    Order order = new Order(productFromDB.getPrice(), p);
                    session.setAttribute("order", order);
                    session.setAttribute("totalAmount", totalAmount);

                } else {
                    Order order = (Order) session.getAttribute("order");
                    ArrayList<Product> product = order.getProduct();
                    double total = 0;
                    boolean inCart = false;
                    for (Product p : product) {
                        if (p.getPid().equals(pid)) {
                            p.setAmount(p.getAmount() + 1);
                            inCart = true;
                        }
                    }
                    if (!inCart) {
                        product.add(new Product(pid, productFromDB.getPname(), productFromDB.getPrice(),
                                productFromDB.getImage(), 1));
                    }
                    for (Product p : product) {
                        totalAmount = totalAmount + p.getAmount();
                        total = total + p.getPrice() * p.getAmount();
                    }
                    Order setOrder = new Order(total, product);
                    session.setAttribute("order", setOrder);
                    session.setAttribute("totalAmount", totalAmount);
                }

            }

            if (service.equals("reduceAmount")) {
                Order order = (Order) session.getAttribute("order");
                ArrayList<Product> product = order.getProduct();
                double total = order.getTotal();
                int totalAmount = (int) session.getAttribute("totalAmount");
                for (Product p : product) {
                    if (p.getPid().equals(pid) && p.getAmount() == 1) {
                        break;
                    }
                    if (p.getPid().equals(pid)) {
                        p.setAmount(p.getAmount() - 1);
                        totalAmount = totalAmount - 1;
                        total = total - p.getPrice();
                    }
                }
                Order setOrder = new Order(total, product);
                session.setAttribute("order", setOrder);
                session.setAttribute("totalAmount", totalAmount);
            }
            if (service.equals("increaseAmount")) {
                Order order = (Order) session.getAttribute("order");
                ArrayList<Product> product = order.getProduct();
                double total = order.getTotal();
                int totalAmount = (int) session.getAttribute("totalAmount");
                for (Product p : product) {
                    if (p.getPid().equals(pid)) {
                        p.setAmount(p.getAmount() + 1);
                        totalAmount = totalAmount + 1;
                        total = total + p.getPrice();
                    }
                }
                Order setOrder = new Order(total, product);
                session.setAttribute("order", setOrder);
                session.setAttribute("totalAmount", totalAmount);
            }
            if (service.equals("removeProduct")) {
                Order order = (Order) session.getAttribute("order");
                int totalAmount = (int) session.getAttribute("totalAmount");
                ArrayList<Product> product = order.getProduct();
                double total = order.getTotal();
                for (int i = 0; i < product.size(); i++) {
                    if (product.get(i).getPid().equals(pid)) {
                        total = total - (double) product.get(i).getPrice() * product.get(i).getAmount();
                        totalAmount = totalAmount - product.get(i).getAmount();
                        product.remove(i);
                    }
                }
                Order setOrder = new Order(total, product);
                session.setAttribute("order", setOrder);
                session.setAttribute("totalAmount", totalAmount);
            }
            if (service.equals("buy")) {
                DAOOrder dorder = new DAOOrder();
                DAOOrderDetail od = new DAOOrderDetail();
                Order order = (Order) session.getAttribute("order");
                //           int totalAmount = (int) session.getAttribute("totalAmount");
                double total = order.getTotal();
                Customer customer = (Customer) session.getAttribute("account");
                String cname = request.getParameter("cname");
                String cphone = request.getParameter("cphone");
                String caddress = request.getParameter("caddress");
                Order saveToDB = new Order(cname, cphone, caddress, total, customer.getCid(), 1);
                dorder.addOrder(saveToDB);
                int orderID = dorder.getOrderID(customer.getCid());
                ArrayList<Product> product = order.getProduct();
                for (Product p : product) {
                    od.addOrderDetail(p.getPid(), orderID, p.getAmount(), p.total());
                }
                session.removeAttribute("order");
                session.removeAttribute("totalAmount");
                response.sendRedirect("index.jsp");

            }
            if (service.equals("changeAmount")) {
                Order order = (Order) session.getAttribute("order");
                ArrayList<Product> product = order.getProduct();
                int currentAmount = Integer.parseInt(request.getParameter("currentAmount"));
                int totalAmount = (int) session.getAttribute("totalAmount");
                double total = order.getTotal();
                int amount = 0;
                for (Product p : product) {
                    if(p.getPid().equals(pid)){
                        amount = p.getAmount();
                        p.setAmount(currentAmount);
                        totalAmount = totalAmount - amount + currentAmount; 
                        total = total + p.getPrice()*(currentAmount-amount);
                    }
                }
                Order setOrder = new Order(total, product);
                session.setAttribute("order", setOrder);
                session.setAttribute("totalAmount", totalAmount);
                response.getWriter().print(amount);
            }
        } catch (Exception e) {
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

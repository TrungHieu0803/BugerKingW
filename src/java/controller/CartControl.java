/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
        try {
    // add to cart or increase amount of 1 product        
            if (service.equals("addToCart")) {
                String pid = request.getParameter("pid");
                Cookie arr[] = request.getCookies();
                String txt = "";
                for (Cookie o : arr) {
                    if (o.getName().equals("id")) {
                        txt = txt + o.getValue();
                        o.setMaxAge(0);
                        response.addCookie(o);
                    }
                }
                if (txt.isEmpty()) {
                    txt = pid;
                } else {
                    txt = txt + "," + pid;
                }
                Cookie c = new Cookie("id", txt);
                c.setMaxAge(60 * 60 * 24);
                response.addCookie(c);
            }
    //reduce amount for 1 product        
            if (service.equals("reduceAmount")) {
                String pid = request.getParameter("pid");
                Cookie arr[] = request.getCookies();
                String txt = "";
                for (Cookie o : arr) {
                    if (o.getName().equals("id")) {
                        txt = txt + o.getValue();
                        o.setMaxAge(0);
                        response.addCookie(o);
                    }
                }
                String ids[] = txt.split(",");
                String txtOutPut = "";
                int check = 0;
                for (int i = 0; i < ids.length; i++) {
                    if (ids[i].equals(pid)) {
                        check++;
                    }
                    if (check != 1) {
                        if (txtOutPut.isEmpty()) {
                            txtOutPut = ids[i];
                        } else {
                            txtOutPut = txtOutPut + "," + ids[i];
                        }
                    } else {
                        check++;
                    }
                }
                if (!txtOutPut.isEmpty()) {
                    Cookie c = new Cookie("id", txtOutPut);
                    c.setMaxAge(60 * 60 * 24);
                    response.addCookie(c);
                }
            }

            if (service.equals("showCart")) {
                HttpSession session = request.getSession();
                Cookie arr[] = request.getCookies();
                ArrayList<Product> list = new ArrayList<>();
                for (Cookie o : arr) {
                    if (o.getName().equals("id")) {
                        String txt[] = o.getValue().split(",");
                        for (String s : txt) {
                            list.add(dao.getByID(s));
                        }
                    }
                }
                for (int i = 0; i < list.size(); i++) {
                    int count = 1;
                    for (int j = i + 1; j < list.size(); j++) {
                        if (list.get(i).getPid().equals(list.get(j).getPid())) {
                            count++;
                            list.remove(j);
                            j--;
                            list.get(i).setAmount(count);
                        }
                    }
                }
                int totalAmount=0;
                double total = 0;
                for (Product o : list) {
                    if(o.getAmount()==0){
                        o.setAmount(1);
                    }
                    totalAmount += o.getAmount();
                    total = total + (double) o.getAmount() * o.getPrice();
                }
                session.setAttribute("totalAmount", totalAmount);
                request.setAttribute("list", list);
                request.setAttribute("total", total);
                request.getRequestDispatcher("cart.jsp").forward(request, response);
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

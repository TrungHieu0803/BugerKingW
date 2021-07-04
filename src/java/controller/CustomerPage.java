/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DAOCustomer;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "CustomerPage", urlPatterns = {"/CustomerPage"})
public class CustomerPage extends HttpServlet {

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
        String service = request.getParameter("service");
        HttpSession session = request.getSession();
        DAOCustomer dc = new DAOCustomer();
        try {
            if (service.equals("update")) {
                Customer c = (Customer) session.getAttribute("account");
                c.setCname(request.getParameter("name"));
                c.setCphone(request.getParameter("phone"));
                c.setcEmail(request.getParameter("email"));
                c.setcAddress(request.getParameter("address"));
                session.setAttribute("account", c);
                dc.updateInformation(c);
                response.sendRedirect("profile.jsp");
            }
            if (service.equals("changePassWord")) {
                Customer c = (Customer) session.getAttribute("account");
                String oldPw = request.getParameter("oldPassword");
                String newPw = request.getParameter("newPassword");
                if (dc.login(c.getUsername(), oldPw)) {
                    dc.updatePassWord(c.getCid(),newPw);
                    request.setAttribute("alert", "block");
                    request.getRequestDispatcher("profile.jsp").forward(request, response);
                } else {
                    request.setAttribute("changePwForm", "block");
                    request.setAttribute("messForChangePw", "User name or password is incorrect!!");
                    request.getRequestDispatcher("profile.jsp").forward(request, response);
                }
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

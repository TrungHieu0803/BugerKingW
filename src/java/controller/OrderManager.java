/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Order;
import entity.OrderDetail;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAOOrder;
import model.DAOOrderDetail;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "OrderManager", urlPatterns = {"/OrderManager"})
public class OrderManager extends HttpServlet {

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
        DAOOrder od = new DAOOrder();
        DAOOrderDetail odetail = new DAOOrderDetail();
        String service = request.getParameter("service");
        try {
            if (service.equals("om")) {
                ArrayList<Order> list = new ArrayList<>();
                list = od.getAllOrder();
                request.setAttribute("listO", list);
                request.getRequestDispatcher("admin/order-manager.jsp").forward(request, response);
            } else if (service.equals("orderDetail")) {
                int oid = Integer.parseInt(request.getParameter("oid"));
                ArrayList<OrderDetail> orderDetail = odetail.getOdByOid(oid);
                for (OrderDetail o : orderDetail) {
                    response.getWriter().print(
                            "                                <tr class=\"rem\"  >\n"
                            + "                                    <td id=\"cid\" class=\"invert\">" + o.getPname() + "</td>\n"
                            + "                                    <td class=\"invert\">" + o.getQuantity() + "</td>\n"
                            + "                                    <td class=\"invert\">" + o.getPrice() + "</td>                           \n"
                            + "                                    <td class=\"invert\">" + o.getTotal() + "</td>\n"
                            + "                                </tr>                           \n"
                    );
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

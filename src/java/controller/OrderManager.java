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
            ArrayList<Order> listSize = new ArrayList<>();
            listSize = od.getAllOrder();
            int totalPage = listSize.size() / 10;
            if (listSize.size() % 10 != 0) {
                totalPage++;
            }

            if (service.equals("om")) {
                String currentPage = request.getParameter("currentPage");
                ArrayList<Order> list = new ArrayList<>();
                if (currentPage == null) {
                    list = od.getOrderPage(1);
                } else {
                    list = od.getOrderPage(Integer.parseInt(currentPage));
                }
                request.setAttribute("totalPage", totalPage);
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

            } else if (service.equals("pagination")) {
                String currentPage = request.getParameter("currentPage");
                int status = Integer.parseInt(request.getParameter("status"));
                ArrayList<Order> list = new ArrayList<>();
                if (status == 3) {
                    if (currentPage == null) {
                        list = od.getOrderPage(1);
                    } else {
                        list = od.getOrderPage(Integer.parseInt(currentPage));
                    }
                } else if (currentPage == null) {
                    list = od.searchOrderByStatus(status, 1);
                } else {
                    list = od.searchOrderByStatus(status, Integer.parseInt(currentPage));
                }
                request.setAttribute("totalPage", totalPage);
                request.setAttribute("listO", list);
                request.getRequestDispatcher("admin/template/order-pagination.jsp").forward(request, response);
            } else if (service.equals("searchByStatus")) {
                ArrayList<Order> list = new ArrayList<>();
                ArrayList<Order> listSizeS = new ArrayList<>();
                int status = Integer.parseInt(request.getParameter("status"));
                if (status == 3) {
                    request.getRequestDispatcher("OrderManager?service=om").forward(request, response);
                } else {
                    listSizeS = od.searchOrderByS(status);
                    list = od.searchOrderByStatus(status, 1);
                    int totalPageSearch = listSizeS.size() / 10;
                    if (listSizeS.size() % 10 != 0) {
                        totalPageSearch++;
                    }
                    request.setAttribute("checkStatus", status);
                    request.setAttribute("totalPage", totalPageSearch);
                    request.setAttribute("listO", list);
                    request.getRequestDispatcher("admin/order-manager.jsp").forward(request, response);
                }

            } else if (service.equals("changeStatus")) {
                int oid = Integer.parseInt(request.getParameter("oid"));
                int status = Integer.parseInt(request.getParameter("status"));
                od.changeStatus(oid, status);
            } else if (service.equals("deleteOrder")) {
                int oid = Integer.parseInt(request.getParameter("oid"));
                od.deleteOrder(oid);
                String currentPage = request.getParameter("currentPage");
                ArrayList<Order> list = new ArrayList<>();
                if (currentPage == null) {
                    list = od.getOrderPage(1);
                } else {
                    list = od.getOrderPage(Integer.parseInt(currentPage));
                }
                request.setAttribute("totalPage", totalPage);
                request.setAttribute("listO", list);
                request.getRequestDispatcher("admin/template/order-pagination.jsp").forward(request, response);

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

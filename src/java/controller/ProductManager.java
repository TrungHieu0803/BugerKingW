/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAOProduct;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "ProductManager", urlPatterns = {"/ProductManager"})
public class ProductManager extends HttpServlet {

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
        DAOProduct dp = new DAOProduct();
        ArrayList<Product> list = new ArrayList<>();
        list = dp.getAllProduct();
        try {
            String service = request.getParameter("service");
            request.setAttribute("listP", list);
            if (service.equals("pm")) {
                request.getRequestDispatcher("admin/product-manager.jsp").forward(request, response);
            }

            if (service.equals("addnew")) {
                String pid = request.getParameter("pid");
                String pname = request.getParameter("pname");
                double price = Double.parseDouble(request.getParameter("price"));
                String image = request.getParameter("image");
                String description = request.getParameter("description");
                int cateID = Integer.parseInt(request.getParameter("product_category"));
                dp.insertNewProduct(new Product(pid, pname, price, image, description, cateID));
                request.setAttribute("mess", "New product is added!");
                request.getRequestDispatcher("admin/add-product.jsp").forward(request, response);
            }
            if(service.equals("dataforupdate")){
                String pid = request.getParameter("pid");
                Product p = dp.getByID(pid);
                request.setAttribute("pid", p.getPid());
                request.setAttribute("pname", p.getPname());
                request.setAttribute("price", p.getPrice());
                request.setAttribute("image", p.getImage());
                request.setAttribute("description", p.getDescription());
                request.setAttribute("cateID", p.getCateID());
                request.getRequestDispatcher("admin/update-product.jsp").forward(request, response);
                
            }
            if(service.equals("update")){
                String pid = request.getParameter("old_pid");
                String name = request.getParameter("pname");
                double price = Double.parseDouble(request.getParameter("price"));
                String image = request.getParameter("image");
                String description = request.getParameter("description");
                int cateID = Integer.parseInt(request.getParameter("product_category"));
                Product p = new Product(pid,name,price , image, description, cateID);
                dp.updateProduct(p);
                request.getRequestDispatcher("ProductManager?service=pm").forward(request, response);
            }
            if(service.equals("changeStatus")){
                String pid = request.getParameter("pid");
                int status = Integer.parseInt(request.getParameter("status"));
                if(status==1){
                    dp.updateProductStatus(pid, 1);                   
                }else if(status==0)
                    dp.updateProductStatus(pid, 0);
            }
            if(service.equals("delete")){
                String pid = request.getParameter("pid");
                dp.deleteProduct(pid);
            }
        } catch (Exception e) {
            e.printStackTrace();
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

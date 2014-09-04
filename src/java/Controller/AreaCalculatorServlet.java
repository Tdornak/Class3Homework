/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Model.AreaCalculatorService;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tdornak
 */
@WebServlet(name = "RectangleServlet", urlPatterns = {"/Calc"})
public class AreaCalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    private static final String RESULT_PAGE = "/index.jsp";
    private double width = 0;
    private double height = 0;
    private String name = "";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        name = request.getParameter("submit");
        
        if (name.equalsIgnoreCase("circle")) {
            AreaCircle(request);
        } else {
            String sWidth = request.getParameter("txtWidth");
            width = Double.parseDouble(sWidth);
            
            String sHeight = request.getParameter("txtHeight");
            height = Double.parseDouble(sHeight);
        }

        AreaCalculatorService calc = new AreaCalculatorService(name);
        String area = calc.calculateArea(width, height);
        
        request.setAttribute("area", area);
        request.setAttribute("name", name);
        
        
        
        RequestDispatcher view = 
                request.getRequestDispatcher(RESULT_PAGE);
        view.forward(request, response);
        
        
    }
    
    private void AreaCircle(HttpServletRequest request) {
        String sWidth = request.getParameter("txtWidth");
        width = Double.parseDouble(sWidth);
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

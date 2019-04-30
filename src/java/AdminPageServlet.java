/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class AdminPageServlet extends HttpServlet {

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
         String userName = null;
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("user"))
                        userName = cookie.getValue();
                }
            }
            if (userName == null)
                response.sendRedirect("login.jsp");
             
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Administrator</title>");
            out.println(" <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"cssstylesheet.css\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
            out.println(" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">");
            out.println(" <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>");
            out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>");
            out.println("<link href=\"https://fonts.googleapis.com/css?family=Comfortaa|Gudea:700|Poiret+One\" rel=\"stylesheet\">");
            out.println("<link rel=\"stylesheet\" href=\"css/adminStyle.css\" type=\"text/css\">");
            out.println("<script src=\"js/adminJs.js\"></script>");
            out.println("</head>");
            out.println("<body>style=\"background-color: #eae4e4\"");
            out.println(" <nav class=\"navbar navbar-inverse navbar-fixed-top\">");
            out.println("<div class=\"container-fluid\">");
            out.println("<div class=\"navbar-header\">");
            out.println("<a class=\"navbar-brand\" href=\"index.html\">DreamEvents.com</a>");
            out.println(" </div>");
            out.println(" <ul class=\"nav navbar-nav\" id=\"list\" style=\"float: right;\" >");
            out.println("<li><a href=\"SubscriberListServlet\" class=\"disabled linkColor\">Subscribers</a></li>");
            out.println("<li><a href=\"EnquiryListServlet\" class=\"linkColor\">Enquiries</a></li>");
            out.println("</ul>");
            out.println(" <div class=\"navbar-header\" style=\"float:right;\">");
            out.println("<a class=\"navbar-brand\" href=\"LogoutServlet\">Logout</a>");
            out.println("</div>");
            out.println("</div>");
            out.println("</nav>");
            out.println(" <div class=\"container-fluid\">");
            out.println(" <div  style=\"height:550px;margin-top: 60px;\" id=\"content\">");
            out.println("</div>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
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

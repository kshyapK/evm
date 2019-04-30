/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mypack.dbConnection;

/**
 *
 * @author user
 */
public class SubscriberListServlet extends HttpServlet {

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
        
        String query;
        ResultSet rs;
        
        Cookie loginCookie = null;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    loginCookie = cookie;
                    break;
                }
            }
        }
        if (loginCookie != null) 
            {  
                try{
                query="select * from subscribers";
                dbConnection db=new dbConnection();


                try (PrintWriter out = response.getWriter()) {
                    /* TODO output your page here. You may use following sample code. */
                      rs=db.selectData("dream_event",query);
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");   
                    out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/stylesheet.css\">");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<table class=\"table1\" border='1'><tr><th>Subscribers Mail ID</th></tr>");
                    while(rs.next())
                    {
                         out.println("<tr><td>" + rs.getString("mail_id") + "</td></tr>");
                    }
                   out.println("</table>");
                    out.println("</body>");
                    out.println("</html>");
                }
                }catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
        }
        else
        {
              try (PrintWriter out = response.getWriter()) {
           out.println("<h1 style=\"text-align:center;color:red;margin-top:200px\">Login to proceed!</h1>");
                   }
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

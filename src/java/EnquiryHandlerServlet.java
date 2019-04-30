/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import mypack.dbConnection;

/**
 *
 * @author user
 */
public class EnquiryHandlerServlet extends HttpServlet {

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
        String name,email,phno,description,fromDate,toDate,query,curDate,service;
        name=request.getParameter("txt_name");
        email=request.getParameter("txt_email");
        description=request.getParameter("txt_des");
        phno=request.getParameter("txt_phone");
        fromDate=request.getParameter("fromdate");
        toDate=request.getParameter("todate");
        service=request.getParameter("service");
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        curDate=dateFormat.format(date);
        
        dbConnection db=new dbConnection();
        query="insert into enquiry_detail values('"+curDate+"','"+name+"','"+email+"','"+phno+"','"+fromDate+"','"+toDate+"','"+service+"','"+description+"')";
        
       db.updateData("dream_event",query);
       //response.setStatus(HttpServletResponse.SC_NO_CONTENT);
       HttpSession session=request.getSession();
      session.setAttribute("getAlert", "Yes");
      
      
      PrintWriter pw=response.getWriter();
        pw.println("<script type=\"text/javascript\">");
        pw.println("alert('Form submitted Successfully');");
        pw.println("</script>");
        
        RequestDispatcher rd=request.getRequestDispatcher("index.html");
       
       
        if(service.equalsIgnoreCase("photography"))
            rd=request.getRequestDispatcher("photography.jsp");
        if(service.equalsIgnoreCase("decoration"))
            rd=request.getRequestDispatcher("decoration.jsp");
        if(service.equalsIgnoreCase("catering"))
            rd=request.getRequestDispatcher("catering.jsp");
        if(service.equalsIgnoreCase("accommodation"))
            rd=request.getRequestDispatcher("accommodation.jsp");
        if(service.equalsIgnoreCase("transportation"))
            rd=request.getRequestDispatcher("transportation.jsp");
       
        
        rd.include(request, response);
        //response.sendRedirect("photography.jsp");
    
      /* try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EnquiryHandlerServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> " + name+"\n"+email+"\n"+description+"\n"+phno+"\n"+fromDate+"\n"+toDate+ "\n"+service+"</h1>");
            out.println("</body>");
            out.println("</html>");
        }*/
    
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

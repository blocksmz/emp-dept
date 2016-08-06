/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import zj.bean.doAddEmp;
import zj.bean.doModEmp;
import zj.bean.doGetDep;
import java.util.*;
import zj.factory.IEmpDAOFactory;

/**
 *
 * @author blocks
 */
@WebServlet(urlPatterns = {"/emp"})
public class emp extends HttpServlet {

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
        
        String action=request.getParameter("action");
        
        System.out.println(action);
        
        if(action.equals("add"))
        {
            boolean flag=false;
            
            try {
                flag=doAddEmp.doInsert(getServletConfig(), request, response);
            } catch (Exception ex) {
                Logger.getLogger(emp.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
            
            if(flag==true)
            {
                request.setAttribute("result", "雇员信息添加成功！");
                request.getRequestDispatcher("addEmp.jsp").forward(request, response);
            }
            else
            {
                request.setAttribute("result", "雇员信息添加失败！");
                request.getRequestDispatcher("addEmp.jsp").forward(request, response);
            }
        }
        
        if(action.equals("search"))
        {
            zj.vo.Emp emp=null;
            try {
                emp=IEmpDAOFactory.getConnection().getById(Integer.parseInt(request.getParameter("sid")));
            } catch (Exception ex) {
                Logger.getLogger(emp.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            request.getSession(true).setAttribute("emp", emp);
            
            request.getRequestDispatcher("modEmp.jsp").forward(request, response);
        }
        
        if(action.equals("mod"))
        {
            boolean flag=false;
            
            try {
                flag=doModEmp.doModify(getServletConfig(), request, response);
            } catch (Exception ex) {
                Logger.getLogger(emp.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
            
            System.out.println("Contextpath:"+getServletContext().getContextPath());
            System.out.println("realpath:"+getServletContext().getRealPath("/"));
            
            if(flag==true)
            {
                request.setAttribute("result", "雇员信息更改成功！");
                request.getRequestDispatcher("modEmp.jsp").forward(request, response);
            }
            else
            {
                request.setAttribute("result", "雇员信息更改失败！");
                request.getRequestDispatcher("modEmp.jsp").forward(request, response);
            }
        }
        
        if(action.equals("dep"))
        {
            doGetDep dg=new doGetDep();
            dg.getDepDetail(Integer.parseInt(request.getParameter("id")));
            request.setAttribute("dep", dg);
            
            request.getRequestDispatcher("depdetail.jsp").forward(request, response);
          
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
    public void doGet(HttpServletRequest request, HttpServletResponse response)
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
    public void doPost(HttpServletRequest request, HttpServletResponse response)
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

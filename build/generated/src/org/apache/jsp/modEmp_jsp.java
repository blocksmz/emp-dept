package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modEmp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>修改雇员信息</title>\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("         ");

        if(request.getAttribute("result")!=null)
        {
            String result=(String)request.getAttribute("result");
    
      out.write("\n");
      out.write("    ");
      out.print(result);
      out.write("\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("    \n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    <h1>修改雇员信息</h1>\n");
      out.write("    <center>\n");
      out.write("        <div style=\"float:right;\">  \n");
      out.write("    <form action=\"emp?action=search\" method=\"post\">\n");
      out.write("     <input type=\"text\" name=\"sid\">\n");
      out.write("      <input type=\"submit\" value=\"查找\">\n");
      out.write("    </form>\n");
      out.write("            </div> \n");
      out.write("    </center>\n");
      out.write("    \n");
      out.write("    ");
      zj.vo.Emp emp = null;
      synchronized (session) {
        emp = (zj.vo.Emp) _jspx_page_context.getAttribute("emp", PageContext.SESSION_SCOPE);
        if (emp == null){
          emp = new zj.vo.Emp();
          _jspx_page_context.setAttribute("emp", emp, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("    <div style=\"margin-left: 40px;\">\n");
      out.write("         <img src=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((zj.vo.Emp)_jspx_page_context.findAttribute("emp")).getPhoto())));
      out.write("\" alt=\"employer picture\">\n");
      out.write("    </div>\n");
      out.write("    <form action=\"emp?action=mod\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("        \n");
      out.write("       <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        雇员姓名(*)\n");
      out.write("                    </td>\n");
      out.write("                    <td><input type=\"text\" id=\"ename\" name=\"ename\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((zj.vo.Emp)_jspx_page_context.findAttribute("emp")).getEname())));
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        雇员工作(*）\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" id=\"job\" name=\"job\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((zj.vo.Emp)_jspx_page_context.findAttribute("emp")).getJob())));
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        雇佣日期（*）\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" id=\"hiredate\" name=\"hiredate\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((zj.vo.Emp)_jspx_page_context.findAttribute("emp")).getHiredate())));
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        基本工资（*）\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" id=\"sal\" name=\"sal\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((zj.vo.Emp)_jspx_page_context.findAttribute("emp")).getSal())));
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        奖金\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"comm\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((zj.vo.Emp)_jspx_page_context.findAttribute("emp")).getComm())));
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        领导编号\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"mgr\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((zj.vo.Emp)_jspx_page_context.findAttribute("emp")).getMgr())));
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        部门编号\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"deptno\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((zj.vo.Emp)_jspx_page_context.findAttribute("emp")).getDeptno())));
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        雇员相片\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"file\" accept=\"image/jpeg\" name=\"photo\">\n");
      out.write("                        \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        雇员简介\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"note\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((zj.vo.Emp)_jspx_page_context.findAttribute("emp")).getNote())));
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <input type=\"submit\" value=\"提交\">\n");
      out.write("            <input type=\"reset\" value=\"重置\"> \n");
      out.write("    </form>   \n");
      out.write("        \n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

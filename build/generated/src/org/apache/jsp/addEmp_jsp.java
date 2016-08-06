package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addEmp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>添加雇员</title>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            function ck()\n");
      out.write("            {\n");
      out.write("\n");
      out.write("                if(document.getElementById(\"ename\").value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"名称不能为空！\");\n");
      out.write("                    document.getElementById(\"ename\").focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(/\\d+/.test(document.getElementById(\"ename\").value))\n");
      out.write("                {\n");
      out.write("                    alert(\"名称中不能包含数字!\");\n");
      out.write("                    var nm=document.getElementById(\"ename\");\n");
      out.write("                    nm.value=\"\";\n");
      out.write("                    nm.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                if(document.getElementById(\"job\").value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"工作不能为空！\");\n");
      out.write("                    document.getElementById(\"job\").focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                if(document.getElementById(\"hiredate\").value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"雇佣日期不能为空！\");\n");
      out.write("                    document.getElementById(\"hiredate\").focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(!/^\\d{4}-\\d{2}-\\d{2}$/.test(document.getElementById(\"hiredate\").value))\n");
      out.write("                {\n");
      out.write("                    alert(\"日期格式为xxxx-xx-xx!\");\n");
      out.write("                    document.getElementById(\"hiredate\").value=\"\";\n");
      out.write("                    document.getElementById(\"hiredate\").focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                if(document.getElementById(\"sal\").value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"工资不能为空！\");\n");
      out.write("                    document.getElementById(\"sal\").focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(/\\D+/.test(document.getElementById(\"sal\").value))\n");
      out.write("                {\n");
      out.write("                    alert(\"工资只能是数字!\");\n");
      out.write("                    var sl=document.getElementById(\"sal\");\n");
      out.write("                    sl.value=\"\";\n");
      out.write("                    sl.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("         </script>   \n");
      out.write("            \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <center>\n");
      out.write("        ");

            if(request.getAttribute("result")!=null)
            {
                String result=(String)request.getAttribute("result");
         
      out.write("\n");
      out.write("    \n");
      out.write("         <h4>");
      out.print(result);
      out.write("</h4>\n");
      out.write("\n");
      out.write("         ");

            }
         
      out.write("\n");
      out.write("        \n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("        <h1>添加雇员</h1>\n");
      out.write("        <form action=\"emp?action=add\" method=\"post\" enctype=\"multipart/form-data\" onsubmit=\"return ck();\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        雇员姓名(*)\n");
      out.write("                    </td>\n");
      out.write("                    <td><input type=\"text\" id=\"ename\" name=\"ename\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        雇员工作(*）\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" id=\"job\" name=\"job\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        雇佣日期（*）\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" id=\"hiredate\" name=\"hiredate\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        基本工资（*）\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" id=\"sal\" name=\"sal\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        奖金\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"comm\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        领导编号\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"mgr\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        部门编号\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"deptno\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        雇员相片\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"file\" accept=\"image/jpeg\" name=\"photo\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        雇员简介\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"note\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <input type=\"submit\" value=\"提交\">\n");
      out.write("            <input type=\"reset\" value=\"重置\">\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>");
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

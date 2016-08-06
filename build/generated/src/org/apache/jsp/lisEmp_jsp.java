package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import zj.vo.Emp;
import zj.factory.IEmpDAOFactory;

public final class lisEmp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


        int pageSize=5;
        int pageCount;
        int showPage;
        int recordCount;
        List<Emp> cont;
        
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>所有雇员显示</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    ");

        if(cont==null)
        {
            
            cont=IEmpDAOFactory.getConnection().getAll();
            
            recordCount=cont.size();
            
            if(recordCount%5==0)
            {
                pageCount=recordCount/pageSize;
            }
            else
            {
                pageCount=recordCount/pageSize+1;
            }
            
            showPage=1;
        }
        if(request.getParameter("tpage")!=null)
        {
            int bshow=Integer.parseInt(request.getParameter("tpage"));
             if(bshow<1)
              {
                 showPage=1;
             }
        
              if(bshow>pageCount)
              {
                  showPage=pageCount;
              }
        }
    
      out.write("\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>所有雇员</h1>\n");
      out.write("        <form>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        雇员名称\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        雇员工作\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        雇佣日期\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        薪资\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        奖金\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        领导编号\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        部门编号\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        雇员风采\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        雇员简介\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            \n");

    int i=0;
    while(i<pageSize)
    {

        if((showPage-1)*pageSize+i+1>recordCount)
                    {
                        break;
                    }

      out.write("\n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(cont.get((showPage-1)*pageSize+i).getEname() );
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(cont.get((showPage-1)*pageSize+i).getJob() );
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(cont.get((showPage-1)*pageSize+i).getHiredate() );
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(cont.get((showPage-1)*pageSize+i).getSal() );
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(cont.get((showPage-1)*pageSize+i).getComm() );
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(cont.get((showPage-1)*pageSize+i).getMgr() );
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       ");
      out.print(cont.get((showPage-1)*pageSize+i).getDeptno() );
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       <img src=\"");
      out.print(cont.get((showPage-1)*pageSize+i).getPhoto() );
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(cont.get((showPage-1)*pageSize+i).getNote() );
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("        \n");
      out.write("    ");

        i++;
      }
    
      out.write("\n");
      out.write("\n");
      out.write("           </table> \n");
      out.write("        </form>\n");
      out.write("    <div>\n");
      out.write("        <a href=\"lisEmp.jsp?tpage=1\">首页</a>\n");
      out.write("        <a href=\"lisEmp.jsp?tpage=");
      out.print(showPage-1);
      out.write("\">上一页</a>\n");
      out.write("        <a href=\"lisEmp.jsp?tpage=");
      out.print(showPage+1);
      out.write("\">下一页</a>\n");
      out.write("        <a href=\"lisEmp.jsp?tpage=");
      out.print(pageCount);
      out.write("\">尾页</a>\n");
      out.write("    </div>\n");
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

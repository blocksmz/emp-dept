<%-- 
    Document   : lisDep
    Created on : Aug 5, 2016, 11:44:27 PM
    Author     : blocks
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="zj.vo.Dept,zj.factory.IDeptDAOFactory,zj.factory.IEmpDAOFactory,zj.vo.Emp " %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>显示所有部门</title>
    </head>
    <%!
        int pageSize=10;
        int pageCount;
        int showPage;
        int recordCount;
        List<Dept> cont;
        
    %>
    
    <%
        if(cont==null)
        {
            cont=IDeptDAOFactory.getConnection().getAll();
            recordCount=cont.size();
            if(recordCount%pageSize==0)
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
    %>
    
    
    <body>
    <center>
        <h1>部门列表</h1>
        
        <table>
            <tr>
                <td>
                    部门编号
                </td>
                <td>
                    部门名称
                </td>
                <td>
                    部门位置
                </td>
                <td>
                    部门成员列表
                </td>
            </tr>
            
            <%
                int i=0;
                while(i<pageSize)
                {
                    if((showPage-1)*pageSize+i+1>recordCount)
                    {
                        break;
                    }
            %>
            
            <tr>
                <td>
                    <a href="emp?action=dep&id=<%=cont.get((showPage-1)*pageSize+i).getDeptno()%>"><%=cont.get((showPage-1)*pageSize+i).getDeptno()%></a>
                </td>
                <td>
                    <%=cont.get((showPage-1)*pageSize+i).getDname() %>
                </td>
                <td>
                    <%=cont.get((showPage-1)*pageSize+i).getLoc() %>
                </td>
                <td>
                    <%
                        List<Emp> emp=IEmpDAOFactory.getConnection().getByDepno(cont.get((showPage-1)*pageSize+i).getDeptno());
                        Iterator<Emp> iter=emp.iterator();
                        while(iter.hasNext())
                        {
                           Emp iemp=iter.next();
                    %>
                    <a href="emp?action=search&sid=<%=cont.get((showPage-1)*pageSize+i).getDeptno()%>"><span><%=iemp.getEname()%></span></a>
                    <% 
                        System.out.println("emp name:"+iemp.getEname());
                        }
                    %>
                </td>
            </tr>   
                    
             <%
                 i++;
                                       
                }
             %>

        </table>
         <div>
        <a href="lisDep.jsp?tpage=1">首页</a>
        <a href="lisDep.jsp?tpage=<%=showPage-1%>">上一页</a>
        <a href="lisDep.jsp?tpage=<%=showPage+1%>">下一页</a>
        <a href="lisDep.jsp?tpage=<%=pageCount%>">尾页</a>
    </div>
    </center>
    </body>
</html>

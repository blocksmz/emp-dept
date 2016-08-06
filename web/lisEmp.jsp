<%-- 
    Document   : lisEmp
    Created on : Aug 5, 2016, 10:12:44 PM
    Author     : blocks
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="zj.vo.Emp" %>
<%@page import="zj.factory.IEmpDAOFactory"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>所有雇员显示</title>
    </head>
    
    <%!
        int pageSize=5;
        int pageCount;
        int showPage;
        int recordCount;
        List<Emp> cont;
        %>
        
        
    <%
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
    %>
    
    <body>
    <center>
        <h1>所有雇员</h1>
        <form>
            <table>
                <tr>
                    <td>
                        雇员名称
                    </td>
                    <td>
                        雇员工作
                    </td>
                    <td>
                        雇佣日期
                    </td>
                    <td>
                        薪资
                    </td>
                    <td>
                        奖金
                    </td>
                    <td>
                        领导编号
                    </td>
                    <td>
                        部门编号
                    </td>
                    <td>
                        雇员风采
                    </td>
                    <td>
                        雇员简介
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
                        <%=cont.get((showPage-1)*pageSize+i).getEname() %>
                    </td>
                    <td>
                        <%=cont.get((showPage-1)*pageSize+i).getJob() %>
                    </td>
                    <td>
                        <%=cont.get((showPage-1)*pageSize+i).getHiredate() %>
                    </td>
                    <td>
                        <%=cont.get((showPage-1)*pageSize+i).getSal() %>
                    </td>
                    <td>
                        <%=cont.get((showPage-1)*pageSize+i).getComm() %>
                    </td>
                    <td>
                        <%=cont.get((showPage-1)*pageSize+i).getMgr() %>
                    </td>
                    <td>
                       <%=cont.get((showPage-1)*pageSize+i).getDeptno() %>
                    </td>
                    <td>
                       <img src="<%=cont.get((showPage-1)*pageSize+i).getPhoto() %>">
                    </td>
                    <td>
                        <%=cont.get((showPage-1)*pageSize+i).getNote() %>
                    </td>
                </tr>
        
    <%
        i++;
      }
    %>

           </table> 
        </form>
    <div>
        <a href="lisEmp.jsp?tpage=1">首页</a>
        <a href="lisEmp.jsp?tpage=<%=showPage-1%>">上一页</a>
        <a href="lisEmp.jsp?tpage=<%=showPage+1%>">下一页</a>
        <a href="lisEmp.jsp?tpage=<%=pageCount%>">尾页</a>
    </div>
    </center>
    </body>
</html>
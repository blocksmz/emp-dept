<%-- 
    Document   : modEmp
    Created on : Aug 5, 2016, 7:38:47 PM
    Author     : blocks
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>修改雇员信息</title>
    </head>
   
    <body>
    <center>
         <%
        if(request.getAttribute("result")!=null)
        {
            String result=(String)request.getAttribute("result");
    %>
    <%=result%>
    <%
        }
    %>
    
    <br>
    <br>
    
    <h1>修改雇员信息</h1>
    <center>
        <div style="float:right;">  
    <form action="emp?action=search" method="post">
     <input type="text" name="sid">
      <input type="submit" value="查找">
    </form>
            </div> 
    </center>
    
    <jsp:useBean id="emp" scope="session" class="zj.vo.Emp" />
    <div style="margin-left: 140px;">
         <img src="<jsp:getProperty name="emp" property="photo"/>" alt="employer picture">
    </div>
    <form action="emp?action=mod" method="post" enctype="multipart/form-data">
        
       <table>
                <tr>
                    <td>
                        雇员姓名(*)
                    </td>
                    <td><input type="text" id="ename" name="ename" value="<jsp:getProperty name="emp" property="ename"/>">
                    </td>
                </tr>
                
                <tr>
                    <td>
                        雇员工作(*）
                    </td>
                    <td>
                        <input type="text" id="job" name="job" value="<jsp:getProperty name="emp" property="job"/>">
                    </td>
                </tr>
                <tr>
                    <td>
                        雇佣日期（*）
                    </td>
                    <td>
                        <input type="text" id="hiredate" name="hiredate" value="<jsp:getProperty name="emp" property="hiredate"/>">
                    </td>
                </tr>
                <tr>
                    <td>
                        基本工资（*）
                    </td>
                    <td>
                        <input type="text" id="sal" name="sal" value="<jsp:getProperty name="emp" property="sal"/>">
                    </td>
                </tr>
                <tr>
                    <td>
                        奖金
                    </td>
                    <td>
                        <input type="text" name="comm" value="<jsp:getProperty name="emp" property="comm"/>">
                    </td>
                </tr>
                
                <tr>
                    <td>
                        领导编号
                    </td>
                    <td>
                        <input type="text" name="mgr" value="<jsp:getProperty name="emp" property="mgr"/>">
                    </td>
                </tr>
                <tr>
                    <td>
                        部门编号
                    </td>
                    <td>
                        <input type="text" name="deptno" value="<jsp:getProperty name="emp" property="deptno"/>">
                    </td>
                </tr>
                
                <tr>
                    <td>
                        雇员相片
                    </td>
                    <td>
                        <input type="file" accept="image/jpeg" name="photo">
                        
                    </td>
                </tr>
                <tr>
                    <td>
                        雇员简介
                    </td>
                    <td>
                        <input type="text" name="note" value="<jsp:getProperty name="emp" property="note"/>">
                    </td>
                </tr>
            </table>
            <input type="submit" value="提交">
            <input type="reset" value="重置"> 
    </form>   
        
    </center>
    </body>
</html>

<%-- 
    Document   : addEmp
    Created on : Aug 2, 2016, 7:11:30 PM
    Author     : blocks
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>添加雇员</title>
        
        
        
        <script>
            
            function ck()
            {

                if(document.getElementById("ename").value=="")
                {
                    alert("名称不能为空！");
                    document.getElementById("ename").focus();
                    return false;
                }
                else if(/\d+/.test(document.getElementById("ename").value))
                {
                    alert("名称中不能包含数字!");
                    var nm=document.getElementById("ename");
                    nm.value="";
                    nm.focus();
                    return false;
                }
                
                if(document.getElementById("job").value=="")
                {
                    alert("工作不能为空！");
                    document.getElementById("job").focus();
                    return false;
                }
                
                if(document.getElementById("hiredate").value=="")
                {
                    alert("雇佣日期不能为空！");
                    document.getElementById("hiredate").focus();
                    return false;
                }
                else if(!/^\d{4}-\d{2}-\d{2}$/.test(document.getElementById("hiredate").value))
                {
                    alert("日期格式为xxxx-xx-xx!");
                    document.getElementById("hiredate").value="";
                    document.getElementById("hiredate").focus();
                    return false;
                }
                
                
                if(document.getElementById("sal").value=="")
                {
                    alert("工资不能为空！");
                    document.getElementById("sal").focus();
                    return false;
                }
                else if(/\D+/.test(document.getElementById("sal").value))
                {
                    alert("工资只能是数字!");
                    var sl=document.getElementById("sal");
                    sl.value="";
                    sl.focus();
                    return false;
                }
                
            }
            
         </script>   
            
    </head>
    <body>
        
        <center>
        <%
            if(request.getAttribute("result")!=null)
            {
                String result=(String)request.getAttribute("result");
         %>
    
         <h4><%=result%></h4>

         <%
            }
         %>
        
         <br>
         <br>
        <h1>添加雇员</h1>
        <form action="emp?action=add" method="post" enctype="multipart/form-data" onsubmit="return ck();">
            <table>
                <tr>
                    <td>
                        雇员姓名(*)
                    </td>
                    <td><input type="text" id="ename" name="ename">
                    </td>
                </tr>
                
                <tr>
                    <td>
                        雇员工作(*）
                    </td>
                    <td>
                        <input type="text" id="job" name="job">
                    </td>
                </tr>
                <tr>
                    <td>
                        雇佣日期（*）
                    </td>
                    <td>
                        <input type="text" id="hiredate" name="hiredate">
                    </td>
                </tr>
                <tr>
                    <td>
                        基本工资（*）
                    </td>
                    <td>
                        <input type="text" id="sal" name="sal">
                    </td>
                </tr>
                <tr>
                    <td>
                        奖金
                    </td>
                    <td>
                        <input type="text" name="comm">
                    </td>
                </tr>
                
                <tr>
                    <td>
                        领导编号
                    </td>
                    <td>
                        <input type="text" name="mgr">
                    </td>
                </tr>
                <tr>
                    <td>
                        部门编号
                    </td>
                    <td>
                        <input type="text" name="deptno">
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
                        <input type="text" name="note">
                    </td>
                </tr>
            </table>
            <input type="submit" value="提交">
            <input type="reset" value="重置">
        </form>
    </center>
    </body>
</html>
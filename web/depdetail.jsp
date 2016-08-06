<%-- 
    Document   : depdetail
    Created on : Aug 6, 2016, 11:32:44 AM
    Author     : blocks
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>部门详细信息</title>
    </head>
    <jsp:useBean id="dep" scope="request" class="zj.bean.doGetDep" />
    <body>
    <center>
        <h1>部门详细信息</h1>
        
        <table>
            <tr>
                <td>部门id</td>
                <td><jsp:getProperty name="dep" property="depno" /></td>
            </tr>
            
            <tr>
                <td>
                    部门名称
                </td>
                <td>
                    <jsp:getProperty name="dep" property="depname" />
                </td>
            </tr>
            
            <tr>
                <td>
                    部门位置
                </td>
                <td>
                    <jsp:getProperty name="dep" property="deploc" />
                </td>
            </tr>
            
            <tr>
                <td>
                    部门总人数
                </td>
                <td>
                    <jsp:getProperty name="dep" property="sum" />
                </td>
            </tr>
            
            <tr>
                <td>
                    部门最高工资
                </td>
                <td>
                    <jsp:getProperty name="dep" property="highest" />
                </td>
                
            </tr>
            
            <tr>
                <td>
                    部门最低工资
                </td>
                <td>
                    <jsp:getProperty name="dep" property="lowest" />
                </td>
            </tr>
            
            <tr>
                <td>
                    部门平均工资
                </td>
                <td>
                    <jsp:getProperty name="dep" property="average" />
                </td>
            </tr>
        </table>

    </center>
    </body>
</html>

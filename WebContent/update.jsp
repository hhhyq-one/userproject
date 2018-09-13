<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="Userservlet" method="post">
       <table border="1" cellpadding="0" cellspacing="0">
       <input type="hidden" name="action" value="update">
         <tr>
           <td>用户编号：</td><td><input type="text" name="id" value="<%=request.getParameter("id")%>" readonly="true"></td>
         </tr>
         <tr>
           <td>用户名：</td><td><input type="text" name="username" value="<%=request.getParameter("username")%>"></td>
         </tr>
          <tr>
           <td>密码：</td><td><input type="password" name="password" value="<%=request.getParameter("password")%>"></td>
         </tr>
          <tr>
           <td>身份证：</td><td><input type="text" name="idenity" value="<%=request.getParameter("idenity")%>"></td>
         </tr>
          <tr>
           <td>家庭住址：</td><td><input type="text" name="address" value="<%=request.getParameter("address")%>"></td>
         </tr>
          <tr>
           <td>出生日期：</td><td><input type="text" name="mydate" value="<%=request.getParameter("mydate")%>"></td>
         </tr>
          <tr>
           <td>电话：</td><td><input type="text" name="phone" value="<%=request.getParameter("phone")%>"></td>
         </tr>
         <tr>
            <td>修改</td><td><input type="submit" value="修改"></td>
         </tr>
       </table>
     </form>

</body>
</html>
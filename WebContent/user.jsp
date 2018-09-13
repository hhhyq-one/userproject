<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
     <table border="2">
         <tr>
           <td>用户编号</td><td>用户名</td><td>密码</td><td>身份证号</td><td>地址</td><td>出生年月</td><td>手机号</td><td colspan="4">用户操作</td>
        </tr>  
        <tr>
           <td>${user.id }</td><td>${user.username }</td><td>${user.password }</td><td>${user.idenity }</td><td>${user.address }</td><td>${user.mydate }</td><td>${user.phone }</td>
           <td><form action="Userservlet" method="post">
           <input type="hidden" name="action" value="delete">
            <input type="hidden" name="id" value="${user.id }">
           <input type="submit" value="删除">
           </form>
           </td>
           <td>
            <form action="update.jsp" method="post">
              <input type="hidden" name="id" value="${user.id }">
              <input type="hidden" name="username" value="${user.username }">
              <input type="hidden" name="password" value="${user.password }">
              <input type="hidden" name="idenity" value="${user.idenity }">
              <input type="hidden" name="address" value="${user.address }">
              <input type="hidden" name="mydate" value="${user.mydate }">
              <input type="hidden" name="phone" value="${user.phone }">
           	  <input type="submit" value="修改">
           </form>
           </td>
            <td>         
           <input type="button" name="Submit" onclick="javascript:history.back(-1);" value="返回上一级">
           </td>
           <td>
           <form action="Userservlet" method="post">
              <input type="hidden" name="action" value="dl">
              <input type="hidden" name="username" value="${name }">
              <input type="hidden" name="password" value="${pwd }">
           	  <input type="submit" value="返回主界面">
           </form>
           </td>
        </tr>     
     </table>
</body>
</html>
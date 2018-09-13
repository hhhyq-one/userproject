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
       <input type="hidden" name="action" value="insert">
         <tr>
           <td>用户名：</td><td><input type="text" name="username"></td>
         </tr>
          <tr>
           <td>密码：</td><td><input type="password" name="password"></td>
         </tr>
          <tr>
           <td>身份证：</td><td><input type="text" name="idenity"></td>
         </tr>
          <tr>
           <td>家庭住址：</td><td><input type="text" name="address"></td>
         </tr>
          <tr>
           <td>出生日期：</td><td><input type="text" name="mydate"></td>
         </tr>
          <tr>
           <td>电话：</td><td><input type="text" name="phone"></td>
         </tr>
         <tr>
            <td>注册</td><td><input type="submit" value="注册"></td>
         </tr>
       </table>
     </form>
</body>
</html>
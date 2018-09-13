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
      <input type="hidden" name="action" value="delete">
      <tr>
      <td><input type="text" name="id" placeholder="请输入用户编号："><br></td>
      </tr>
      <tr>
         <td><input type="submit" value="确认"></td>
      </tr>
      </table>
   </form>
     
     
</body>
</html>
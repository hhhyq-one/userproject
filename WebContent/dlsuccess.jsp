<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
    <h>${name }登录成功：欢迎进入！！！！ <a href="Userservlet?action=select"><h>查看所有用户信息</h></a></h>
    <br>
    <form action="Userservlet" method="post">
      <table border="2">
      <input type="hidden" name="action" value="serach">
         <tr>
           <td>用户名：</td><td colspan="3"><input type="text" name="username"></td>
         </tr>
         <tr>
           <td>地址：</td><td colspan="3"><input type="text" name="address"></td>
         </tr>
         <tr>
           <td>排序元素：</td><td>ID<input type="radio" name="cell" value="id"></td><td>用户名<input type="radio" name="cell" value="username"></td><td>出生日期：<input type="radio" name="cell" value="mydate"></td>
         </tr>
         <tr>
           <td>排序方式：</td><td colspan="1.5">升序<input type="radio" name="order" value="asc"></td><td colspan="1.5">降序<input type="radio" name="order" value="desc"></td>
         </tr>
         <tr>
           <td>查询</td><td><input type="submit" value="查询"></td>
         </tr>
      </table>
    </form>
    <form action="Userservlet" method="post">
      <input type="hidden" name="action" value="userout">
      <input type="submit" value="注销">
    </form>
    
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="Userservlet" method="post">
   <table border="2">
   <input type="hidden" name="action" value="dl">
      <tr>
           <td><h>用户编号</h></td>
         </tr>
     <c:forEach items="${listid }" var="id">
         <tr>
           <td><a href="Userservlet?action=sall&&id=${id }">${id }</a></td>
         </tr>
     </c:forEach> 
      <tr>
           <td>
           <input type="hidden" name="username" value="${name }">
           <input type="hidden" name="password" value="${pwd }">
           <input type="submit" value="返回主界面"></td>
         </tr>
    </table>
</form>         
</body>
</html>
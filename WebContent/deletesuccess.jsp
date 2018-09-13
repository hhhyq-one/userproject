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
     <table>
      <input type="hidden" name="action" value="select">
        <tr>
          <td> <h1>成功删除了${count}条数据</h1></td>
        </tr>
        <tr>
          <td><input type="submit" value="返回用户列表界面"></td>
        </tr>
     </table>     
     </form>
    
</body>
</html>
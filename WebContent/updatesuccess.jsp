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
          <td> <h>成功修改了${count }条信息</h></td>
        </tr>
        <tr>
        
          <td><input type="submit" value="返回用户列表界面"></td>
          <td><input type="button" name="Submit" onclick="javascript:history.back(-2);" value="返回上二级"></td>
        </tr>
     </table>
       
     </form>
    
</body>
</html>
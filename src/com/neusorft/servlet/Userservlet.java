package com.neusorft.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neusorft.DButil.Dbutil;
import com.neusorft.UserDao.userdao;
import com.neusorft.user.User;


@WebServlet(urlPatterns= {"/Userservlet"},name="Userservlet")
public class Userservlet extends HttpServlet{
   @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
}
   
   @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String action = request.getParameter("action");
	    if (action.equals("insert")) {
	    	String username = request.getParameter("username");
			String password = request.getParameter("password");
			String idenity = request.getParameter("idenity");
			String address = request.getParameter("address");
			String mydate = request.getParameter("mydate");
			String phone = request.getParameter("phone");
			User user=new User(0,username,password,idenity,address,mydate,phone);
			int insert = insert(user);
			request.setAttribute("count", insert);
			request.getRequestDispatcher("insertsuccess.jsp").forward(request, response);
		}
	    if (action.equals("select")) {
	    	List<Integer> listid = selectall();
	    	request.setAttribute("listid", listid);
	    	request.getRequestDispatcher("/userid.jsp").forward(request, response);
	    }
	    
	    if(action.equals("sall")) {
	    	List<User> user=select();
	    	String sid = request.getParameter("id");
	    	int id=Integer.parseInt(sid);
	    	for (User u : user) {
				if(id==u.getId()) {
					request.setAttribute("user", u);
					request.getRequestDispatcher("/user.jsp").forward(request, response);
				}
			}
	    	
	    }
	    
	    if(action.equals("update")) {
	    	String sid=request.getParameter("id");
	    	int id=Integer.parseInt(sid);
	    	String username=request.getParameter("username");
	    	String password=request.getParameter("password");
	    	String idenity=request.getParameter("idenity");
	    	String address=request.getParameter("address");
	    	String mydate=request.getParameter("mydate");
	    	String phone=request.getParameter("phone");
	    	User user=new User(id,username,password,idenity,address,mydate,phone);
	    	int i = update(user);
	    	if(i!=0) {
	    		request.setAttribute("count", i);
				request.getRequestDispatcher("updatesuccess.jsp").forward(request, response);
	    	}else {
	    		request.getRequestDispatcher("updatefailure.jsp").forward(request, response);
	    	}
			
	    }
	    
	    if(action.equals("delete")) {
	    	String sid=request.getParameter("id");
	    	int id=Integer.parseInt(sid);
	    	int i = delete(id);
	    	if(i!=0) {
	    		request.setAttribute("count", i);
				request.getRequestDispatcher("deletesuccess.jsp").forward(request, response);
	    	}else {
	    		request.getRequestDispatcher("deletefailure.jsp").forward(request, response);
	    	}
	    }
	    
	    if(action.equals("dl")) {
	    	String username = request.getParameter("username");
	    	String password = request.getParameter("password");
	    	String name = dl(username, password);
	    	HttpSession session = request.getSession();
	    	if(!"".equals(name)) {
	    		session.setAttribute("name", name);
	    		session.setAttribute("pwd", password);
	    		request.getRequestDispatcher("dlsuccess.jsp").forward(request, response);
	    	}else {
	    		request.getRequestDispatcher("dlerror.jsp").forward(request, response);
	    	}
	    }
	    
	    if(action.equals("serach")) {
	    	String username = request.getParameter("username");
	    	String address = request.getParameter("address");
	    	String cell = request.getParameter("cell");
	    	String order = request.getParameter("order");
	    	Map<String, String> map=new HashMap<>();
	    	map.put("username", username);
	    	map.put("address", address);
	    	map.put("cell", cell);
	    	map.put("order", order);
	    	String s=username+address+cell+order;
	    	if(!"".equals(s)&&s!=null) {
	    		List<Integer> listid = serach(map);
	    		request.setAttribute("listid", listid);
	    		request.getRequestDispatcher("userid.jsp").forward(request, response);
	    	}else {
	    		List<Integer> listid = selectall();
		    	request.setAttribute("listid", listid);
		    	request.getRequestDispatcher("/userid.jsp").forward(request, response);
	    	}
	    }
	    if(action.equals("userout")) {
	    	HttpSession session = request.getSession();
	        session.removeAttribute("name");
	        request.getRequestDispatcher("start.jsp").forward(request, response);
	    }
	    
	}
   
   
   public int insert(User user) {
	   userdao u=new userdao();
	   int i = u.insert(user);
	   return i;
   }
   
   public List<Integer> selectall(){
	   userdao u=new userdao();
	   List<Integer> listid = u.selectall();
	   return listid;
   }
   
   public List<User> select(){
	   userdao u=new userdao();
	   List<User> list = u.select();
	   return list;
   }
   
   public int update(User user) {
	   userdao u=new userdao();
	   int i = u.update(user);
	   return i;
   }
   
   public int delete(int id) {
	   userdao u=new userdao();
	   int i = u.delete(id);
	   return i;
   }
   
   public String dl(String username,String password) {
	   userdao u=new userdao();
	   String name=u.dl(username,password);
	   return name;
   }
   
   public List<Integer> serach(Map<String, String> map){
	   userdao u=new userdao();
	   List<Integer> listid = u.serach(map);
	   return listid;
   }   
}

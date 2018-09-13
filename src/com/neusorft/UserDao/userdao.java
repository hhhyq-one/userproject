package com.neusorft.UserDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mysql.jdbc.Connection;
import com.neusorft.DButil.Dbutil;
import com.neusorft.user.User;


//插入一条数据
public class userdao {
	Dbutil db=new Dbutil();
	public int insert(User user) {
		int num = 0;
		String sql="insert into t00_user (username,password,idenity,address,mydate,phone) values(?,?,?,?,?,?)";
		PreparedStatement ps = db.getPs(sql);
		try {
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getIdenity());
			ps.setString(4, user.getAddress());
			ps.setString(5, user.getMydate());
			ps.setString(6, user.getPhone());
			num = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}
	
	//查询所有用户的编号
	public List<Integer> selectall(){
		List<Integer> list=new ArrayList<>();
		String sql="select id from t00_user";
		PreparedStatement ps = db.getPs(sql);
		try {
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Integer integer=new Integer(rs.getInt("id"));
				list.add(integer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	//查询用户具体信息
	public List<User> select(){
		List<User> list=new ArrayList<>();
		String sql="select * from t00_user";
		PreparedStatement ps = db.getPs(sql);
		try {
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				User user=new User(rs.getInt("id"),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
						rs.getString(7));
				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	//修改用户信息
		public int update(User user) {
			int num = 0;
			String sql="update t00_user set username=?,password=?,idenity=?,address=?,mydate=?,phone=? where id=?";
			PreparedStatement ps = db.getPs(sql);
			try {
				ps.setString(1, user.getUsername());
				ps.setString(2, user.getPassword());
				ps.setString(3, user.getIdenity());
				ps.setString(4, user.getAddress());
				ps.setString(5, user.getMydate());
				ps.setString(6, user.getPhone());
				ps.setInt(7, user.getId());
				num = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return num;
		}
		
		//删除用户信息
		public int delete(int id) {
			int num = 0;
			String sql="delete from t00_user where id=?";
			PreparedStatement ps = db.getPs(sql);
			try {
				ps.setInt(1,id );
				num = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return num;
		}
		
		//用户登录
		public String dl(String username,String password) {
			String sql="select username from t00_user where username=? and password=?";
			PreparedStatement ps=db.getPs(sql);
			String name="";
			try {
				ps.setString(1, username);
				ps.setString(2, password);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
				  name=rs.getString("username");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return name;
		}
		
		//用户查询
		public List<Integer> serach(Map<String, String> map){
			List<Integer> list=new ArrayList<>();
			String sql="select id from t00_user";
			String username = map.get("username");
			String address = map.get("address");
			String s=username+address;
			String cell = map.get("cell");
			String order = map.get("order");
			if(!"".equals(s)&&s!=null) {
				sql+=" where ";
				if(!"".equals(username)&&username!=null) {
					sql+="username like '%"+username+"%'";
				}
				if(!"".equals(username)&&username!=null&&!"".equals(address)&&address!=null) {
					sql+=" and";
				}
				if(!"".equals(address)&&address!=null) {
					sql+=" address like '%"+address+"%'";
				}else {
					sql+=" ";
				}
			}
			if(!"".equals(cell)&&cell!=null) {
				sql+=" order by "+cell+" "+(!"".equals(order)&&order!=null?order:"asc");
			}

			PreparedStatement ps = db.getPs(sql);
			try {
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					Integer integer=new Integer(rs.getInt("id"));
					list.add(integer);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return list;			
		}
}

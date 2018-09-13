package com.neusorft.DButil;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class Dbutil {
	private static InputStream in=Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");
	private static Properties pr=new Properties();
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	static {
		try {
			pr.load(in);
			driver=pr.getProperty("DRIVER");
			url=pr.getProperty("URL");
			username=pr.getProperty("USERNAME");
			password=pr.getProperty("PASSWORD");
			Class.forName(driver);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConn() {
		Connection conn=null;
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public PreparedStatement getPs(String sql) {
		Connection conn=getConn();
		PreparedStatement ps=null;
		try {
			ps=conn.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ps;
	}
	
	public void close(ResultSet rs,PreparedStatement ps,Connection conn) {
		if(rs!=null) {
    		try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
    	}
    	if(ps!=null) {
    		try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
    	}
    	if(conn!=null) {
    		try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
    	}
	}
	

}

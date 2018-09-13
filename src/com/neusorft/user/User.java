package com.neusorft.user;

public class User {
    private int id;
    private String username;
    private String password;
    private String idenity;
    private String address;
    private String mydate;
    private String phone;
    
   public User() {
}

	public User(int id, String username, String password, String idenity, String address, String mydate,String phone) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.idenity = idenity;
		this.address = address;
		this.mydate = mydate;	
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdenity() {
		return idenity;
	}

	public void setIdenity(String idenity) {
		this.idenity = idenity;
	}

	public String getMydate() {
		return mydate;
	}

	public void setMydate(String mydate) {
		this.mydate = mydate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}

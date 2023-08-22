package com.user.user.entities;

public class Details {
	
	private int user_id;
	private String user_name;
	private String user_email;
	private String user_mobile;
	private String user_profession;
	private String user_pass;
	private String user_Cpass;
	
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Details(int user_id, String user_name, String user_email, String user_mobile, String user_profession,
			String user_pass, String user_Cpass) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_mobile = user_mobile;
		this.user_profession = user_profession;
		this.user_pass = user_pass;
		this.user_Cpass = user_Cpass;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_mobile() {
		return user_mobile;
	}

	public void setUser_mobile(String user_mobile) {
		this.user_mobile = user_mobile;
	}

	public String getUser_profession() {
		return user_profession;
	}

	public void setUser_profession(String user_profession) {
		this.user_profession = user_profession;
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

	public String getUser_Cpass() {
		return user_Cpass;
	}

	public void setUser_Cpass(String user_Cpass) {
		this.user_Cpass = user_Cpass;
	}

	@Override
	public String toString() {
		return "Details [user_id=" + user_id + ", user_name=" + user_name + ", user_email=" + user_email
				+ ", user_mobile=" + user_mobile + ", user_profession=" + user_profession + ", user_pass=" + user_pass
				+ ", user_Cpass=" + user_Cpass + "]";
	}
	
	
	
}

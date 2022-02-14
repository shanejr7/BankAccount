package com.model;

 
import lombok.Data;

@Data
public class User {
 
    private int id;

  
    private String userName;

  
    private String email;
    
 
    private String password;

    public User() {
    	this.password = "123";

    }

	public User(String string, String string2, String string3) {
		
		this.userName = string;
		this.email = string2;
		this.password = string3;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean validateUserPassword(String password,String userName) {
		
		if(password.compareTo(this.password)==0 && userName.compareTo(this.userName)==0)
			return true;
		return false;
		
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", email=" + email + ", password=" + password + "]";
	}


}

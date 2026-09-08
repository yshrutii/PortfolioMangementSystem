
package com.portfolio.app.model;
public class User {
	private String UserId;
private String name;
private String email;
public User(String userid,String name,String email)

{
	this.UserId=userid;
	this.name=name;
	this.email=email;
}
public String getUserid() {
	return UserId;}
	
public void setUserid(String userid) {
	this.UserId=userid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
}
}

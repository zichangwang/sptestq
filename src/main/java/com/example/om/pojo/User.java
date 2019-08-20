package com.example.om.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	private int id;
	private String username;
	private String password;
	private String email;
	private String pass_answer;
	private String pass_question;
	private String salt;
	
	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass_answer() {
		return this.pass_answer;
	}

	public void setPass_answer(String pass_answer) {
		this.pass_answer = pass_answer;
	}

	public String getPass_question() {
		return this.pass_question;
	}

	public void setPass_question(String pass_question) {
		this.pass_question = pass_question;
	}
}

/*
 * Location: C:\Users\WZC\Desktop\ROOT\WEB-INF\classes\ Qualified Name:
 * com.example.om.bean.User JD-Core Version: 0.6.0
 */
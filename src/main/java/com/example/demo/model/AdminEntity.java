package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin")
public class AdminEntity {
	@Id
	@Column(name = "login_id")
	private String loginId;
	private String password;

	public String getLogin_id() {
		return loginId;
	}

	public void setLogin_id(String login_id) {
		this.loginId = login_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

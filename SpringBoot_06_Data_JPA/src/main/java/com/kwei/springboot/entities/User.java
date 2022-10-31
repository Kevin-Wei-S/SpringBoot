package com.kwei.springboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// 使用JPA註解-配置映射關係
// JPA-標示為實體類(與數據表呈映射關係)
@Entity
// 如果省略, 表名為類型小寫: user.
@Table(name = "tbl_user")
public class User {
	
	@Id // 標示此屬性為主鍵
	// 設置自增主鍵
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "uname", length = 50) // 與數據表對應的欄位
	private String username;
	@Column // 默認欄位名即為屬性名
	private String password;
	@Column
	private String email;
	
	public User() {
		super();
	}

	public User(Integer id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}

	
}

package com.pricl.test.sys.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.pricl.test.core.entity.UUID;

@Entity(name = "T_USER")
public class User extends UUID {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 帐号 **/
	@Column(name = "ACCOUNT_", length = 40, nullable = false)
	private String account;

	/** 密码 **/
	@Column(name = "PASSWORD_", length = 40, nullable = false)
	private String password;

	/** 姓名 **/
	@Column(name = "NAME_", length = 40, nullable = false)
	private String name;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// /** 性别 **/
	// @Column(name = "SEX_", length = 1)
	// private String sex;
	//
	// /** 年龄 **/
	// @Column(name = "AGE_")
	// private java.util.Date age;
	//
	// /** 创建时间 **/
	// @Column(name = "CREATE_TIME_", nullable = false)
	// private java.util.Date createTime;
	//
	// /** 修改时间 **/
	// @Column(name = "MODIFY_TIME_", nullable = false)
	// private java.util.Date modifyTime;

}

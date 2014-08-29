package com.pricl.test.core;

public class Subject {
	// 姓名
	private final String name;

	// 账号
	private final String account;

	// 性别
	private final String sex;

	// 年龄
	private final String age;

	/**
	 * 
	 * @param name
	 * @param account
	 */
	public Subject(String name, String account) {
		super();
		this.name = name;
		this.account = account;
		this.sex = "";
		this.age = "";
	}

	/**
	 * 
	 * @param name
	 * @param account
	 * @param sex
	 * @param age
	 */
	public Subject(String name, String account, String sex, String age) {
		super();
		this.name = name;
		this.account = account;
		this.sex = sex;
		this.age = age;
	}

	/**
	 * 获取当前用户姓名
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 账号
	 * 
	 * @return
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * 
	 * @return
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * 
	 * @return
	 */
	public String getAge() {
		return age;
	}
}

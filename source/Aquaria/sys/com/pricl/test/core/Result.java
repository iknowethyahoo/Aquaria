package com.pricl.test.core;

public class Result {
	// 结果代码
	private int code;

	// 结果数据
	private Object data;

	public Result(int code, Object data) {
		super();
		this.code = code;
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static Result ok() {
		return new Result(1, "");
	};

	public static Result ok(String content) {
		return new Result(1, content);
	}

	public static Result error() {
		return new Result(-1, "");
	}

	public static Result error(String content) {
		return new Result(-1, content);
	}
}

package com.aixu.entity;

/**
 * @desc 通用返回结果集
 * @author jianglinle
 * @date 2017年12月6日
 */
public class ResultValue {
	/** 状态 */
	private Integer status;

	/** 信息 */
	private String message;

	/** 数据 */
	private Object data;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public ResultValue() {
		super();
	}

	public ResultValue(Integer status, String message, Object data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public ResultValue success(String message, Object data) {
		ResultValue rv = new ResultValue();
		rv.setStatus(1);
		rv.setMessage(message);
		rv.setData(data);
		return rv;
	}
	
	public ResultValue fail(String message, Object data) {
		ResultValue rv = new ResultValue();
		rv.setStatus(0);
		rv.setMessage(message);
		rv.setData(data);
		return rv;
	}
	
	public ResultValue success(Object data) {
		ResultValue rv = new ResultValue();
		rv.setStatus(1);
		rv.setMessage("成功");
		rv.setData(data);
		return rv;
	}
	
	public ResultValue fail(Object data) {
		ResultValue rv = new ResultValue();
		rv.setStatus(0);
		rv.setMessage("失败");
		rv.setData(data);
		return rv;
	}
}

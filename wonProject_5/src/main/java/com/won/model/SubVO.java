package com.won.model;

import java.sql.Date;

public class SubVO {
	private String id;
	private int s_num;
	private Date s_startDate;
	private Date s_lastDate;
	private String s_ing;
	private String s_pay;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getS_num() {
		return s_num;
	}
	public void setS_num(int s_num) {
		this.s_num = s_num;
	}
	public Date getS_startDate() {
		return s_startDate;
	}
	public void setS_startDate(Date s_startDate) {
		this.s_startDate = s_startDate;
	}
	public Date getS_lastDate() {
		return s_lastDate;
	}
	public void setS_lastDate(Date s_lastDate) {
		this.s_lastDate = s_lastDate;
	}
	public String getS_ing() {
		return s_ing;
	}
	public void setS_ing(String s_ing) {
		this.s_ing = s_ing;
	}
	public String getS_pay() {
		return s_pay;
	}
	public void setS_pay(String s_pay) {
		this.s_pay = s_pay;
	}
		
	@Override
	public String toString() {
		return "SubVO [id=" + id + ", s_num=" + s_num + ", s_startDate=" + s_startDate + ", s_lastDate=" + s_lastDate
				+ ", s_ing=" + s_ing + ", s_pay=" + s_pay + "]";
	}
			
}

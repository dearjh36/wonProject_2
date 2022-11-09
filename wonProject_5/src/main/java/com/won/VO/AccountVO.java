package com.won.VO;

import java.sql.Date;

public class AccountVO {
	private String id;
	private int ac_num;
	private Date ac_date;
	private String ac_classify;
	private int ac_goalNum;
	private int ac_price;
	private String ac_content;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAc_num() {
		return ac_num;
	}
	public void setAc_num(int ac_num) {
		this.ac_num = ac_num;
	}
	public Date getAc_date() {
		return ac_date;
	}
	public void setAc_date(Date ac_date) {
		this.ac_date = ac_date;
	}
	public String getAc_classify() {
		return ac_classify;
	}
	public void setAc_classify(String ac_classify) {
		this.ac_classify = ac_classify;
	}
	public int getAc_goalNum() {
		return ac_goalNum;
	}
	public void setAc_goalNum(int ac_goalNum) {
		this.ac_goalNum = ac_goalNum;
	}
	public int getAc_price() {
		return ac_price;
	}
	public void setAc_price(int ac_price) {
		this.ac_price = ac_price;
	}
	public String getAc_content() {
		return ac_content;
	}
	public void setAc_content(String ac_content) {
		this.ac_content = ac_content;
	}
	
	@Override
	public String toString() {
		return "AccountVO [id=" + id + ", ac_num=" + ac_num + ", ac_date=" + ac_date + ", ac_classify=" + ac_classify
				+ ", ac_goalNum=" + ac_goalNum + ", ac_price=" + ac_price + ", ac_content=" + ac_content + "]";
	}
	
}

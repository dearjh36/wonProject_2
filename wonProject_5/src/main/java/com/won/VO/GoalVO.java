package com.won.VO;

import java.util.Date;

public class GoalVO {
	private String id;
	private int g_num;
	private Date g_regisDate;
	private Date g_goalDate;
	private String g_name;
	private int g_goalAmount;
	private int g_currentAmount;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getG_num() {
		return g_num;
	}
	public void setG_num(int g_num) {
		this.g_num = g_num;
	}
	public Date getG_regisDate() {
		return g_regisDate;
	}
	public void setG_regisDate(Date g_regisDate) {
		this.g_regisDate = g_regisDate;
	}
	public Date getG_goalDate() {
		return g_goalDate;
	}
	public void setG_goalDate(Date g_goalDate) {
		this.g_goalDate = g_goalDate;
	}
	public String getG_name() {
		return g_name;
	}
	public void setG_Name(String name) {
		this.g_name = name;
	}
	public int getG_goalAmount() {
		return g_goalAmount;
	}
	public void setG_goalAmount(int g_goalAmount) {
		this.g_goalAmount = g_goalAmount;
	}
	public int getG_currentAmount() {
		return g_currentAmount;
	}
	public void setG_currentAmount(int g_currentAmount) {
		this.g_currentAmount = g_currentAmount;
	}
	@Override
	public String toString() {
		return "GoalVO [id=" + id + ", g_num=" + g_num + ", g_regisDate=" + g_regisDate + ", g_goalDate=" + g_goalDate
				+ ", g_name=" + g_name + ", g_goalAmount=" + g_goalAmount + ", g_currentAmount=" + g_currentAmount + "]";
	}

}

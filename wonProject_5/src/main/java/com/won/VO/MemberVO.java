package com.won.VO;

import java.util.Date;

public class MemberVO {
	private String id;
	private String m_name;
	private String m_birth;
	private String m_pw;
	private String m_phone;
	private String m_email;
	private String m_sub;
	private String m_state;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_birth() {
		return m_birth;
	}
	public void setM_birth(String m_brith) {
		this.m_birth = m_brith;
	}
	public String getM_pw() {
		return m_pw;
	}
	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}
	public String getM_phone() {
		return m_phone;
	}
	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}
	public String getM_email() {
		return m_email;
	}
	public void setM_email(String m_email) {
		this.m_email = m_email;
	}
	public String getM_sub() {
		return m_sub;
	}
	public void setM_sub(String m_sub) {
		this.m_sub = m_sub;
	}
	public String getM_state() {
		return m_state;
	}
	public void setM_state(String m_state) {
		this.m_state = m_state;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", m_name=" + m_name + ", m_birth=" + m_birth + ", m_pw=" + m_pw + ", m_phone="
				+ m_phone + ", m_email=" + m_email + ", m_sub=" + m_sub + ", m_state=" + m_state + "]";
	}

	
	 
}

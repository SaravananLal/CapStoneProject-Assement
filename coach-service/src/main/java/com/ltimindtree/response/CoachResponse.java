package com.ltimindtree.response;

import com.ltimindtree.entity.Coach;

public class CoachResponse {

	private long coachId;

	private String name;

	private String pwd;
	
	private String dob;
	private String gender;
	private String mobile;
	private String spec;
	public CoachResponse(Coach coach) {
		super();
		this.coachId = coach.getId();
		this.name = coach.getName();
		this.pwd = coach.getPwd();
		this.dob = coach.getDob();
		this.gender = coach.getGender();
		this.mobile =coach.getMobile() ;
		this.spec = coach.getSpec();
	}
	public long getCoachId() {
		return coachId;
	}
	public void setCoachId(long coachId) {
		this.coachId = coachId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}






}

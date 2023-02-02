package com.ltimindtree.response;

import com.ltimindtree.entity.User;

public class UserResponse {

	private long id;

	private String name;
	private String pwd;
	private String dob;
	private String mobile;
	private String mail;
	private String pin;	
	private String city;
	private String state;
	private String country;

	private CoachResponse coachResponse;

	public UserResponse(User student) {
		super();
		this.id = student.getId();
		this.name = student.getName();
		this.pwd = student.getPwd();
		this.dob = student.getDob();
		this.mobile = student.getMobile();
		this.mail = student.getMail();
		this.pin = student.getPin();
		this.city = student.getCity();
		this.state = student.getState();
		this.country = student.getCountry();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public CoachResponse getCoachResponse() {
		return coachResponse;
	}

	public void setCoachResponse(CoachResponse coachResponse) {
		this.coachResponse = coachResponse;
	}
}

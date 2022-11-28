package com.kh.hw.member.model.vo;

public class Member {
		
	private String id;
	private String name;
	private String password;
	private String eamil;
	private char gender;
	private int age;
	
	
	public Member() {
		super();

	}


	public Member(String id, String name, String password, String eamil, char gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.eamil = eamil;
		this.gender = gender;
		this.age = age;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEamil() {
		return eamil;
	}


	public void setEamil(String eamil) {
		this.eamil = eamil;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	public String information() {
		return id+ name + password + eamil + gender + age;
	}

}

package com.kh.practice.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{
		grade = 3; classroom = 12; name = "홍성빈"; height = 181; gender = '남';
	}
	
	
	public Student() {
		
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public int getClassroom() {
		return classroom;
	}
	
	public String getName() {
		return name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void information() {
		//xxx 학생은 x학년 x반이고, 키는 xx.xcm 이고 남(여)학생 입니다.
		System.out.printf("%s 학생은 %d학년 %d반이고, 키는 %.1fcm 이고 %c학생 입니다.\n" , name , grade , classroom , height , gender);
	}
}


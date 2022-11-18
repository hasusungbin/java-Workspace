package com.kh.chap05_constructor.model.vo;

public class Circle {
	// 필드부
	private static final/*sf 에선 세터게터메서드 생성 안함.*/ double PI = 3.14;
	private static int radius = 1;
	
	// 생성자부 
	public Circle() {   //  { 
		// 초기화 블럭 {}			코드;
	// 						}
		
	}
	//메서드부
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void incrementRadius() {
		radius++;
	}
	
	// 원의 둘레 -> 2*r*PI
	public void getAreaOfCircle() {
		System.out.println("원의 둘레 : " +(radius*2)*PI);
	}
	
	
	// 원의 넓이 -> r*r*PI
	public void getSizeOfCircle() {
		 System.out.println("원의 넓이 : "+ PI * radius * radius);
	}
}

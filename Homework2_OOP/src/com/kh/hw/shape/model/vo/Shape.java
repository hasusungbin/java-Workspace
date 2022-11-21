package com.kh.hw.shape.model.vo;

public class Shape {
	private int type;
	private double height;
	private double width;
	private String color = "white";
	
	public Shape() {
		
	}
	
	public Shape(int type, double height, double width) {
		this.type = type;
		this.height = height;
		this.width = width;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int type() {
		return type;
	}
	
	public double height() {
		return height;
	}
	
	public double width() {
		return width;
	}
	
	public String color() {
		return color;
	}
	
	public String information() {
		
	}
}

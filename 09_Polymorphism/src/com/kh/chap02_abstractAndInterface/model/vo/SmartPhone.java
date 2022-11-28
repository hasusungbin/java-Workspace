package com.kh.chap02_abstractAndInterface.model.vo;

public abstract interface SmartPhone implements TouchDisplay{
	
	private String maker; // 제조사 정보
	
	public SmartPhone() {
		
	}
	
	public String prinlnformation();
	
	public void setMaker(String maker) {
		
	}
	
	public String getMaker();
	
}

package com.kh.chap02_abstractAndInterface.model.vo;

public abstract class V40 implements SmartPhone{

	public V40() {
		maker = "LG";
	}
	
	public String makeCall();
	public String takeCall();
	public String picture();
	public String charge();
	public String touch();
	public boolean bluetoothPen();
	
	
	public String printlnformation() {
		
	}
	
}

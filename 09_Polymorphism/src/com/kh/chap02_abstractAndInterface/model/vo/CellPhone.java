package com.kh.chap02_abstractAndInterface.model.vo;

public interface CellPhone extends Phone implements Camera, Phone{
	
	public String charge(); // 충전 방식
	
}

package com.kh.chap03_class.model.vo;



public class Product {
	// 클래스 선언 구문에 사용 가능한 접근제한자 : public , default(접근제한자가 안써있는 상태)
	// public으로 해야 다른 패키지에서 접근가능
	// default로 설정한 경우 같은 패키지 에서만 접근 가능./ 다른 패키지에서 접근 불가
	
	// 상품명, 상품가격, 브랜드
	private String pName;
	private int price;
	private String brand = "apple";
	
	//setter 메서드 3개
	
	//getter 메서드 3개
	
	// 모든 필드값을 하나의 문자열로 합쳐서 반환해주는 information메소드
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String information() {
		return "상품명 : "+pName+"가격 : "+price+"원 , 브랜드 : "+brand;
	}
}

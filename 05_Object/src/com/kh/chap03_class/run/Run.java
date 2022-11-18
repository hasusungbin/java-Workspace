package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.setpName("아이폰 14 ");
		p1.setPrice(1400000);
//		p1.setBrand("apple"); brand 필드에 "애플"로 값이 이미 초기화 돼있어서 brand명 지정시
		// 애플 상품이라면 초기화 하지 않아도됨.
		
		System.out.println(p1.information());
		
		Product p2 = new Product();
		p2.setpName("갤럭시 z플립4");
		p2.setPrice(1350000);
		p2.setBrand("samsung");
		
		System.out.println(p2.information());
		
		Member m1 = new Member();
		m1.changeName("홍성빈");
		m1.printName();
	}

}

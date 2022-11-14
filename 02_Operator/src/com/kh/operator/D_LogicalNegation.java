package com.kh.operator;

public class D_LogicalNegation {
	
	/*
	 * 논리부정연산자 ! (단항연산자)
	 * 
	 * !논리값(True/False)
	 * 
	 * 논리값을 반대로 바꿔주는 연산자
	 */

	
	public void method() {
		
		System.out.println("true의 부정 : " + !true);
		System.out.println("false의 부정 : " + !false);
		
		boolean b = true;
		boolean b2 = !b;
		
		System.out.println("b : "+b); // true
		System.out.println("b2 : " +b2); // false
		
		// 계산식에 논리부정연산자 사용하기.
		
		boolean b3 = !(5>3); // false
		System.out.println("b3 : " +b3);
		
		
		
	}
}

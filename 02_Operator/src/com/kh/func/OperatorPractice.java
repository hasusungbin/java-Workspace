package com.kh.func;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		
		int num2 = sc.nextInt();
		
		
		System.out.println("1인당 사탕 개수 : " + num2 / num1);
		
		System.out.println("남는 사탕 개수 : " + num2 % num1);
		
		
	}
	
}

package com.kh.practice.numRange.view;

import java.util.Scanner;

public class NumberMenu {
	
	public void menu() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		if(1<num1 && num1<100 && 1<num2 && num2 < 100) {
			System.out.printf("%d은(는) %d의 배수인가? %b",num1,num2,(num1%num2) == 0);
		}
		
	}
	
}

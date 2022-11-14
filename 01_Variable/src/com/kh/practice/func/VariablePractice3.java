package com.kh.practice.func;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void test3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로 : ");
		double avenue = sc.nextDouble();
		
		
		System.out.println("세로 : ");
		double column = sc.nextDouble();
		
		System.out.println("면적 : "+(avenue * column));
		System.out.println("둘레 : "+((avenue + column)*2));
	
		
		
		
		
	}	
}

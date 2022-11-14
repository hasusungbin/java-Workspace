package com.kh.func;

import java.util.Scanner;

public class OperatorPractice2 {

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String str = sc.nextLine();
		
		System.out.print("학년 : ");
		int num = sc.nextInt();
		
		System.out.print("반 : ");
		int num2 = sc.nextInt();
		
		System.out.print("번호 : ");
		int num3 = sc.nextInt();
		
		sc.nextLine();
		System.out.print("성별 ( M/N ) : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.print("성적 : ");
		double dNum = sc.nextDouble();
		
		System.out.println(num+ "학년" +num2+ "반" +num3+ "번호" +str+"학생의 성적은" +dNum+ "이다.");
		
		
	}
	
	
}

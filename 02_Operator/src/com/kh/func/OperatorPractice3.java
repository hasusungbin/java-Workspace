package com.kh.func;

import java.util.Scanner;

public class OperatorPractice3 {
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 : ");
		int num1 = sc.nextInt();
		String result = (num1 <= 13) ? "어린이 입니다." :  ((19 >= num1) ? "청소년 입니다." : "어른 입니다.");
		
		System.out.print(result);
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int num1 = sc.nextInt();
		
		System.out.println("영어 : ");
		int num2 = sc.nextInt();
		
		System.out.println("수학 : ");
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		
		double avg = sum / 3.0;

		String result = num1 >= 40 && num2 >= 40 && num3 >= 40 && avg >= 60 ? "합격" : "불합격" ;
		
		System.out.println("합계 : " +sum);
		System.out.println("평균 : " +avg);
		System.out.println(result);
		
		
		
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요.(-포함) : ");
		
		String resNo = sc.nextLine(); // 961020-1234567
		char gender = resNo.charAt(7);
		
		String result = (gender == '1' || gender == '3') ? "남자" : "여자"	;	
		// '1' == 1 -> 49 == 1 , '2' == 1 -> 50 == 1 (문자와 숫자를 비교하는것이기 때문에 false 가 나옴.)
		System.out.println(result);
		
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("입력 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num3 <= num1 || num3 > num2) ? true : false;
		
		System.out.println(result);
		
		
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("입력 2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("입력 3 : ");
		int num3 = sc.nextInt();
		
		System.out.println((num1 == num2 && num2 == num3) ? true : false);
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A사원의 연봉 : ");
		int num1 = sc.nextInt();
		
		System.out.println("B사원의 연봉 : ");
		int num2 = sc.nextInt();
		
		System.out.println("C사원의 연봉 : ");
		int num3 = sc.nextInt();
		
		double num1Total = num1 * 1.4;
		double num2Total = num2;
		double num3Total = num3 * 1.15;
		
		
		System.out.println("A사원의 연봉/연봉+a : "+num1+"/"+num1Total);
		System.out.println(num1Total >= 3000 ? "3000 이상" : "3000 미만");
		
		System.out.println("B사원의 연봉/연봉+a : "+num2+"/"+num2Total);
		System.out.println(num2Total >= 3000 ? "3000 이상" : "3000 미만");
		
		System.out.println("C사원의 연봉/연봉+a : "+num3+"/"+num3Total);
		System.out.println(num3Total >= 3000 ? "3000 이상" : "3000 미만");
	}
	
}

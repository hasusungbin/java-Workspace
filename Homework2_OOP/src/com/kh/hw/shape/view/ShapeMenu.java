package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	
	public void inputMenu() {
		System.out.println("===== 도형 프로그램 =====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		System.out.println("메뉴 번호 : ");
		int num = sc.nextInt();
		// switch문 쓰기
		if( num == 3 ) {
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴번호 : ");
			int num2 = sc.nextInt();
		} else if( num == 4) {
			System.out.println("1. 사각형 면적");
			System.out.println("2. 사각형 색칠");
			System.out.println("3. 사각형 정보");
			System.out.print("9. 메인으로");
			System.out.println("메뉴 번호 : ");
			int num3 = sc.nextInt();
		} else if( num == 9 ) {
			
		}
		
	}
}



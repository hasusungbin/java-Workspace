package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {
	
	Scanner sc = new Scanner(System.in);
	
	private MemberController mc = new MemberController();
	
	public MemberMenu() {
		
	}
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("최대 등록 가능한 회원 수는 10명 입니다.");
			System.out.println("현재 등록된 회원 수는 0명 입니다." );
			
			System.out.println("1. 새 회원 등록");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			
			System.out.println("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: insertMember(); break; 
			case 2: searchMember(); break;
			case 3: updateMember(); break;
			case 4: deleteMember(); break;
			case 5: printAll(); break;
			case 9: System.out.print("프로그램을 종료합니다."); break;
				default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); return;
			}
		}
	}
	
	public void insertMember() {
		
		System.out.println("새 회원을 등록합니다.");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		if(id.equals(mc.checkId(id))) {
			System.out.println("중복된 아이디 입니다. 다시 입력해주세요.");
			return;
		}
		System.out.print("이름 : ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.print("비밀번호 : ");
		int num = sc.nextInt();
		System.out.print("이메일 : ");
		String em = sc.nextLine();
		System.out.println("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
			if(gender == 'F' || gender == 'M') {
				System.out.println("나이 : ");
				int age = sc.nextInt();
			} else {
				System.out.println("성별을 다시 입력하세요.");
				
			}
		
	}
	
	public void searchMember() {
		
	}
	
	public void searchId() {
		
	}
	
	public void searchName() {
		
	}
	
	public void searchEmail() {
		
	}
	
	public void updateMember() {
		
	}
	
	public void updatePassword() {
		
	}
	
	public void updateName() {
		
	}
	
	public void updateEmail() {
		
	}
	
	public void deleteMember() {
		
	}
	
	public void deleteOne() {
		
	}
	
	public void deleteAll() {
		
	}
	
	public void printAll() {
		
	}
}

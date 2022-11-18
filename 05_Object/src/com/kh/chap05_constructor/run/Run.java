package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.*;

public class Run {

	public static void main(String[] args) {
//		User user1 = new User();
		User user2 = new User("binryun" , "1001jp" , "홍성빈"); // id, pwd , name
//		System.out.println(user2.information());
		

		
		
		Circle cc = new Circle();
		cc.getAreaOfCircle();
		cc.getSizeOfCircle();
		cc.incrementRadius();
		cc.getAreaOfCircle();
		cc.getSizeOfCircle();
		
		
	}
}

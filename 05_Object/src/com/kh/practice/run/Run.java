package com.kh.practice.run;

import com.kh.practice.model.vo.Book;
import com.kh.practice.model.vo.Lotto;
import com.kh.practice.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student std = new Student();
//		std.information();
		
		new Lotto().information();
		
		Book b1 = new Book();
		b1.inform();
		
		Book b2 = new Book("자바의 정석", "나무","홍성빈"); //title, publisher, author
		b2.inform();
		
		Book b3 = new Book("자바의 정석" , "나무" , "홍성빈" , 15000 , 0.0);
		b3.inform();
	}

}

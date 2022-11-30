package com.kh.practice.numRange.run;

import com.kh.practice.numRange.exception.NumRangeException;
import com.kh.practice.numRange.view.NumberMenu;

public class Run {

	public static void main(String[] args) {
		NumberMenu nm = new NumberMenu();
		nm.menu();
		throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
	}

}

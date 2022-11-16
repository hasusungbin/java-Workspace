package com.kh.Practice;

public class ArrayPractice {
	public void practice1() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.println(arr[i]);
		}
		
	}
	
	public void practice2() {
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			int sum = 10;
			arr[i] = i;
			System.out.print(sum-i);
		}
	}
	
	public void practice3() {
		
	}
}

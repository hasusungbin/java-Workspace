package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		StringTokenizer stn = new StringTokenizer(str, " ");
		
		//방법 1. String클래스 이용
//		String result = "";
//		while(stn.hasMoreTokens()) {
//			result += stn.nextToken(); // J , a , v , a , P ...
//		}
		
		// 방법 2. StringBuffer of StringBuilder를 이용.
		StringBuilder sb = new StringBuilder();
		
		while(stn.hasMoreTokens()) {
			sb.append(stn.nextToken());
		}
		
		
		return sb.toString();
	}
	
	public String firstCap(String input) {
		String upper = input.substring(0, 1).toUpperCase(); // 0 이상 1 미만의 인덱스 범위를 잘라옴. 그 후 대문자 변환.
		
		return upper + input.substring(1); // 대문자로 변환한 문자 + 0번 인덱스를 제외한 문자열을 합쳐서 반환.
	}
	
	public int findChar(String input, char one) {
		int count = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == one) {
				count++;	// a p p l e
			}
		}
		
		// 방법 2. toCharArray 활용
//		char[] arr = input.toCharArray(); // apple -> {'a','p','p','l','e'}
//		for(char c : arr) {
//			if(c == one) {
//				count++;
//			}
//		}
		return count;
	}
}

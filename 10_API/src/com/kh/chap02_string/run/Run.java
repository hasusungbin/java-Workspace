package com.kh.chap02_string.run;

import com.kh.chap02_string.controller.*;

public class Run {

	public static void main(String[] args) {
		A_StringPoolTest aspt = new A_StringPoolTest();
//		aspt.method1();
//		aspt.method2();
//		aspt.method3();
		
		B_StringMethodTest bsmt = new B_StringMethodTest();
//		bsmt.method1();
		
		C_StringTokenizerTest cstt = new C_StringTokenizerTest();
		cstt.method();
		
		D_StringBufferAndBuilder dsab = new D_StringBufferAndBuilder();
		dsab.method();
		
	}

}

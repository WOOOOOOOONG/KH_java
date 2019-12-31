package com.kh.run;

//외부 클래스 사용시 import 구문 작성
//길게 경로 다 작성해서도 가능

 
import com.kh.first.A_MethodTest;

public class RunA {
	public static void main(String[] args) {
		
		A_MethodTest a = new A_MethodTest();
		
		/*
		 * a.methodA();
		 * a.methodB();
		 * a.methodC();
		*/
		
		//다른 방법
		
		a.methodA();
		
	}
}

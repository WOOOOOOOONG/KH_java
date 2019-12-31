package com.kh.first;

public class A_MethodTest {

	public void methodA() {
		System.out.println("Method A가 호출되었어요 !");
		methodB();
	}
	
	public void methodB() {
		System.out.println("Method B가 호출되었어요 !");
		methodC();
	}
	
	public void methodC() {
		System.out.println("Method C가 호출되었어요 !");
	}
	
}

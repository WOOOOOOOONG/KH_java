package com.kh.practice1.run;

import com.kh.practice1.example.VariablePractice;

public class Run {
	public static void main(String[] args) {
		VariablePractice v = new VariablePractice();
		
		System.out.println("---method1() 테스트---\n");
		v.method1();
		System.out.println("\n");
		
		System.out.println("---method2() 테스트---\n");
		v.method2();
		System.out.println("\n");
		
		System.out.println("---method3() 테스트---\n");
		v.method3();
		System.out.println("\n");
		
		System.out.println("---method4() 테스트---\n");
		v.method4();
	}
}

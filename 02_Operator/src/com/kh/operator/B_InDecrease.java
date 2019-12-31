package com.kh.operator;

public class B_InDecrease {
	public void method1() {
		int a = 10;
		int b = ++a;
		
		System.out.println("A : " + a + ", b : " + b);
		
		int c = 10;
		int d = c++;
		
		System.out.println("c : " + c + ", d : " + d);
		
		int num1 = 20;
		int result = num1++ * 3;
		
		System.out.println("result : " + result);
		System.out.println("num1 : " + num1);
	}
	
	public void method2() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++); //10
		
		System.out.println((++a) + (b++)); //12 + 20 = 32
		
		System.out.println((a++) + (--b) + (--c)); //12 + 20 + 29 = 61
		
		System.out.println("a : " + a); //13
		System.out.println("b : " + b); //20
		System.out.println("c : " + c); //29
	}
}

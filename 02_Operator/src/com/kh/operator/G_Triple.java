package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		System.out.print("정수 값 입력 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수이다" : "양수가 아니다";
		System.out.println(num + "은 " + result);	
	}
	
	public void method2() {
		System.out.print("정수 값 입력 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수이다" : "홀수이다";
		System.out.println(num + "은 " + result);
	}
	
	public void method3() {
		System.out.print("정수 값 입력: ");
		int num = sc.nextInt();
		
		String result = (num == 0) ? "0이다." : 
			((num > 0) ? "양수이다" : "음수이다");
		
		System.out.println(num + "은 " + result);
	}
	
	
}

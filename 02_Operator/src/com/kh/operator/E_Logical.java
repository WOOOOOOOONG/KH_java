package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		boolean isTrue;
		isTrue = (1 <= num) && (num <= 100);
		
		System.out.println("사용자가 입력한 값이 1부터 " + "100 사이입니까 : " + isTrue);
	}
	
	public void method2() {
		char ch;
		
		System.out.print("문자 하나 입력받기 : ");
		ch = sc.nextLine().charAt(0);
		
		boolean isTrue = (ch >= 65) && (ch <= 90);
		System.out.println("입력한 문자가 대문자입니까 : " + isTrue);
	}
	
	public void method3() {
		
		System.out.print("계속 하시려면 y 혹은 Y를 입력하세요. ");
		char ch = sc.nextLine().charAt(0);
		
		boolean isTrue = (ch == 'y') || (ch == 'y');
		
		System.out.println("사용자가 입력한 값이 y 또는 Y 입니까 ? " + isTrue);
	}
	
	public void method4() {
		int num = 10;
		System.out.println("&& 연산 전의 num값 : " + num);
		
		boolean result1 = false && ++num > 0;
		
		System.out.println("result1 : " + result1);
		System.out.println("&& 연산 후의 num값 : " + num);
		
		boolean result2 = true || ++num > 0;
		
		System.out.println("result1 : " + result2);
		System.out.println("|| 연산 후의 num값 : " + num);
	}
}

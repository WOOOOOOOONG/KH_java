package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	// break; 문 쓰기
	
	Scanner s = new Scanner(System.in);
	
	public void method1() {
		while(true) {
			System.out.print("문자열 입력 : ");
			String str = s.nextLine();
			
			if(str.equals("exit")) {
				break;
			}
			System.out.println("str : " + str);
		}
	}
	
	public void method2() {
		int num;
		int sum = 0;
		
		System.out.print("숫자 하나를 입력하세요 : ");
		num = s.nextInt();
		
		for (int i = 1; ; i++) {
			sum += i;
			
			if (i == num) {
				break;
			}
		}
		System.out.println("sum : " + sum);
	}
	
	public void method3() {
		while(true) {
			System.out.print("정수1 : ");
			int num1 = s.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = s.nextInt();
			
			s.nextLine();
			System.out.print("연산기호(+또는-) : ");
			String op = s.nextLine();
			
			int result = 0;
			
			if(op.equals("+")) {
				result = num1 + num2;
			}else if(op.equals("-")) {
				result = num1 - num2;;
			}else {
				System.out.println("잘못 입력하였습니다.");
				break;
			}
			System.out.println("result : " + result);
		}
	}
	
	
}

package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		boolean isTrue;
		isTrue = (1 <= num) && (num <= 100);
		
		System.out.println("����ڰ� �Է��� ���� 1���� " + "100 �����Դϱ� : " + isTrue);
	}
	
	public void method2() {
		char ch;
		
		System.out.print("���� �ϳ� �Է¹ޱ� : ");
		ch = sc.nextLine().charAt(0);
		
		boolean isTrue = (ch >= 65) && (ch <= 90);
		System.out.println("�Է��� ���ڰ� �빮���Դϱ� : " + isTrue);
	}
	
	public void method3() {
		
		System.out.print("��� �Ͻ÷��� y Ȥ�� Y�� �Է��ϼ���. ");
		char ch = sc.nextLine().charAt(0);
		
		boolean isTrue = (ch == 'y') || (ch == 'y');
		
		System.out.println("����ڰ� �Է��� ���� y �Ǵ� Y �Դϱ� ? " + isTrue);
	}
	
	public void method4() {
		int num = 10;
		System.out.println("&& ���� ���� num�� : " + num);
		
		boolean result1 = false && ++num > 0;
		
		System.out.println("result1 : " + result1);
		System.out.println("&& ���� ���� num�� : " + num);
		
		boolean result2 = true || ++num > 0;
		
		System.out.println("result1 : " + result2);
		System.out.println("|| ���� ���� num�� : " + num);
	}
}

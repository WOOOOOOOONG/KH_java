package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		System.out.print("���� �� �Է� : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "����̴�" : "����� �ƴϴ�";
		System.out.println(num + "�� " + result);	
	}
	
	public void method2() {
		System.out.print("���� �� �Է� : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "¦���̴�" : "Ȧ���̴�";
		System.out.println(num + "�� " + result);
	}
	
	public void method3() {
		System.out.print("���� �� �Է�: ");
		int num = sc.nextInt();
		
		String result = (num == 0) ? "0�̴�." : 
			((num > 0) ? "����̴�" : "�����̴�");
		
		System.out.println(num + "�� " + result);
	}
	
	
}

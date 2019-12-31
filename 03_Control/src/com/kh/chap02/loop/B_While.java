package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	
	Scanner s = new Scanner(System.in);
	
	public void method1() {
		int i = 1;
		while (i <= 5) {
			System.out.println("�ȳ��ϼ���.");
			i++;
		}
	}
	
	public void method2() {
		int i = 5;
		while (i >= 1) {
			System.out.println(i + " ");
			i--;
		}
	}
	
	public void method3() {
		int i = 1;
		while (i < 10) {
			System.out.println(i + " ");
			i += 2;
			
		}
	}
	
	public void method4() {
		int num, i = 1;
		num = s.nextInt();
		
		while(i <= 9) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
			i++;
		}
	}
	
	public void method5() {
		int random = (int)(Math.random() * 51 + 50); 
		// *�� �ش� �������� ��������, +�� ��𼭺��� �ε�
		int i = 1;
		int sum = 0;
		System.out.println("random���� " + random);
		
		while(i <= random) {
			sum += i;
			i++;
		}
		
		System.out.println("1���� " + random + "������ ���� " + sum + "�Դϴ�.");
	}
	
	public void method8() {
		int hour = 0;
		while (hour < 24) {
			int min = 0;
			while (min < 60) {
				System.out.printf("%2d�� %2d�� \n", hour, min);
				min++;
			}
			hour++;
		}
	}
	
	public void method9() {
		while (true) {
			System.out.println("===�޴�===");
			System.out.println("1. 1���� 5���� ���");
			System.out.println("2. 5���� 1���� ���� ���");
			System.out.println("3. 1���� 10���� Ȧ�� ���");
			System.out.println("9. ���α׷� ����");
			
			System.out.print("�޴� ���� : ");
			int menu = s.nextInt();
			
			switch(menu) {
			case 1: 
				method1(); 
				break;
			case 2:
				method2(); 
				break;
			case 3: 
				method3();
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				return;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	
	public void method10() {
		while (true) {
			String str;
			System.out.print("���ڸ� �Է����ּ��� : ");
			str = s.nextLine();
			
			if(str.equals("exit")) {
				System.out.println("���α׷��� ����˴ϴ�.");
				return;
			}
			
			System.out.println("str : " + str);
			
			
		}
	}
}

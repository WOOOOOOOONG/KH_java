package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		char gender;
		double height;
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		
		sc.nextLine();
		System.out.print("������ �Է��ϼ���(��/��) : ");
		gender = sc.nextLine().charAt(0);
		
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		height = sc.nextDouble();
		
		System.out.println();
		System.out.println("Ű " + height + "�� " + age + "�� "  
		+ gender + "�� " + name + "�� �ݰ����ϴ�^^");
		
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		int number1, number2;
		
		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		number1 = sc.nextInt();
		
		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		number2 = sc.nextInt();
		
		System.out.println();
		System.out.println("���ϱ� ��� : " + (number1 + number2)); 
		System.out.println("���� ��� : " + (number1 - number2));
		System.out.println("���ϱ� ��� : " + (number1 * number2));
		System.out.println("������ �� ��� : " + (number1 / number2));
		
	}
	
	public void method3() {
		double row;
		double height;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		row = sc.nextDouble();
		
		System.out.print("���� : ");
		height = sc.nextDouble();
		
		System.out.println();
		System.out.println("���� : " + (row * height));
		System.out.println("�ѷ� : " + ((row + height) * 2));
	}
	
	public void method4() {
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		str = sc.nextLine();
		
		System.out.println();
		System.out.println("ù ��° ���� : " + str.charAt(0));
		System.out.println("�� ��° ���� : " + str.charAt(1));
		System.out.println("�� ��° ���� : " + str.charAt(2));
		
		sc.close();
	}
}

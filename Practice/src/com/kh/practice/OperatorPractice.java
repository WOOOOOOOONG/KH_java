package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		String str = num > 0 ? "�����" : "����� �ƴϴ�";
		System.out.println();
		System.out.println(str);
	}
	
	public void practice2() {
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		String str = (num > 0) ? "�����" : (num == 0 ? "0�̴�" : "������");
		System.out.println();
		System.out.println(str);
	}

	public void practice3() {
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		String str = (num % 2 == 0) ? "¦����" : "Ȧ����";
		System.out.println();
		System.out.println(str);
	}

	public void practice4() {
		int people;
		int candy;
		int privateCandy;
		
		System.out.print("�ο� �� : ");
		people = sc.nextInt();
		
		System.out.print("���� ���� : ");
		candy = sc.nextInt();
		
		privateCandy = candy / people;
		System.out.println("1�δ� ���� ���� : " + privateCandy);
		System.out.println("���� ���� ���� : " + (candy - (privateCandy * people)));
	}

	public void practice5() {
		String name;
		int grade, group, number;
		char gender;
		double result;
		
		sc.nextLine();
		System.out.print("�̸� : ");
		name = sc.nextLine();
		
		System.out.print("�г�(���ڸ�) : ");
		grade = sc.nextInt();
	
		System.out.print("��(���ڸ�) : ");
		group = sc.nextInt();
		
		System.out.print("��ȣ(���ڸ�) : ");
		number = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("����(M/F) : ");
		gender = sc.nextLine().charAt(0);
		
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		result = sc.nextDouble();
		
		System.out.println();
		
		System.out.println(grade + "�г� " + group + "�� " + number + "�� " + name 
				+ " " + ((gender == 'M') ? "���л�" : "���л�") + "�� ������ " + result + "�̴�.");
	}

	public void practice6() {
		int age;
		String ageRange;
		
		System.out.print("���� : ");
		age = sc.nextInt();
		System.out.println();
		
		ageRange = (age <= 13) ? "���" : (age > 19 ? "����" : "û�ҳ�");
		System.out.println(ageRange);
	}

	public void practice7() {
		int kor, eng, math;
		double avg;
		String result;
		
		System.out.print("���� : ");
		kor = sc.nextInt();
		
		System.out.print("���� : ");
		eng = sc.nextInt();
		
		System.out.print("���� : ");
		math = sc.nextInt();
		
		System.out.println();
		
		avg = (double)(kor + eng + math) / 3.0;
		System.out.println("�հ� : " + (kor + eng + math));
		System.out.println("��� : " + avg);
		
		result = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? "�հ�" : "���հ�";
		System.out.println(result);
		
	}

	public void practice8() {
		String SSAN; //Social Security Account Number
		String gender;
		
		sc.nextLine();
		System.out.print("�ֹε�Ϲ�ȣ�� �Է��ϼ���(- ����) : ");
		SSAN = sc.nextLine();
		
		System.out.println();
		
		gender = SSAN.charAt(7) == 1 ? "����" : "����";
		System.out.println(gender);
	}

	public void practice9() {
		int num1, num2;
		int input;
		boolean result;
		
		System.out.print("����1 : ");
		num1 = sc.nextInt();
		
		System.out.print("����2 : ");
		num2 = sc.nextInt();
		
		System.out.print("�Է� : ");
		input = sc.nextInt();
		
		System.out.println();
		
		result = input <= num1 || input > num2 ? true : false;
		System.out.println(result);
	}

	public void practice10() {
		int num1, num2, num3;
		boolean result;
		
		System.out.print("�Է�1 : ");
		num1 = sc.nextInt();
		
		System.out.print("�Է�2 : ");
		num2 = sc.nextInt();
		
		System.out.print("�Է�3 : ");
		num3 = sc.nextInt();
		
		System.out.println();
		
		result = (num1 == num2 && num1 == num3 && num2 == num3) ? true : false;
		System.out.println(result);
	}

	public void practice11() {
		int A, B, C;
		double incomeA, incomeB, incomeC;
		String resultA, resultB, resultC;
		
		System.out.print("A����� ���� : ");
		A = sc.nextInt();
		
		System.out.print("B����� ���� : ");
		B = sc.nextInt();
		
		System.out.print("C����� ���� : ");
		C = sc.nextInt();
		
		System.out.println();
		
		incomeA = A + A * 0.4f;
		incomeB = B;
		incomeC = (double)C * 1.15f;
		
		resultA = incomeA >= 3000 ? "3000 �̻�" : "3000 �̸�";
		resultB = incomeB >= 3000 ? "3000 �̻�" : "3000 �̸�";
		resultC = incomeC >= 3000 ? "3000 �̻�" : "3000 �̸�";
		
		System.out.println("A����� �μ�Ƽ������ ���� : " + incomeA);
		System.out.println(resultA);
		
		System.out.println("B����� �μ�Ƽ������ ���� : " + incomeB);
		System.out.println(resultB);
		
		System.out.println("C����� �μ�Ƽ������ ���� : " + incomeC);
		System.out.println(resultC);
		
	}
}

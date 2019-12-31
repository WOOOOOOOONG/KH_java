package com.kh.chap01.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner s = new Scanner(System.in);
	
	public void practice1() {
		int number;
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("9. ����");
		
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		number = s.nextInt();
		
		if (number == 1) {
			System.out.println("�Է� �޴��Դϴ�.");
		} else if (number == 2) {
			System.out.println("���� �޴��Դϴ�.");
		} else if (number == 3) {
			System.out.println("��ȸ �޴��Դϴ�.");
		} else if (number == 4) {
			System.out.println("���� �޴��Դϴ�.");
		} else if (number == 9) {
			System.out.println("���α׷��� ����˴ϴ�.");
		} else {
			System.out.println("�ùٸ� ���� �Է��� �ּ���.");
		}
	}
	
	public void practice2() {
		int num;
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		num = s.nextInt();
		
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("¦����");
			} else {
				System.out.println("Ȧ����");
			}
		} else {
			System.out.println("����� �Է����ּ���.");
		}
	}
	
	public void practice3() {
		int kor, eng, math;
		float average;
		
		System.out.print("���� ���� : ");
		kor = s.nextInt();
		
		System.out.print("���� ���� : ");
		math = s.nextInt();
		
		System.out.print("���� ���� : ");
		eng = s.nextInt();
		
		average = (float)(kor + math + eng) / 3.0f;
		if (kor >= 40 && math >= 40 && eng >= 40 && average >= 60) {
			System.out.println("���� : " + kor);
			System.out.println("���� : " + math);
			System.out.println("���� : " + eng);
			System.out.println("�հ� : " + (kor + math + eng));
			System.out.println("��� : " + average);
			System.out.println("�����մϴ�, �հ��Դϴ� !");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}

	public void practice4() {
		int month;
		String season;
		
		System.out.print("1~12 ������ ���� �Է� : ");
		month = s.nextInt();
		switch (month) {
		case 1:
		case 2:
		case 12:
			season = month + "���� �ܿ��Դϴ�.";
			break;
			
		case 3:
		case 4:
		case 5:
			season = month + "���� ���Դϴ�.";
			break;
			
		case 6:
		case 7:
		case 8:
			season = month + "���� �����Դϴ�.";
			break;
			
		case 9:
		case 10:
		case 11:
			season = month + "���� �����Դϴ�.";
			break;
			
			default:
				season = month + "���� �߸� �Էµ� ���Դϴ�.";
		}
		
		System.out.println(season);
	}

	public void practice5() {
		String ID, password;
		String IDinput, passwordInput;
		
		ID = "byeollim";
		password = "1234";
		
		s.nextLine();
		System.out.print("���̵� : ");
		IDinput = s.nextLine();
		
		System.out.print("��й�ȣ : ");
		passwordInput = s.nextLine();
		
		if (ID.equals(IDinput) && password.equals(passwordInput)) {
			System.out.println("�α��� ����");
		} else if (ID.equals(IDinput) && !password.equals(passwordInput)) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�,");
		} else if (!ID.equals(IDinput) && password.equals(passwordInput)) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		} else {
			System.out.println("���̵�� �н����尡 Ʋ�Ƚ��ϴ�.");
		}
	}

	public void practice6() {
		String permission;
		
		s.nextLine();
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		permission = s.nextLine();
		
		if (permission.equals("������")) {
			System.out.println("ȸ������, �Խñ� ����");
			System.out.println("�Խñ� �ۼ�, ��� �ۼ�");
			System.out.println("�Խñ� ��ȸ");
		} else if (permission.equals("ȸ��")) {
			System.out.println("�Խñ� �ۼ�, ��� �ۼ�");
			System.out.println("�Խñ� ��ȸ");
		} else if (permission.equals("��ȸ��")) {
			System.out.println("�Խñ� ��ȸ");
		} else {
			System.out.println("�߸� �Է��߽��ϴ�.");
		}
	}

	public void practice7() {
		double height, weight, BMI;
		
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		height = s.nextDouble();
		
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		weight = s.nextDouble();
		
		BMI = weight / (height * height);
		System.out.println("BMI ���� : " + BMI);
		
		if (BMI < 18.5) {
			System.out.println("��ü��");
		} else if (BMI >= 18.5 && BMI < 23) {
			System.out.println("����ü��");
		} else if (BMI >= 23 && BMI < 25) {
			System.out.println("��ü��");
		} else if (BMI >= 25 && BMI < 30) {
			System.out.println("��");
		} else if (BMI >= 30) {
			System.out.println("�� ��");
		} else {
			System.out.println("�ùٸ� ���� �Է��ϼ���.");
		}
	}

	public void practice8() {
		int num1, num2;
		int result;
		char op;
		
		System.out.print("�ǿ�����1 �Է� : ");
		num1 = s.nextInt();
		if (num1 <= 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}
		
		System.out.print("�ǿ�����2 �Է� : ");
		num2 = s.nextInt();
		if (num2 <= 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}
		
		s.nextLine();
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		op = s.nextLine().charAt(0);
		
		if (op == '+') {
			result = num1 + num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
		} else if (op == '-') {
			result = num1 - num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
		} else if (op == '*') {
			result = num1 * num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
		} else if (op == '/') {
			result = num1 / num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
		} else if (op == '%') {
			result = num1 % num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}
	}

	public void practice9() {
		int middleTest, finalTest, work, attendence;
		double middleTest2, finalTest2, work2, attendence2;
		double result;
		
		System.out.print("�߰� ��� ���� : ");
		middleTest = s.nextInt();
		
		System.out.print("�⸻ ��� ���� : ");
		finalTest = s.nextInt();
		
		System.out.print("����  ���� : ");
		work = s.nextInt();
		
		System.out.print("�⼮ ȸ�� : ");
		attendence = s.nextInt();
		
		middleTest2 = middleTest * 0.2;
		finalTest2 = finalTest * 0.3;
		work2 = work * 0.3;
		attendence2 = (double)attendence;
		
		result = middleTest2 + finalTest2 + work2 + attendence;
		
		System.out.println("===========���===========");
		
		System.out.println("�߰� ��� ����(20) : " + middleTest2);
		System.out.println("�⸻ ��� ����(30) : " + finalTest2);
		System.out.println("���� ����           (30) : " + work2);
		System.out.println("�⼮ ����           (20) : " + attendence2);
		System.out.println("���� : " + result);

		if (result >= 70 && attendence >= 14) {
			System.out.println("PASS");
		} else if (result >= 70 && attendence < 14) {
			System.out.println("FAIL [�⼮ Ƚ�� ����] (" + attendence + "/20)");
		} else if (result < 70 && attendence >= 14) {
			System.out.println("FAIL [���� �̴�] (���� " + result + ")");
		} else {
			System.out.println("FAIL [�⼮ Ƚ�� ����] (" + attendence + "/20)");
			System.out.println("FAIL [���� �̴�] (���� " + result + ")");
		}
	}
	
	public void practice10() {
		int number;
		
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. Pass/Fail");
		
		System.out.print("���� : ");
		number = s.nextInt();
		
		switch (number) {
		case 1:
			System.out.println();
			System.out.println("===========1. �޴� ���===========");
			practice1();
			break;
		case 2:
			System.out.println();
			System.out.println("===========2. ¦��/Ȧ��===========");
			practice2();
			break;
		case 3:
			System.out.println();
			System.out.println("===========3. �հ�/���հ�===========");
			practice3();
			break;
		case 4:
			System.out.println();
			System.out.println("===========4. ����===========");
			practice4();
			break;
		case 5:
			System.out.println();
			System.out.println("===========5. �α���===========");
			practice5();
			break;
		case 6:
			System.out.println();
			System.out.println("===========6. ���� Ȯ��===========");
			practice6();
			break;
		case 7:
			System.out.println();
			System.out.println("===========7. BMI===========");
			practice7();
			break;
		case 8:
			System.out.println();
			System.out.println("===========8. ����===========");
			practice8();
			break;
		case 9:
			System.out.println();
			System.out.println("===========9. Pass/Fail===========");
			practice9();
			break;
			default:
				System.out.println("1~10 ���̸� �Է��ϼ���.");
				break;
				
		}
	}
}

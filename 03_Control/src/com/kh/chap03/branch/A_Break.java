package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	// break; �� ����
	
	Scanner s = new Scanner(System.in);
	
	public void method1() {
		while(true) {
			System.out.print("���ڿ� �Է� : ");
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
		
		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
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
			System.out.print("����1 : ");
			int num1 = s.nextInt();
			
			System.out.print("����2 : ");
			int num2 = s.nextInt();
			
			s.nextLine();
			System.out.print("�����ȣ(+�Ǵ�-) : ");
			String op = s.nextLine();
			
			int result = 0;
			
			if(op.equals("+")) {
				result = num1 + num2;
			}else if(op.equals("-")) {
				result = num1 - num2;;
			}else {
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break;
			}
			System.out.println("result : " + result);
		}
	}
	
	
}

package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	Scanner s = new Scanner(System.in);
	
	public void method7() {
		int number;
		int sum = 0;
		
		System.out.print("���� �Է��ϼ��� : ");
		number = s.nextInt();
		
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		
		System.out.println("1���� " + number + "������ ���� " + sum + "�Դϴ�.");
		s.close();
	}
	
	public void method9() {
		int number;
		
		System.out.print("���� �Է��ϼ��� : ");
		number = s.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", number, i, number * i);
		}
	}
	
	public void method11() {
		//2~9 ������ ���� ������
		int num = (int)(Math.random() * 8 + 2); //�ֱ׷���
		
		for (int i = 1; i < 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
	}
	
	//��ø �ݺ���
	public void method17() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					System.out.print(j + 1);
					continue;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
}

package test.controller;

import java.util.Scanner;

public class Test1 {
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.print("�Է� : ");
		num = s.nextInt();
		if(num >= 1 && num <= 100) {
			if(num % 2 == 0) {
				System.out.println("2�� ����Դϴ�.");
			}else {
				System.out.println("2�� ����� �ƴմϴ�.");
			}
		}else {
			System.out.println("1~100 ������ ���� �ƴմϴ�.");
		}
	}
}

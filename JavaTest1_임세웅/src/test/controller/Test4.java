package test.controller;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num1, num2;
		int sum, diff, mul, div;
		
		System.out.print("ù ��° ���� : ");
		num1 = s.nextInt();
		System.out.print("�� ��° ���� : ");
		num2 = s.nextInt();
		
		if(num1 >= 1 && num1 <= 9 && num2 >= 1 && num2 <= 9) {
			sum = num1 + num2;
			diff = num1 - num2;
			mul = num1 * num2;
			div = num1 / num2;
			
			System.out.printf("�� : %d \n", sum);
			System.out.printf("�� : %d \n", diff);
			System.out.printf("�� : %d \n", mul);
			System.out.printf("������ : %d \n", div);
		} else if(num2 <= 0) {
			sum = 0;
			diff = 0;
			mul = 0;
			div = 0;
			
			System.out.printf("�� : %d \n", sum);
			System.out.printf("�� : %d \n", diff);
			System.out.printf("�� : %d \n", mul);
			System.out.printf("������ : %d \n", div);
		} else {
			System.out.println("1���� 9������ ���ڸ� �Է��ϼ���.");
		}
	}

}

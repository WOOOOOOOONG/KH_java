package test.controller;

import java.util.*;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num1, num2;
		int mul;
		
		System.out.print("���� �Է� : ");
		num1 = s.nextInt();
		num2 = s.nextInt();
		
		if(num1 >= 1 && num1 <= 9 && num2 >= 1 && num2 <= 9) {
			mul = num1 * num2;
			if(mul >= 10) {
				System.out.println("���ڸ� �� �Դϴ�.");
			} else {
				System.out.println("���ڸ� �� �Դϴ�.");
			}
		} else {
			System.out.println("1���� 9������ ���� �Է��ϼ���.");
		}
		
	}

}

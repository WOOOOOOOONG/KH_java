package test.controller;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.print("�Է� : ");
			num = s.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("** �Է��� ���������� �Ǿ����ϴ�! **");
				break;
			case 2:
				System.out.println(" ** ��ȸ�� ���۵Ǿ����ϴ�! **");
				break;
			case 3:
				System.out.println("** ������ ���������� �Ǿ����ϴ�! **");
				break;
			case 4:
				System.out.println("** ������ ���������� �Ǿ����ϴ�! **");
				break;
			case 5:
				System.out.println("** ���������� ����Ǿ����ϴ�! **");
				return;
				default:
					System.out.println("** �ٽ� �Է��� �ּ���! **");
					break;
				}
		}
		
	}

}

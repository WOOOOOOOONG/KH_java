package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	
	Scanner s = new Scanner(System.in);
	
	public void method3() {
		//1���� ���� ��(17~24)������ �� ���ϱ�
		int random = (int)(Math.random() * 8 + 17);
		int i = 1;
		int sum = 0;
		
		do {
			sum += i;
			i++;
		} while (i <= random);
		
		System.out.println(sum);
	}
	
	public void method4() {
		String str;
		int i = 0;
		
		System.out.print("���ڿ� �Է� : ");
		str = s.nextLine();
		
		do {
			System.out.println(str.charAt(i));
			i++;
		} while(i < str.length());
	}
}

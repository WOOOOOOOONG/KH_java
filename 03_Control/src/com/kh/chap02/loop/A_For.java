package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	Scanner s = new Scanner(System.in);
	
	public void method7() {
		int number;
		int sum = 0;
		
		System.out.print("수를 입력하세요 : ");
		number = s.nextInt();
		
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + number + "까지의 합은 " + sum + "입니다.");
		s.close();
	}
	
	public void method9() {
		int number;
		
		System.out.print("수를 입력하세요 : ");
		number = s.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", number, i, number * i);
		}
	}
	
	public void method11() {
		//2~9 사이의 랜덤 구구단
		int num = (int)(Math.random() * 8 + 2); //왜그럴까
		
		for (int i = 1; i < 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
	}
	
	//중첩 반복문
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

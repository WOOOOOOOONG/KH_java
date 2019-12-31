package test.controller;

import java.util.Scanner;

public class Test1 {
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.print("입력 : ");
		num = s.nextInt();
		if(num >= 1 && num <= 100) {
			if(num % 2 == 0) {
				System.out.println("2의 배수입니다.");
			}else {
				System.out.println("2의 배수가 아닙니다.");
			}
		}else {
			System.out.println("1~100 사이의 값이 아닙니다.");
		}
	}
}

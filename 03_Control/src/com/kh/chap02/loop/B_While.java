package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	
	Scanner s = new Scanner(System.in);
	
	public void method1() {
		int i = 1;
		while (i <= 5) {
			System.out.println("안녕하세요.");
			i++;
		}
	}
	
	public void method2() {
		int i = 5;
		while (i >= 1) {
			System.out.println(i + " ");
			i--;
		}
	}
	
	public void method3() {
		int i = 1;
		while (i < 10) {
			System.out.println(i + " ");
			i += 2;
			
		}
	}
	
	public void method4() {
		int num, i = 1;
		num = s.nextInt();
		
		while(i <= 9) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
			i++;
		}
	}
	
	public void method5() {
		int random = (int)(Math.random() * 51 + 50); 
		// *가 해당 범위부터 언제까지, +가 어디서부터 인듯
		int i = 1;
		int sum = 0;
		System.out.println("random값은 " + random);
		
		while(i <= random) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 " + random + "까지의 합은 " + sum + "입니다.");
	}
	
	public void method8() {
		int hour = 0;
		while (hour < 24) {
			int min = 0;
			while (min < 60) {
				System.out.printf("%2d시 %2d분 \n", hour, min);
				min++;
			}
			hour++;
		}
	}
	
	public void method9() {
		while (true) {
			System.out.println("===메뉴===");
			System.out.println("1. 1부터 5까지 출력");
			System.out.println("2. 5부터 1까지 역순 출력");
			System.out.println("3. 1부터 10까지 홀수 출력");
			System.out.println("9. 프로그램 종료");
			
			System.out.print("메뉴 선택 : ");
			int menu = s.nextInt();
			
			switch(menu) {
			case 1: 
				method1(); 
				break;
			case 2:
				method2(); 
				break;
			case 3: 
				method3();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
				default:
					System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	public void method10() {
		while (true) {
			String str;
			System.out.print("문자를 입력해주세요 : ");
			str = s.nextLine();
			
			if(str.equals("exit")) {
				System.out.println("프로그램이 종료됩니다.");
				return;
			}
			
			System.out.println("str : " + str);
			
			
		}
	}
}

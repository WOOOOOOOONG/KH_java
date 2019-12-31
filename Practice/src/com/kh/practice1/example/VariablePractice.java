package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		char gender;
		double height;
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		sc.nextLine();
		System.out.print("성별을 입력하세요(남/여) : ");
		gender = sc.nextLine().charAt(0);
		
		System.out.print("키를 입력하세요(cm) : ");
		height = sc.nextDouble();
		
		System.out.println();
		System.out.println("키 " + height + "인 " + age + "살 "  
		+ gender + "자 " + name + "님 반갑습니다^^");
		
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		int number1, number2;
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		number1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		number2 = sc.nextInt();
		
		System.out.println();
		System.out.println("더하기 결과 : " + (number1 + number2)); 
		System.out.println("빼기 결과 : " + (number1 - number2));
		System.out.println("곱하기 결과 : " + (number1 * number2));
		System.out.println("나누기 몫 결과 : " + (number1 / number2));
		
	}
	
	public void method3() {
		double row;
		double height;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		row = sc.nextDouble();
		
		System.out.print("세로 : ");
		height = sc.nextDouble();
		
		System.out.println();
		System.out.println("면적 : " + (row * height));
		System.out.println("둘레 : " + ((row + height) * 2));
	}
	
	public void method4() {
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		str = sc.nextLine();
		
		System.out.println();
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
		
		sc.close();
	}
}

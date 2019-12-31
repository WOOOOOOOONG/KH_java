package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String str = num > 0 ? "양수다" : "양수가 아니다";
		System.out.println();
		System.out.println(str);
	}
	
	public void practice2() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String str = (num > 0) ? "양수다" : (num == 0 ? "0이다" : "음수다");
		System.out.println();
		System.out.println(str);
	}

	public void practice3() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String str = (num % 2 == 0) ? "짝수다" : "홀수다";
		System.out.println();
		System.out.println(str);
	}

	public void practice4() {
		int people;
		int candy;
		int privateCandy;
		
		System.out.print("인원 수 : ");
		people = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		candy = sc.nextInt();
		
		privateCandy = candy / people;
		System.out.println("1인당 사탕 개수 : " + privateCandy);
		System.out.println("남는 사탕 개수 : " + (candy - (privateCandy * people)));
	}

	public void practice5() {
		String name;
		int grade, group, number;
		char gender;
		double result;
		
		sc.nextLine();
		System.out.print("이름 : ");
		name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		grade = sc.nextInt();
	
		System.out.print("반(숫자만) : ");
		group = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		number = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		result = sc.nextDouble();
		
		System.out.println();
		
		System.out.println(grade + "학년 " + group + "반 " + number + "번 " + name 
				+ " " + ((gender == 'M') ? "남학생" : "여학생") + "의 성적은 " + result + "이다.");
	}

	public void practice6() {
		int age;
		String ageRange;
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.println();
		
		ageRange = (age <= 13) ? "어린이" : (age > 19 ? "성인" : "청소년");
		System.out.println(ageRange);
	}

	public void practice7() {
		int kor, eng, math;
		double avg;
		String result;
		
		System.out.print("국어 : ");
		kor = sc.nextInt();
		
		System.out.print("영어 : ");
		eng = sc.nextInt();
		
		System.out.print("수학 : ");
		math = sc.nextInt();
		
		System.out.println();
		
		avg = (double)(kor + eng + math) / 3.0;
		System.out.println("합계 : " + (kor + eng + math));
		System.out.println("평균 : " + avg);
		
		result = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? "합격" : "불합격";
		System.out.println(result);
		
	}

	public void practice8() {
		String SSAN; //Social Security Account Number
		String gender;
		
		sc.nextLine();
		System.out.print("주민등록번호를 입력하세요(- 포함) : ");
		SSAN = sc.nextLine();
		
		System.out.println();
		
		gender = SSAN.charAt(7) == 1 ? "남자" : "여자";
		System.out.println(gender);
	}

	public void practice9() {
		int num1, num2;
		int input;
		boolean result;
		
		System.out.print("정수1 : ");
		num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		input = sc.nextInt();
		
		System.out.println();
		
		result = input <= num1 || input > num2 ? true : false;
		System.out.println(result);
	}

	public void practice10() {
		int num1, num2, num3;
		boolean result;
		
		System.out.print("입력1 : ");
		num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		num3 = sc.nextInt();
		
		System.out.println();
		
		result = (num1 == num2 && num1 == num3 && num2 == num3) ? true : false;
		System.out.println(result);
	}

	public void practice11() {
		int A, B, C;
		double incomeA, incomeB, incomeC;
		String resultA, resultB, resultC;
		
		System.out.print("A사원의 연봉 : ");
		A = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		B = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		C = sc.nextInt();
		
		System.out.println();
		
		incomeA = A + A * 0.4f;
		incomeB = B;
		incomeC = (double)C * 1.15f;
		
		resultA = incomeA >= 3000 ? "3000 이상" : "3000 미만";
		resultB = incomeB >= 3000 ? "3000 이상" : "3000 미만";
		resultC = incomeC >= 3000 ? "3000 이상" : "3000 미만";
		
		System.out.println("A사원의 인센티브포함 연봉 : " + incomeA);
		System.out.println(resultA);
		
		System.out.println("B사원의 인센티브포함 연봉 : " + incomeB);
		System.out.println(resultB);
		
		System.out.println("C사원의 인센티브포함 연봉 : " + incomeC);
		System.out.println(resultC);
		
	}
}

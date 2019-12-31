package com.kh.chap01.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner s = new Scanner(System.in);
	
	public void practice1() {
		int number;
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		number = s.nextInt();
		
		if (number == 1) {
			System.out.println("입력 메뉴입니다.");
		} else if (number == 2) {
			System.out.println("수정 메뉴입니다.");
		} else if (number == 3) {
			System.out.println("조회 메뉴입니다.");
		} else if (number == 4) {
			System.out.println("삭제 메뉴입니다.");
		} else if (number == 9) {
			System.out.println("프로그램이 종료됩니다.");
		} else {
			System.out.println("올바른 값을 입력해 주세요.");
		}
	}
	
	public void practice2() {
		int num;
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		num = s.nextInt();
		
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public void practice3() {
		int kor, eng, math;
		float average;
		
		System.out.print("국어 점수 : ");
		kor = s.nextInt();
		
		System.out.print("수학 점수 : ");
		math = s.nextInt();
		
		System.out.print("영어 점수 : ");
		eng = s.nextInt();
		
		average = (float)(kor + math + eng) / 3.0f;
		if (kor >= 40 && math >= 40 && eng >= 40 && average >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + (kor + math + eng));
			System.out.println("평균 : " + average);
			System.out.println("축하합니다, 합격입니다 !");
		} else {
			System.out.println("불합격입니다.");
		}
	}

	public void practice4() {
		int month;
		String season;
		
		System.out.print("1~12 사이의 정수 입력 : ");
		month = s.nextInt();
		switch (month) {
		case 1:
		case 2:
		case 12:
			season = month + "월은 겨울입니다.";
			break;
			
		case 3:
		case 4:
		case 5:
			season = month + "월은 봄입니다.";
			break;
			
		case 6:
		case 7:
		case 8:
			season = month + "월은 여름입니다.";
			break;
			
		case 9:
		case 10:
		case 11:
			season = month + "월은 가을입니다.";
			break;
			
			default:
				season = month + "월은 잘못 입력된 달입니다.";
		}
		
		System.out.println(season);
	}

	public void practice5() {
		String ID, password;
		String IDinput, passwordInput;
		
		ID = "byeollim";
		password = "1234";
		
		s.nextLine();
		System.out.print("아이디 : ");
		IDinput = s.nextLine();
		
		System.out.print("비밀번호 : ");
		passwordInput = s.nextLine();
		
		if (ID.equals(IDinput) && password.equals(passwordInput)) {
			System.out.println("로그인 성공");
		} else if (ID.equals(IDinput) && !password.equals(passwordInput)) {
			System.out.println("비밀번호가 틀렸습니다,");
		} else if (!ID.equals(IDinput) && password.equals(passwordInput)) {
			System.out.println("아이디가 틀렸습니다.");
		} else {
			System.out.println("아이디와 패스워드가 틀렸습니다.");
		}
	}

	public void practice6() {
		String permission;
		
		s.nextLine();
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		permission = s.nextLine();
		
		if (permission.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리");
			System.out.println("게시글 작성, 댓글 작성");
			System.out.println("게시글 조회");
		} else if (permission.equals("회원")) {
			System.out.println("게시글 작성, 댓글 작성");
			System.out.println("게시글 조회");
		} else if (permission.equals("비회원")) {
			System.out.println("게시글 조회");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
	}

	public void practice7() {
		double height, weight, BMI;
		
		System.out.print("키(m)를 입력해 주세요 : ");
		height = s.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		weight = s.nextDouble();
		
		BMI = weight / (height * height);
		System.out.println("BMI 지수 : " + BMI);
		
		if (BMI < 18.5) {
			System.out.println("저체중");
		} else if (BMI >= 18.5 && BMI < 23) {
			System.out.println("정상체중");
		} else if (BMI >= 23 && BMI < 25) {
			System.out.println("과체중");
		} else if (BMI >= 25 && BMI < 30) {
			System.out.println("비만");
		} else if (BMI >= 30) {
			System.out.println("고도 비만");
		} else {
			System.out.println("올바른 수를 입력하세요.");
		}
	}

	public void practice8() {
		int num1, num2;
		int result;
		char op;
		
		System.out.print("피연산자1 입력 : ");
		num1 = s.nextInt();
		if (num1 <= 0) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		
		System.out.print("피연산자2 입력 : ");
		num2 = s.nextInt();
		if (num2 <= 0) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		
		s.nextLine();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		op = s.nextLine().charAt(0);
		
		if (op == '+') {
			result = num1 + num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
		} else if (op == '-') {
			result = num1 - num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
		} else if (op == '*') {
			result = num1 * num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
		} else if (op == '/') {
			result = num1 / num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
		} else if (op == '%') {
			result = num1 % num2;
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
	}

	public void practice9() {
		int middleTest, finalTest, work, attendence;
		double middleTest2, finalTest2, work2, attendence2;
		double result;
		
		System.out.print("중간 고사 점수 : ");
		middleTest = s.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		finalTest = s.nextInt();
		
		System.out.print("과제  점수 : ");
		work = s.nextInt();
		
		System.out.print("출석 회수 : ");
		attendence = s.nextInt();
		
		middleTest2 = middleTest * 0.2;
		finalTest2 = finalTest * 0.3;
		work2 = work * 0.3;
		attendence2 = (double)attendence;
		
		result = middleTest2 + finalTest2 + work2 + attendence;
		
		System.out.println("===========결과===========");
		
		System.out.println("중간 고사 점수(20) : " + middleTest2);
		System.out.println("기말 고사 점수(30) : " + finalTest2);
		System.out.println("과제 점수           (30) : " + work2);
		System.out.println("출석 점수           (20) : " + attendence2);
		System.out.println("총점 : " + result);

		if (result >= 70 && attendence >= 14) {
			System.out.println("PASS");
		} else if (result >= 70 && attendence < 14) {
			System.out.println("FAIL [출석 횟수 부족] (" + attendence + "/20)");
		} else if (result < 70 && attendence >= 14) {
			System.out.println("FAIL [점수 미달] (총점 " + result + ")");
		} else {
			System.out.println("FAIL [출석 횟수 부족] (" + attendence + "/20)");
			System.out.println("FAIL [점수 미달] (총점 " + result + ")");
		}
	}
	
	public void practice10() {
		int number;
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		
		System.out.print("선택 : ");
		number = s.nextInt();
		
		switch (number) {
		case 1:
			System.out.println();
			System.out.println("===========1. 메뉴 출력===========");
			practice1();
			break;
		case 2:
			System.out.println();
			System.out.println("===========2. 짝수/홀수===========");
			practice2();
			break;
		case 3:
			System.out.println();
			System.out.println("===========3. 합격/불합격===========");
			practice3();
			break;
		case 4:
			System.out.println();
			System.out.println("===========4. 계절===========");
			practice4();
			break;
		case 5:
			System.out.println();
			System.out.println("===========5. 로그인===========");
			practice5();
			break;
		case 6:
			System.out.println();
			System.out.println("===========6. 권한 확인===========");
			practice6();
			break;
		case 7:
			System.out.println();
			System.out.println("===========7. BMI===========");
			practice7();
			break;
		case 8:
			System.out.println();
			System.out.println("===========8. 계산기===========");
			practice8();
			break;
		case 9:
			System.out.println();
			System.out.println("===========9. Pass/Fail===========");
			practice9();
			break;
			default:
				System.out.println("1~10 사이를 입력하세요.");
				break;
				
		}
	}
}

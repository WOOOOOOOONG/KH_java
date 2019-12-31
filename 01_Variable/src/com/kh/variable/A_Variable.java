package com.kh.variable;
/* 
 * 다른 패키지명 안에는 같은 클래스명 만들 수 있음.
 * -> 클래스명은 패키지명부터 시작하기 때문에
 *
 */

import java.util.Scanner;

public class A_Variable {
	
	public void printValue() {
		System.out.println("변수 사용 전");
		System.out.println(100 + 10);
		System.out.println((100 + 10) * 10);
		System.out.println(((100 + 10) * 10) - 10);
		System.out.println((((100 + 10) * 10) - 10) / 10);
		
		// 변수의 정의 : 어떤 값을 메모리에 기록하기 위한 공간
		
		int point = 100;
		int bonus = 10;
		int personCount = 10;
		int fees = 10;
		
		System.out.println();
		System.out.println("변수 사용 후");
		System.out.println(point + bonus);
		System.out.println((point + bonus) * personCount);
		System.out.println((point + bonus) * personCount);
		
		/* 변수를 사용하는 이유
		 * 
		 * 값을 저장해 두고 사용하기 위함
		 */
	}
	public void declareVariable() {
		// 2. 숫자형
		
		// 2-1. 정수형
		boolean isTrue;
		byte bNum;
		short sNum;
		int iNum; // 기본형
		long lNum; // long 8byte
		
		// 2-2. 실수형
		float fNum;
		double dNum; //기본형
		
		// 3. 문자형
		char ch;
		
		// 4. 문자열(참조형)
		String str;
		
		// 변수에 값 대입
		isTrue = true;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		
		fNum = 4.0f;
		dNum = 10.8d;
		
		ch = 'a';
		
		str = "ABC"; // 하나의 문자만 저장도 가능
		
		// 4. 변수 명명 규칙
		int number;
		// int number; 동일 변수명 안 됨.
		int Number;
		// int true; 예약어  됨.
		int _1;
		int $2;
		//int number#3; '_', '$'이외의 특수문자 불가능
		String username;
		String userName; //카멜 표기법으로 단어와 단어 이어질 때 뒤에꺼 대문자
		
		String 이름; // 한글명은 안되는 곳일 수도 있기 때문에 가능하면 지양
		
	}
}

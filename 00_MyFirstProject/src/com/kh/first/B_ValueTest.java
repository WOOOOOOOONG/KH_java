package com.kh.first;

/* <명명 규칙>
 * 1. 패키지 -> 소문자 시작
 * 2. 클래스 -> 대문자 시작(파스칼)
 * 3. 메소드 -> 소문자 시작(카멜)
 */

public class B_ValueTest {
	public void printValue1() {
		
		// 숫자 출력
		System.out.println(123);
		System.out.println(1.23);
		
		// 문자 출력
		System.out.println('a');
		System.out.println('b');
		
		// 문자열 출력 -> 쌍따옴표(더블 쿼테이션) 사용
		System.out.println("안녕하세요.");
		System.out.println("반갑습니다.");
		
		// 내부 연산기능
		System.out.println(123 + 456);
		System.out.println(1.23 - 0.12); //컴퓨터는 이진수밖에 표현 못해서 실수값 연산은 불완전함
		
		// 문자와 숫자는 연산 가능
		// 컴퓨터는 문자도 숫자로 해석
		System.out.println('a' + 1);
		
		// 문자열은 숫자로 나옴
		System.out.println("ㅎㅇㅎㅇ" + 1);
	}
}

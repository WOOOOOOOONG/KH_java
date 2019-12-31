package com.kh.variable;

import java.util.Scanner;

public class B_KeyboardInput {
	// java.util 패키지에서 제공하는 Scanner 클래스를 이용한
	// 키보드 입력 테스트
	
	public void inputScanner1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까 : ");
//		String name = sc.next();
//		-> 사용자가 입력한 값 중 공백 이전까지의 값만 읽어오기
		String name = sc.nextLine();
//		-> 사용자가 입력한 한 줄에 있는 모든 정보 읽어오기
//		-> 공백이 포함될 여지가 있으면 nextLine(). 웬만하면 nextLine() 쓰면 될듯.
		
		System.out.print("당신의 나이는 몇살입니까 :  ");
		int age = sc.nextInt();
//		-> 사용자가 입력한 정수에 대한 값 읽어오기
		
		System.out.print("당신의 키는 몇입니까"
				+ "(소수점 첫째 자리까지 입력하시오.) : ");
		double height = sc.nextDouble();
		
//		사용자가 입력한 값들을 각각 name, age, height 라는 변수에 담았으니 출력해서 확인
		System.out.println(name + "님은 " + age + "세 이며, 키는" + height + "cm입니다.");;
		
		sc.close();
	}
	
	public void inputScanner2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt(); // 나이와 enter까지 입력
		sc.nextLine();
		
		System.out.println("주소 : ");
		String address = sc.nextLine(); // 버퍼에 이미 있는 enter를 보고 바로 나감
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "님은" + age + "세 이며, 사는 곳은 " + address
				+ "이고, 키는 " + height + "cm입니다.");
	}
	
	public void inputScanner3() {
		// 변수 선언
		String name;
		char gender;
		int age;
		double height;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		gender = sc.nextLine().charAt(0);
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.print("키 : ");
		height = sc.nextDouble();
		
		System.out.println(name + "님의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		
		sc.close();
	}
}

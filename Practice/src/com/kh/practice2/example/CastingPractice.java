package com.kh.practice2.example;

import java.util.*;

public class CastingPractice {
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		System.out.print("문자 : ");
		
		char ch = sc.nextLine().charAt(0);
		int num = ch;
		
		System.out.println();
		System.out.println(ch + " unicode : " + num);
		System.out.println();
	}
	
	public void method2() {
		double kor, eng, math;
		
		System.out.print("국어 : ");
		kor = sc.nextDouble();
		
		System.out.print("영어 : ");
		eng = sc.nextDouble();
		
		System.out.print("수학 : ");
		math = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("총점 : " + (int)(kor + eng + math));
		System.out.println("평균 : " + (int)((kor + eng + math) / 3));
		System.out.println();
	}
	
	public void method3() {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2); // 2
		System.out.println((int)dNum); // 2
		
		System.out.println(iNum2 * dNum); //10.0
		System.out.println((double)iNum1); //10.0
		
		System.out.println((double)iNum1 / (double)iNum2); //2.5
		System.out.println(dNum); //2.5
		
		System.out.println((int)fNum); //3
		System.out.println((int)(((double)iNum1 / (double)iNum2) + 0.9)); //3
		
		System.out.println((float)(iNum1 / fNum)); //3.333333
		System.out.println((double)((double)iNum1 / fNum)); //3.3333333335
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println(iNum1 + ch);
		System.out.println((char)(iNum1 + ch));
		
	}
}

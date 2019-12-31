package com.kh.variable;

public class D_Cast {
	public void rule1() {
//		형변환 불가능
		boolean flag = true;
		
//		자동 형 변환
//		1. 작은 자료형에서 큰 자료형으로
//		2. 정수에서 실수로 (ex. long -> float)
		int i = 12;
		double d = 3.3;
		double result = i + d;
		
		System.out.println("result : " + result);
		
		int i2 = 214748;
		long l = 100000000L;
		long result2 = i2 + l;
		
		System.out.println("result2 : " + result2);
		
		float f = 1.0f;
		double d2 = f;
		double result3 = f + d2;
		
		System.out.println("f : " + f);
		System.out.println("d2 : " + d2);
		System.out.println("result3 : " + result3);
		
		long l2 = 10000000000L;
		float f2 = l2;
		System.out.println("f2 : " + f2);
		
		int num = 'A';
		System.out.println("num : " + num);
		
		char c = 65;
		System.out.println("ch : " + c);
		
		byte b2 = 1;
		byte b3 = 10;
//		byte result4 = b2 + b3; 에러
		int result4 = b2 + b3;
		System.out.println("b2 : " + b2);
		System.out.println("b3 : " + b3);
		System.out.println("result4 : " + result4);
	}
	
	public void rule2() {
		int iNum = 10;
		double dNum = 5.89;
//		int iSum = iNum + dNum;
		int iSum = (int)(iNum + dNum);
		System.out.println("iSum : " + iSum);
		
		int iSum2 = iNum + (int)dNum;
		System.out.println("iSum2 : " + iSum2);
		
		double dSum = iNum + dNum;
		System.out.println("dSum : " + dSum);
	}
	
	public void dataLoss() {
		int iNum = 290;
		System.out.println("iNum : " + iNum);
		
		byte bNum = (byte)iNum;
		System.out.println("bNum : " + bNum); // 340나옴. 데이터 손실 발생하기 때문에 주의
	}
}
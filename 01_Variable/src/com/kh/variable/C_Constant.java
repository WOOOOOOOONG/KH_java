package com.kh.variable;

public class C_Constant {

	public void finalConstant() {
		int age = 20;
		final int AGE = 20;
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		age = 30;
//		AGE = 30;
		
		System.out.println("변경된 age : " + age);
		System.out.println("변경된 AGE : " + AGE);
		System.out.println("상수 값은 한 번 기록된 후 " + "값 변경 불가능함!!");
	}
}

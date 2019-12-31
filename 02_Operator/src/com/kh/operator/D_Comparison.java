package com.kh.operator;

public class D_Comparison {
		public void method1() {
			int a = 10;
			int b = 25;
	
			boolean bResult = (a == b);
			boolean bResult2 = (a <= b);
			
			System.out.println("a´Â Â¦¼öÀÎ°¡ : " + (a % 2 == 0));
			System.out.println("b´Â È¦¼öÀÎ°¡ : " + (b % 2 == 0));
			
			System.out.println("a´Â Â¦¼öÀÎ°¡ : " + (b % 2 == 0));
			System.out.println("b´Â È¦¼öÀÎ°¡ : " + (b % 2 == 0));
	}
}

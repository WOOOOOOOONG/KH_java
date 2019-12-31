package com.kh.variable;

public class E_Overflow {
	public void printVariableSize() {
		//Byte, Short, Integer ...
		//등은 java.lang 패키지 하위에 포함된 클래스고,
		//import하지 않고 사용 가능
		System.out.println("byte의 크기 : " + Byte.BYTES + "byte");
		System.out.println("short의 크기 : " + Short.BYTES + "byte");
		System.out.println("int의 크기 : " + Integer.BYTES + "byte");
		System.out.println("long의 크기 : " + Long.BYTES + "byte");
		System.out.println("float의 크기 : " + Float.BYTES + "byte");
		System.out.println("double의 크기 : " + Double.BYTES + "byte");
		System.out.println("char의 크기 : " + Character.BYTES + "byte");
	}
	
	public void overflow() {
		
	}
}

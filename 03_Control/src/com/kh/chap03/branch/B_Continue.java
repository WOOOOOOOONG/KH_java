package com.kh.chap03.branch;

import java.util.Scanner;

public class B_Continue {
	Scanner s = new Scanner(System.in);
	
	public void method2() {
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("sum : " + sum);
	}
	
	public void method3() {
		for (int dan = 2; dan <= 9; dan++) {
			if (dan == 4) {
				continue;
			}
			System.out.println("=== " + dan + " ===");
			
			for (int su = 1; su <= 9; su++) {
				System.out.println(dan + " X " + su + " = " + (dan*su));
			}
		}
	}
	
	public void method4() {
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("=== " + dan + " ===");
			
			for (int su = 1; su <= 9; su++) {
				if (su % 2 == 0) {
					continue;
				}
				System.out.println(dan + " X " + su + " = " + (dan*su));
			}
			System.out.println();
		}
	}
	
	
}

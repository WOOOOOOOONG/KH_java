package com.kh.baek;

import java.util.Scanner;

public class Baek101 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		long start, destination;
		
		Scanner sc = new Scanner(System.in);
		
		t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			start = sc.nextLong();
			destination = sc.nextLong();
			
			long n = 1L;
			while ((n * n) <= (destination - start)) {
				n++;
			}
			n--;
			
			long remain = (destination - start) - (n * n);
			remain = (long)Math.ceil((double)remain / (double)n);
			System.out.println((long)(n * 2  - 1 + remain));
		}
		
		sc.close();
	}
}
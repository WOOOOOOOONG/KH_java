package test.controller;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		double average;
		int cnt = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
			cnt ++;
		}
		
		average = sum / cnt;
		
		System.out.println("ÇÕ°è : " + sum);
		System.out.println("Æò±Õ : " + average);
	}

}

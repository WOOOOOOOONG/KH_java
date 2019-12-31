package test.controller;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num1, num2;
		int sum, diff, mul, div;
		
		System.out.print("첫 번째 정수 : ");
		num1 = s.nextInt();
		System.out.print("두 번째 정수 : ");
		num2 = s.nextInt();
		
		if(num1 >= 1 && num1 <= 9 && num2 >= 1 && num2 <= 9) {
			sum = num1 + num2;
			diff = num1 - num2;
			mul = num1 * num2;
			div = num1 / num2;
			
			System.out.printf("합 : %d \n", sum);
			System.out.printf("차 : %d \n", diff);
			System.out.printf("곱 : %d \n", mul);
			System.out.printf("나누기 : %d \n", div);
		} else if(num2 <= 0) {
			sum = 0;
			diff = 0;
			mul = 0;
			div = 0;
			
			System.out.printf("합 : %d \n", sum);
			System.out.printf("차 : %d \n", diff);
			System.out.printf("곱 : %d \n", mul);
			System.out.printf("나누기 : %d \n", div);
		} else {
			System.out.println("1부터 9까지의 숫자만 입력하세요.");
		}
	}

}

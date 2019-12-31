package test.controller;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		for(num = 2; num <= 5; num++) {
			if(num % 2 == 1) {
				for(int i = 1; i <= 9; i++) {
					System.out.printf("%d*%d=%d \n", num, i, num * i);
				}
			}
		}
	}

}

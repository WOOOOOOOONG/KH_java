package com.kh.chap02.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner s = new Scanner(System.in);
	
	public void practice1() {
		int num;
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		num = s.nextInt();
		
		if (num <= 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		
		for (int i = 0; i < num; i++) {
			System.out.print((i + 1) + " ");
		}
		System.out.println();
		System.out.println();
	}
	
	public void practice2() {
		int num = 0;
		
		while(num < 1) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			num = s.nextInt();
			
			if (num < 1) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
		
		for (int i = 0; i < num; i++) {
			System.out.print((i + 1) + " ");
		}
		System.out.println();
		System.out.println();
	}
	
	public void practice3() {
		int num;
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		num = s.nextInt();
		
		if (num <= 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		
		for (int i = num; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
	}
	
	public void practice4() {
		int num = 0;
		
		while (num < 1) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			num = s.nextInt();
		
			if (num < 1) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
		
			for (int i = num; i > 0; i--) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println();
	}

	public void practice5() {
		int num;
		int sum = 0;
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		num = s.nextInt();
		
		for (int i = 1; i <= num; i++) {
			sum += i;
			if (i == num) {
				System.out.print(i + " = ");
			}
			else if(i != num) {
				System.out.print(i + " + ");
			}
		}
		System.out.println(sum);
		System.out.println();
	}
	
	public void practice6() {
		int num1, num2;
		
		System.out.print("ù ��° ���� : ");
		num1 = s.nextInt();
		System.out.print("�� ��° ���� : ");
		num2 = s.nextInt();
		
		if (num1 <= 0 || num2 <= 0) {
			System.out.println("1�̻��� ���ڸ��� �Է����ּ���.");
		} else if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println();
	}
	
	public void practice7() {
		int num1, num2;
		
		while(true) {
			System.out.print("ù ��° ���� : ");
			num1 = s.nextInt();
			
			System.out.print("�� ��° ���� : ");
			num2 = s.nextInt();
			
			if (num1 <= 0 || num2 <= 0) {
				System.out.println("1�̻��� ���ڸ��� �Է����ּ���.");
				continue;
			} else if (num1 > num2) {
				for (int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
				}
				break;
			} else {
				for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
				}
				break;
			}
		}
		System.out.println();
		System.out.println();
	}
	
	public void practice8() {
		int num;
		
		System.out.print("���� : ");
		num = s.nextInt();
		System.out.println("===== " + num + "�� =====");
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d \n", num, i, num * i);
		}
		System.out.println();
	}

	public void practice9() {
		int num;
		
		System.out.print("���� : ");
		num = s.nextInt();
		
		if (!(num >= 2 && num <= 9)) {
			System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
			System.out.println();
			return;
		}
		
		for (int i = num; i <= 9; i++) {
			System.out.println("===== " + i + "�� =====");
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d \n", i, j, i * j);
			}
		}
		System.out.println();
	}
	
	public void practice10() {
		int num;
		
		while(true) {
			
			System.out.print("���� : ");
			num = s.nextInt();
			
			if (!(num >= 2 && num <= 9)) {
				System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
				continue;
			}
		
			for (int i = num; i <= 9; i++) {
				System.out.println("===== " + i + "�� =====");
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d \n", i, j, i * j);
				}
			}
			break;
		}
		System.out.println();
	}
	
	public void practice11() {
		int start;
		int diff;
		
		System.out.print("���� ���� : ");
		start = s.nextInt();
		System.out.print("���� : ");
		diff = s.nextInt();
		
		for(int i = 0; i < 10; i++) {
			System.out.print(start + " ");
			start += diff;
		}
		System.out.println();
		System.out.println();
	}
	
	public void practice12() {
		int num;
		
		System.out.print("���� �Է� : ");
		num = s.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void practice13() {
		int num;
		
		System.out.print("���� �Է� : ");
		num = s.nextInt();
		
		for(int i = num; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		s.nextLine();
		System.out.println();
	}
	
	public void practice14() {
		String op;
		int num1, num2;
		
		while(true) {
			System.out.print("������(+, -, *, /, %) : ");
			op = s.nextLine();
		
			if(op.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				System.out.println();
				return;
			}
			
			System.out.print("����1 : ");
			num1 = s.nextInt();
		
			System.out.print("����2 : ");
			num2 = s.nextInt();
			
			s.nextLine();
			
			if(num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
			
			if (op.charAt(0) == '+') {
				System.out.printf("%d %s %d = %d \n", num1, op, num2, num1 + num2);
			} else if(op.charAt(0) == '-') {
				System.out.printf("%d %s %d = %d \n", num1, op, num2, num1 - num2);
			} else if(op.charAt(0) == '*') {
				System.out.printf("%d %s %d = %d \n", num1, op, num2, num1 * num2);
			} else if(op.charAt(0) == '/') {
				System.out.printf("%d %s %d = %d \n", num1, op, num2, num1 / num2);
			} else if(op.charAt(0) == '%') {
				System.out.printf("%d %s %d = %d \n", num1, op, num2, num1 % num2);
			} else {
				System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
		}
	}
		
	public void practice15() {
		int num;
		boolean isSolo = true;
		
		System.out.print("���� : ");
		num = s.nextInt();
		
		if(num < 2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.println();
			return;
		}
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				isSolo = false;
			}
		}
		
		if(isSolo == true) {
			System.out.println("�Ҽ��Դϴ�.");
		} else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}
		System.out.println();
	}
	
	public void practice16() {
		int num;
		boolean isSolo;
		
		while(true) {
			isSolo = true;
			System.out.print("���� : ");
			num = s.nextInt();
		
			if(num < 2) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
		
			for(int i = 2; i < num; i++) {
				if(num % i == 0) {
					isSolo = false;
				}
			}
		
			if(isSolo == true) {
				System.out.println("�Ҽ��Դϴ�.");
			} else {
				System.out.println("�Ҽ��� �ƴմϴ�.");
			}
			break;
		}
		System.out.println();
	}

	public void practice17() {
		int num;
		int count = 0;
		boolean isSolo;
		
		System.out.print("���� : ");
		num = s.nextInt();
		
		if(num < 2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.println();
			return;
		}
		
		for(int i = 2; i <= num; i++) {
			
			isSolo = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isSolo = false;
					break;
				}
			}
			if(isSolo == true) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.printf("2���� %d���� �Ҽ��� ������ %d���Դϴ�. \n",num, count);
		System.out.println();
	}
	
	public void practice18() {
		int num;
		System.out.print("�ڿ��� �ϳ��� �Է��ϼ��� : ");
		num = s.nextInt();
		int count = 0;
		
		for (int i = 2; i <= num; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
			if(i % 2 == 0 && i % 3 == 0) {
				count++;
			}
		}
		System.out.println();
		System.out.println("count : " + count);
		System.out.println();
	}
	
	public void practice19() {
		int num;
		System.out.print("���� �Է� : ");
		num = s.nextInt();
		
		for(int i = num; i >= 1; i--) {
			for(int j = 0; j < num; j++) {
				if (j >= i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void practice20() {
		int num;
		System.out.print("���� �Է� : ");
		num = s.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = num - 1; i >= 1; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void practice21() {
		int num;
		int starPosition, starCount;
		
		System.out.print("���� �Է� : ");
		num = s.nextInt();
		char[][] str = new char[num * 2][num * 2];
		
		starPosition = ((num * 2) / 2) - 1;
		starCount = 1;
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num * 2 - 1; j++) {
				str[i][j] = ' ';
			}
			
			for(int j = starPosition; j < starPosition + starCount; j++) {
				str[i][j] = '*';
			}
			
			starPosition -= 1;
			starCount += 2;
			
		}
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num * 2 - 1; j++) {
				System.out.print(str[i][j]); 
			}
			System.out.println();
		}
		System.out.println();
	}

	public void practice22() {
		int num;
		
		System.out.print("���� �Է� : ");
		num = s.nextInt();
		for(int i = 0; i < num; i++) {
			if(i == 0 || i == num - 1) {
				for(int j = 0; j < num; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(int j = 0; j < num; j++) {
					if(j == 0 || j == num - 1)
						System.out.print("*");
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		System.out.println();
	}
	
	public void practice23() {
		int num;
		int dice1, dice2;
		int diceSum = 0;
		char isNextGame;
		
		do {
			System.out.print("���� �Է� : ");
			num = s.nextInt();
			
			dice1 = (int)((Math.random() * 6) + 1);
			System.out.println("ù ��° �ֻ��� ���� �� : " + dice1);
			dice2 = (int)((Math.random() * 6) + 1);
			System.out.println("�� ��° �ֻ��� ���� �� : " + dice2);
			
			diceSum = dice1 + dice2;
			System.out.println("�� �ֻ��� ���� �� : " + diceSum);
			
			if(num == diceSum) {
				System.out.println("�¾ҽ��ϴ�.");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
			
			System.out.print("��� �Ͻðڽ��ϱ�? (y/n) : ");
			
			s.nextLine();
			
			isNextGame = s.nextLine().charAt(0);
			
			if(isNextGame == 'y') {
				continue;
			} else if(isNextGame == 'n') {
				System.out.println();
				break;
			} else {
				System.out.println("�ùٸ� ���� �Է����� �ʾҽ��ϴ�.");
				System.out.println("������ �����մϴ�.");
			}
		} while(true);
	}
	
	public void practice24() {
		int i;
		
		while(true) {
			System.out.print("������ �޼��� ��ȣ �Է�(0 ����) : ");
			i = s.nextInt();
			s.nextLine();
			
			switch(i) {
			case 0 :
				System.out.println("==== �����մϴ� ====");
				System.out.println();
				return;
			case 1 : 
				System.out.println("==== method" + i + "() ���� ====");
				practice1();
				break;
			case 2 :
				System.out.println("==== method" + i + "() ���� ====");
				practice2();
				break;
			case 3 :
				System.out.println("==== method" + i + "() ���� ====");
				practice3();
				break;
			case 4 :
				System.out.println("==== method" + i + "() ���� ====");
				practice4();
				break;
			case 5:
				System.out.println("==== method" + i + "() ���� ====");
				practice5();
				break;
			case 6:
				System.out.println("==== method" + i + "() ���� ====");
				practice6();
				break;
			case 7:
				System.out.println("==== method" + i + "() ���� ====");
				practice7();
				break;
			case 8:
				System.out.println("==== method" + i + "() ���� ====");
				practice8();
				break;
			case 9:
				System.out.println("==== method" + i + "() ���� ====");
				practice9();
				break;
			case 10:
				System.out.println("==== method" + i + "() ���� ====");
				practice10();
				break;
			case 11:
				System.out.println("==== method" + i + "() ���� ====");
				practice11();
				break;
			case 12:
				System.out.println("==== method" + i + "() ���� ====");
				practice12();
				break;
			case 13:
				System.out.println("==== method" + i + "() ���� ====");
				practice13();
				break;
			case 14:
				System.out.println("==== method" + i + "() ���� ====");
				practice14();
				break;
			case 15:
				System.out.println("==== method" + i + "() ���� ====");
				practice15();
				break;
			case 16:
				System.out.println("==== method" + i + "() ���� ====");
				practice16();
				break;
			case 17:
				System.out.println("==== method" + i + "() ���� ====");
				practice17();
				break;
			case 18:
				System.out.println("==== method" + i + "() ���� ====");
				practice18();
				break;
			case 19:
				System.out.println("==== method" + i + "() ���� ====");
				practice19();
				break;
			case 20:
				System.out.println("==== method" + i + "() ���� ====");
				practice20();
				break;
			case 21:
				System.out.println("==== method" + i + "() ���� ====");
				practice21();
				break;
			case 22:
				System.out.println("==== method" + i + "() ���� ====");
				practice22();
				break;
			case 23:
				System.out.println("==== method" + i + "() ���� ====");
				practice23();
				break;
				default :
					break;
		}
		
		}
	}
}

package com.kh.array.practice;

import java.util.*;

public class ArrayPractice {
	
	Scanner s = new Scanner(System.in);
	
	public void practice1() {
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = i + 1;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		int j = 10;
		for(int i = 0; i < 10; i++) {
			arr[i] = j;
			j--;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		int num;
		System.out.print("���� ���� : ");
		num = s.nextInt();
		
		int[] arr = new int[num];
		for(int i = 0; i < num; i++) {
			arr[i] = i + 1;
		}
		
		for(int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		String[] str = {"���", "��", "����", "������", "����"};
		
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals("��")) {
				System.out.println(str[i]);
				break;
			}
		}
	}
	
	public void practice5() {
		String str = new String();
		int cnt = 0;
		char ch;
		
		System.out.print("���ڿ� : ");
		str = s.nextLine();
		System.out.print("���� : ");
		ch = s.nextLine().charAt(0);
		
		System.out.printf("%s�� %c�� �����ϴ� ��ġ(�ε���) : ", str, ch);
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				System.out.print(i + " ");
				cnt++;
			}
		}
		System.out.println();
		
		System.out.println("i ���� : " + cnt);
	}
	
	public void practice6() {
		int num;
		String[] str = {"������", "ȭ����", "������", "�����"
				, "�ݿ���", "�����", "�Ͽ���"};
		
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		num = s.nextInt();
		
		if (num >= 0 && num <= 6) {
			System.out.println(str[num]);
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void practice7() {
		int num;
		int sum = 0;
		
		System.out.print("���� : ");
		num = s.nextInt();
		
		int[] arr = new int[num];
		for(int i = 0; i < num; i++) {
			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			arr[i] = s.nextInt();
		}
		
		for(int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("�� �� : " + sum);
	}
	
	public void practice8() {
		int num = 0;
		int[] arr;
		
		while(true) {
			System.out.print("���� : ");
			num = s.nextInt();
			
			if(!(num % 2 == 1 && num >= 3)) {
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
			arr = new int[num];
			
			for(int i = 0; i < num; i++) {
				if(i <= (num - 1) / 2) {
					arr[i] = i + 1;
				}else {
					arr[i] = arr[i - 1] - 1;
				}
			}
			break;
		}
		
		for(int i = 0; i < num; i++) {
			if(i == num - 1) {
				System.out.println(arr[i]);
				break;
			}
			System.out.print(arr[i] + ", ");
		}
	}
	
	public void practice9() {
		String[] chicken = {"���", "�Ҵ�", "�Ķ��̵�"};
		String str;
		
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		str = s.nextLine();
		
		for(int i = 0; i < chicken.length; i++) {
			if(chicken[i].equals(str)) {
				System.out.printf("%sġŲ  ��� ���� \n", chicken[i]);
				break;
			}
			else if(i == chicken.length - 1) {
				System.out.printf("%sġŲ�� ���� �޴��Դϴ�. \n", str);
			}
		}
	}
	
	public void practice10() {
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = (int)((Math.random() * 10) + 1);
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice11() {
		int[] arr = new int[10];
		int random;
		boolean isHave;
		for(int i = 0; i < 10; i++) {
			isHave = false;
			random = (int)((Math.random() * 10) + 1);
			
			for(int j = 0; j < i; j++) {
				if(arr[j] == random) {
					isHave = true;
					break;
				}
			}
			
			if(isHave == true) {
				i--;
				continue;
			}else {
				arr[i] = random;
			}
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() {
		String str;
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		str = s.nextLine();
		
		char[] charStr = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			if(i < 8) {
				charStr[i] = str.charAt(i);
			}else {
				charStr[i] = '*';
			}
		}
		for(int i = 0; i < charStr.length; i++) {
			System.out.print(charStr[i]);
		}
	}
	
	public void practice13() {
		int[] arr = new int[6];
		int temp;
		int random;
		boolean isHave;
		for(int i = 0; i < 6; i++) {
			isHave = false;
			random = (int)((Math.random() * 64) + 1);
			
			for(int j = 0; j < i; j++) {
				if(arr[j] == random) {
					isHave = true;
					break;
				}
			}
			
			if(isHave == true) {
				i--;
				continue;
			}else {
				arr[i] = random;
			}
		}
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 5; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice14() {
		String str;
		char[] charStr;
		int charIndex = 0;
		boolean isData;
		
		System.out.print("���ڿ� : ");
		str = s.nextLine();
		charStr = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			isData = false;
			
			for(int j = 0; j < charStr.length; j++) {
				if(str.charAt(i) == charStr[j]) {
					isData = true;
					break;
				}
			}
			if(isData == false) {
				charStr[charIndex++] = str.charAt(i);
			}
		}

		System.out.print("���ڿ��� �ִ� ���� : ");
		for(int i = 0; i < charIndex; i++) {
			if(i == charStr.length - 1) {
				System.out.println(charStr[i]);
			}else {
				System.out.print(charStr[i] + ", ");
			}
		}
		
		System.out.println();
		System.out.println("���� ���� : " + charIndex);
	}
	
	public void practice15() {
		int size;
		int strSize = 0;
		boolean bContinue = true;
		boolean bFirst = true;
		char isContinue;
		String[] str = new String[50];
		
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		size = s.nextInt();
		s.nextLine();
		
		while(bContinue == true) {
			if(bFirst == false) {
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				size = s.nextInt();
				s.nextLine();
			}
			
			bFirst = false;
			
			for(int i = 0; i < size; i++) {
				System.out.printf("%d��° ���ڿ� : ", (strSize + 1));
				str[strSize++] = s.nextLine();
			}

			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			isContinue = s.nextLine().charAt(0);
			
			if(isContinue == 'y') {
				continue;
			} else if(isContinue == 'n') {
				bContinue = false;
			}
		}
		
		System.out.print("[");
		for(int i = 0; i < strSize; i++) {
			if(i == strSize - 1) {
				System.out.print(str[i]);
				continue;
			}
			System.out.print(str[i] + ", ");
		}
		System.out.print("]");
	}
}

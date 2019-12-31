package com.kh.dimension;

import java.util.*;

public class DimensionalArray {
	Scanner s = new Scanner(System.in);
	
	public void method1() {
		/* 2���� �迭 ����
		 * �ڷ���[][] �迭��
		 * �ڷ���[] �迭��[]
		 * �ڷ��� �迭��[][]
		 */
		
		int[][] arr1;
		int[] arr2[];
		int arr3[][];
		
		arr1 = new int[3][5];
		
		System.out.println("���� ���� : " + arr1.length);
		
		System.out.println("���� ���� : " + arr1[0].length);
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void method2() {
		int[][] arr = new int[3][5];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[0][4] = 5;
		
		int value = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void method3() {
		int[][] arr = {{1, 2, 3, 4, 5},
					{6, 7, 8, 9, 10},	
					{11, 12, 13, 14, 15}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
				// tap�� �ٵ� �����ش�.
			}
			System.out.println();
		}
	}
	
	public void method4() {
		/* �����迭
		 * ���� ���������� �� �࿡ ���� ���� ������
		 * ���� ������ ���������� ���� ���¸� ����.
		 */
		
		//���� ���̸� �����ְ�, ������ �ึ�� ���� �ʱ�ȭ
		int[][] arr = new int[3][];
		
		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void method5() {
		int[][] arr = {{1, 2}, {3}, {4, 5, 6}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void method6() {
		double[][] scores = new double[2][4];
		
		for(int i = 0; i < scores.length; i++) {
			double sum = 0;
			
			for(int j = 0; j < scores[i].length - 1; j++) {
				if(i == 0) {
					System.out.print((j + 1) + "�� �л��� ���� ���� : ");
				}else {
					System.out.print((j + 1) + "�� �л��� ���� ���� : ");
				}
				scores[i][j] = s.nextDouble();
				sum += scores[i][j];
			}
			scores[i][3] = sum;
		}
		
		for(int i = 0; i < scores.length; i++) {
			if(i == 0) {
				System.out.print("���� ���� : ");
			}else {
				System.out.print("���� ���� : ");
			}

			for(int j = 0; j < scores[i].length; j++) {
				if(j < scores[i].length - 1) {
					System.out.print(scores[i][j] + " ");
				}else {
					System.out.print("�հ� : " + scores[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println("���� ���� ��� : " + scores[0][3] / 3);
		System.out.println("���� ���� ��� : " + scores[1][3] / 3);
	}

	public void method7() {
		char[][] arr = new char[5][5];
		int row, column;
		
		while(true) {
			// ������ �Է�
			System.out.print("�� �ε��� �Է� >> ");
			row = s.nextInt();
			
			System.out.print("�� �ε��� �Է� >> ");
			column = s.nextInt();
			
			// Ż�� ����
			if(row > 4 || row < 0 || column > 4 || column < 0) {
				break;
			}
			
			arr[row][column] = 'X';
			
			// ���� ���
			System.out.print("\t");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(i + "\t");
			}
			System.out.println();
			
			// �࿭ ���
			for(int i = 0; i < arr.length; i++) {
				System.out.print(i + "\t");
				
				for(int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("���α׷��� �����մϴ�");
	}
	
	public void method8() {
		int[] arr = new int[3 * 3];
		int[][] arr2 = new int[3][3];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println("===== ������ �迭 ��� =====");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int index = 0; // ������ �迭�� 0��~������ �ε���
					   // ���� �����ϱ� ���� ����
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = arr[index++];
			}
		}
		
		System.out.println("===== ������ �迭 ��� =====");
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void bingo() {
		System.out.print("������ ũ�� ���� : ");
		int num = s.nextInt();
		
		int[] temArr = new int[num * num];
		
		for(int i = 0; i < temArr.length; i++) {
			temArr[i] = (int)(Math.random() * (num * num) + 1);
			for(int j = 0; j < i; j++) {
				if(temArr[i] == temArr[j]) {
					i--;
					break;
				}
			}
		}
		
		int[][] arr = new int[num][num];
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = temArr[index++];
			}
		}
		
		// �� ���� ������ ���
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d ", arr[i][j]);
			}
			System.out.println();
		}
		
		int count = 0;
		System.out.println("===== ���� ���� ���� =====");
		while(true) {
			System.out.print("������ �Է��Ͻÿ� : ");
			int select = s.nextInt();
			s.nextLine();
			count++; // �� ����
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					if(arr[i][j] == select) {
						arr[i][j] = 0;
					}
					System.out.printf("%4d", arr[i][j]);
				}
				System.out.println();
			}
			
			System.out.print("������ �����ðڽ��ϱ�? (Y/N) : ");
			char ch = s.nextLine().toUpperCase().charAt(0);
			
			if(ch == 'Y') {
				break;
			}
		}
		
		System.out.println(count + "�� �Է��Ͽ����ϴ�.");
		String s;
	}
}

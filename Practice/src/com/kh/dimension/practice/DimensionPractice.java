package com.kh.dimension.practice;

import java.util.*;

public class DimensionPractice {
	Scanner s = new Scanner(System.in);
	
	public void practice1() {
		int[][] arr = new int[4][4];
		int index = 1;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				arr[i][j] = index++;
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int[][] arr = new int[4][4];
		int index = 16;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				arr[i][j] = index--;
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		String[][] arr = new String[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		int[][] arr = new int[4][4];
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr[i].length - 1; j++) {
				arr[i][j] = (int)(Math.random() * 10 + 1);
			}
			for(int j = 0; j < arr[i].length - 1; j++) {
				arr[i][3] += arr[i][j];
			}
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr[i].length - 1; j++) {
				arr[3][i] += arr[j][i];
				arr[3][3] += arr[i][j];
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void practice5() {
		int row = 0, column = 0;
		char[][] charStr;
		while(true) {
			System.out.print("�� ũ�� : ");
			row = s.nextInt();
			System.out.print("�� ũ�� : ");
			column = s.nextInt();
			
			if(row > 10 || row < 0 || column > 10 || column < 0) {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
				continue;
			}
			break;
		}
		
		charStr = new char[row][column];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				charStr[i][j] = (char)(Math.random() * 26 + 65);
			}
		}
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.printf("%c ", charStr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice6() {
		String[][] strArr = new String[][] {{"��", "��", "��", "��", "��"}, 
			{"��", "��", "��", "��", "��"}, {"��", "��", "��", "��", "��"},
			{"��", "��", "��", "��", "��"}, {"��", "��", "! ", "��", "!! "}};
			
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
		}
		
	}
	
	public void practice7() {
		int arr[][];
		int rowSize;
		int[] columnSize;
		char alphabet = 'a';
		
		System.out.print("���� ũ�� : ");
		rowSize = s.nextInt();
		arr = new int[rowSize][];
		columnSize = new int[rowSize];
		
		for(int i = 0; i < rowSize; i++) {
			System.out.printf("%d���� ũ�� : ", i);
			columnSize[i] = s.nextInt();
		}
		
		for(int i = 0; i < rowSize; i++) {
			arr[i] = new int[columnSize[i]];
			for(int j = 0; j < columnSize[i]; j++) {
				arr[i][j] = alphabet++;
			}
		}
		
		for(int i = 0; i < rowSize; i++) {
			for(int j = 0; j < columnSize[i]; j++) {
				System.out.printf("%c ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		String[] students = {"�迹��", "�迵��", "����", "������", 
				"������", "������", "�̿���", "�ӽ�ȯ", "������", "������"
				, "���¿�", "������"};
		
		String[][] firstDivision = new String[3][2];
		String[][] secondDivision = new String[3][2];
		int studentCount = 0;
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < firstDivision.length; j++) {
				for(int k = 0; k < firstDivision[j].length; k++) {
					if(i == 0) {
						firstDivision[j][k] = students[studentCount++];
					} else {
						secondDivision[j][k] = students[studentCount++];
					}
				}
			}
		}
		
		for(int i = 0; i < 2; i++) {
			System.out.println("== " + (i + 1) + "�д� ==");
			
			for(int j = 0; j < firstDivision.length; j++) {
				for(int k = 0; k < firstDivision[j].length; k++) {
					if(i == 0) {
						System.out.print(firstDivision[j][k] + " ");
					} else {
						System.out.print(secondDivision[j][k] + " ");
					}
				}
				System.out.println();
			}
		}
	}
	
	public void practice9() {
		String[] students = {"�迹��", "�迵��", "����", "������", 
				"������", "������", "�̿���", "�ӽ�ȯ", "������", "������"
				, "���¿�", "������"};
		
		String[][] firstDivision = new String[3][2];
		String[][] secondDivision = new String[3][2];
		int studentCount = 0;
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < firstDivision.length; j++) {
				for(int k = 0; k < firstDivision[j].length; k++) {
					if(i == 0) {
						firstDivision[j][k] = students[studentCount++];
					} else {
						secondDivision[j][k] = students[studentCount++];
					}
				}
			}
		}
		
		for(int i = 0; i < 2; i++) {
			System.out.println("== " + (i + 1) + "�д� ==");
			
			for(int j = 0; j < firstDivision.length; j++) {
				for(int k = 0; k < firstDivision[j].length; k++) {
					if(i == 0) {
						System.out.print(firstDivision[j][k] + " ");
					} else {
						System.out.print(secondDivision[j][k] + " ");
					}
				}
				System.out.println();
			}
		}
		
		String name;
		boolean isFind = false;
		String direction;
		System.out.println("============================");
		System.out.print("�˻��� �л� �̸��� �Է��ϼ��� : ");
		name = s.nextLine();
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < firstDivision.length; j++) {
				for(int k = 0; k < firstDivision[j].length; k++) {
					if(i == 0) {
						if(firstDivision[j][k].equals(name)) {
							isFind = true;
							System.out.printf("�˻��Ͻ� %s �л��� %d�д� %d��° �� ", name, (i + 1), (j + 1));
							direction = k == 0 ? "����" : "������";
							System.out.printf("%s�� �ֽ��ϴ�.", direction);
							
							return;
						}
					} else {
						if(secondDivision[j][k].equals(name)) {
							isFind = true;
							System.out.printf("�˻��Ͻ� %s �л��� %d�д� %d��° �� ", name, (i + 1), (j + 1));
							direction = k == 0 ? "����" : "������";
							System.out.printf("%s�� �ֽ��ϴ�.", direction);
							
							return;
						}
					}
				}
			}
		}
		
		if(isFind == false) {
			System.out.printf("%s�л��� ã�� ���߽��ϴ�. \n", name);
		}
	}
}

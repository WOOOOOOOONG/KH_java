package com.kh.dimension;

import java.util.*;

public class DimensionalArray {
	Scanner s = new Scanner(System.in);
	
	public void method1() {
		/* 2차원 배열 형태
		 * 자료형[][] 배열명
		 * 자료형[] 배열명[]
		 * 자료형 배열명[][]
		 */
		
		int[][] arr1;
		int[] arr2[];
		int arr3[][];
		
		arr1 = new int[3][5];
		
		System.out.println("행의 길이 : " + arr1.length);
		
		System.out.println("열의 길이 : " + arr1[0].length);
		
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
				// tap은 줄도 맞춰준다.
			}
			System.out.println();
		}
	}
	
	public void method4() {
		/* 가변배열
		 * 행은 정해졌으나 각 행에 대한 열의 갯수가
		 * 정해 갯수가 정해져있지 않은 상태를 말함.
		 */
		
		//행의 길이만 정해주고, 각각의 행마다 따로 초기화
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
					System.out.print((j + 1) + "번 학생의 국어 점수 : ");
				}else {
					System.out.print((j + 1) + "번 학생의 영어 점수 : ");
				}
				scores[i][j] = s.nextDouble();
				sum += scores[i][j];
			}
			scores[i][3] = sum;
		}
		
		for(int i = 0; i < scores.length; i++) {
			if(i == 0) {
				System.out.print("국어 점수 : ");
			}else {
				System.out.print("영어 점수 : ");
			}

			for(int j = 0; j < scores[i].length; j++) {
				if(j < scores[i].length - 1) {
					System.out.print(scores[i][j] + " ");
				}else {
					System.out.print("합계 : " + scores[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println("국어 점수 평균 : " + scores[0][3] / 3);
		System.out.println("영어 점수 평균 : " + scores[1][3] / 3);
	}

	public void method7() {
		char[][] arr = new char[5][5];
		int row, column;
		
		while(true) {
			// 데이터 입력
			System.out.print("행 인덱스 입력 >> ");
			row = s.nextInt();
			
			System.out.print("열 인덱스 입력 >> ");
			column = s.nextInt();
			
			// 탈출 조건
			if(row > 4 || row < 0 || column > 4 || column < 0) {
				break;
			}
			
			arr[row][column] = 'X';
			
			// 윗줄 출력
			System.out.print("\t");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(i + "\t");
			}
			System.out.println();
			
			// 행열 출력
			for(int i = 0; i < arr.length; i++) {
				System.out.print(i + "\t");
				
				for(int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("프로그램을 종료합니다");
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
		
		System.out.println("===== 일차원 배열 출력 =====");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int index = 0; // 일차원 배열의 0번~마지막 인덱스
					   // 까지 접근하기 위한 변수
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = arr[index++];
			}
		}
		
		System.out.println("===== 이차원 배열 출력 =====");
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void bingo() {
		System.out.print("빙고판 크기 지정 : ");
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
		
		// 내 랜덤 빙고판 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d ", arr[i][j]);
			}
			System.out.println();
		}
		
		int count = 0;
		System.out.println("===== 빙고 게임 시작 =====");
		while(true) {
			System.out.print("정수를 입력하시오 : ");
			int select = s.nextInt();
			s.nextLine();
			count++; // 턴 증가
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					if(arr[i][j] == select) {
						arr[i][j] = 0;
					}
					System.out.printf("%4d", arr[i][j]);
				}
				System.out.println();
			}
			
			System.out.print("게임을 끝내시겠습니까? (Y/N) : ");
			char ch = s.nextLine().toUpperCase().charAt(0);
			
			if(ch == 'Y') {
				break;
			}
		}
		
		System.out.println(count + "번 입력하였습니다.");
		String s;
	}
}

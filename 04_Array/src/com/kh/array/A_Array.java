package com.kh.array;

import java.util.Scanner;
import java.util.Random;

public class A_Array {
	// Java에서 배열은 힙 영역에 할당됨(C++은 스택)
	Scanner s = new Scanner(System.in);
	
	public void method1() {
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		int sum = num1 + num2 + num3 + num4 + num5;
		
		// 따로
		int[] arr;
		arr = new int[5];
		
		// 동시에
		int[] arr1 = new int[5];
		
		/* 초기화
		 * 배열명[인덱스] = 값;
		*/
		arr1[0] = 0;
		arr1[1] = 1;
		arr1[2] = 2;
		arr1[3] = 3;
		
		for(int i = 0; i < 5; i ++) {
			arr1[i] = i;
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
	
	public void method2() {
		int[] iArr;
		// iArr = new int[]; 반드시 크기 지정
		iArr = new int[5];
		
		int[] iArr2 = new int[5];
		char[] cArr = new char[10];
		double[] dArr = new double[20];
		
		System.out.println("iArr : " + iArr2);
		System.out.println("cArr : " + cArr);
		System.out.println("dArr : " + dArr);
		
		// heap영역의 메모리는 변수를 만들거나
		// 직접적으로 접근을 하지 못하는 영역
		// 주소를 통해서만 찾아 갈 수 있음.
	}
	
	public void method3() {
		char[] cArr = new char[5];
		int[] iArr = new int[3];
		
		// 일반 변수는 자동 초기화가 되지 않지만
		// char 배열은 기본적으로 ' '초기화(JVM이 해 줌)
		// 그 이유는 heap 영역은 값이 없는 공간이 존재할 수 없기 때문
		for(int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i]);
		}
		
		// int 배열은 기본적으로 0으로 초기화(JVM이 해 줌)
		// 배열의 길이도 length로 알 수 있음.(String은 length()
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}	
	}
	
	public void method4() {
		System.out.print("새로 할당할 배열의 길이 : ");
		int size = s.nextInt();
		
		double[] dArr = new double[size];
		
		System.out.println(dArr);
		System.out.println("dArr의 길이 : " + dArr.length);
	}
	
	public void method5() {
		int[] iArr = new int[5];
		
		iArr[0] = 2;
		iArr[1] = 4;
		iArr[2] = 6;
		iArr[3] = 8;
		iArr[4] = 10;
		
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = (i + 1) * 2;
		}
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("iArr의 해쉬코드 값 : " + iArr.hashCode());
		System.out.println("iArr의 길이 : " + iArr.length);
		
		iArr[4] = 12;
		
		// 배열은 한 번 지정한 크기는 변경이 불가능한 단점이 있다.
		// 따라서 크기를 바꾸려면 다시 배열 크기를 지정하여 할당해야 함.
		// 같은 배열에 다시 재할당이 가능하다
		iArr = new int[10];
		
		System.out.println("===== 변경 후의 iArr =====");
		System.out.println("iArr의 해쉬코드 값 : " + iArr.hashCode());
		System.out.println("iArr의 길이 : " + iArr.length);
		// 주소값이 바뀐걸 알 수 있고
		// 기존에 참조하던 연결 끊기고 새로운 곳 참조
		// 원래 참조하던 메모리는 heap영역을 둥둥 떠다니다가 GC가 발견하고 지움
		
		iArr = null;
		
		System.out.println("===== 삭제 후의 iArr =====");
		System.out.println("iArr의 주소 값 : " + iArr);
		// System.out.println("iArr의 해쉬코드 값 : " + iArr.hashCode());
		// 주소값 null은 괜찮은데 해쉬코드를 쓰거나 값을 참조하려 하면 NullPointerException 뜸
	}
	
	public void method6() {
		int[] iArr = {1, 2, 3, 4};
		int[] iArr2 = new int[] {1, 2, 3, 4};
		//이 방법도 가능
		
		System.out.println("iArr의 길이 : " + iArr.length);
		System.out.println("iArr2의 길이 : " + iArr2.length);
		
		System.out.println(iArr == iArr2); // 참조 변수들의 주소를 비교한 상황
		System.out.println(iArr.equals(iArr2)); // 이것도 안되네
	}
	
	public void method7() {
		String[] sArr = new String[5];
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		for(int i = 0; i < sArr.length; i++) {
			System.out.print("과일 : ");
			sArr[i] = s.nextLine();
		}
		
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
	}
	
	public void method8() {
		double[] height = new double[5];
		double sum = 0;
		double avg = 0;
		for(int i = 0; i < height.length; i++) {
			System.out.printf("%d번째 사람의 키 : ", (i + 1));
			height[i] = s.nextDouble();
			sum += height[i];
		}
		
		avg = sum / height.length;
		System.out.printf("%d명의 키의 총합 : %f \n", height.length, sum);
		System.out.printf("%d명의 키 평균 : %f \n", height.length, avg);
	}
	
	public void method9() {
		System.out.print("입력받으려는 정수의 수는 : ");
		int num = s.nextInt();
		
		int[] arr = new int[num];
		
		Random r = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100) + 1; // 안에 넣는 수가 최대, +는 Math.random()과 같이 최소
			// arr[i] = (int)((Math.random() * 100) + 1) 과 같음.
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
	
	public void method10() {
		System.out.print("문자열 입력 : ");
		String str = s.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			System.out.println(arr[i]);
		}
	}
	
	public void method11() {
		// 최대값 최소값 구하기
		int[] arr = new int[5];
		int max = -99999, min = 99999;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d 번째 입력: ", (i + 1));
			arr[i] = s.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}
	
	
}

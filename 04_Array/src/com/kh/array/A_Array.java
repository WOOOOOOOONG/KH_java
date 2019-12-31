package com.kh.array;

import java.util.Scanner;
import java.util.Random;

public class A_Array {
	// Java���� �迭�� �� ������ �Ҵ��(C++�� ����)
	Scanner s = new Scanner(System.in);
	
	public void method1() {
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		int sum = num1 + num2 + num3 + num4 + num5;
		
		// ����
		int[] arr;
		arr = new int[5];
		
		// ���ÿ�
		int[] arr1 = new int[5];
		
		/* �ʱ�ȭ
		 * �迭��[�ε���] = ��;
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
		// iArr = new int[]; �ݵ�� ũ�� ����
		iArr = new int[5];
		
		int[] iArr2 = new int[5];
		char[] cArr = new char[10];
		double[] dArr = new double[20];
		
		System.out.println("iArr : " + iArr2);
		System.out.println("cArr : " + cArr);
		System.out.println("dArr : " + dArr);
		
		// heap������ �޸𸮴� ������ ����ų�
		// ���������� ������ ���� ���ϴ� ����
		// �ּҸ� ���ؼ��� ã�� �� �� ����.
	}
	
	public void method3() {
		char[] cArr = new char[5];
		int[] iArr = new int[3];
		
		// �Ϲ� ������ �ڵ� �ʱ�ȭ�� ���� ������
		// char �迭�� �⺻������ ' '�ʱ�ȭ(JVM�� �� ��)
		// �� ������ heap ������ ���� ���� ������ ������ �� ���� ����
		for(int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i]);
		}
		
		// int �迭�� �⺻������ 0���� �ʱ�ȭ(JVM�� �� ��)
		// �迭�� ���̵� length�� �� �� ����.(String�� length()
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}	
	}
	
	public void method4() {
		System.out.print("���� �Ҵ��� �迭�� ���� : ");
		int size = s.nextInt();
		
		double[] dArr = new double[size];
		
		System.out.println(dArr);
		System.out.println("dArr�� ���� : " + dArr.length);
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
		
		System.out.println("iArr�� �ؽ��ڵ� �� : " + iArr.hashCode());
		System.out.println("iArr�� ���� : " + iArr.length);
		
		iArr[4] = 12;
		
		// �迭�� �� �� ������ ũ��� ������ �Ұ����� ������ �ִ�.
		// ���� ũ�⸦ �ٲٷ��� �ٽ� �迭 ũ�⸦ �����Ͽ� �Ҵ��ؾ� ��.
		// ���� �迭�� �ٽ� ���Ҵ��� �����ϴ�
		iArr = new int[10];
		
		System.out.println("===== ���� ���� iArr =====");
		System.out.println("iArr�� �ؽ��ڵ� �� : " + iArr.hashCode());
		System.out.println("iArr�� ���� : " + iArr.length);
		// �ּҰ��� �ٲ�� �� �� �ְ�
		// ������ �����ϴ� ���� ����� ���ο� �� ����
		// ���� �����ϴ� �޸𸮴� heap������ �յ� ���ٴϴٰ� GC�� �߰��ϰ� ����
		
		iArr = null;
		
		System.out.println("===== ���� ���� iArr =====");
		System.out.println("iArr�� �ּ� �� : " + iArr);
		// System.out.println("iArr�� �ؽ��ڵ� �� : " + iArr.hashCode());
		// �ּҰ� null�� �������� �ؽ��ڵ带 ���ų� ���� �����Ϸ� �ϸ� NullPointerException ��
	}
	
	public void method6() {
		int[] iArr = {1, 2, 3, 4};
		int[] iArr2 = new int[] {1, 2, 3, 4};
		//�� ����� ����
		
		System.out.println("iArr�� ���� : " + iArr.length);
		System.out.println("iArr2�� ���� : " + iArr2.length);
		
		System.out.println(iArr == iArr2); // ���� �������� �ּҸ� ���� ��Ȳ
		System.out.println(iArr.equals(iArr2)); // �̰͵� �ȵǳ�
	}
	
	public void method7() {
		String[] sArr = new String[5];
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		for(int i = 0; i < sArr.length; i++) {
			System.out.print("���� : ");
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
			System.out.printf("%d��° ����� Ű : ", (i + 1));
			height[i] = s.nextDouble();
			sum += height[i];
		}
		
		avg = sum / height.length;
		System.out.printf("%d���� Ű�� ���� : %f \n", height.length, sum);
		System.out.printf("%d���� Ű ��� : %f \n", height.length, avg);
	}
	
	public void method9() {
		System.out.print("�Է¹������� ������ ���� : ");
		int num = s.nextInt();
		
		int[] arr = new int[num];
		
		Random r = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100) + 1; // �ȿ� �ִ� ���� �ִ�, +�� Math.random()�� ���� �ּ�
			// arr[i] = (int)((Math.random() * 100) + 1) �� ����.
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
	
	public void method10() {
		System.out.print("���ڿ� �Է� : ");
		String str = s.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			System.out.println(arr[i]);
		}
	}
	
	public void method11() {
		// �ִ밪 �ּҰ� ���ϱ�
		int[] arr = new int[5];
		int max = -99999, min = 99999;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d ��° �Է�: ", (i + 1));
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
		
		System.out.println("�ִ� : " + max);
		System.out.println("�ּڰ� : " + min);
	}
	
	
}

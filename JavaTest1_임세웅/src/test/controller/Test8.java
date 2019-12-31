package test.controller;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, 
				{14, 16, 18, 78}, {45, 26, 72, 23}}; 
		int lengthSum = 0;
		double sum = 0.0;
		double avg;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				lengthSum++;
				sum += array[i][j];
			}
		}
		avg = sum / lengthSum;
		
		System.out.println("ÇÕ°è :  "+ sum);
		System.out.println("Æò±Õ :  "+ avg);
	}

}

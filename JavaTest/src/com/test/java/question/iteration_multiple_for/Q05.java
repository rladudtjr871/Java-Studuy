package com.test.java.question.iteration_multiple_for;

public class Q05 {

	public static void main(String[] args) {
		
		//구구단 출력
		
		int sum;

		for(int i=1; i<10; i++) {
			
			for(int j=2; j<6; j++) {
				
				sum = j * i;
				
				System.out.printf("%d x %d = %2d\t", j, i, sum);
				
			}
			System.out.println();
			
		}
		
		System.out.println();
		
		for(int i=1; i<10; i++) {
			
			for(int j=6; j<10; j++) {
				
				sum = j * i;
				
				System.out.printf("%d x %d = %2d\t", j, i, sum);
				
			}
			System.out.println();
			
		}

	}

}

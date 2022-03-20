package com.test.java.question.iteration_multiple_for;

public class Q06 {

	public static void main(String[] args) {
		
		/*
		요구사항
		2부터 100사이의 소수를 구하시오.

		조건..
		소수: 1과 자기자신으로밖에 나눠지지 않는 수
		출력..
		2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
		
		
		*/
		
		String decimal = "";
		
		for (int i=2; i<101; i++) {
			
			int cnt = 0;
			
			for (int j=1; j<=i; j++) {
				
				if (i%j == 0) {
					cnt++;
				}
			}
			
			if (cnt == 2) {
				decimal += i + ", ";
			}
			
			
		}
		System.out.println(decimal + "\b\b");
		
		
	}//main
	

}

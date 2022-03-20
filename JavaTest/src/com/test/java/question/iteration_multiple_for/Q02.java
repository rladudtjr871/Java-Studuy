package com.test.java.question.iteration_multiple_for;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws Exception {
		/*
		요구사항]
		아래와 같이 출력하시오.

		조건]
		행의 갯수를 입력받으시오.
		
		입력]
		행: 5 

		출력]
		    *
		   **
		  ***
		 ****
		*****
		
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.printf("행: ");
		int row = Integer.parseInt(reader.readLine());
		
		for (int i=0; i<row; i++) {
			
			for (int j=row; j>i; j--) {
				
				System.out.print(" ");
			}
			
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}

}

package com.test.java.question.iteration_multiple_for;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception {
/*
		요구사항]
		아래와 같이 출력하시오.

		조건]
		행의 갯수를 입력받으시오.
		
		입력]
		행: 5 

		출력..
		*****
		 ****
		  ***
		   **
		    *
		    
		설계] 1. 행을 입력 받는다.
			 2. for문을 두개 생성하여 하나는 행을 바꾸고 하나는 별과 빈칸을 찍도록 한다.
			 3. 빈칸은 한칸씩 늘어나게 별은 줄어들게 출력
*/
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.printf("행: ");
		int row = Integer.parseInt(reader.readLine());
		
		for (int i=0; i<row; i++) {
			
			if (i>=1) {
				for (int j=1; j<=i; j++) {
				
				System.out.print(" ");
				
				}
			}
			
			for(int j=i; j<row; j++) {
				System.out.print("*");
			}
			
		System.out.println();
		
		}
		
		
	}

}

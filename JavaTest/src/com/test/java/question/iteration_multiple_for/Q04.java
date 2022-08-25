package com.test.java.question.iteration_multiple_for;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws Exception {
		/*
			요구사항
			아래와 같이 출력하시오.

			조건..
			행의 갯수를 입력받으시오.
			입력..
			행: 5 

			출력..
		    	aa
		   	   abba
		  	  abccba
		 	 abcddbca
			abcdeedcba

		

		 	
		 	TODO
		 	설계] 1. 행의 갯수를 입력 받는다.
		 		 2. 입력 받은 갯수 곱하기 2가 최종 행의 길이이다.
		 		 3. 문자로 출력해야 하기때문에 %c로 97(소문자a)부터 출력해준다.
		 		 4. 
		 */

		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("행 : ");
		int row  = Integer.parseInt(reader.readLine());
		
		
		
		for (int i=1; i<=row; i++) {  //행 전환
			
			for (int j=row; j>i ; j--) {
				System.out.print(" ");
			}
			
			//        01    2
			for (int j=0; j<i; j++) {
				System.out.printf("%c", 'a' + j);
			}
		
			for (int j=i-1; j>=0; j--) {
				System.out.printf("%c", 'a' + j);
			}
			
			System.out.println();
		}
		
		
		
	}//main

	
}

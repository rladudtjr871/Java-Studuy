package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws Exception {
		/*
			요구사항
		 
			숫자 1개를 입력받아 1부터 입력한 숫자까지의 합을 출력하시오.

			입력]
			숫자 : 5 

			출력]
			1 ~ 5 = 15
			
			
			설계] 1. 숫자를 1개 입력 받는다.
				 2. 반복문의 증감식을 --로 하여 더하기 연산해준다.
				 3. 더한 값 출력
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 : ");
		int firstNum = Integer.parseInt(reader.readLine());
		
		int sum = 0;
		//int lastNum = 0;
		
		for(int i=firstNum; i>=1; i--) {
			
			sum += i;
			//lastNum = i;
		}
		
		System.out.printf("1 ~ %d = %d", firstNum, sum); //lastNum자리에 1로 대체
		
	}//main

}

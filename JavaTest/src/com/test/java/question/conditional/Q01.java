package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception{

		/*
		 	설계] 1. 첫번째 숫자와 두번째 숫자 입력을 받는다.
		 		 2. 비교할 메소드를 만든다.
		 		 	2-1 if문으로 두 숫자를 비교한다.
		 		 	2-2 같지 않은 경우와 같은 경우로 나눈다
		 		 	2-3 같지 않으면 크고 작음을 비교한다.
		 		 3. 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자: ");
		int firstNum = Integer.parseInt(reader.readLine());
		
		System.out.print("두번째 숫자: ");
		int secondNum = Integer.parseInt(reader.readLine());
		
		compare(firstNum, secondNum);
		
	}//main

	private static void compare(int firstNum, int secondNum) {
		
		int result;
		
		if (firstNum != secondNum) {
			
			if(firstNum > secondNum) {
				
				result = firstNum - secondNum;
				System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.\n", firstNum, secondNum, result);
				
			} else {
				
				result = secondNum - firstNum;
				System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.\n", secondNum, firstNum, result);
			
			}
			
			
		} else {
			System.out.println("두 숫자는 동일합니다");
		}
		
	}
	
}

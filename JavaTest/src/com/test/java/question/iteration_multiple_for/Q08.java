package com.test.java.question.iteration_multiple_for;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q08 {

	public static void main(String[] args) throws Exception{
		/*
		
			요구사항
			숫자를 2개 입력받아 각각의 약수와 두 숫자의 공약수를 구하시오.

			조건..
			공약수: 둘 이상의 정수에 공통된 약수
			입력..
			첫번째 숫자: 12 

			두번째 숫자: 8 

			출력..
			12의 약수: 1, 2, 3, 4, 6, 12
			8의 약수: 1, 2, 4, 8
			12와 8의 공약수: 1, 2, 4
			
			설계]
		 	1.숫자 두개를 입력 받는다
		 	2.첫번쨰 숫자 크기만큼 반복하는 반복문
		 	3.두번째 숫자 크기만큼 반복하는 반복문
		 	4.두 반복문 모두 해당 값보다 작은 값으로 나누어 나머지가 0인 경우
		 	5.문자열로 누적 저장해주고
		 	6.0인 경우의 수가 같으면 같은 수는 다른 문자열에 누적한다.
		 	
		 	
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("첫번째 숫자: ");
		int firstNum = Integer.parseInt(reader.readLine());
		
		System.out.print("두번째 숫자: ");
		int secondNum = Integer.parseInt(reader.readLine());
		
		
		String first = "";
		String second = "";
		String result = "";
		
		for (int i=1; i<=firstNum; i++) {
			
			if (firstNum%i == 0) {
				first += String.format("%d, ", i);
			}
			
			if ((firstNum%i == 0) && (secondNum%i == 0)) {
						
				result += String.format("%d,", i);
						
			}
			
		}
				
			
		
		for(int j=1; j<=secondNum; j++) {
			if (secondNum%j == 0) {
				second += String.format("%d, ", j);
			}
		}
		
		System.out.printf("%d의 약수: %s\b\n",firstNum, first);
		System.out.printf("%d의 약수: %s\b\n", secondNum, second);
		System.out.printf("%d와 %d의 공약수: %s\b\n", firstNum, secondNum, result);
		
	}//main

}

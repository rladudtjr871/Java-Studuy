package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws Exception{


		/*
		 
		 	설계] 1. 정수 두개와 연산자를 입력 받는다.
		 		 2. 숫자 두개를 연산하는 메소드를 생성
		 		 3. 연산 결과는 소수점 이하 첫째자리까지 출력, 산술연산자는 (+, -, *, /, %)만 가능
		 		 4. 연산 결과 출력
		 */
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자: ");
		int firstNum = Integer.parseInt(reader.readLine());
		
		System.out.print("두번째 숫자: ");
		int secondNum = Integer.parseInt(reader.readLine());
		
		System.out.print("연산자: ");
		String input = reader.readLine();
		
		char operator = input.charAt(0);
		//String.equals 사용하는게 좋아보임
		
		calculate(firstNum, secondNum, operator);
		
	}//main

	private static void calculate(int firstNum, int secondNum, char operator) {
		
		int result;
		
		double firstNumDoub = (double)firstNum;
		double divide;
		
		
		if ((operator == '+') || (operator == '-')
			|| (operator == '*')|| (operator == '/') 
								|| (operator == '%')) {
			
			if(operator == '+') {
				
				result = firstNum + secondNum;
				
				System.out.printf("%d + %d = %d", firstNum, secondNum, result);
				
			} else if(operator == '-') {
				
				result = firstNum - secondNum;
				
				System.out.printf("%d - %d = %d", firstNum, secondNum, result);
				
			} else if(operator == '*') {
				
				result = firstNum * secondNum;
				
				System.out.printf("%d * %d = %d", firstNum, secondNum, result);
				
			} else if(operator == '/') {
				
				divide = firstNumDoub / secondNum;
				
				System.out.printf("%d / %d = %.1f", firstNum, secondNum, divide);
				
			} else if(operator == '%') {
				
				result = firstNum % secondNum;
				
				System.out.printf("%d % %d = %d", firstNum, secondNum, result);
				
			}
			
		} else {
			
			System.out.println("연산이 불가능합니다.");
			
		}
		
	}

}

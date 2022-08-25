package com.test.java.question.iteration_multiple_for;

public class Q12 {

	public static void main(String[] args) {

//		아래와 같이 출력하시오.
//
//		조건..
//		마지막 숫자가 100이 넘기 전까지 출력하시오.
//		출력..
//		1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89 = 232
		
		int firstNum = 1;
		int secondNum = 1;
		int sum = 0;
		String calculate = firstNum + " + " + secondNum;
		for(;;) {
			
			sum = firstNum + secondNum;
			
			firstNum = secondNum;
			
			secondNum = sum;
			
			if (secondNum < 100) {
				calculate += String.valueOf(" + " + secondNum);
			} else {
				sum += firstNum - 1;
				break;
			}
			
		}
		
		System.out.printf("%s = %d", calculate, sum);
		
		
		
	}//main

}

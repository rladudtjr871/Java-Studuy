package com.test.java.question.iteration_multiple_for;

public class Q11 {

	public static void main(String[] args) {
		
//		요구사항
//		아래와 같이 출력하시오.
//
//		조건..
//		마지막 숫자가 100이 넘기 전까지 출력하시오.
//		출력..
//		1 + 2 + 4 + 7 + 11 + 16 + 22 + 29 + 37 + 46 + 56 + 67 + 79 + 92 = 469

		
		int num = 1;
		int plus = 0;
		int sum = 0;
		String calculate = "";		
			for (int i=0; num<100; i++) {
				
				num += i;
				
				if(num<100) {
					sum += num;
					calculate += String.valueOf(num + " + ");
				}
			}
			
			System.out.printf("%s = %d", calculate, sum);

		
	}//main

}

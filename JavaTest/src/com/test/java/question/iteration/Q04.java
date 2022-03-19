package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws Exception{
		
		/*
		 	요구사항] 입력 횟수(N)와 숫자 N개를 입력받아 짝수의 합과 홀수의 합을 각각 출력하시오.
		 	
		 	입력]
			입력 횟수 : 3 
			숫자 : 1 
			숫자 : 2 
			숫자 : 3 
		
			출력]
			짝수 1개의 합 : 2
			홀수 2개의 합 : 4
			
			
			설계] 1. 입력을 받는다.
				 2. 입력 횟수만큼 for문으로 반복해서 질문한다.
				 3. 받은 숫자의 홀수 짝수를 if문으로 구분하고 더한다.
				 4. 출력
				 
		 */

		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("입력 횟수: ");
		int repet = Integer.parseInt(reader.readLine());
		
		int sumEven = 0;
		int countEven = 0;
		int sumOdd = 0;
		int countOdd = 0;
		
		for (int i=repet; i>0; i--) {
			
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			
			if (num % 2 == 0) {
				
				countEven++;
				sumEven += num;
				
			}else {
				countOdd++;
				sumOdd += num;
				
			}
			
		}
		
		System.out.printf("짝수 %d개의 합: %d\n", countEven, sumEven);
		System.out.printf("홀수 %d개의 합: %d\n", countOdd, sumOdd);
		
		
		
		
	}

}

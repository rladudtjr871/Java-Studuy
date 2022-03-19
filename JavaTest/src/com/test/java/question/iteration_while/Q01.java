package com.test.java.question.iteration_while;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception{

		/*
		 	요구사항] 숫자 N개 입력 받아 아래와 같이 출력하시오.
		 	
		 	조건] 누적값이 100을 넘어가는 순간 루프를 종료하시오.
		 	     짝수는 더하고 홀수는 빼시오.
		 	
		 	설계] 1. 반복문으로 반복해서 입력을 하나하나 받는다. 입력 받으며 바로 연산하는데 이때 100이 넘는지 안 넘는지를 if문으로 체크
		 		 2. 입력 받은 값이 홀수면 - %d를 하고
		 		 3. 짝수면 + %d를 합니다.
		 		 4. 마지막 결과값을 출력
		 */

		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		String result = "";
		
		while(sum < 100) {
	
				
				System.out.print("숫자: ");
				int inNum = Integer.parseInt(reader.readLine());
				
				
				
				if(inNum % 2 == 0) {
					sum += inNum;
					
					if(inNum == sum) {
						result += inNum;
						
					}else {
						result += " + " + inNum;
					}
					
				}else {
					sum -= inNum;
					
					if(inNum == sum) {
						result += inNum;
						
					}else {
						result += " - " + inNum;
						
					}
					
				}
				
			}
		
		System.out.printf("%s = %d", result, sum);
	}//main
	
		
		
}



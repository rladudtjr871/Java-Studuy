package com.test.java.question.iteration_while;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws Exception{

		//TODO
		/*
		요구사항
		최대 9자리 정수를 입력받아 각자리의 홀수 숫자합과 짝수 숫자합을 구하시오.

		조건..
		9자리 이하 숫자만 입력하시오.
		Math.pow() 메소드 사용(제곱값 구하는 메소드)
		Math.pow(10, 2) → 100
		Math.pow(10, 3) → 1000
		Math.pow(10, 4) → 10000
		입력..
		숫자 입력 : 273645281 

		출력..
		짝수의 합 : 22
		홀수의 합 : 16
		
		 	설계] 1. 숫자를 최대 9자리 입력 받는다.
		 		 2. 입력 받은 숫자를 Math.pow()를 사용해 나누어 각 자리수만 추출한다.
		 		 3. 추출한 값을 if문으로 짝수 홀수 비교한다.
		 		 4. 짝수끼리 더하고 홀수끼리 더하고 출력한다.
		 */
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 입력: ");
		int inum = Integer.parseInt(reader.readLine()); //273645282
		
		int cycle = 1;
		int num = 0;
		int even =0;
		int odd =0;
		
		while(cycle<=9) {
			
			num = (int)((inum % Math.pow(10, cycle)) / Math.pow(10, cycle - 1));
		//   8                               2(100)                       1(10)
			
			if (num%2 == 0) {
				even += num;
				
			}else {
				odd += num;
			}
			
			cycle++;
		}
		
		System.out.printf("짝수의 합: %d\n", even);
		System.out.printf("홀수의 합: %d\n", odd);
		
	}//main
	
}

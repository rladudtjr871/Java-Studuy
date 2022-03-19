package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws Exception{
		
		/*
			요구사항] 아래와 같이 출력하시오.

			입력]
			시작 숫자 : 1 
			종료 숫자 : 10 

			출력]
			1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
			
			설계] 1.시작 숫자와 종료 숫자를 입력 받는다.
				 2.시작 숫자가 종료 숫자보다 <= 때까지 계속 더하여 최종 값 출력
				 3.이때 더하는 값 하나하나를 다 출력해야한다.
		*/
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("시작 숫자: ");
		int numStart = Integer.parseInt(reader.readLine());
		
		System.out.print("종료 숫자: ");
		int numEnd = Integer.parseInt(reader.readLine());
		
		int sum = 0;
		String calculation = String.format("%d", numStart);
	
		
		
		//			1			 5
		for (int i=numStart+1; i<=numEnd; i++) {
			
			sum += i;
			calculation += String.format(" + %d" , i);
			
		}

		sum += numStart;
		
		System.out.printf("%s = %d", calculation, sum);
		

	}

}

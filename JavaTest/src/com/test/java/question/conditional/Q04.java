package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws Exception{
		
		/*
		 
		  	설계] 1. 근무년수 입력 받기
		  		 2. 메소드를 생성하여 근무년수를 비교하기
		  		 3. if문으로 년차에 따라 분류하고 출력하기
		  		 4. 출력
		  		 
		 */

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("근무 년수: ");
		int workYear = Integer.parseInt(reader.readLine());
		
		career(workYear);
		
	}//main

	private static void career(int workYear) {

		int before;
		int after;

		if (workYear > 0) {

			if (workYear >= 10) {

				before = workYear - 9;

				System.out.printf("%d년차 고급 개발자입니다.\n", workYear);
				System.out.printf("당신은 %d년전까지 중급 개발자였습니다.\n", before);

			} else if (workYear >= 5) {

				before = workYear - 4;
				after = 10 - workYear;

				System.out.printf("%d년차 중급 개발자입니다.\n", workYear);
				System.out.printf("당신은 %d년전까지 중급 개발자였습니다.\n", before);
				System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.\n", after);
				
			} else {

				after = 5 - workYear;
				
				System.out.printf("%d년차 초급 개발자입니다.\n", workYear);
				System.out.printf("앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다.\n", after);

			}
			
		} else {
			
			System.out.println("입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오.");
			
		}
		
	}

}

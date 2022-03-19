package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception{
		/*
		 
		  	요구사항
		  	사용자의 이름과 인사할 횟수를 입력 받아 출력하시오.

			입력]	
			이름 : 홍길동 
			횟수 : 3 

			출력]
			홍길동님 안녕하세요~
			홍길동님 안녕하세요~
			홍길동님 안녕하세요~
			
			설계] 1. 사용자의 이름과 인사 횟수를 입력 받는다.
				 2. for문을 이용해 횟수를 변수로 받아 그만큼 반복
				 3. 출력
		 
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름: ");
		String name = reader.readLine();
		
		System.out.print("횟수: ");
		int num = Integer.parseInt(reader.readLine());
		
		for (int i=1; i<=num; i++) {
			System.out.printf("%s님 안녕하세요~\n", name);
		}
		
	}

}

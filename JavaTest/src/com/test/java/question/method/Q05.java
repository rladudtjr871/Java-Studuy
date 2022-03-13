package com.test.java.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws Exception{
		
		/*
		  -짝수홀수
		  요구사항] 숫자를 전달하면 '짝수' 혹은 '홀수' 라는 단어를 반환하는 메소드를 선언하시오.
		 	 조건]String getNumber(int)
		 	 입력] 숫자 : 5
		  호출방식] result = getNumber(n); 
			   	  System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", n, result);
			 출력]입력하신 숫자 '5'는(은) '홀수'입니다.
		*/
		
		//설계
		//1. BufferdReader로 입력을 받고 입력값을 실인자로한다
		//2. 짝수홀수를 삼항연산자로 구분하는 메소드를 만든다.
		//3. 메소드를 호출하여 출력
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 : ");
		int n = Integer.parseInt(reader.readLine());
		
		
		String result = getNumber(n);
		System.out.printf("입력하신 숫자 \'%d\'는(은) %s입니다.\n", n, result);
		
		
		
	}//main

	//홀짝
	public static String getNumber(int n) {
		
		String oddEven = n % 2 == 0 ? "'짝수'" : "'홀수'";
		
		return oddEven;
	}
	
	
}//Q06class

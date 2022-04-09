package com.test.java.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws Exception{

		/*
		    요구사항
			이메일 주소를 입력받아 아이디와 도메인을 각각 추출하시오.

			입력]
			이메일: hong@gmail.com 

			출력]
			아이디: hong
			도메인: gmail.com
			
			
			설계]
			1.이메일을 입력받는다.
			2.@를 기준으로 아이디와 도메인을 나눕니다.
			
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이메일: ");
		String inEmail = reader.readLine();		
		
		
		String[] email = inEmail.split("@");
		
		System.out.printf("아이디: %s\n", email[0]);
		System.out.printf("도메인: %s\n", email[1]);
		

	}//main
	
	

}

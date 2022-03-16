package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws Exception {
		
		/*
		 
		  설계] 1. 영문자 1개를 입력 받는다.
		  	   2. 영문자 소문자 > 대문자, 대문자 > 소문자로 변환하는 메소드를 생성 (32 차이)
		  	   3. 출력
		 
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자 : ");
		String input = reader.readLine();
		
		char alphabet = input.charAt(0);
		
		change(alphabet);

	}//main

	//대소문자 변환 메소드
	private static void change(char alphabet) {
		
		
		//대소문자는 32만큼 차이
		if (alphabet >= 65 && alphabet <= 90) {
			 
			char alphaBig = (char)(alphabet + 32);
			
			System.out.printf("\'%s\'의 소문자는 \'%s\'입니다.", alphabet, alphaBig);
			
		} else if (alphabet >= 97 && alphabet <= 122) {
				
			 
			char alphaSmall = (char)(alphabet - 32);
			System.out.printf("\'%s\'의 대문자는 \'%s\'입니다.", alphabet, alphaSmall);
			
		} else {
			
			System.out.println("영문자만 입력하시오.");
			
		}
		
	}

	
	
	
}

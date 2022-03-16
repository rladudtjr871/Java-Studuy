package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws Exception{
		
		/*
		 	
		 	설계] 1. 문자를 입력 받는다.
		 		 2. 입력 받은 문자를 비교할 메소드를 생성
		 		 3. 문자가 F,f,M,m,S,s,B,b가 아니면 예외처리
		 		 4. 맞을경우 각 알파벳 대소문자끼리 같은 출력을 하도록 한다.
		 		 5. 출력
		 	
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자 : ");
		String input = reader.readLine();
		 
		char fam = input.charAt(0);
		 
		family(fam);
		
	}//main

	private static void family(char fam) {
		
		if ((fam == 'F') || (fam == 'f')) {
			
			System.out.println("Father");
			
		} else if ((fam == 'M') || (fam == 'm')) {
			
			System.out.println("Mother");
			
		} else if ((fam == 'S') || (fam == 's')) {
			
			System.out.println("Sister");
			
		} else if ((fam == 'B') || (fam == 'b')) {
			
			System.out.println("Brother");
			
		} else {
			
			System.out.println("입력한 문자가 올바르지 않습니다.");
			
		}
			 
		
	}
	
}


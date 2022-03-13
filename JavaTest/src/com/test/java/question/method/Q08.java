package com.test.java.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q08 {

	public static void main(String[] args) throws Exception{

		/*
		  요구사항] 사과 나무 씨앗을 심을 날로부터 특정 시간이 흘렀을 때 사과 총 몇개가 열리는지 구하는 메소드를 선언하시오.
		     조건] int getApple(int sunny, int foggy)
		          사과 나무를 처음 심었을 때 나무의 길이: 0m
				  맑은 날 사과 나무의 성장률: 5㎝
				  흐린 날 사과 나무의 성잘률: 2㎝
				  사과 나무는 길이가 1m 넘는 시점부터 사과가 열린다.
				  1m 넘는 시점부터 10㎝ 자랄 때마다 사과가 1개씩 열린다.
				  
			 입력] 맑은 날 : 35 
				  흐린 날 : 10 
				  
		  	 출력] 사과가 총 9개 열렸습니다.
		  	 
		  	 설계] 1. 입력을 BufferdReader로 받는다.
		  	  	  2. 맑은 날과 흐린 날 성장률을 반영하여 100cm가 넘는 시점에서
		  	  	     10cm마다 사과가 1개 자라서 총 몇개인지 연산하는 메소드를 생성한다.
		  	  	  3. 메소드 호출
		  	  	  
		*/
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("맑은 날 : ");
		int sunny  = Integer.parseInt(reader.readLine());
		
		System.out.print("흐린 날 : ");
		int foggy = Integer.parseInt(reader.readLine());
		
		
		int result = getApple(sunny, foggy);
		
		System.out.printf("사과가 총 %d개 열렸숩니다.", result);

	}//main
		
		//나무에 열린 사과 수
		public static int getApple(int sunny, int foggy) {
			
			int result = ((sunny * 5) + (foggy * 2) >= 110) ? (((sunny * 5) + (foggy * 2) - 100) / 10) : 0;
			
			return result;
		}//getApple
		
}//Q08class

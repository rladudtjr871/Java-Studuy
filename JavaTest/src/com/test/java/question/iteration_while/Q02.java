package com.test.java.question.iteration_while;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws Exception {


		/*
		 	요구사항] 숫자 10개를 입력 받아 한글로 변환 후 출력하시오
		 	
		 	조건] 1~9까지만 입력
		 	
		 	설계] 1. 무한 반복문으로 입력을 받습니다.
		 		 2. String 변수를 빈 채로 생성합니다.
		 		   2.1 입력 받은 수를 switch문으로 맞는 값으로 이동시킵니다.
		 		   2.2 그 수의 한글 이름을 String 변수에 추가 저장합니다.
		 		   2.3 출력합니다.
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		String numKor = "";
		int cycle = 0;
		while (cycle<10) {
			
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			cycle++;
			
			if (num < 10) {
				switch(num) {
					case 1:
						numKor += "일";
						break;
					
					case 2:
						numKor += "이";
						break;
					
					case 3:
						numKor += "삼";
						break;
					
					case 4:
						numKor += "사";
						break;
					
					case 5:
						numKor += "오";
						break;
					
					case 6:
						numKor += "육";
						break;
					
					case 7:
						numKor += "칠";
						break;
					
					case 8:
						numKor += "팔";
						break;
					
					case 9:
						numKor += "구";	
						break;
					}	
				} else {
					continue;
				}
		}
		
		System.out.printf("%s", numKor);
		
	}//main

}

package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q09 {
	public static void main(String[] args) throws Exception{
		
		/*
		 	
		 	설계] 1. 년도를 입력 받는다.
		 		 2. if문을 이용해 윤년을 판별한다.
		 		 3. 출력
		 	
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("년도 입력: ");
		int year = Integer.parseInt(reader.readLine());
		String result;
		
		if (year % 4 == 0) {
			if( year % 100 == 0) {
				if(year % 400 == 0) {
					result = "윤년";
				} else {
					result = "평년";
				}
			}else {
				result = "윤년";
			}
		} else {
			result = "평년";
		}
		System.out.printf("%d년은 \'%s\'입니다.\n", year, result);
		
	}

}

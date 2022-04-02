package com.test.java.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws Exception{

		
		/*
		요구사항
		배열의 요소를 삭제하시오.

		조건]
		배열 길이: 10
		마지막 요소는 0으로 채우시오.
		
		입력]
		삭제 위치 : 2 

		출력]
		원본 : [5, 6, 1, 3, 2, 0, 0, 0, 0, 0]
		결과 : [5, 6, 3, 2, 0, 0, 0, 0, 0, 0]
		
		입력]
		삽입 위치 : 5 

		출력]
		원본 : [5, 6, 1, 3, 2, 8, 7, 4, 10, 9]
		결과 : [5, 6, 1, 3, 2, 7, 4, 10, 9, 0]
		 */

		int[] origin = {5, 6, 1, 3, 2, 0, 0, 0, 0, 0}; //10
		//int[] origin = {5, 6, 1, 3, 2, 8, 7, 4, 10, 9};
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("삽입 위치: "); //6
		int insert = Integer.parseInt(reader.readLine());
		
		System.out.print("값: "); //100
		int inValue = Integer.parseInt(reader.readLine());
		
		for (int i=origin.length-1; i>insert; i--) { //9 8 7
			
			origin[i] = origin[i-1]; //9 <- 8
									//8 <- 7
			
		}
		
		origin[insert] = inValue;
		
		System.out.println(dump(origin));
		
	}//main

	public static String dump(int origin[]) {
		
		String result = "[ ";
		
		for (int i=0; i<origin.length; i++) {
			
			result += origin[i] + ", ";
		}
		
		result += "\b\b]";
		
		return result;
	}
	
}

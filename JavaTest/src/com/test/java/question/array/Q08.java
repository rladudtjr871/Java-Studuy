package com.test.java.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q08 {

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
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("삭제 위치: ");
		int delete = Integer.parseInt(reader.readLine());
		
		//int[] num = {5, 6, 1, 3, 2, 0, 0, 0, 0, 0};
		int[] num =  {5, 6, 1, 3, 2, 8, 7, 4, 10, 9};
		
		System.out.println("원본: " + dump(num));
		
		for (int i=delete+1; i<num.length; i++) { //9부터 delete까지
			
			num[i-1] = num[i]; //delete가 2일경우 3값을 2에 덮어쓴다.
			
		}
		
		num[9] = 0;
		
		System.out.println("결과: " + dump(num));
		
	}//main
	
	public static String dump(int[] num) {
		
		String result = "[ ";
		
		for (int i=0; i<num.length; i++) {
			
			result += num[i] + ", ";
			
		}
		
		result += "\b\b]";
		
		return result;
	}

}

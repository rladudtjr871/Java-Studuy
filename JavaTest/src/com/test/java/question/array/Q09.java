package com.test.java.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q09 {

	public static void main(String[] args) throws Exception{
				
		/*
		요구사항
		배열의 요소를 순차적으로 2개씩 더한 결과를 배열로 생성한 뒤 출력하시오.

		조건]
		원본 배열 길이: 사용자 입력
		원본 배열 요소: 난수(1~9)
		결과 배열 길이: 사용자 입력 / 2
		
		입력]
		배열 길이: 10 
		출력]
		원본 : [ 1, 5, 3, 6, 2, 7, 8, 2, 2, 9 ]
		결과 : [ 6, 9, 9, 10, 11 ]
		
		입력]
		배열 길이: 4 
		출력]
		원본 : [ 5, 3, 9, 1 ]
		결과 : [ 8, 10 ]
		
		입력]
		배열 길이: 5 
		출력]
		원본 : [ 1, 5, 3, 2, 7 ]
		결과 : [ 6, 5, 7 ]
		 */
		
//		0 01
//		1 23
//		2 45
//		3 67
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("배열의 길이: ");
		int length = Integer.parseInt(reader.readLine());
		
		int[] random = new int[length];
		
		
		for (int i=0; i<random.length; i++) {	 //1~9 난수를 배열에 저장
			
			int randomNum = (int)(Math.random()*9+1);
			
			if (randomNum < 10) {
				
				random[i] = randomNum;
				
			}//10일 경우 0으로 취급
			
		}
		
		System.out.println("원본: " + dump(random));
		
		
		
		
		int half = (int)(random.length / 2.0 + 0.5); //원본의 절반 길이 생성
		
		int[] randomHalf = new int[half];
				
		if (random.length % 2 == 0) { //배열길이가 짝수일 경우
			for (int i=0; i<randomHalf.length; i++) {
				randomHalf[i] = random[i*2] + random[i*2+1];
				
			}
		} else{ //배열의 길이가 홀수일 경우
			for (int i=0; i<randomHalf.length-1; i++) { //-1을 하는 이유는 배열이 9일경우 존재하지 않는 9번째 값을 요구하게된다.
				randomHalf[i] = random[i*2] + random[i*2+1];
				
			}
			randomHalf[half-1] = random[length-1]; 
	
		}
		
		
		System.out.println("결과: " + dump(randomHalf));
		
		
	}//main

	public static String dump(int[] random) {
		
		String result = "[ ";
		
		for (int i=0; i<random.length; i++) {
			
			result += random[i] + ", ";
			
		}
		
		result += "\b\b]";
		
		return result;
	}
	
	
	
	
	
}

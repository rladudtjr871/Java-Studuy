package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {
	public static void main(String[] args) throws Exception{
		
		/*
		 
		  설계] 1.점수를 입력 받는다.
		  	   2.점수에 따른 등급을 비교하는 메소드를 생성한다.
		  	   3.점수가 올바른 범위일 경우와 아닌 경우로 if문 생성
		  	   4.올바를 경우의 if문 안에 각 점수별로 if문을 생성
		  	   5.점수에 맞는 등급을 점수와 함게 출력
		  	  
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("점수: ");
		int score = Integer.parseInt(reader.readLine());
		
		rank(score);
		
		
	}//main
	
	private static void rank(int score) {
		
		if (score > 0 && score < 101) {
			
			if(score >= 90) {
				System.out.printf("입력한 %d점은 성적 A입니다.\n", score);
				
			} else if(score >= 80) {
				System.out.printf("입력한 %d점은 성적 B입니다.\n", score);
				
			} else if(score >= 70) {
				System.out.printf("입력한 %d점은 성적 C입니다.\n", score);
				
			} else if(score >= 60) {
				System.out.printf("입력한 %d점은 성적 D입니다.\n", score);
				
			} else if(score >= 0) {
				System.out.printf("입력한 %d점은 성적 F입니다.\n", score);
				
			}
			
		} else {
			System.out.println("점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.");
			
		}
		
	}
	
}

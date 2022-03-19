package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws Exception{

		/*
			요구사항
			시작 숫자, 종료 숫자, 증감치를 입력받아 숫자를 순차적으로 출력하시오.
			
			입력]
			시작 숫자 : 10 
			종료 숫자 : 1 
			증감치 : -2 

			출력]
			10
			8
			6
			4
			2
			
			설계] 1. 시작 숫자, 종료 숫자, 증감치를 입력 받아 변수로 저장
				 2. for문의 초기식을 시작숫자
				 3. 비교식을 시작 숫자 <= 종료숫자
				 4. 증감식을 시작 숫자 += 증감치로 설정하고
				 5. 시작 숫자를 출력
		 */

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("시작 숫자: ");
		int numFirst = Integer.parseInt(reader.readLine());
		
		System.out.print("종료 숫자: ");
		int numSecond = Integer.parseInt(reader.readLine());
		
		System.out.print("증감치: ");
		int indecrease = Integer.parseInt(reader.readLine());
		
		
		
		if (indecrease > 0) {
			for (int first=numFirst; first<= numSecond ; first+=indecrease) {
				
				System.out.printf("%d\n", first);
			}
		} else if (indecrease < 0) {
			for (int first=numFirst; first>=numSecond ; first+=indecrease) {
				
				System.out.printf("%d\n", first);
				
			}
		}
		
		
	
	}

}

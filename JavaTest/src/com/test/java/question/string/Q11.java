package com.test.java.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11 {

	public static void main(String[] args) throws Exception{

		/*
		요구사항
		입력받은 문장에서 숫자를 찾아 그 합을 구하시오.

		조건]
		모든 숫자는 한자리 숫자로 처리한다.
		
		입력]
		입력: 국어 점수는 95점입니다. 

		출력]
		문장에 존재하는 모든 숫자의 합은 14입니다.
		
		설계]
		1.문자열 입력을 받는다
		2.charAt()으로 각 문자열을 추출하여 '0'과 '9' 사이의 값일 경우
		3.해당 값 - '0'을 해주어 그 차이로 int값을 얻는다.
		*/

		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("입력: ");
		String txt = reader.readLine();
			
		
		numSum(txt);
		
		
	}//main

	private static void numSum(String txt) {
		
		int sum = 0;
		
		
		for(int i=0; i<txt.length(); i++) {
		
			if('0'<=txt.charAt(i) && txt.charAt(i)<='9') { //0~9 사이의 값일 경우
				
				sum += txt.charAt(i) - '0';	 //추출한 값에서 '0'을 빼주면 해당 값의 int값을 얻을 수 있다.
				
			}
		}
		
		System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다.", sum);
		
	}
	

}

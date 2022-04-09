package com.test.java.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws Exception{
		
		/*
		요구사항
		숫자를 입력받아 각 자릿수의 수의 합을 구하시오.

		입력]
		숫자: 314 

		출력]
		결과: 3 + 1 + 4 = 8
		
		
		설계]
		1.숫자를 입력 받습니다.
		2.반복문으로 charAt() 이용해 자리수만큼 하나한 추출하여 각 숫자와 비교하여 더한다.
		
		
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자: ");
		String num = reader.readLine();
		char[] numArr = new char[num.length()];
		int sum = 0;
		String txt = "";
		for (int i=0; i<num.length(); i++) {
			
			 numArr[i] = num.charAt(i);
			 
			if (num.charAt(i) == '1') {
				sum += 1;
				txt += "1 + ";
			} else if(num.charAt(i) == '2') {
				sum += 2;
				txt += "2 + ";
			} else if(num.charAt(i) == '3') {
				sum += 3;
				txt += "3 + ";
			} else if(num.charAt(i) == '4') {
				sum += 4;
				txt += "4 + ";
			} else if(num.charAt(i) == '5') {
				sum += 5;
				txt += "5 + ";
			} else if(num.charAt(i) == '6') {
				sum += 6;
				txt += "6 + ";
			} else if(num.charAt(i) == '7') {
				sum += 7;
				txt += "7 + ";
			} else if(num.charAt(i) == '8') {
				sum += 8;
				txt += "8 + ";
			} else if(num.charAt(i) == '9') {
				sum += 9;
				txt += "9 + ";
			}
			 
		}
		
		System.out.printf("결과: %s \b\b= %d", txt, sum);
		
	}//main

}

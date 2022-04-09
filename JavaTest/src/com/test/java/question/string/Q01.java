package com.test.java.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q01 {

	public static void main(String[] args) throws Exception {
		
		
		/*
		   	문장을 입력받아 역순으로 출력하시오.

			입력]
			문장 입력 : 가나다 

			출력]
			역순 결과 : "다나가"
			
			1.입력을 받고
			2.입력 받은 값을 charAt()으로 추출하여 배열에 거꾸로 담는다.
			3.배열 안에 값을 하나씩 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문장 입력: ");
		String txt = reader.readLine();
		
		
		reverse(txt);
		
		
	}//main

	private static void reverse(String txt) {

		char[] txtArr = new char[txt.length()];
		int j = 0;
		
		for (int i=txt.length()-1; i>=0; i--) {
			
			txtArr[i] = txt.charAt(j);
			j++;
			
		}
		
		System.out.print("역순 결과:");
		System.out.print("\"");
		for (int i=0; i<txtArr.length; i++) {
			System.out.printf("%s", txtArr[i]);
		}
		System.out.print("\"");
		
	}//reverse

	
	
	
	
}

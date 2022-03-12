package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws Exception{

		//4.섭씨 -> 화씨
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("섭씨(C) : ");
		String input = reader.readLine();
		
		double celsius    = Double.parseDouble(input);
		double fahrenheit = celsius * 1.8 + 32;
		
		
		//출력
		System.out.printf("섭씨 %.0fC는 화씨 %.1fF입니다.", celsius, fahrenheit);
		
		//입력을 받아서 바로 변환하는 것이 더 좋은 것 같다
		//double celsius = Double.parseDouble(reader.readLine());
	}

}

package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception {


		//1.나이 구하기
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("태여난 년도 : ");
		String input = reader.readLine();
		
		int birthYear = Integer.parseInt(input);
		int age = 2022 - birthYear + 1;
		
		System.out.printf("나이 : %d\n", age);
		
		
		//숫자가 아닌 값을 입력한다면? 삼항
		//올바른 년도가 아닌 값을 입력하면? 음수를 입력하면? 삼항
		//올해가 2022년이 아니라면? 입력

	}

}

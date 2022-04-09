package com.test.java.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q08 {

	public static void main(String[] args) throws Exception{
		/*
		요구사항
		영단어를 입력받아 분리하시오.

		조건]
		합성어를 입력한다.
		합성어는 파스칼 표기법으로 입력한다.
		출력은 각 단어를 공백으로 구분한다.
		
		입력]
		단어: StudentName 

		출력]
		결과: Student Name
		*/
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("단어: ");
		String txt = reader.readLine();
		
		String[] word = new String[txt.length()];
		
		for(int i=0; i<txt.length(); i++) {
			
			if(i!=0 && 65<=txt.charAt(i) && txt.charAt(i)<=90) {
				word[i] = " " + txt.charAt(i);
			}else {
				word[i] = "" + txt.charAt(i);
			}
			
		}
		
		System.out.print("결과: ");
		for(int i=0; i<word.length; i++) {
			System.out.print(word[i]);
		}

	}

}

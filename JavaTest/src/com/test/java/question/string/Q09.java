package com.test.java.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q09 {

	public static void main(String[] args) throws Exception{
		
		/*
		요구사항]
		금지어를 마스킹 처리 하시오.

		조건]
		-금지어
		  바보
		  멍청이
		
		입력]
		입력: 너랑 안놀아 바보야!! 

		출력]
		너랑 안놀아 **야!!
		금지어를 1회 마스킹했습니다.
		
		설계]
		1.입력을 받습니다.
		2.해당 문자열에 금지어를 찾아 *로 바꾸고 count++ 해줍니다.
		문제 발생) 바보바보 일경우 1번으로 나온다
		해결!!!) 각 case에 카운트를 넣었다
		*/
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("입력: ");
		String txt = reader.readLine();
		
		forbid(txt);
		
		
	}//main

	private static void forbid(String txt) {
		
		int count = 0;
		String[] forbidTxt = {"바보", "멍청이"};
		
		for (int i=0; i<forbidTxt.length; i++) { //금지어 개수만큼 반복
			
			if(txt.indexOf(forbidTxt[i])>-1) { //금지어가 있으면 0보다 크지만 없으면 -1을 반환
	
				switch(forbidTxt[i].length()) { //금지어 글자수에 따라
					case 2:
						txt = txt.replace(forbidTxt[i], "**"); //금지어 글자수가 2글자빕
						count++;
						break;
						
					case 3:
						txt = txt.replace(forbidTxt[i], "***"); //금지어가 3글자
						count++;
						break;
				}
				
				count++; //금지어 개수 카운팅
			}
			
		}
		
		System.out.println(txt);
		System.out.printf("금지어를 %d회 마스킹했습니다.", count);
		
	}

}

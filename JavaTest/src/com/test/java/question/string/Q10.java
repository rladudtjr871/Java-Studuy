package com.test.java.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q10 {

	public static void main(String[] args) throws Exception{
		
		/*
		요구사항
		입력받은 금액을 한글로 출력하시오.

		조건]
		입력 범위(원): 0 ~ 99,999,999
		
		입력]
		금액(원): 120 

		출력]
		일금 일백이십원
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("금액(원): ");
		String won = reader.readLine();
		
		
		korWon(won);
		
		

	}//main

	private static void korWon(String won) {
		
		String wonnum = won.replace(",", "");
		
		
		String[] money = {"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
		String[] unit = {"원", "십", "백", "천", "만", "십", "백", "천"};
		String wonTxt = "";
		
		for(int i=0; i<wonnum.length(); i++) {
			
			int moneynum = wonnum.charAt(i) - '0'; //뽑아낸 값 - '0' = 뽑으값(int)
			
			wonTxt += money[moneynum] + unit[wonnum.length()-1-i]; //숫자 + 자리값
			//자리값 변화에 대응 식
			
		}
		
		System.out.printf("일금 %s", wonTxt);
			

	}
}










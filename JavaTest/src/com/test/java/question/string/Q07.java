package com.test.java.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q07 {

	public static void main(String[] args) throws Exception{
		
		/*
		요구사항
		숫자를 입력받아 3자리마다 , 를 붙이시오.

		조건]
		%,d 사용 금지
		
		입력]
		숫자: 1234 

		출력]
		결과: 1,234
		
		
		설계]
		1.숫자를 입력 받는다.
		2.숫자를 자리마다 따로따로 배열에 저장한다.
		3.뒤에서부터 count가 3일때마다 ,을 추가하여 저장한다.
		 
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자: ");
		String num = reader.readLine();
		
		int cnt = 1;
		String[] numArr = num.split(""); //숫자를 문자열로 각 자리수를 배열에 저장
		
		for (int i=numArr.length-1; i>=0; i--) { //숫자 배열의 길이
			

		
			if (i != 0 && cnt%3 == 0) {  //i가 0이면 맨 앞 숫자에 ,이 추가되어 출력, 3으로 나누어질때마다 반점
				numArr[i] ="," + numArr[i];
			}
			cnt++;  //cnt는 앞자리 수부터 3번째마다를 체크하기 위한 변수
			
		}
		
		System.out.print("결과: ");
		
		for(int i=0; i<numArr.length; i++) {
			System.out.printf("%s", numArr[i]);
		}
	}

}

package com.test.java.question.datetime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q03 {

	public static void main(String[] args) throws Exception {
		
		/*
		 	요구사항
			태어난 년도를 입력하면 나이를 출력하시오.

			조건
			올해를 기준으로 나이를 계산하시오.
			내년, 내후년에 실행해도 그때에 맞는 나이가 출력되야합니다.
			우리나라 나이로 출력하시오.
			
			입력
			태어난 년도: 1995 

			출력
			나이 : 28세
			
		  	설계] 1. 나이를 구하는 메소드를 생성한다.
		  		 2. 현재 시간과 입력받은 나이를 .getTimeInMillis()메소드로 A변수에 저장해준다.
		  		 3. B변수를 생성해 A변수를 연산하여 년도만 남도록 한다.
		  		 4. 나온 년도를 연산하여 출력
		  	
		 */
		
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("태어난 년도: ");
		int birth = Integer.parseInt(reader.readLine());

		age(birth);



	}// main

	private static void age(int birth) {

		Calendar now = Calendar.getInstance();
		Calendar birthsecond = Calendar.getInstance();

		birthsecond.set(Calendar.YEAR, birth);

		long nowTime = now.getTimeInMillis();
		long birthTime = birthsecond.getTimeInMillis();

		long nowYear = nowTime / 1000 / 60 / 60 / 24 / 365;
		long birthYear = birthTime / 1000 / 60 / 60 / 24 / 365;

		int result = (int) nowYear - (int) birthYear + 1;
		System.out.printf("나이 : %d세\n", result);

	}//main
}

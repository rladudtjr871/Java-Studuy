package com.test.java.question.datetime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q04 {

	public static void main(String[] args) throws Exception{
		/*
		 
		 	요구사항
			남녀 커플의 이름과 만난날을 입력받아 기념일을 출력하시오.

			입력
			남자 이름 : 하하하 
			여자 이름 : 호호호 
			만난날(년) : 2022 
			만난날(월) : 3
			만난날(일) : 15 

			출력
			'하하하'과(와) '호호호'의 기념일
			100일 : 2022-06-23
			200일 : 2022-10-01
			300일 : 2023-01-09
			500일 : 2023-07-28
			1000일 : 2024-12-09

		   설계] 1.만난 날을 입력 받는다.
		   		2.기념일을 계산할 메소드를 만든다 입력 받은 값을 인자로 쓸 인자도 만든다.
		   		3.add()메소드로 기념일만큼 더하여 연산해준다.
		   		4.다음 기념일 구할 때 꼭 만난 날로 다시 초기화!
		   		
		  
		 */
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("남자 이름: ");
		String nameMan = reader.readLine();
		
		System.out.print("여자 이름: ");
		String nameWoman = reader.readLine();
		
		System.out.print("만난날(년): ");
		int year = Integer.parseInt(reader.readLine());
		
		System.out.print("만난날(월): ");
		int month = Integer.parseInt(reader.readLine());
		
		System.out.print("만난날(일): ");
		int day = Integer.parseInt(reader.readLine());
		
		
		anniversary(nameMan, nameWoman, year, month, day);

		
	}//main
	
	private static void anniversary(String nameMan, String nameWoman, int year, int month, int day) {
		
		Calendar coupleDay = Calendar.getInstance();
		
		coupleDay.set(year, month - 1, day);
		
		System.out.printf("\'%s\'과(와) \'%s\'의 기념일\n", nameMan, nameWoman);
		
		
		coupleDay.add(Calendar.DATE, 100);
		System.out.printf("100일 : %tF\n", coupleDay);
		
		coupleDay.set(year, month, day);
		coupleDay.add(Calendar.DATE, 200);
		System.out.printf("200일 : %tF\n", coupleDay);
		
		
		coupleDay.set(year, month, day);
		coupleDay.add(Calendar.DATE, 300);
		System.out.printf("300일 : %tF\n", coupleDay);
		
		
		coupleDay.set(year, month, day);
		coupleDay.add(Calendar.DATE, 500);
		System.out.printf("400일 : %tF\n", coupleDay);
		
		coupleDay.set(year, month, day);
		coupleDay.add(Calendar.DATE, 1000);
		System.out.printf("1000일 : %tF\n", coupleDay);
		
	}

}

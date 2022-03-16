package com.test.java.question.datetime;

import java.util.Calendar;

public class Q02 {

	public static void main(String[] args) {
		/*
			요구사항
			오늘 태어난 아이의 백일과 첫돌을 출력하시오.

			출력
			백일: 2022-06-23
			첫돌: 2023-03-15
			
			1.백일 첫돌을 계산할 메소드 생성
			2.현재 날짜에 .add메소드로 100일만큼 더한다.
			3.현재 날짜에 .add메소드로 1년만큼 더한다.
			4.get메소드로 가져와 출력
		*/
		babyDay();

	}//main
	
	private static void babyDay() {
		
		Calendar day100 = Calendar.getInstance();
		Calendar firstBirthday = Calendar.getInstance();
		
		day100.set(2022, 2, 15);
		day100.add(Calendar.DATE, 100);
		
		firstBirthday.set(2022, 2, 15);
		firstBirthday.add(Calendar.YEAR, 1);
		
		System.out.printf("백일: %d-%d-%d\n"
							, day100.get(Calendar.YEAR)
							, day100.get(Calendar.MONTH) + 1
							, day100.get(Calendar.DAY_OF_MONTH));
		
		System.out.printf("첫돌: %d-%d-%d\n"
				, firstBirthday.get(Calendar.YEAR)
				, firstBirthday.get(Calendar.MONTH) + 1
				, firstBirthday.get(Calendar.DAY_OF_MONTH));
	}
	

}

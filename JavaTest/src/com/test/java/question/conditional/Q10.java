package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q10 {
	/*
	 	
	 	1.년월일을 입력 받는다.
	 	2.date에 현재 시간을 초기화한다.
	 	3.입력한 시간으로 date를 set() 해준다.
	 	4.입력한 달의 날짜의 DayOfWeek가 2~6 사이이면 평일이므로
	 	5.if문으로 평일을 먼저 구별하고 그 안에 if문으로 각 요일별로 비교하여 토요일로 맞춘다.
	 	
	 */
	public static void main(String[] args) throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("년 : ");
		int year = Integer.parseInt(reader.readLine());
		
		System.out.print("월 : ");
		int month = Integer.parseInt(reader.readLine());
		
		System.out.print("일 : ");
		int day = Integer.parseInt(reader.readLine());
		
		
		Calendar date = Calendar.getInstance();
		
		date.set(year, month - 1, day);
		
		int dayOfWeekDay = date.get(Calendar.DAY_OF_WEEK);
		
		if(dayOfWeekDay>=2 && dayOfWeekDay <=6) { 
			
			System.out.println("입력하신 날짜는 '평일'입니다.");
			System.out.println("해당 주의 토요일로 이동합니다.");
			
			if (dayOfWeekDay ==2) {
				date.add(Calendar.DAY_OF_WEEK, 5);
				
			} else if (dayOfWeekDay == 3) {
				date.add(Calendar.DAY_OF_WEEK, 4);
				
			} else if (dayOfWeekDay == 4) {
				date.add(Calendar.DAY_OF_WEEK, 3);
				
			} else if (dayOfWeekDay == 5) {
				date.add(Calendar.DAY_OF_WEEK, 2);
				
			} else {
				date.add(Calendar.DAY_OF_WEEK, 1);
			}
		
			System.out.printf("이동한 날짜는 '%tF'입니다.", date);
			
		} else if (dayOfWeekDay == 1) {
			
			System.out.println("입력하신 날짜는 '휴일'입니다.");
			System.out.println("결과가 없습니다.");
			
		}
	}

}

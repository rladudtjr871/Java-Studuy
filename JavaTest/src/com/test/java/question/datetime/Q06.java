package com.test.java.question.datetime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q06 {

	public static void main(String[] args) throws Exception{
		
		/*
		 
			요구사항
			여러 배달 음식을 같은 시간에 받기를 원하는 고객이 있다. 고객이 각각의 매장에 몇시에 전화를 해야 모든 음식을 같은 시간에 받을 수 있는지 알려주시오.

			조건
			전화를 걸면 짜장면은 10분 뒤에 도착합니다.
			전화를 걸면 치킨은 18분 뒤 도착합니다.
			전화를 걸면 피자는 25분 뒤 도착합니다.
			음식을 받기 원하는 시간은 오후 11시 이전에만 가능합니다.(날짜 변경 금지)
			
			입력
			음식을 받기 원하는 시각

			시 : 24 
			분 : 32 
	
			출력
			짜장면 : 0시 22분
			치킨 : 0시 14분
			피자 : 0시 7분
		  
		 
		  	설계] 1.입력을 받는다.
		  		 2.입력 받은 값으로 연산할 메소드를 생성
		  		 3.짜장면은 10분, 치킨 18분, 피자 25분 (오후 11시 이전에만)
		  		 4.원하는 시간으로 set()메소드를 이용해 시간과 분을초기화
		  		 5.메뉴별 소요시간만큼 add()메소드로 -소요시간 해주어 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("음식을 받기 원하는 시각");
		
		System.out.print("시 : ");
		int hour = Integer.parseInt(reader.readLine());
		
		System.out.print("분 : ");
		int minute = Integer.parseInt(reader.readLine());
		
		delivery(hour, minute);
		

	}//main
	
	private  static void delivery(int hour, int minute) {
		
		Calendar jjajang = Calendar.getInstance();
		Calendar chicken = Calendar.getInstance();
		Calendar pizza = Calendar.getInstance();
		
		jjajang.set(Calendar.HOUR_OF_DAY, hour);
		jjajang.set(Calendar.MINUTE, minute);
			
		jjajang.add(Calendar.MINUTE, -10);
		System.out.printf("짜장면: %02d시 %02d\n"
							, jjajang.get(Calendar.HOUR_OF_DAY)
							, jjajang.get(Calendar.MINUTE));
		
		
		chicken.set(Calendar.HOUR_OF_DAY, hour);
		chicken.set(Calendar.MINUTE, minute);
			
		chicken.add(Calendar.MINUTE, -18);
		System.out.printf("치킨: %02d시 %02d\n"
							, chicken.get(Calendar.HOUR_OF_DAY)
							, chicken.get(Calendar.MINUTE));
		
		
		pizza.set(Calendar.HOUR_OF_DAY, hour);
		pizza.set(Calendar.MINUTE, minute);
			
		pizza.add(Calendar.MINUTE, -25);
		System.out.printf("피자: %02d시 %02d"
							, pizza.get(Calendar.HOUR_OF_DAY)
							, pizza.get(Calendar.MINUTE));
		
	}//delivery

}

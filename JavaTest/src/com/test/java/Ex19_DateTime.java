package com.test.java;

import java.util.Calendar;
import java.util.Date;

public class Ex19_DateTime {

	public static void main(String[] args) {


		/*
		   
		   자바의 자료형(값형)
		   1. 원시형(값형)
		   	   - byte, short, int, long
		   	   - float, double
		   	   - char
		   	   - boolean
		   	   
		   2. 참조형
		   	   - 클래스
		   	   - String
		   	   - 날짜시간
		   	   
		   	   
		   자바의 날짜시간 자료형
		   1. Date 클래스 > 거의 사용 안함
		   2. Calender 클래스 > 현역
		   3. 추가 클래스 > 현역
		   
		   
		   
		   A. 시각
		   B. 시간
		   
		   2022년 3월 14일 오후 2시 32분 46초 > 시간 vs 시각 > 시각
		   
		   8시간 공부 > 시간 vs 시각 > 시간
		   
		   자료형의 시각 > 둘은 완전 다른 자료형
		   
		   시각, 시간 > 연산
		   특정 기준일(1970년 1월 1일 0시 0분 0초, 1년 1월 1일 자정)로부터
		   해당 시각이 얼마만큼 흘렀는지 구한 누적 시간 -> 틱(tick)값, Epoch Time, Timestamp
		   
		   시간 + 시각 = X (2022-01-13 + 2024-06-24)
		   시각 - 시각 = O (2022-01-13 + 2024-06-24)
		   
		   시간 + 시간 = O(시간), 8시간 + 2시간 = 10시간
		   시간 - 시간 = O(시간), 8시간 - 2시간 = 6시간
		   
		   시간 + 시간 = O(시각), 2022-01-13 + 5일 = 2022-01-18
		   시간 - 시간 = O(시각), 2022-01-13 - 5일 = 2022-01-08
		   
		 */
		
		
		//m1();
		m2();

	}//main
	
	
	private static void m1() {
		//첫번째 예제
		
		//Date
		
		//자료형(Date) 변수명(date) = new Date();
		Date date = new Date(); //현재 시각을 생성해서 date라는 변수에 담아라
		
		System.out.println(date);
		//Mon Mar 14 17:04:38 KST 2022
		
	}
	
	
	private static void m2() {
		//두번째 예제
		
		//Calender 클래스
		
		//현재 시각 얻어오기(가장 기본적인 행동)
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);
		//[time=1647245424199, areFieldsSet=true,areAllFieldsSet=true, ...
		
		//c1안에 들어있는 수많은 데이터 중 원하는 데이터를 추출
		//- int get(int)
		System.out.println(c1.get(1)); //년도 추출 > 2022
		System.out.println(c1.get(2)); //2
		System.out.println(c1.get(3)); //12
		System.out.println(c1.get(4)); //3
		System.out.println(c1.get(5)); //14
		
		int year = 1;
		System.out.println(c1.get(1));		//가독성 낮음
		System.out.println(c1.get(year));	//가독성 높음
		
		
		//자바가 제공하는 Calender 상수(변수)
		System.out.println(Calendar.YEAR);
		System.out.println(c1.get(Calendar.YEAR)); //***실제로 사용하는 최종 구문
		System.out.println();
		System.out.println();
		
		System.out.println(c1.get(Calendar.YEAR)); //2022. 년도
		System.out.println(c1.get(Calendar.MONTH)); //2. 월(0~11)
		System.out.println(c1.get(Calendar.DATE)); //14. 날짜(일)
		System.out.println(c1.get(Calendar.HOUR)); //5. 시(12H)
		System.out.println(c1.get(Calendar.MINUTE)); //23. 분
		System.out.println(c1.get(Calendar.SECOND)); //22. 초
		System.out.println(c1.get(Calendar.MILLISECOND)); //251. 밀리초(1/1000)
		System.out.println(c1.get(Calendar.AM_PM)); //1. 오전(0), 오후(1)
		
		System.out.println(c1.get(Calendar.DAY_OF_YEAR)); //73. 일(1년 중)
		System.out.println(c1.get(Calendar.DAY_OF_MONTH)); //14. 일(1달 중)
		System.out.println(c1.get(Calendar.DAY_OF_WEEK)); //2. 일(요일) 1(일)~7(토)
		
		System.out.println(c1.get(Calendar.WEEK_OF_YEAR)); //12. 주
		System.out.println(c1.get(Calendar.WEEK_OF_MONTH)); //3. 주
		
		System.out.println(c1.get(Calendar.HOUR_OF_DAY)); //17. 시(24H)
		System.out.println();
		System.out.println();
		
		//요구사항] "오늘은 2022년 3월 14일입니다." 출력하시오
		
		Calendar now = Calendar.getInstance();
		
		System.out.printf("오늘은 %d년 %d월 %d일입니다.\n"
							, now.get(Calendar.YEAR)
							, now.get(Calendar.MONTH) + 1
							, now.get(Calendar.DATE));
		System.out.println();
		
		//요구사항] "지금은 오후 5시 37분입니다." 출력하시오
		System.out.printf("지금은 %s %d시 %d분입니다.\n"
				, now.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
				, now.get(Calendar.HOUR)
				, now.get(Calendar.MINUTE));
		System.out.println();
		
		
		//printf(), format() > 형식문자 + 날짜시간
		System.out.printf("%tF\n", now); //2022-03-14 *****
		
		System.out.printf("%d-%02d-%02d\n"
				, now.get(Calendar.YEAR)
				, now.get(Calendar.MONTH) + 1
				, now.get(Calendar.DATE));
		
		System.out.printf("%tT\n", now); //17:45:05 *****
		
		System.out.printf("%tA\n", now); //월요일 *****
				
	}
}

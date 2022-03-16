package com.test.java.question.datetime;

import java.util.Calendar;
import com.test.java.Ex17_LocalVariable;

public class Q01 {

	public static void main(String[] args) {
		
		/*
		
			요구사항
			현재 시간을 출력하는 메소드 선언하시오.
		
			조건.	.
			void nowTime()
			현재 시간을 24시간으로 출력하시오.
			현재 시간을 오전/오후로 출력하시오.
			
			호출..
			nowTime();
			
			출력..
			현재 시간 : 10시 30분 25초
			현재 시간 : 오전 10시 30분 25초
		
			1.nowTime()메소드를 생성한다.
			2.메소드 안에 calendar클래스를 이용하여 현재 시간을 받는다.
			3. HOUR와 HOUR_OF_DAY를 사용해 두가지 방법으로 출력한다.
		
		*/
		nowTime();
		
	}//main

	private static void nowTime() {
		
		Calendar nowTime = Calendar.getInstance();
		String amPm = (nowTime.get(Calendar.AM_PM) == 0) ? "오전" : "오후";
		System.out.printf("현재 시간 : %d시 %d분 %d초\n"
							, nowTime.get(Calendar.HOUR)
							, nowTime.get(Calendar.MINUTE)
							, nowTime.get(Calendar.SECOND));
		
		System.out.printf("현재 시간 : %s %d시 %d분 %d초\n"
				, amPm
				, nowTime.get(Calendar.HOUR_OF_DAY)
				, nowTime.get(Calendar.MINUTE)
				, nowTime.get(Calendar.SECOND));
		
	}
}

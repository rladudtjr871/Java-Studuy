package com.test.java.question.iteration;

public class Q08 {

	public static void main(String[] args) {

		//TODO
		/*
		 	요구사항] 서기 1년 1월 1일부터 오늘까지 며칠째인지 합을 구하시오.

			조건]
			Calendar 클래스 사용 금지
			
			출력]
			2022년 3월 16일은 738,230일째 되는 날이고 수요일입니다.
			
			설계] 1. 1년 1월 1일을 기준으로 2022년03월16일
				 2. 년 월 일을 각각 변수로 받는다.
				 3. 
		 */
		
			int total = 0;
			int year = 2022;
			int month = 3;
			int date = 17;
			//1년 1월 1일 ~ 2021년 12월 31일
			
			for (int i=1; i<year; i++) {
				total += 365;
				
				//현재 i년이 윤년인지 검사?
				if (isLeafYear(i)) {
					total++;
				}
				
			}
			
			//2022년 1월 1일 ~ 2022년 2월 28일
			for (int i=1; i<month; i++) {
				
				total += getLastDay(year, i);
			}
			
			
			//2022년 3월 1일 ~ 2022년 3월 17일
			total += date;
			
			
			System.out.printf("%d년 %d월 %d일은 %,d일째 되는 날이고 목요일입니다.\n", year, month, date, total);
			
		}
		
		private static int getLastDay(int year, int month) {
			switch (month) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
					return 31; //break역할
				case 4: case 6: case 9: case 11:
					return 30;
				case 2:
					return isLeafYear(year) ? 29 : 28;
			}
			return 0;
		}

		public static boolean isLeafYear(int year) {
			
//			a. 년도를 4로 나눈다.
//			떨어지면 b 검사
//			떨어지지 않으면 "평년"
//			b. 년도를 100으로 나눈다.
//			떨어지면 c 검사
//			떨어지지 않으면 "윤년"
//			c. 년도를 400으로 나눈다.
//			떨어지면 "윤년"
//			떨어지지 않으면 "평년"
			
			if (year % 4 == 0) {
				
				if (year % 100 == 0) {
					
					if (year % 400 == 0) {
						return true;
						
					} else {
						return false;
					}
					
				} else {
					return true;
				}
				
			} else {
				return false;
			}
			
		}
			

}

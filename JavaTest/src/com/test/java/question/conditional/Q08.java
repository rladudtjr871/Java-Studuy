package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q08 {

	public static void main(String[] args) throws Exception {

		/*
		 	1. 들어온 시간과 나간 시간을 입력 받는다
		 	2. 30분 간은 무료 주차이므로 30분 초과 후 10분부터 2000원을 부과하는 메소드 생성
		 	3. 출력
		 	
		 */
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("[들어온 시간]");
		System.out.print("시 : ");
		int inHour = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		int inMinute = Integer.parseInt(reader.readLine());
		
		System.out.println("[나간 시간]");
		System.out.print("시 : ");
		int outHour = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		int outMinute = Integer.parseInt(reader.readLine());

		
		parkingFee(inHour, inMinute, outHour, outMinute);
		
	}//main

	private static void parkingFee(int inHour, int inMinute, int outHour, int outMinute) {

		int minuteOfHour = (outHour - inHour) * 60;
		int minute = outMinute - inMinute;
		
		int minuteFinal = minute + minuteOfHour;
		//50
		int fee;
		
		//무료주차
		if (minuteFinal >= 0 && minuteFinal <= 30) {
			
			fee = 0;
			
			System.out.printf("주차 요금은 %d원입니다.", fee);
		//유료주차
		} else if (minuteFinal > 31) {
			
			//최종시간이 음수일 경우 오류가 나므로 여기에서 계산해준다.
			fee = ((minuteFinal - 30) / 10) * 2000; 
			
			System.out.printf("주차 요금은 %d입니다.", fee);
		//입력오류
		} else if (minuteFinal < 0){
			
			System.out.println("잘못된 시간을 입력하셨습니다.");
			
		}
		
	}
	

}

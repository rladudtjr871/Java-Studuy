package com.test.java.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws Exception{
		
		/*
			요구사항] 지하철 탑승 소요 시간을 구하시오. 지나가는 역의 개수, 환승역의 횟수, 시간대를 전달 받아 총 걸리는 시간을 반환하는 메소드를 선언하시오.
			   조건] int getTime(int station, int change, int time)
					각 역간 소요 시간 : 2분 소요
					환승 소요 시간 : N분 소요
					시간대에 따라 환승 소요 시간이 다르다.
					평상시: 3분
					출근시: 4분
					퇴근시: 5분
					
			   입력] 역의 개수 : 15 
					환승역의 횟수 : 1 
					시간대(1.평상시, 2.출근시, 3.퇴근시): 1
					
			   출력] 총 소요 시간은 33분입니다.
			   
			   
			   설계] 1. Bufferdreader로 입력 받기
			        2. (역 갯수 * 2) + (환승역 * (3 or 4 or 5)) 연산하는 메소드를 만든다.
			        3. 메소드 호출
		
		*/
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("역의 개수 : ");
		int station = Integer.parseInt(reader.readLine());
		
		System.out.print("환승역의 횟수 : ");
		int change = Integer.parseInt(reader.readLine());
		
		System.out.print("시간대(1.평상시, 2.출근시, 3.퇴근시): ");
		int time = Integer.parseInt(reader.readLine());
		
		
		int timeSubway = getTime(station, change, time);
		System.out.printf("총 소요시간은 %d분입니다.", timeSubway);
		
	}//main
	
	//지하철 이동시간
	public static int getTime(int station, int change, int time) {

	 String time2 = 0 < time && time < 4 ? (time == 1 ? "3" : (time == 2 ? "4": "5")) : "잘못된 값";
	 
	 int result = (station * 2) + (change * Integer.parseInt(time2));	
	 
	 //station * 2 연산을 변수에 따로 받아주는게 좋은 것 같다.
	 return result;
	}
	
	

}//Q08class

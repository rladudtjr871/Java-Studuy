package com.test.java.question.datetime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q05 {

	public static void main(String[] args) throws Exception{
		
		/*
		  
		 	요구사항
			아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오.

			입력
			아빠 생일(년) : 1969 
			아빠 생일(월) : 5 
			아빠 생일(일) : 10 
			딸 생일(년) : 1997 
			딸 생일(월) : 7 
			딸 생일(일) : 22 

			출력
			아빠는 딸보다 총 10,300일을 더 살았습니다.
		  
		 
		 	1.아빠와 딸의 생년월일을 입력 받는다.
		 	2.입력 받은 값으로 연산할 메소드를 선언한다.
		 	3.아빠와 딸의 입력받은 생년월일로 각각 초기화 해준다.
		 	4.그 값을 getTimeInMills()로 받는다.
		 	5.이제 연산이 가능해졌기때문에 딸 - 아빠 연산해준다.
		 	6.해당 값은 millisecond이기 때문에 일로 바꾸어준다.
		 	7.출력
		  
		 */
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("아빠 생일(년) : ");
		int yearDad = Integer.parseInt(reader.readLine());
		
		System.out.print("아빠 생일(월) : ");
		int monthDad = Integer.parseInt(reader.readLine());
		
		System.out.print("아빠 생일(일) : ");
		int dayDad = Integer.parseInt(reader.readLine());
		
		
		System.out.print("딸 생일(년) : ");
		int yearDaughter = Integer.parseInt(reader.readLine());
		
		System.out.print("딸 생일(월) : ");
		int monthDaughter = Integer.parseInt(reader.readLine());
		
		System.out.print("딸 생일(일) : ");
		int dayDaughter = Integer.parseInt(reader.readLine());
		
		live(yearDad, monthDad, dayDad, yearDaughter, monthDaughter, dayDaughter);
		
		
		
	}//main

	private static void live(int yearDad, int monthDad, int dayDad,
							 int yearDaughter, int monthDaughter,int dayDaughter) {
		
		Calendar dad = Calendar.getInstance();
		Calendar daughter = Calendar.getInstance();
		
		dad.set(yearDad, monthDad, dayDad);
		daughter.set(yearDaughter, monthDaughter, dayDaughter);
		
		long dadmilli = dad.getTimeInMillis();
		long daughtermilli = daughter.getTimeInMillis();
		
		long elder = daughtermilli - dadmilli;
		
		long elderDay = elder / 1000 / 60 / 60 / 24; //초 > 분> 시 > 일
		int elderDayResult = (int)elderDay;
		
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.", elderDayResult);
		
	}
	
	
	
}

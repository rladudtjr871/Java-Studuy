package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Ex22_for {

	public static void main(String[] args) throws Exception {

		/*
		 	
		 	반복문
		 	- 특정 코드를 개발자가 원하는 횟수만큼 반복 실행한다.
		 	- 생산성 향상 + 유지보수성 향상
		 	
		 	for (초기식; 조건식; 증감식) {
		 		실행문; 
		 	}
		 	
		 */

		
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		m11();
		
	}//main

	private static void m11() {

		//난수
		//- 임의의 수
		//- 난수 생성기
		
		//1. Math.random()
		//2. Random 클래스
		
		//Returns a double value with a positive sign, greaterthan or
		//equal to 0.0 and less than 1.0.Returned values are chosen
		//pseudorandomly with (approximately)uniform distribution from that range. 
		
		//0 ~ 0.9999999999999
		//0이상 1미만의 값
		//System.out.println(Math.random());
		
		
		
		//1~10사이의 난수
		
		//A: 최솟값
		//A+B-1: 최대값
		//(int)(Math.random() * B) + A
		
		for (int i=0; i<10; i++) {
			
			//int num =(int)(Math.random() * 8) //뒤에 곱한 값(8) -1이 최대값이 된다. 
			//int num =(int)(Math.random() * 10) + 1;
			
			int num =(int)(Math.random() * 7) + 3;
			
			System.out.println(num);
			
		}
		
	}//m11

	private static void m10() {
		
		//2022년 3월 1일 ~ 3월 31일까지 날짜 출력
		
		//2022년 3월 1일 화요일 > 시작 날짜
		//2022년 3월 2일 수요일 > 
		//...
		//2022년 3월 31일 목요일
		
		Calendar c1 = Calendar.getInstance();
		
		c1.set(2022, 2, 1); //2022년 3월 1일
		
		//c1이 속해있는 월의 최대값을 가져와라 > 마지막 날짜
		//System.out.println(c1.getActualMaximum(Calendar.DATE));
		
		int lastDay = c1.getActualMaximum(Calendar.DATE);
		
		for (int i=1; i<=lastDay; i++){
			
			System.out.printf("%d년 %d월 %d일 %tA\n"
								, c1.get(Calendar.YEAR)
								, c1.get(Calendar.MONTH) + 1
								, c1.get(Calendar.DATE)
								, c1);
			
			c1.add(Calendar.DATE, 1); //루프 1바퀴 > 1일 증가
			
		}
		
		
	}//m10

	private static void m9() {
		
		//2022년 3월 1일 ~ 3월 31일까지 날짜 출력
		
		//2022년 3월 1일 화요일
		//2022년 3월 2일 수요일
		//...
		//2022년 3월 31일 목요일
		
		for (int date=1; date<=31; date++) {
			
			String day = getDay(date);

			
			System.out.printf("2022년 3월 %02d일 %s요일\n", date, day);
			
		}
		
	}//m9

	//XXX This method must return a result of type String
	//모든 경우에 return문이 존재해야 하는데 일부 경우에 return문이 존재하지 않는다.
	public static String getDay(int date) {
		
		if (date % 7 == 1) {
			return "화";
		} else if (date % 7 == 2) {
			return "수";
		} else if (date % 7 == 3) {
			return "목";
		} else if (date % 7 == 4) {
			return "금";
		} else if (date % 7 == 5) {
			return "토";
		} else if (date % 7 == 6) {
			return "일";
		} else {
			return "월";
		}
		
		//return X
		
		//return ""; //return null;
		
	}
	
	private static void m8() throws Exception {
		
		int sum = 0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		//짝수만 누적
		
		for (;;) {
			
			System.out.print("숫자: ");
			
			int num = Integer.parseInt(reader.readLine());
			
			if (num == 0) {
				break;
			}
			
//			if (num % 2 == 1) {  //continue로 가능하지만 break보다 사용빈도 수가 적다
//				continue;
//			}
			
			if (num % 2 == 0) {
				sum += sum;
			}
			
			sum += num;
			
		}
		
		System.out.println("최종 합: " + sum);
		
	}

	private static void m7() throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//사용자 입력 숫자 > 누적 > 횟수 사용자 맘대로
		int sum = 0;
		
		for (;;) {
			
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			
			if (num == 0) {
				break;
			}
			
			sum += num;
			
		}
		
		System.out.println("최종 합: " + sum);
		
	}

	private static void m6() {
		
		//무한 루프, Infinite Loop
//		for (int i=0; i<10; i--) {  //21억 바퀴
//			System.out.println("안녕하세요." + i);
//		}
		
		
		//무한 루프 일부러 만들기
//		for (;;) {
//			System.out.println("무한 루프");
//		}
		
		//무한 루프 + 루프 변수 활용
//		for (int i=2147083647; ; i++) {
//			System.out.println(i);
//		}
		
		
//		for (int i=2147083647; true ; i++) {
//		System.out.println(i);
//		}
		
		for (int i=0; ; i++) {
			System.out.println(i);
			if(i>100000) {
				break;
			}
		}
		
		//Unreachable code (무한 반복문이 위에 있을 경우)
		//루프 탈출하는 방법
		for (int i=1; i<=10; i++) {
			
			System.out.println(i);
			
			if (i == 5) {
				break; //if문을 제외한 나머지 제어문을 탈출하는 역할 *****XXX
			}
			
		}
		
		System.out.println();
		
		
		for (int i=1; i<=10; i++) {
			
			if (i == 5) {
				continue; //하던 일을 멈추고 제어의 처음으로 돌아가세요.
						  //for문에 대해서 동작 XXX
			}
			
			System.out.println(i);
			
		}
		
		
		
	}

	private static void m5() throws Exception {
		
		//구구단 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("단: ");
		
		int dan = Integer.parseInt(reader.readLine());
		
		//5 x 1 = 5
		//5 x 2 = 10
		//..
		//5 x 9 =45
		
		for (int i=1; i<10; i++) {
			System.out.printf("%d x %d = %2d\n", dan, i, dan * i);
		}
		
	}

	private static void m4() throws Exception {

		//요구사항] 사용자 숫자 입력 > x10번 입력 > 숫자의 합
		
		//요구사항] 1~10까지 합
		int sum = 0; //누적 변수(반드시 0으로 초기화)
		
		for (int i=1; i<=10; i++) {
			sum = sum + i;
			//1 = 0 + 1
			//3 = 0 + 1 + 2
			//6 = 0 + 1 + 2 + 3
			//....
			//55 = 0 + 1 + .. + 10
		}
		
		System.out.println(sum);
		
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		sum = 0;
		
		for(int i=0; i<10; i++) {
			
		System.out.print("숫자: ");
		int num = Integer.parseInt(reader.readLine());
		sum += num;
		
		}
		
		System.out.println(sum);
		
	}

	private static void m3() {

		//반복문 사용 이유
		//1. 반복하기 위해서 > 난이도 쉬움
		//2. 루프 변수를 사용하기 위해서(******) > 연습 필요!! > 수열 생성
		
		//요구사항] 숫자 1~10까지 출력
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		System.out.println();
		System.out.println();
		
		
		
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		
		for (int i=7; i<=100; i+=7) {
			System.out.println(i);
		}
		
		System.out.println();
		
		
	}//m3

	private static void m2() {
		
		//반복문? > 몇회전?
		for (int i=0; i<5; i++) {
			System.out.println("실행문");
		}
		
		System.out.println();
		
		for (int i=3; i<=7; i++) {
			System.out.println("실행문");
		}
		
		System.out.println();
		
		for (int i=10; i>5; i--) {
			System.out.println("실행문");
		}
		
	}//m2

	private static void m1() {
		
		//요구사항] "안녕하세요" x 5 출력
		
//		hello();
//		hello();
//		hello();
//		hello();
//		hello();
		
		for (int i=1; i<=5; i++) {
			hello();
		}
		
		System.out.println();
		
		//int i=1; > 초기식 > for문에 처음 진입할 때 딱 1번만 실행된다.
		//i<=5;	   > 조건식 > 반복 유무를 결정한다.
		//i++;	   > 증감식 > 조건식의 변화를 유발한다.
		// i=1 > 비교 > 출력 > 증가 > 비교 > 출력 > 증가
		
		//반복문 > loop(iteration) > i > 루프 변수
		for (int i=1; i<=5; i++) {
			System.out.println("안녕하세요.");
			
		}
		
	}//m1
	
	public static void hello() {
		
		System.out.println("안녕하세요.");
		
	}

}

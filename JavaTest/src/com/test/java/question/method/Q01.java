package com.test.java.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception {
		
		//요구사항] 사용자가 페달을 밟은 횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오.
		//자전거 바퀴 지름(26인치), 기어비 1:1, 모든 출력 숫자 천단위 표기 
		
		//설계
		//1. 사용자가 밟은 페달 횟수를 입력 받을 BufferdReader 생성
		//2. 26인치를 미터로 환산 (0.6604)
		//3. 원의 둘레를 구하기 위한 3.14
		//4. 메소드 생성 > 페달 횟수 * 0.6604 * 3.14 * 2
		//5. printf를 이용해 값 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//입력
		System.out.print("사용자가 페달을 밟은 횟수 : ");
		int pedal = Integer.parseInt(reader.readLine());
		
		//메소드호출
		distance(pedal);
		
	}
	
		//거리 연산 메소드
		public static void distance(int pedal) {
			double pi = 3.14;
			double inch = 0.0254;
			double result = 26 * pi * inch * pedal;
			System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %,.3fm를 달렸습니다.", pedal, result);
		}
		
}

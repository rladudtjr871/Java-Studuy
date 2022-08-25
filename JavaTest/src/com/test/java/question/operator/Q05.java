package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws Exception {


		//5.자전거
			//요구사항] 사용자가 페달을 밟은 횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오.
			//자전거 바퀴 지름(26인치), 기어비 1:1, 모든 출력 숫자 천단위 표기 
				
			//설계
			//1. 사용자가 밟은 페달 횟수를 입력 받을 BufferdReader 생성
			//2. 26인치를 미터로 환산 (0.6604)
			//3. 원의 둘레를 구하기 위한 3.14
			//4. 페달 횟수 * 0.6604 * 3.14 * 2
			//5. printf를 이용해 값 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("사용자가 페달을 밟은 횟수 : ");
		String input = reader.readLine();
		
		int pedal = Integer.parseInt(input);
		
		//인치 > 미터 > 0.6604
		double meter = (3.14 * 0.6604) * pedal;
		
		System.out.printf("사용자가 총 %d회 페달을 밟아 자전거가 총 %,.3f", pedal, meter);
		
		//final double PI = 3.14;
		//final double INCH = 0.0254;
		//pedal * INCH * (PI * 26);
		
	}

}

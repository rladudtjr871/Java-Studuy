package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws Exception {


		//5.자전거
		
		
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

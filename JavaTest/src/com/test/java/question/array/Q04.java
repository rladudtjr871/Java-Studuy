package com.test.java.question.array;

import java.util.Arrays;

public class Q04 {

	public static void main(String[] args) {

		
		/*
		요구사항
		1~20 사이의 난수를 담고 있는 배열을 생성하고 최대값과 최소값을 출력하시오.

		조건]
		난수를 20개 발생 후 배열에 넣는다.
		난수는 1 ~ 20 사이
		
		출력]
		원본 : 10, 9, 3, 18, 15, 9, 5, 4, 3, 11, 15, 18, 9, 14, 18, 5, 8, 7, 9, 17
		최대값 : 18
		최소값 : 3
		 */

		int[] origin = new int[20];
		
		for (int i=0; i<origin.length; i++) {
			
			origin[i] = (int)(Math.random()*20) + 1;
			
		}
		
		Arrays.sort(origin);
		//System.out.println(Arrays.toString(origin));
		System.out.println("최대값: " + origin[origin.length-1]);
		System.out.println("최솟값: " + origin[0]);

		
		
	}//main

}

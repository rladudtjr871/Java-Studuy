package com.test.java.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws Exception{


		/*
		요구사항
		난수를 담고 있는 배열을 생성한 뒤 아래와 같이 출력하시오.

		조건]
		난수를 20개 발생 후 배열에 넣는다.
		난수는 1 ~ 20 사이
		배열을 탐색하여 범위에 만족하는 숫자만 출력한다.
		
		입력]
		최대 범위 : 15
		최소 범위 : 5

		출력]
		원본 : 10, 2, 3, 20, 15, 9, 5, 1, 3, 11, 15, 18, 9, 14, 18, 5, 8, 2, 1, 17
		결과 : 10, 15, 9, 5, 11, 15, 9, 14, 5, 8
		
		설계]
		1.반복문으로 20개의 난수를 생성하여 배열에 넣는다(1~20)
		2.배열의 요소를 for문으로 하나하나 조건에 부합하는지 검사한다.
		3.부합하는 숫자만 다른 배열에 담는다
		4.배열 안의 값을 덤프한다.
		 */
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("최대 범위: ");
		int max = Integer.parseInt(reader.readLine());
				
		System.out.print("최소 범위: ");
		int min = Integer.parseInt(reader.readLine());
		
		int[] numArr = new int[20];
		String result = "";
		
		for (int i=0; i<numArr.length; i++) {
			numArr[i] = (int)(Math.random() *20) +1;
			
			if (min <= numArr[i] && numArr[i] <= max) {
				result += numArr[i] + ", ";
			}
			
		}
		
		System.out.println(result + "\b\b");
		
		
		
		
	}//main

}

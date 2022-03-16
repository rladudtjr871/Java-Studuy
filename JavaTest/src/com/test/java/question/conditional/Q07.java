package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws Exception{

		/*
		 	
		 	설계] 1. 입력을 받는다
		 		 2. 숫자 5개의 짝수와 홀수의 개수를 카운트하고 비교하는는 메소드 생성
		 		 3. if문을 이용해 홀수일 경우와 짝수일 경우를 나누어 카운트
		 		 4. 개수의 차이를 변수에 받는다.
		 		 5. 출력
		 	
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 입력: ");
		int firstNum = Integer.parseInt(reader.readLine());
		
		System.out.print("숫자 입력: ");
		int secondNum = Integer.parseInt(reader.readLine());
		
		System.out.print("숫자 입력: ");
		int thirdNum = Integer.parseInt(reader.readLine());
		
		System.out.print("숫자 입력: ");
		int fourthNum = Integer.parseInt(reader.readLine());
		
		System.out.print("숫자 입력: ");
		int fifthNum = Integer.parseInt(reader.readLine());
		
		oddEven(firstNum, secondNum, thirdNum, fourthNum, fifthNum);
		
	}//main

	private static void oddEven(int firstNum, int secondNum, int thirdNum, int fourthNum, int fifthNum) {
		
		int countOdd = 0;
		int countEven = 0;
		int result;
	
		// 첫번째 숫자
		if (firstNum % 2 == 0) {

			countEven++;

		} else {

			countOdd++;

		}

		// 두번째 숫자
		if (secondNum % 2 == 0) {

			countEven++;

		} else {

			countOdd++;

		}

		// 세번째 숫자
		if (thirdNum % 2 == 0) {

			countEven++;

		} else {

			countOdd++;

		}

		// 네번째 숫자
		if (fourthNum % 2 == 0) {

			countEven++;

		} else {

			countOdd++;

		}

		// 다섯번째 숫자
		if (fifthNum % 2 == 0) {

			countEven++;

		} else {
			
			countOdd++;
			
		}
		
		//홀수가 더 많은 경우
		if (countOdd > countEven) {
			
			result = countOdd - countEven;
			
			System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n", countEven, countOdd);
			System.out.printf("홀수가 짝수보다 %d개 더 많습니다\n", result);
			
		}
		
		//짝수가 더 많은 경우
		if (countOdd < countEven) {
			
			result = countEven - countOdd;
			
			System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n", countEven, countOdd);
			System.out.printf("짝수가 홀수보다 %d개 더 많습니다.\n", result);
			
		}
	}

}

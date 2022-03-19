package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q09 {

	public static void main(String[] args) throws Exception{

		/*
		 	설계] 1. 난수를 생성하여 numcom에 저장
		 		 2. 사용자에게 for문으로 반복적으로 입력을 받는다.
		 		 3. 그 값이 난수와 같으면 정답문과 시도 횟수를 출력
		 		 4. 10회가 넘어가면 강제 종료 시킨다.
		 		 
		 */
		
		
		int numCom = (int)(Math.random() * 10 + 1);
		int count = 0;
		
		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.\n");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		for(; ;) {
		
			count++;
			
			System.out.print("숫자: ");
			int inNum = Integer.parseInt(reader.readLine());
			
			if (count == 10) {
				System.out.println("포로그램을 강제 종료합니다.");
					break;
					
				} else {
					
					if (inNum == numCom) {
						System.out.println("맞았습니다.");
					
						break;
					
					} else {
						System.out.println("틀렸습니다.\n");
						continue;
					
					}
				}
		}
		
		System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", numCom);
		System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다.\n", count);
		System.out.println("포로그램을 종료합니다.\n");
	}//main

}

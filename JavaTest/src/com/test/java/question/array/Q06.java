package com.test.java.question.array;

import java.util.Arrays; 

public class Q06 {

	public static void main(String[] args) {


		/*
		요구사항
		중복되지 않는 임의의 숫자 6개를 만드시오.(로또)

		조건]
		숫자의 범위 : 1 ~ 45
		오름차순 정렬
		
		출력]
		[1, 5, 23, 36, 37, 41]
		
		
		설계]
		1. 무한 반복으로 Math.random() 메소드로 1~45까지의 숫자를 생성하여 변수에 저장합니다. 해당 값이 중복이 아니면 배열에 저장
		2. 방금 생성한 난수가 배열에 없으면 넣고 있으면 continue, 만약 6개가 채워지면 break
		3. 오름차순 정렬
		4. 덤프
		 */
		
		int random = 0;
		int[] randomArr = new int[6];
		boolean flag = false;
		for(int i=0; i<randomArr.length; i++) {
			
			random = (int)(Math.random() * 45) + 1;
			
			
			for(int j=0; j<i; j++) { //중복 검사
				
				if (randomArr[j] == random) { //중복된 숫자
					i--;	//이번 회차 무효
					flag = true;
					break; //숫자 다시 뽑기
				}
				
			}
			
			if(!flag) {
				randomArr[i] = random;
			}
			
			flag = false;
			
		}
		
		Arrays.sort(randomArr);
		
		System.out.println(Arrays.toString(randomArr));
		
		
		
		
	}

}

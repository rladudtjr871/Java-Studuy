package com.test.java.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q06 {
	
	/*
	요구사항
	주민 등록 번호 유효성 검사를 하시오.

	조건..
	'-'의 입력 유무 상관없이 검사하시오.
	입력..
	주민등록번호: 951220-1021547 

	출력..
	올바른 주민등록번호입니다.
	*/
	
	public static void main(String[] args) throws Exception {
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("주민등록번호: ");
		String inJumin = reader.readLine();
		
		
		juminTest(inJumin);
		
		
		
	}//main

	
	private static void juminTest(String inJumin) {
		
		int lastNum = 0;
		int sum = 0;
		inJumin = inJumin.replace("-", ""); // "-"를 없애어 "-"의 존재유무에 상관없이 처리
		String[] juminArr = inJumin.split(""); //각 숫자를 배열에 저장
		
		for(int i=0; i<juminArr.length-1; i++) {
			
			if(i+2 > 9) {	//맨 앞자리가 2로 시작해 2,3,4,5,6,7,8,9,2,3,4,5,마지막자리
							//i+2가 9보다 커지면 다시 다시 2부터 시작이기때문에 그 전과 후를 나눔
				sum += Integer.parseInt(juminArr[i]) * (i-6); //i+2가 10일때 i=8이므로 2로 만들기 위해서는 i-6을 해준다.
			} else {
			sum += Integer.parseInt(juminArr[i]) * (i+2); //i가 0일때 2부터 시작이므로 +2 해준다
			}
		}
		

		sum = 11 - sum % 11; //마지막 숫자와 비교를 위한 연산
		
		lastNum = Integer.parseInt(juminArr[juminArr.length-1]);
		
		if (lastNum == sum) {
			System.out.println("올바른 주민등록번호입니다.");
			
		}else {
			System.out.println("올바르지 않은 주민등록번호입니다.");
		}
	}//juminTest
	

}

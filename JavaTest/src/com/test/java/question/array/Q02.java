package com.test.java.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws Exception{

		/*
		요구사항
		학생의 이름을 N개 입력받아 아래와 같이 출력하시오.

		조건]
		이름을 오름차순 정렬하시오.
		
		입력]
		학생 수 : 6 
		학생명 : 홍길동 
		학생명 : 아무개 
		학생명 : 하하하 
		학생명 : 호호호 
		학생명 : 후후후 
		학생명 : 헤헤헤 

		출력]
		입력한 학생은 총 6명입니다.
		1. 아무개
		2. 하하하
		3. 헤헤헤
		4. 호호호
		5. 홍길동
		6. 후후후
		 */

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("학생 수: ");
		int student = Integer.parseInt(reader.readLine());
		String[] nameArr = new String[student];
		
		for (int i=0; i<nameArr.length; i++) { //배열에 하나하나 넣기
			
			System.out.print("학생명: ");
			String name = reader.readLine();
			
			nameArr[i] = name;
			
		}
		
		System.out.printf("입력한 학생은 총 %d명입니다.\n", student);
		
		studentSort(nameArr); //오름차순 정렬
		
		for (int i=0; i<nameArr.length; i++) {  //배열 하나하나 출력
			
			System.out.printf("%d. %s\n", i+1, nameArr[i]);
			
		}

	}//main
	
	public static void studentSort(String[] nameArr) { //String배열 오름차순
		
		for (int i=0; i<nameArr.length-1; i++){
			for (int j=0; j<nameArr.length-1-i; j++) {
				
				if (nameArr[j].compareTo(nameArr[j+1]) > 0) {
					
					String temp = nameArr[j];
					nameArr[j] = nameArr[j+1];
					nameArr[j+1] = temp;
					
				}
				
			}
			
			
		}
			
		
	}
	
}

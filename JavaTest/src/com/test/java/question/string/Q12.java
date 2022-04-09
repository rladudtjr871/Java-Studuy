package com.test.java.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q12 {

	public static void main(String[] args) throws Exception{

		
		/*
		요구사항
		연산식을 입력받아 실제 연산을 하시오.

		조건]
		산술 연산자만 구현하시오.(+, -, *, /, %)
		연산식의 공백은 자유롭게 입력 가능합니다.
		산술 연산자가 반드시 존재하는지 체크하시오.
		피연산자의 갯수가 2개인지 체크하시오.
		
		입력]
		입력: 10 + 2   or  * 3(이 경우 오류메시지)

		출력]
		10 + 2 = 12
		
		설계]
		1.문자열을 입력 받는다.
		2.입력 받은 문자열을 for문 + if문 돌려서 연산자를 찾아내고 변수에 저장
		3.연산자를 기준으로 split하여 배열에 저장한다.(숫자를 구분하기 위해서)
		4.해당 숫자를 int로 변환하여 변수에 저장하고 sum 연산을 해준다.
		5.출력
		문제발생] 숫자가 부족할 경우 안된다. sol) input(" ", "") //공백을 제거
		해결!
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("입력: ");
		String input = reader.readLine();
		
		
		calculate(input);

	}//main

	
	private static void calculate(String input) {
		
		int sum = 0;
		char operator = '\n';
		String calculNum = "";
		
			if(input.contains("+")==true) {
				operator = '+';
				calculNum = input.replace("+", "");
				
			} else if(input.contains("-")==true) {
				operator = '-';
				calculNum = input.replace("-", "");
				
			} else if(input.contains("*")==true) {
				operator = '*';
				calculNum = input.replace("*", "");
				
			} else if(input.contains("/")==true) {
				operator = '/';
				calculNum = input.replace("/", "");
				
			} else if(input.contains("%")==true) {
				operator = '%';
				calculNum = input.replace("%", "");
				
			} else if(input.contains("+")==false && input.contains("-")==false 
					&& input.contains("*")==false && input.contains("/")==false 
					&& input.contains("%")==false) {
				
				System.out.println("연산자가 올바르지 않습니다.");
			}
			
//		}

			
			//String separator = "\\" + operator;
			//String calculNum = input.replace(separator, "");
			String[] calculArr = calculNum.split(""); //숫자만 배열에 넣기
			
			if (calculArr.length != 2) {
				System.out.println("피연산자가 부족합니다.");
			}else {
			
				int[] num = new int[calculArr.length];
				
				for (int i=0; i<calculArr.length; i++) {  //공백 제거
					calculArr[i] = calculArr[i].trim();
					num[i] = Integer.parseInt(calculArr[i]);
				}
				
	
	
				
				if(input.contains("+")) {
					
					sum = num[0] + num[1];
					
				} else if(input.contains("-")) {
					
					sum = num[0] - num[1];
					
				} else if(input.contains("*")) {
					
					sum = num[0] * num[1];
					
				} else if(input.contains("/")) {
					
					sum = num[0] / num[1];
					
				} else if(input.contains("%")) {
					
					sum = num[0] % num[1];
				}
				
				System.out.printf("%d %s %d = %d", num[0], operator, num[1], sum);
			}
		
	}

}

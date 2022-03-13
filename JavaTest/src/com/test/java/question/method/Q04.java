package com.test.java.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws Exception{

		
		/*
		  -연산식
		  요구사항] 숫자를 2개 입력받아 연산식을 반환하는 메소드를 선언하시오.
		  조건..
		  String add(int, int)
		  String subtract(int, int)
		  String multiply(int, int)
		  String divide(int, int)
		  String mod(int, int)
		
		  입력] 첫번째 숫자 : ?
		  	   두번째 숫자 : ?
		  	   
		  출력] ? + ? = ? ... * % / -
		  
		  Sol]
		  1.입력 받을 Bufferdreader 생성
		  2.각 연산에 맞는 메소드를 생성, int형 가인자 두개를 가진다.
		  3.입력 받은 값을 후인자로 메소드 호출
		  
		  
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자: ");
		int num1 = Integer.parseInt(reader.readLine());
		
		System.out.print("두번째 숫자: ");
		int num2 = Integer.parseInt(reader.readLine());
		
		String result;
		result = add(num1, num2);
		System.out.println(result);
		
		result = subtract(num1, num2);
		System.out.println(result);
		
		result = multiply(num1, num2);
		System.out.println(result);
		
		result = divide(num1, num2);
		System.out.println(result);
		
		result = mod(num1, num2);
		System.out.println(result);
		
		
		
		
	}//main
		
		//더하기
		public static String add(int n1, int n2) {
			
			int calculate =  n1 + n2;
			String result = n1 + " + " + n2 + " = " + calculate;
					
			return result;
		}
		
		//빼기
		public static String subtract(int n1, int n2) {
			
			int calculate =  n1 - n2;
			String result = n1 + " - " + n2 + " = " + calculate;
		
					
			return result;
		}
		
		//곱하기
		public static String multiply(int n1, int n2) {
			
			int calculate =  n1 * n2;
			String result = n1 + " * " + n2 + " = " + calculate;
		
					
			return result;
		}
		
		//나누기
		public static String divide(int n1, int n2) {
			//String.format 사용 방법
			//double calculate = (double)n1 / n2;
			//String result = String.format("%d / %d = %.1f", n1, n2, calculate);
			
			double calculate = (double)n1 / n2;
			String result = n1 + " / " + n2 + " = " + calculate;
				
			return result;
		}
		
		//나머지
		public static String mod(int n1, int n2) {
			
			int calculate =  n1 % n2;
			
			String result = n1 + " % " + n2 + " = " + calculate;
		
					
			return result;
		}
		

		
}//Q05 Class

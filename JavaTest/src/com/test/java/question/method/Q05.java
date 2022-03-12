package com.test.java.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws Exception{

		/*요구사항] 숫자를 2개 입력받아 연산식을 반환하는 메소드를 선언하시오.
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
		
		int result;
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

		public static int add(int n1, int n2) {
			
			return n1 + n2;
		}
		
		public static int subtract(int n1, int n2) {
			
			return n1 - n2;
		}

		public static int multiply(int n1, int n2) {
	
			return n1 * n2;
		}

		public static double divide(int n1, int n2) {
	
			return n1 / n2;
		}

		public static int mod(int n1, int n2) {
	
			return n1 + n2;
		}
}

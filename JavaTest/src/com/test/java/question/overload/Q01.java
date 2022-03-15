package com.test.java.question.overload;

public class Q01 {

	public static void main(String[] args) {

		/*
		요구사항] 인자로 받은 숫자들의 합을 구하는 메소드를 선언하시오.

		   조건] void sum(int)
				void sum(int, int)
				void sum(int, int, int)
				void sum(int, int, int, int)
				void sum(int, int, int, int, int)
				
		   호출] sum(10);
				sum(10, 20);
				sum(10, 20, 30);
				sum(10, 20, 30, 40);
				sum(10, 20, 30, 40, 50);
				
		   출력] 10 = 10
				10 + 20 = 30
				10 + 20 + 30 = 60
				10 + 20 + 30 + 40 = 100
				10 + 20 + 30 + 40 + 50 = 150
				
		   설계] 1. 메소드 오버라디딩을 이용해 인자가 다른 sum메소드를 생성
		   		2. 메소드를 호출하면 인자 수에 따라 알맞은 메소드가 호출된다.
	 */
		
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);
		sum(10, 20, 30, 40, 50);
		
		
		
	}//main

	
	public static void sum(int num) {
		
		System.out.printf("%d = %d\n", num, num);
		
	}
	
	public static void sum(int num, int num2) {
		
		int result = num + num2;
		
		System.out.printf("%d + %d = %d\n", num, num2, result);
		
	}
	
	public static void sum(int num, int num2, int num3) {
		
		int result = num + num2 + num3;
		
		System.out.printf("%d + %d + %d = %d\n", num, num2, num3, result);
		
	}
	
	public static void sum(int num, int num2, int num3, int num4) {
		
		int result = num + num2 + num3 + num4;
		
		System.out.printf("%d + %d + %d + %d = %d\n", num, num2, num3, num4, result);
		
	}
	
	public static void sum(int num, int num2, int num3, int num4, int num5) {
		
		int result = num + num2 + num3 + num4 + num5;
		
		System.out.printf("%d + %d + %d + %d + %d = %d\n", num, num2, num3, num4, num5, result);
		
	}
	
	
}

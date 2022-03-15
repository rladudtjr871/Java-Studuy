package com.test.java.question.overload;

public class Q03 {

	public static void main(String[] args) {

		/*
			요구사항] 인자로 받은 숫자들 중 양수의 갯수를 반환하는 메소드를 선언하시오.
		
			   조건] int positive(int)
					int positive(int, int)
					int positive(int, int, int)
					int positive(int, int, int, int)
					int positive(int, int, int, int, int)
					
			   호출] count = positive(10);
					count = positive(10, 20);
					count = positive(10, 20, -30);
					count = positive(10, 20, -30, 40);
					count = positive(10, 20, -30, 40, 50);
					
			   출력] 양수 : 1개
					양수 : 2개
					양수 : 2개
					양수 : 3개
					양수 : 4개
					
			   설계] 1.메소드 오버라디딩
			   		2.호출
			   		
		 */

		int count;
		
		count = positive(10);
		System.out.printf("양수 : %d개\n", count);
		
		count = positive(10, 20);
		System.out.printf("양수 : %d개\n", count);
		
		count = positive(10, 20, -30);
		System.out.printf("양수 : %d개\n", count);
		
		count = positive(10, 20, -30, 40);
		System.out.printf("양수 : %d개\n", count);

		count = positive(10, 20, -30, 40, 50);
		System.out.printf("양수 : %d개\n", count);
		
	}//main
	
	public static int positive(int num) {

		num = num > 0 ? 1 : 0;
		
		int result = num;
		
		return result;
		
	}
	
	public static int positive(int num, int num2) {
		
		num  = num > 0 ? 1 : 0;
		num2 = num2 > 0 ? 1 : 0; 
		
		int result = num + num2;
		
		return result;
		
	}
	
	public static int positive(int num, int num2, int num3) {
		
		num  = num > 0 ? 1 : 0;
		num2 = num2 > 0 ? 1 : 0; 
		num3 = num3 > 0 ? 1 : 0;
		
		int result = num + num2 + num3; 
		
		return result;
		
	}
	
	public static int positive(int num, int num2, int num3, int num4) {
		
		num  = num > 0 ? 1 : 0;
		num2 = num2 > 0 ? 1 : 0; 
		num3 = num3 > 0 ? 1 : 0;
		num4 = num4 > 0 ? 1 : 0;
		
		int result = num + num2 + num3 + num4;
		
		return result;
		
	}
	
	public static int positive(int num, int num2, int num3, int num4, int num5) {
		
		num  = num > 0 ? 1 : 0;
		num2 = num2 > 0 ? 1 : 0; 
		num3 = num3 > 0 ? 1 : 0;
		num4 = num4 > 0 ? 1 : 0;
		num5 = num5 > 0 ? 1 : 0;
		
		int result = num + num2 + num3 + num4 + num5;
		//int count = 0;
		//count += num > 0 ? 1 : 0;
		//이렇게 하는게 더 효과적인 것 같다
		
		return result;
		
	}

}

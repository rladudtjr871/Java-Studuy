package com.test.java.question.method;

public class Q04 {

	public static void main(String[] args) {
		//요구사항]  숫자 1개를 전달하면 4자리로 출력하는 메소드를 선언하시오.
		//	 조건]  - void difit(int num)
		//	       - 입력한 숫자가 4자리 이상이면 그대로 출력한다. 
		
		//설계
		//1. int형 가인자를 가진 digit메소드를 생성한다.
		//2. 4자리수로 출력하고 빈자리를 0으로 채우도록 한다.
		//3. 실인자를 넣어 메소드호출
	
		digit(1);
		digit(12);
		digit(321);
		digit(5678);
		digit(98765);
		
		
	}//main
	
		public static void digit(int num) {
		
			System.out.printf("%d -> %04d\n", num, num);
		
	}
	
}//Q04 class

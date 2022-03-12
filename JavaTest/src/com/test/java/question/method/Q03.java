package com.test.java.question.method;

public class Q03 {
	public static void main(String[] args) {
	
		//요구사항] 이름을 전달하면 이름뒤에 '님'을 붙여서 반환하는 메소드를 선언하시오.
		//조건) String getName(String name)
		//		-name: (이름)
		//		-return: (이름)님
		
		//출력
		//고객: 홍길동님
		//고객: 아무개님
		
		//설계
		//1. 고객:???을 출력함며 인자로 "이름"을 받는 메소드를 생성한다.
		//2. 메소드를 호출한다.
		
		String result;
		
		result = getName("홍길동");
		System.out.printf("고객: %s\n", result);

		result = getName("아무개");
		System.out.printf("고객: %s\n", result);
		
		
	}//main
	
	public static String getName(String name) {

		return name + "님";
		
	}
	
	
	
}//Q03 Class

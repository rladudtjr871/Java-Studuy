package com.test.java.question.method;

public class Q02 {

	public static void main(String[] args) {

		//요구사항] 인삿말을 출력하는 메소드 3개를 선언하시오.
		
		//설계
		//1.안녕하세요를 출력하는 hello()메소드를 만든다.
		//2.소개를 출력하는 introduce()메소드를 만든다.
		//3.작별 인사를 출력하는 bye()메소드를 만든다.
		
		
		//메소드 호출
		hello();
		introduce();
		bye();

		
	}//main
	
	
	//메소드  선언
	public static void hello() {
		System.out.println("안녕하세요.");
	}
	
	public static void introduce() {
		System.out.println("저는 홍길동입니다.");
	}

	public static void bye() {
		System.out.println("안녕하세요.");
	}
	
}//Q02 class

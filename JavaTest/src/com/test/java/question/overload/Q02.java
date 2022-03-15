package com.test.java.question.overload;

public class Q02 {

	public static void main(String[] args) {
		/*
		 	
		 	요구사항] 인자로 받은 이름들을 직급 순으로 출력하는 메소드를 선언하시오.
			   조건] 사원 → 대리 → 과장 → 부장
					void position(String)
					void position(String, String)
					void position(String, String, String)
					void position(String, String, String, String)
					
			   호출] position("홍길동");
					position("홍길동", "유재석");
					position("홍길동", "유재석", "박명수");
					position("홍길동", "유재석", "박명수", "정형돈");
					
			   출력] 사원 : 홍길동
         
					사원 : 홍길동
					대리 : 유재석

					사원 : 홍길동
					대리 : 유재석
					과장 : 박명수
			
					사원 : 홍길동
					대리 : 유재석
					과장 : 박명수
					부장 : 정형돈
		 		
		 	   설계] 1. 메소드 오버라이딩을 이용해 메소드 생성
		 		    2. 메소드 호출 
		 	
		 */
		
		position("홍길동");
		position("홍길동", "유재석");
		position("홍길동", "유재석", "박명수");
		position("홍길동", "유재석", "박명수", "정형돈");

	}//main

	
	public static void position(String staff){
		
		System.out.printf("사원 : %s\n", staff);
		System.out.println();
		
	}
	
	public static void position(String staff, String assistManager){
		
		System.out.printf("사원 : %s\n대리 : %s\n", staff, assistManager);
		System.out.println();
		
	}
	public static void position(String staff, String assistManager, String manager){
		
		System.out.printf("사원 : %s\n대리 : %s\n과장 : %s\n", staff, assistManager, manager);
		System.out.println();
		
	}
	public static void position(String staff, String assistManager, String manager, String Director){
		
		System.out.printf("사원 : %s\n대리 : %s\n과장 : %s\n부장 : %s\n", staff, assistManager, manager, Director);
		System.out.println();
		
	}
	
	
	
}

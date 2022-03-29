package com.test.java.obj.stereo;

public class Ex51_enum {

	public static void main(String[] args) {

		
		/*
		  
		  클래스의 종류
		  1. 클래스
		  2. 인터페이스
		  3. 추상 클래스
		  4. enum
		
		
		  열거형, Enumeration
		  - 클래스의 일종
		
		*/
		
		
		//요구사항] 의류 쇼핑몰 > 티셔츠 > 고객 > 색상 선택(빨강, 노랑, 파랑)
		
		//Case 1. > 주관식(직접 입력)
		String color = "발강"; //오타 발생 가능!! > 오타시 런타임에러
		
		if (color.equals("빨강") || color.equals("노랑") || color.equals("파랑")) {
			System.out.println("판매 가능");
		} else {
			System.out.println("재고 없음");
		}
		
		System.out.println();
		
		
		//Case 2. > 객관식(주어진 것 중 선택)
		색상 c1 = 색상.빨강; //선택형!!! > 제약적 > 제공한 것들 중에만 선택해서 사용해라!!!
						  //오타 발생시 컴파일 오류
		
		색상 c2 = 색상.파랑; //열거형의 파랑이라는 데이터를 넣는다
		
		
		if (c1 == 색상.빨강 || c1 == 색상.노랑 || c1 == 색상.파랑) {
			System.out.println("판매 가능");
		} else {
			System.out.println("재고 없음");
		}
		
		
		
		
		int c3 = 색상2.노랑;
		
		if (c3 == 색상2.빨강 || c3 == 색상2.노랑 || c3 == 색상2.파랑) {
			System.out.println("판매 가능");
		} else {
			System.out.println("재고 없음");
		}
		

		
		
		직급 position = 직급.사원;
		
		Gender g1 = Gender.MALE;
		Gender g2 = Gender.FEMALE;
		
		
		
		
		
		
		
		
	}//main

}//Ex51



class 클래스명 {
	//구현 멤버
}

interface 인터페이스명 { 
	//추상 멤버
}

abstract class 추상클래스명 {
	//구현 멤버
	//추상 멤버
}

enum 열거형명 {
	//열거형 멤버
}



//열거형 선언하기
enum 색상 {	
	빨강, //final static 상수
	노랑,	 //보통 enum타입은 int로 잡힘..(중요x)
	파랑
}


class 색상2 {
	//열거형 만들어지는 방식
	final public static int 빨강 = 0;
	final public static int 노랑 = 1;
	final public static int 파랑 = 2;
}


enum 직급 {
	사원,
	대리,
	과장,
	부장
}


enum Gender {
	MALE, //final public static
	FEMALE
}




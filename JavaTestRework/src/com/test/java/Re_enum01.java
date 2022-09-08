package com.test.java;

public class Re_enum01 {

	public static void main(String[] args) {
		
/*
 
 	  	 클래스의 종류
		  1. 클래스
		  2. 인터페이스
		  3. 추상 클래스
		  4. enum
		
		
		  열거형, Enumeration
		  - 클래스의 일종
 
 
 		Case 1. > 주관식(직접 입력)
			String color = "발강"; //오타 발생!! > 오타시 런타임에러 > 오류 발견 어렵다.
			
		Case 2. > 객관식(주어진 것 중 선택)
			색상 c1 = 색상.빨강; //선택형!!! > 제약적 > 제공한 것들 중에만 선택해서 사용해라!!!
						  	  //오타 발생시 컴파일 오류 > 오류 발견이 쉽다.
			
			
			enum(열거형)의 장점
			 색상 뒤 (.)을 찍으면 선택 가능한 것들이 나오기 때문에
			  > 오타 발생을 없애고 오타가 생겨도 컴파일 오류로 표시해줌
 */
		

	}

}



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

//==========================================================


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
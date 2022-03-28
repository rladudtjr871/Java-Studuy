package com.test.java;

public class Ex29_String {

	public static void main(String[] args) {


		//1. 메모리의 공간은 한번 할당되면 더 이상 늘리거나 줄일 수 없다.
		//2. "문자열은 불변(Immutable)이다." > 한번 만들어진 문자열은 절대 수정할 수 없다.
		//3. 믄자열은 참조형이다.
		
		//자바 자료형
		//1. 값형
		//	- 값이 변경되어도 공간의 크기는 변화가 없다.
		//2. 참조형(배열, 문자열)
		//	- 값이 변경되면 공간의 크기가 변한다.
		
		
		//m1();
		m2();
		
		
		
	}//main

	
	
	
	
	private static void m2() {

		//String vs StringBuilder
		//- 문자열
		
		String s1 = "홍길동"; //문자열 리터럴 사용("")
		String s3 = new String ("홍길동"); //문자열의 원래 모습
		StringBuilder s2 = new StringBuilder("홍길동"); //참조형의 기본코드
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		
		
		
		//StringBuilder > 기존의 String보다 좋은 장점 > 수정 작업에 강하다!!!
		
		//일반적인 문자열 > String 사용
		//하드한 수정 작업 > StrignBuilder 사용
		
		//String 사용
		long begin = System.nanoTime();
		
		String txt1 = "홍길동";
		
		for (int i=0; i<100000; i++) {
			txt1 = txt1 + "."; 	//수정작업
		}
		
		long end = System.nanoTime();
		
		System.out.println(txt1.length());
		System.out.println(end - begin + "ns"); //5.7s
		
		//==============================================================
		
		//StringBuilder 사용
		begin = System.nanoTime();
		
		StringBuilder txt2 = new StringBuilder("홍길동");
		
		for (int i=0; i<100000; i++) {
			//txt1 = txt1 + "."; //같은 행동
			txt2.append(".");  //가비지(Garbage) 발생 안함
			
		}
		
		end = System.nanoTime();
		
		System.out.println(txt2.length());
		System.out.println(end-begin+"ns"); //0.00426초
		
	}//m2

	
	


	private static void m1() {
		
		//*** 모든 값형은 어떤 데이터를 넣더라도 공간의 크기가 불변이다!!!
		
		int n1 = 10; //4byte
		int n2 = 20; //4byte
		
		n1 = 1000000000; //4byte
		
		
		String s1 = "홍길동"; //6byte
		String s2 = "아무개"; //6byte

		
		System.out.println(s1); //100번지
		
		s1 = "홍길동안녕하세요"; //16byte
		
		System.out.println(s1); //300번지
		//"문자열은 불변이다"라는 말은 이런걸 말하는 것이다.
		
		//코드상의 모든 문자열 리터럴은 메모리(힙)에 새로 생성된다.
		s1 = "참";//참 > 리터럴
		
		System.out.println(s1);
		
		
		
		//자료형 > int
		int a = 10;			//4byte
		int b = 20;			//4byte
		int c = 10000000;	//4byte
		
		
		//자료형 > int[]
		int[] alist = new int[3];	 //12byte
		int[] alist2 = new int[5];	 //20byte
		int[] alist3 = new int[10];	 //40byte
		
		
		//자료형 > String
		String t1 = "홍길동"; 	  //6byte
		String t2 = "홍";		  //2byte
		String t3 = "홍길동입니다."; //14byte
		
		
		
		String txt = "홍길동";
		
		txt = "아무개";
		
		
		//같은 지역에 한해서 (같은 메소드 내에서만), 값이 아예 같으면 주소를 공유
		String m1 = "홍길동";
		String m2 = "홍길동";
		String m3 = "홍길동";
		
		String w1 = "홍길동입니다. 안녕하세요. 저는 자바를 배우는 학생입니다.홍길동입니다. 안녕하세요. 저는 자바를 배우는 학생입니다.홍길동입니다. 안녕하세요. 저는 자바를 배우는 학생입니다.";
		String w2 = "홍길동입니다. 안녕하세요. 저는 자바를 배우는 학생입니다.홍길동입니다. 안녕하세요. 저는 자바를 배우는 학생입니다.홍길동입니다. 안녕하세요. 저는 자바를 배우는 학생입니다.";
		String w3 = "홍길동입니다. 안녕하세요. 저는 자바를 배우는 학생입니다.홍길동입니다. 안녕하세요. 저는 자바를 배우는 학생입니다.홍길동입니다. 안녕하세요. 저는 자바를 배우는 학생입니다.";
		
		
		
		//문자열은 불변이다.
		String z1 = "홍길동";
		String z2 = "홍길동";
		
		z1 = "홍길남";
		
		
		
		
		//문자열을 대상하는 피해야 하는 행동 > 상황 파악을 해줘야함
		//1. 문자열의 잦은 수정
		//2. 큰 문자열의 수정
		
		String txt1 = "홍길동";
		
		for (int i=0; i<100; i++) {
			txt1 = txt1 + "님"; //누적 > 수정 > 100번
		}
		
		System.out.println(txt1);
		System.out.println(txt1.length());
		
		
		txt1 = "홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다";
		
		txt1 = txt1 + "."; // x > 작업이 무겂다.
	}//m1

	
	
}
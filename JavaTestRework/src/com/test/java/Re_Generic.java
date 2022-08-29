package com.test.java;

public class Re_Generic {

	public static void main(String[] args) {

/*
   			[SUMMARY] Generic 만들기
   
   
   		*** 값형을 사용할 수 없다. > 반드시 참조형(클래스)만 가능
   		- int -> Integer
   		
   		Item<String> i2 = new Item<String>();  //Generic 사용 방법
		i2.c = "문자열";
   
   
   
   
   
   
    int a = 10; > 데이터를 담는 공간
	T = int	  > 데이터를 담는 공간
	T = String
	T = Boolean




	제네릭 클래스
	- T : 타입 변수 > 자료형을 저장하는 변수
	- <> : 인자 리스트 역할
	class Item<T,U> {
	
		public T a;
		public U b; //클래스 설계 당시에는 c의 자료형이 결정되지 않음 
						> 나중에 결정 > 객체를 생성할 때
					//c의 자료형은 컴파일 때가 아닌 런타임임 때 결정된다.
	
		
		public Item(T a, U b) {
			this.a = a;
			this.b = b;
		}
		
		
		
		public void test(T a, U b) { //메소드 매개변수의 자료형
		
		T b; //지역변수 > 비권장..
		
		}
	
	
		public T get() { //메소드 반환타입
		
			return this.a;
		}
	
	
	
}
   
 */

	}

}

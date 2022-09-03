package com.test.java;


public class Re_final {

	public static void main(String[] args) {

/*
 
 		   final 키워드
		   - 한번 결정하면 바꿀 수 없다.
		   
		   1. 변수 적용(지역변수 + 멤버 변수) *****
		   	   - 초기화한 이후에 값을 변경할 수 없다.
		   	   - 상수
		   	   	      - 상수는 되도록 선언과 동시에 초기화를 한다.(권장)
		   	   	      - 상수명은 모두 대문자로 작성한다(명명법) ***** 
		   	   - const int num = 10;
		   
		   2. 메소드 적용
		   		- 상속 시 재정의(Override)를 할 수 없다.(막을 수 있다.)
		   		
		   3. 클래스 적용
		   		- 상속이 불가능하다.
		   
 
 
 		//Member m1 = new Member();
		//System.out.println(m1.a); 		//10
		//System.out.println(Member.b);   //20
		
		-위에 m1객체 생성 전에 Member.b 출력이 가능(static)
		System.out.println(Member.b); //static 생성자 확인 > static은 객체 생성 전에 이미 만들어진다.
 
 	
 	
 		번외) 멤버 변수 (멤버변수 초기화는 생성자에서 해주는 습관을 들여라)
 		
 		
 		
 		생성자 > 정적 생성자 > 정적 멤버만을 초기화하는 역할
		static {
			//Cannot use this in a static context
			//this.a = 10;
			Member.b = 20;
		
		}
 
 	
 		
 		
 		부모 클래스 설계시..
		- 상속 받는 자식이 이 메소드만큼은 고치지 않았으면.. 하는 경우가 있다.
		- 프로그램의 안정성 문제
		- 터미널 클래스
		- Leaf Node
		final class FinalUser {
			
		}
		
		
 */
		
		

	}

}

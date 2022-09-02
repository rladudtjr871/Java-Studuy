package com.test.java;

public class Re_Casting01 {

	public static void main(String[] args) {
		

		/*
		   
		   [SUMMARY] 업캐스팅 다운캐스팅 만들기
		   
		   참조형 형변환
		   - 상속관계의 클래스 간의 형변환 > 직계끼리만 가능(방계는 불가능)
		   - A클래스 > B클래스
		   
		   
		   1. 업캐스팅, Up Casting
		   		- 암시적인 형변환
		   		- 자식 클래스 -> 부모 클래스
		   		- 100% 가능
		   		
		   2. 다운캐스팅, Down Casting
		   		- 명시적인 형변환
		   		- 부모 클래스 -> 자식 클래스
		   		- 100% 불가능(근본)
		   		- 가능 내부조작
		   
		   
		   
		   Parent 의 변수(a, b)
		   Child 의 변수(a, b, c, d)
		   
			Parent p2;
			Child c2;
			
			c2 = new Child();
			
			복사
			Parent = Child
			암시적인 형변환
			부모클래스 = 자식클래스
			업캐스팅(***)
			100% 가능 > 아주 안전한 형변환
			p2 = c2;
			p2 = (Parent)c2; //원형
			
			
			복사 + 형변환 > 제대로 완료 검증? > 복사된 참조변수 > 모든 멤버 접근 테스트
			p2.a = 10;
			p2.b = 20;
			
			System.out.println(p2.a);
			System.out.println(p2.b);
			안 보이는 c와 d는 중요하지 않다.
			
			------------------------------------------------------------
			
			Parent p3;
			Child c3;
			
			p3 = new Parent();
			
			Child = Parent
			명시적인 형변환
			자식클래스 = 부모클래스
			다운 캐스팅
			c3 = (Child)p3; //원인 > 이 원인을 아예 불가능한 작업으로 취급하자 > 결론!!!
			
			검증 > 복사본이 사용에 문제가 없는지?
			c3.a = 10; //O
			c3.b = 20; //O
			c3.c = 30; //X
			c3.d = 40; //X
			
			class Parent cannot be cast to class Child
			System.out.println(c3.a);
			System.out.println(c3.b);
			System.out.println(c3.c);
			System.out.println(c3.d);
		   		
		 */
	}

}

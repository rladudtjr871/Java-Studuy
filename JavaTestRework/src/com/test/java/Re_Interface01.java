package com.test.java;


public class Re_Interface01 {

	public static void main(String[] args) {

/*
   	
   			[SUMMARY] Interface(인터페이스) 만들기
   
   
   			1. 인터페이스는 자료형이다 (모든 자료형들은 변수를 만들 수 있다.)
			2. 인터페이스는 객체를 만들 수 없다. > 추상 멤버(추상 메소드)를 가지고 있기 때문에
		   		> 추상 멤버를 가지고 있기 때문에 실체화 할 수 없다.(*****)
		
		
			Mouse m1 = new Mouse();  // X
			m1.test(); //이것때문에 만들 수 없다.(******) > body가 없다.
   
   
   			서로 비슷한 부류의 객체들의 사용법을 물리적으로 통일시키는 방법 > 인터페이스

			인터페이스 == 제품의 규격 역할
			
			
		   	다중 상속
		   	- 자바에서는 다중 상속을 지원하지 않는다.  > 어렵다(복잡..)
		   	- 자바에서는 인터페이스에 한해서 다중 상속을 지원한다. > 매우 활발하게 사용중..
   
   
XXX 여기부터 밑에 중요 
인터페이스 선언
interface Mouse {
		
		인터페이스 멤버
		- 추상 메소드를 멤버로 가진다 (*****)
		- 멤버 변수는 가질 수 없다.
		- 멤버 메소드는 가질 수 없다.
		
		
	 	추상 메소드 선언(인터페이스 멤버)
		void test(); //추상메소드는 body가 없다. {}가 없다.
		void click();  
   
}   


//인터페이스를 자식 클래스에 구현
class G304 implements Mouse {


 	*** 인터페이스는 자식 클래스에 강제로(***) 어떤 메소드를 만들도록 한다.
 	
	@Override
	public void click() {
		????
	}
	
	@Override
	public void test() {
		????
	}
}



//인터페이스 다중 상속
class 테스트 implements 아빠, 과장, 남자, 카페사장{
  	????(구현부)
}


 */

	


	}

}

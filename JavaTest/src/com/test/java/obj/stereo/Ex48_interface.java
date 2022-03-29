package com.test.java.obj.stereo;

public class Ex48_interface {

	public static void main(String[] args) {


		/*
		 
		   Stereo Type
		   - 추상적인 자료형
		   - 인터페이스, 추상클래스 > 클래스의 일종
		   
		   
		   인터페이스, interface
		   
		 		 
		 */
		
		//사용자에게는 둘 다 마우스 > 같은 범주 객체 > 비슷할거라는 기대치..
		
		G304 m1 = new G304();
		m1.click();
		m1.click();
		m1.click();
		
		
		//새 마우스
		G102 m2 = new G102();
//		m2.down(); //기대치 불만족
//		m2.down();
//		m2.down();
		m2.click();
		m2.click();
		m2.click();
		
		
		
		//1. 인터페이스는 자료형이다 (모든 자료형들은 변수를 만들 수 있다.)
		//2. 인터페이스는 객체를 만들 수 없다. > 추상 멤버(추상 메소드)를 가지고 있기 때문에
		//    > 추상 멤버를 가지고 있기 때문에 실체화 할 수 없다.(*****)
		
		
		//Mouse m1 = new Mouse();  // X
		//m1.test(); //이것때문에 만들 수 없다. (******)
		
		
		
		

	}//main

}//Ex48



//서로 비슷한 부류의 객체들의 사용법을 물리적으로 통일시키는 방법 > 인터페이스

//인터페이스 == 제품의 규격 역할


//인터페이스 선언
interface Mouse {
	
	//인터페이스 멤버
	//- 추상 메소드를 멤버로 가진다 (*****)
	//- 멤버 변수는 가질 수 없다.
	//- 멤버 메소드는 가질 수 없다.
	
//	private String name; //Illegal modifier for the interface field Mouse.name; only public, static & final are permitted
//	public String name;  //변수 선언 불가
	
	//Abstract methods do not specify a body
//	public void test() {
//		
//	}
	
	//추상 메소드 선언(인터페이스 멤버)
	void test(); //추상메소드는 public을 안 써도 된다. 언제나 public이라서
				 //추상메소드는 body가 없다. {}가 없다.
	
	void click();
	
}

//클래스 선언

//The type G304 must implement the inherited abstract method Mouse.test()
class G304 implements Mouse {
	
	
	
	//클래스 멤버 선언
	private String type;
	private String color;
	private int dpi;
	
	@Override
	public void click() {
		System.out.println("클릭했다!!!");
	}
	
	
	//*** 인터페이스는 자식 클래스에 강제로(***) 어떤 메소드를 만들도록 한다.
	@Override
	public void test() {
		//내맘대로~
	}
	
}

class G102 implements Mouse{
	private String color;
	private int price;
	private int buttons;
	
	
	public void click() {
		System.out.println("클릭했슴둥~~");
	}
	
	@Override
	public void test() {
		
		
	}
	
}





class AAA{
	private BBB b;
	private int num;
	private CCC[] list = new CCC[5];
}


class BBB {
	
}

class CCC{
	
}

class DDD{
	public void test() {
		EEE e = new EEE();
		
	}
}

class EEE {
	
}







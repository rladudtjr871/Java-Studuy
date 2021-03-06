package com.test.java.obj.stereo;

public class Ex52_Generic {

	public static void main(String[] args) {


		/*
		  
		  클래스의 종류
		  1. 클래스
		  2. 인터페이스
		  3. 추상 클래스
		  4. enum
		  5. 제네릭 클래스
		  
		  
		  제네릭, Generic
		  1. 제네릭 클래스 > O
		  2. 제네릭 메소드
		  
		  
		*/
		
		
		//요구사항] 클래스 설계
		//1. 멤버 변수 선언 > int
		//2. 멤버 변수를 중심으로 여러가지 행동을 하는 메소드 선언
		
		//추가사항] String을 중심으로 하는 클래스를 추가 설계
		//추가사항] boolean을 중심으로 하는 클래스를 추가 설계
		//추가사항] double
		//추가사항] byte
		//추가사항] Calendar
		//추가사항] 무한대...
		
		
		//위의 문제점 > 해결방안
		//1. Object 클래스 > 오래된 방식(나쁜의미x)
		//2. 제네릭 클래스 > 최신 방식
		
		
		WrapperInt n1 = new WrapperInt(10);
		System.out.println(n1.toString());
		System.out.println(n1.getData() * 2);
		System.out.println();
		
		
		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1.toString());
		System.out.println(s1.getData().length());
		System.out.println();

		
		
		WrapperBoolean b1 = new WrapperBoolean(false);
		System.out.println(b1.toString());
		System.out.println(b1.getData() ? "참" : "거짓");
		System.out.println();
		
		
	}//main

}//Ex52




class WrapperInt {
	
	private int data; //클래스의 중심이 되는 데이터!!!
	
	public WrapperInt(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "data=" + data;
	}
	
		
}



class WrapperString {
	
	private String data; //클래스의 중심이 되는 데이터!!!
	
	public WrapperString(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "data=" + data;
	}
	
		
}


class WrapperBoolean {
	
	private boolean data; //클래스의 중심이 되는 데이터!!!
	
	public WrapperBoolean(boolean data) {
		this.data = data;
	}

	public boolean getData() {
		return data;
	}

	public void setData(boolean data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "data=" + data;
	}
	
		
}







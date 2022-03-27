package com.test.java.obj.constructor;

public class Ex37_Costructor {

	public static void main(String[] args) {

		
		//공산품 > 일괄적 초기화 > model(M705), price(40000)
		Mouse m1 = new Mouse();
		
		Mouse m2 = new Mouse();
		m2.setPrice(35000);
		
		Mouse m3 = new Mouse();
		m3.setPrice(35000);
		
		//객체의 초기 상태 > 상황에 따라 달라질 수 있다. > 생성자의 매개변수 사용 > 다양성
		Mouse m4 = new Mouse(35000); //모델명 기본값(M705) + 가격 지정
		
		//QC불량 > discount > 35000
		
		Mouse m5 = new Mouse("A100"); //모델명 지정 + 가격 기본 값
		
		Mouse m6 = new Mouse("B123", 30000); //모델명 지정 + 가격 지정
		
		System.out.println(m1.getModel() + ", " + m1.getPrice());
		System.out.println(m2.getModel() + ", " + m2.getPrice());
		System.out.println(m3.getModel() + ", " + m3.getPrice());
		System.out.println(m4.getModel() + ", " + m4.getPrice());
		System.out.println(m5.getModel() + ", " + m5.getPrice());
		System.out.println(m6.getModel() + ", " + m6.getPrice());
		
		
		//setter와 생성자 사용의 차이
		//setter는 Null 값인 상태에서 set메소드로 값을 넣어줘야한다.(기본값이 Null)
		//생성자는 기본 값을 지정할 수 있다. 생성자 오버로딩을 통해 초기 상태를 바꿀 수 있다.(기본값이 있다.)
		
		
	}//main

}//Constructor



class Mouse {
	
	private String model;
	private int price;
	
	public Mouse() {
		this.model = "M705";
		this.price = 40000;
	}
	
	public Mouse(String model) {
		this.model = model;
		this.price = 40000;
	}
	
	public Mouse(int price) {
		this.model = "M705";
		this.price = price;
	}
	
	public Mouse(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}

package com.test.java.obj.staticmember;

public class Ex40_static {

	public static void main(String[] args) {

		
		
		//요구사항]
		//1. 펜을 생산하시오.
		//2. 생산된 펜의 개수를 세시오.
		
		
		//Case 1.
		//- Pen과 count 간의 관계가 약함. > 가독성 낮음(count라는 이름이 Pen하고 아무 상관없음)
		//- 오차 발생(count++ 누락시)
//		int count = 0;
//		
//		Pen p1 = new Pen("Monami", "Black");
//		count++;
//		
//		Pen p2 = new Pen("Monami", "Black");
//		count++;
//		
//		Pen p3 = new Pen("Monami", "Black");
//		count++;
//		
//		System.out.println("볼펜 개수: " + count);
		
		
		
		/*
		//Case 2.
		//- count변수와 Pen의 관계를 강하게 연결 > 결합
		Pen p1 = new Pen("Monami", "Black");
		p1.count++;

		Pen p2 = new Pen("Monami", "Black");
		//p2.count++;
		p1.count++;
		
		Pen p3 = new Pen("Monami", "Black");
		//p3.count++;
		p1.count++;
		
		//p1이라는 한낱 객체(개인)가 모든 펜들의개수를 세는 공통적인 값을 대표로 저장할만한 이유가 없다;;
		System.out.println("볼펜 개수: " + p1.count);
		System.out.println("볼펜 개수: " + p2.count);
		System.out.println("볼펜 개수: " + p3.count);
		*/
		
		
		
		//Case 3.
		//- Pen과 count 변수의 관계가 명확
		//- 소재 분명 > 여러 곳x > 유일! > 변수 딱 1개!!!
//		Pen p1 = new Pen("Monami", "Black");
//		Pen.count++;
//		
//		Pen p2 = new Pen("Monami", "Black");
//		Pen.count++;
//		
//		Pen p3 = new Pen("Monami", "Black");
//		Pen.count++;
//		
//		
//		System.out.println("볼펜 개수: " + Pen.count);
		
		
		
		
		//Case 4.
		//- 현재 예시에서는 가장 이상적인 방법
		//- count++ 누락 방지
		Pen p1 = new Pen("Monami", "Black");
		Pen p2 = new Pen("Monami", "Black");
		Pen p3 = new Pen("Monami", "Black");
		
		System.out.println("볼펜 개수: " + Pen.count);

		
		
		
		
		
		
		
		
	}//main

}//Ex40




//class Pen {
//	
//	private String model;
//	private String color;
//	public int count = 0; //이 예제에서만 get/set을 안 쓰려고 public 사용(설명상)
//	
//	public Pen(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
//	
//	public String dump() {
//		return String.format("{ model: %s, color: %s }"
//				, this.model
//				, this.color);
//	}
//	
//}




//class Pen {
//	
//	private String model;
//	private String color;
//	public static int count = 0; //공용 데이터
//	
//	public Pen(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
//	
//	public String dump() {
//		return String.format("{ model: %s, color: %s }"
//				, this.model
//				, this.color);
//	}
//	
//}


class Pen {
	
	private String model;
	private String color;
	public static int count = 0; //공용 데이터
	
	public Pen(String model, String color) {
		this.model = model;
		this.color = color;
		Pen.count++;
	}
	
	public String dump() {
		return String.format("{ model: %s, color: %s }"
				, this.model
				, this.color);
	}
	
}











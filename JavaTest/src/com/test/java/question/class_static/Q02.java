package com.test.java.question.class_static;

public class Q02 {

	public static void main(String[] args) {

		
		
		//바리스타
		Barista barista = new Barista();

		//손님 1
		//에스프레소 1잔 주문 - 원두 30g
		Espresso e1 = barista.makeEspresso(30);
		e1.drink();
		//System.out.println();
		
		//손님 2
		//라테 1잔 주문 - 원두 30g, 우유 250ml
		Latte l1 = barista.makeLatte(30, 250);
		l1.drink();
		//System.out.println();
		
		//손님 3
		//아메리카노 1잔 주문 - 원두 30g, 물 300ml, 각얼음 20개
		Americano a1 = barista.makeAmericano(30, 300, 20);
		a1.drink();
		System.out.println();

		//손님 4
		//에스프레소 10잔 주문 - 원두 25g
		Espresso[] e2 = barista.makeEspressoes(25, 10);

		for (Espresso e : e2) {
		      e.drink();
		}
		System.out.println();
		
		//손님 5
		//라테 5잔 주문 - 원두 25g, 우유 300ml
		Latte[] l2 = barista.makeLattes(25, 300, 5);

		for (Latte l : l2) {
		      l.drink();
		}
		System.out.println();
		
		//손님 6
		//아메리카노 15잔 주문 - 원두 20g, 물 350ml, 각얼음 30개
		Americano[] a2 = barista.makeAmericanos(20, 350, 30, 15);

		for (Americano a : a2) {
		      a.drink();
		}
		
		System.out.println();
		
		//결산
		barista.result();
		

	}//main

}//Q02




class Barista {
	
	
	
	public Espresso makeEspresso(int bean) {
		//에스프레소 1잔을 만든다.
		//int bean : 원두량(g)
		//return Espreeso : 에스프레소 1잔	
		
		Espresso e1 = new Espresso(bean);
		
		
		
		
		return e1;
		
	}
	
	public Espresso[] makeEspressoes(int bean, int count) { //25,10
		//에스프레소 N잔을 만든다.
		//int bean : 원두량(g)
		//int count : 음료 개수(잔)
		//return Espresso[] : 에스프레소 N잔
		
		
		Espresso[] espressoArr = new Espresso[count];
		
		
		
		for (int i=0; i<espressoArr.length; i++) {
			
			espressoArr[i] = new Espresso(bean);
			
			//Coffee.bean += bean;
		}
		
		return espressoArr;
	}
	
	
	public Latte makeLatte(int bean, int milk) {
		//라테 1잔을 만든다.
		//int baen : 원두량(g)
		//int milk : 우유량(ml)
		//return Latte : 라테 1잔
		
		Latte l1 = new Latte(bean, milk);
		
//		Coffee.bean += bean;
//		Coffee.milk += milk;
		
		return l1;
		
	}
	
	public Latte[] makeLattes(int bean, int milk, int count) {
		//라테 N잔을 만든다.
		//int baen : 원두량(g)
		//int milk : 우유량(ml)
		//int count : 음료 개수(잔)
		//return Latte[] : 라테 N잔
		
		Latte[] latteArr = new Latte[count];
		
		for (int i=0; i<latteArr.length; i++) {
			
			latteArr[i] = new Latte(bean, milk);
			
//			Coffee.bean += bean;
//			Coffee.milk += milk;
			
		}
		
		return latteArr;
		
	}
	
	public Americano makeAmericano(int bean, double water, int ice) {
		//아메리카노 1잔을 만든다.
		//int baen : 원두량(g)
		//int water : 물량(ml)
		//int ice : 얼음 개수(개)
		//return Americano : 아메리카노 1잔
		
		Americano a1 = new Americano(bean, water, ice);
		
//		Coffee.bean += bean;
//		Coffee.water += water;
//		Coffee.ice += ice;
		
		return a1;
		
	
	}
	
	public Americano[] makeAmericanos(int bean, int water, int ice, int count) {
		//아메리카노 N잔을 만든다.
		//int baen : 원두량(g)
		//int water : 물량(ml)
		//int ice : 얼음 개수(개)
		//int count : 음료 개수(잔)
		//return Americano[] : 아메리카노 N잔
		
		Americano[] americanoArr = new Americano[count];
		
		for (int i=0; i<americanoArr.length; i++) {
			
			americanoArr[i] = new Americano(bean, water, ice);
			
//			Coffee.bean += bean;
//			Coffee.water += water;
//			Coffee.ice += ice;
			
		}
		
		return americanoArr;
	}
	
	
	public void result() {
		//판매 결과를 출력한다.
		//음료 판매량(에스프레소 판매 개수, 라테 판매 개수, 아메리카노 판매 개수)
		//원자재 소비량(원두 소비량, 물 소비량, 우유 소비량, 얼음 소비량)
		//매출액(원두 판매액, 물 판매액, 우유 판매액, 얼음 판매액)
		
		System.out.println("=================================");
		System.out.println("판매결과");
		System.out.println("=================================");
		System.out.println();
		
		System.out.println("---------------------------------");
		System.out.println("음료 판매량");
		System.out.println("---------------------------------");
		System.out.println("에스프레소: " + Coffee.espresso + "잔");
		System.out.println("아메리카노: " + Coffee.americano + "잔");
		System.out.println("라떼: " + Coffee.latte + "잔");
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("원자재 소비량");
		System.out.println("---------------------------------");
		System.out.printf("원두: %,dg\n", Coffee.bean);
		System.out.printf("물: %,dg\n", (int)Coffee.water);
		System.out.printf("얼음: %,dg\n", Coffee.ice);
		System.out.printf("우유: %,dg\n", Coffee.milk);
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("매출액");
		System.out.println("---------------------------------");
		System.out.printf("원두: %,d원\n", Coffee.bean * 1);
		System.out.printf("물: %,d원\n", (int)(Coffee.water * 0.2 / 1));
		System.out.printf("얼음: %,d원\n", Coffee.ice * 3);
		System.out.printf("우유: %,d원\n", Coffee.milk * 4);
		
		
	}
	
}//Barista



class Coffee {
	//공용 데이터
	public static int bean; //총 원두량g
	public static double water; //총 물 용량ml
	public static int ice; //총 얼음 개수
	public static int milk; //총 우유 용량ml
	public static int beanUnitPrice = 1; //원두 단가 1g/1원
	public static double waterUnitPrice = 0.2; //물 단가 1ml/0.2원
	public static int iceUnitPrice = 3; //얼음 단가 1개/3원
	public static int milkUnitPrice = 4; //우유 단가 1ml/4원
	public static int beanTotalPrice = 0; //원두 총 판매액
	public static int waterTotalPrice = 0; //물 총 판매액
	public static int iceTotalPrice = 0; //얼음 총 판매액
	public static int milkTotalPrice = 0; //우유 총 판매액
	public static int americano = 0; //아메리카노 총 판매 개수(잔)
	public static int latte = 0; //라떼 총 판매 개수(잔)
	public static int espresso = 0; //에스프레소 총 판매 개수(잔)
	
}

class Espresso {
	private int bean;
	
//	public Espresso() {
//		this.bean = Coffee.bean;
//	}
	
	public Espresso(int bean) {
		this.bean = bean;
	}

	public void drink() {
		//커피를 마신다.(출력)
		//this.bean = Coffee.bean;
		System.out.printf("원두 %sg으로 만들어진 에스프레소를 마십니다.\n", this.bean);
		//System.out.printf("%d", Coffee.bean);
		Coffee.bean += bean;
		Coffee.espresso++;
	}
	
}

class Latte {
	private int bean;
	private int milk;
	//private int cnt = 0;
	public Latte (int bean, int milk) {
		this.bean = bean;
		this.milk = milk;
		
	}
	
	public void drink() {
		System.out.printf("원두 %sg, 우유 %dml로 만들어진 라떼를 마십니다.\n", this.bean, this.milk);
		//System.out.printf("%d", Coffee.bean);
		Coffee.bean += bean;
		Coffee.milk += milk;
		Coffee.latte++;
	}

}

class Americano {
	private int bean;
	private double water;
	private int ice;
	
	public Americano(int bean, double water, int ice) {
		this.bean = bean;
		this.water = water;
		this.ice = ice;
	}
	
	public void drink() {
		System.out.printf("원두 %sg, 물 %,dml, 얼음 %d개로 만들어진 아메리카노를 마십니다.\n", this.bean, (int)this.water, this.ice);
		Coffee.bean += bean;
		Coffee.water += water;
		Coffee.ice += ice;
		Coffee.americano++;
	}
}














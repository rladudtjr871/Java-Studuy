package com.test.java.question.class_access;

import java.util.Calendar;

public class Q03 {

	public static void main(String[] args) {


		Bugles snack = new Bugles();

		snack.setWeight(500);
		snack.setCreationTime("2022-3-21");
		System.out.println("가격 : " + snack.getPrice() + "원");
		System.out.println("유통 기한이 " + snack.getExpiration() + "일 남았습니다.");

		snack.eat();


		Bugles snack2 = new Bugles();

		snack2.setWeight(300);
		snack2.setCreationTime("2022-3-12");
		System.out.println("가격 : " + snack2.getPrice() + "원");
		System.out.println("유통 기한이 " + snack2.getExpiration() + "일 남았습니다.");

		snack2.eat();

	}//main

}//Q03



class Bugles {
	
	private int price;
	private int weight;
	private Calendar creationTime;
	private int expiration;
	private int last;
	private long eat;
	
	public int getPrice() {
		
		if (this.weight == 300) {
			this.price = 850;
			this.last = 7;
			return price;
			
		} else if(this.weight == 500) {
			this.price = 1200;
			this.last = 10;
			return price;
			
		} else if(this.weight == 850) {
			this.price = 1950;
			this.last = 15; // 일 시 분 초 밀리초 = 24 60 60 60 
			return price;
			
		} else {
			this.price = 0;
			return price;
		}
		
		
	}
	
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setCreationTime(String creationTime) {
		
		//String time = String.format("", creationTime);
		String[] timeArr = creationTime.split("-");
		int year = 0;
		int month = 0;
		int day = 0;
		for (int i=0; i<timeArr.length; i++) {
			
			switch(i) {
				case 0:
					year = Integer.parseInt(timeArr[i]);
					break;
				case 1:
					month = Integer.parseInt(timeArr[i]);
					break;
				case 2:
					day = Integer.parseInt(timeArr[i]);
					break;
		    
			}
		}
		
		Calendar creat = Calendar.getInstance();
		creat.set(year, month-1, day);
		
		this.creationTime = creat;
	}
	
	
	public int getExpiration() {
		
		Calendar now = Calendar.getInstance();
		creationTime.add(Calendar.DATE, last);
		
		//        제조날짜+유통기한(10일)       -           현재시간
		eat = ((creationTime.getTimeInMillis() - now.getTimeInMillis()) / 1000 / 60 / 60 / 24);
		
		return this.expiration = (int)eat-1; //생산일부터 1일
	}
	
	public void eat() {
		if (this.expiration > -1) {
			System.out.println("과자를 맛있게 먹습니다.\n");
		}else {
			
			System.out.println("유통기한이 지나 먹을 수 없습니다.\n");
			
			
		}
		
		
	}
	
}






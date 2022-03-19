package com.test.java.question.iteration_while;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws Exception {

		/*
		 	요구사항]
		 	자판기 프로그램을 구현
		 	
		 	설계]
		 	1.자판기 이름과 음료 이름, 가격을 출력시킵니다.
		 	2.사용자에게 투입 금액을 입력 받는다.
		 	3.음료를 선택하도록 합니다.
		 	4.만약 음료 가격보다 투입 금액이 적으면 "금액이 부족합니다"라는 메시지를 띄웁니다.
		 	5.가격이 알맞으면 "??를 제공합니다" 와 "잔돈 ??원을 제공합니다" 라는 메시지를 입력
		 */
		
		
		boolean cycle = true;
		int coke = 700;
		int soda = 600;
		int bita = 500;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {

			int changes = 0;
		
		System.out.println("==================");
		System.out.println("       자판기");
		System.out.println("==================");
		System.out.println("1. 콜라 : 700원");
		System.out.println("2. 사이다 : 600원");
		System.out.println("3. 비타500 : 500원");
		System.out.println("------------------");
		System.out.print("금액 투입(원) : ");
		int pay = Integer.parseInt(reader.readLine());
		System.out.println("------------------");
		System.out.print("음료 선택(번호) : ");
		int select = Integer.parseInt(reader.readLine());
		
		switch (select) {
			
			case 1:
				if (pay >= coke) {
					
					changes = pay - coke;
					
					System.out.println("+콜라를 제공합니다.");
					System.out.printf("+잔돈 %d원을 제공합니다.\n", changes);
					System.out.println();
					
					System.out.print("계속하시려면 엔터를 입력하세요.");
					String enter = reader.readLine();
					break;
					
				} else {
					
					System.out.println("금액이 부족합니다.");
					System.out.println();
					
					System.out.print("계속하시려면 엔터를 입력하세요.");
					String enter = reader.readLine();
					break;
				}
				
			case 2:
				
				if (pay >= soda) {
					
					changes = pay - soda;
					
					System.out.println("+사이다를 제공합니다.");
					System.out.printf("+잔돈 %d원을 제공합니다.\n", changes);
					System.out.println();
					
					System.out.print("계속하시려면 엔터를 입력하세요.");
					String enter = reader.readLine();
					break;
					
				} else {
					
					System.out.println("금액이 부족합니다.");
					System.out.println();
					
					System.out.print("계속하시려면 엔터를 입력하세요.");
					String enter = reader.readLine();
					break;
				}
				
			case 3:
				
				if (pay >= bita) {
					
					changes = pay - bita;
					
					System.out.println("+콜라를 제공합니다.");
					System.out.printf("+잔돈 %d원을 제공합니다.\n", changes);
					System.out.println();
					
					System.out.print("계속하시려면 엔터를 입력하세요.");
					String enter = reader.readLine();
					break;
					
				} else {
					
					System.out.println("금액이 부족합니다.");
					System.out.println();
					
					System.out.print("계속하시려면 엔터를 입력하세요.");
					String enter = reader.readLine();
					break;
				}
			
		}
		
		}
		
		
		
	}

}

package com.test.java.question.iteration_while;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws Exception {

		/*
		 TODO
		요구사항]
		사용자가 입력한 범위의 숫자까지 369 게임 과정을 출력하시오.

		조건]
		최대 3자리까지만 입력하시오
		
		설계]
		1.최대 숫자를 입력 받습니다.(3자리까지만)
		2. 1 <= 50을 조건으로 반복문 생성   3 6 9
		3. 현재 숫자 /  
		
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("최대 숫자: ");
		int num = Integer.parseInt(reader.readLine());
		
		int cycle=1;
		if (num < 1000) {
			
			while(cycle<=num) {
				
				if ((cycle/100 == 3) || (cycle/100 == 6) || (cycle/100 == 9)) {
					System.out.print("짝 ");
					
				}else if ((cycle/10 == 3) || (cycle/10 == 6) || (cycle/10 == 9)) {
					System.out.print("짝 ");
					
				} else if((cycle %10 == 3) || (cycle%10 == 6) || (cycle%10 == 9)){
					System.out.print("짝 ");
					
				} else {
					System.out.printf("%d ", cycle);
					
				}
				 cycle++;
			}
			
			
		}else {
			System.out.println("최대 3자리까지의 수만 입력하세요.");
		}
		
		
		
	}

}

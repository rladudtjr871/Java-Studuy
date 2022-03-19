package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws Exception{

		/*
		 	
		 	요구사항] 아래와 같이 출력하시오.
		 	
		 	입력]
			시작 숫자 : 1 
			종료 숫자 : 10 

			출력]
			1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10 = -5
			
			설계] 1.입력을 받는다.
				 2. +, - 부호를 바꿀 sign변수를 선언하고 1을 담는다.
				 3. 시작숫자부터 종료숫자까지 반복하는 for문
				 4. for문 안에 if문으로 끝 수와 같아지면 마무리 문장을 출력시키고
				 5. sign이 처음 + 이기때문에 sign이 양수면 %d - 를 출력하도록하고
				 6. 음수이면 %d + 를 출력하도록 한다.
				 7. sum값을 더하고 sign을 바꿔준다.
		 */

		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("시작 숫자: ");
		int numStart = Integer.parseInt(reader.readLine());
		
		System.out.print("종료 숫자: ");
		int numEnd = Integer.parseInt(reader.readLine());
		
		
		int sum = 0;
		int sign = 1;
		
		
		for(int i=numStart; i<=numEnd ;i++) {
						
			if (i == numEnd) {
				
				System.out.printf("%d = ", i);
				
			}else if(sign > 0) {
				System.out.printf("%d - ", i);
			}else {
				System.out.printf("%d + ", i);
			}
			
			
			sum += (i * sign);
			sign *= -1;
			
		}
		
		System.out.println(sum);
	}

}

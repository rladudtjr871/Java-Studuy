package com.test.java.question.iteration_multiple_for;

public class Q07 {

	public static void main(String[] args) {

		/*
		  TODO
		 	요구사항
			1부터 100사이의 완전수를 구하시오.

			조건..
			완전수: 자기 자신을 제외한 나머지 약수들의 합이 자신과 동일한 수
			약수: 어떤 수나 식을 나누어 나머지가 없이 떨어지는 수
			출력..
			6 = [1, 2, 3]
			28 = [1, 2, 4, 7, 14]
			
			
		 */
		int sum;
		String num = "";
		
		for (int i=1; i<=100; i++) { //1~100까지
			sum = 0;
			for (int j=1; j<i; j++) { //i값 까지만 반복
				
				if (i % j == 0) { //현재 i값과 i보다 작은 수들을 나누어 나머지가 0이면
					sum += j;  //현재 j값을 sum에 더한다.
					}
				
				}
			
			if (sum == i) { //sum과 i가 같을 경우 즉 약수를 더한 값이 자신인 완전수
				num += String.format("%d = [", i);
				String divisor = ""; //밖에 선언하면 divisor가 공백 초기화가 안된다. 그로인해 그 전 값이 한번 더 출력되고 다음 값이 나온다
				
				for(int j=1; j<i; j++) {  //현재 i보다 작은 수들을
					
					if (i % j == 0) { //i와 나누어 0이면
						divisor += j + ", "; //약수들을 문자열로 추가
					}

				}
				num += divisor + "\b]\n";  //최종적으로 ,이 하나 더 나오므로 지우고 다음 완전수를 나타내기 위해 줄을 바꿔준다.
				
			}
			
		}
		
		System.out.printf(num);

	}

}

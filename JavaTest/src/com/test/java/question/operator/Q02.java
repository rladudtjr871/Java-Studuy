package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws Exception {

		//2.연산식 만들기
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		//숫자 입력 받기
		System.out.print("첫번째 숫자 : ");
		String input = reader.readLine();
		
		
		System.out.print("두번째 숫자 : ");
		String input2 = reader.readLine();
		
		
		int first  = Integer.parseInt(input);
		int second = Integer.parseInt(input2);
		
		
		//출력
		System.out.printf("%d + %d = %,d\n", first, second, first + second);
		System.out.printf("%d - %d = %,d\n", first, second, first - second);		
		System.out.printf("%d * %d = %,d\n", first, second, first * second);		
		System.out.printf("%d / %d = %.1f\n", first, second, (double)first / second);
		//형변환을 해주지 않아서 오류가 발생하여 first를 double형으로 형변환 해주었습니다.		
		System.out.printf("%d %% %d = %d\n", first, second, first % second);
		//printf에서 '%'를 '%%'로 하지않으면 문자 그대로의 '%'로 인식을 못하는 것을 간과하여 '%%'로 수정했습니다.
		
		
		//printf문에서 형변환을 하는 것이 좋은지, double변수를 밖에서 만들고 출력하는 것이 좋은가
		// > 코드가 간결하면 상관없지만 길어지면 따로 변수로 빼주는 것이 좋다.
		//산술기호나 문장부호 띄어쓰기를 해야 가독성이 높다.
		//변수명은 직관적인 것이 이해하기 좋다.
		
		//숫자가 아닌 값을 입력한다면? 삼항
		//나눗셈의 결과가 정수일 때 소수이하를 표시 안하려면? %.0f 사용, 처음부터 int값으로 받기
		
	}

}

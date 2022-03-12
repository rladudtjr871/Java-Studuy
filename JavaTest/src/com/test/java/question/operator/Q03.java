package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws Exception{
		
		//3.사각형
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//넓이와 높이 입력 받기
		System.out.print("너비(cm) : ");
		String input = reader.readLine();
		
		System.out.print("높이(cm) : ");
		String input2 = reader.readLine();
		
		
		int width = Integer.parseInt(input);
		int height = Integer.parseInt(input2);
		
		
		//출력
		System.out.printf("사각형의 넓이는 %dcm2\n", width * height);
		System.out.printf("사각형의 둘레는 %dcm\n", (width * 2) + (height * 2));
		
		
		//입력값을 치환하지 않을 땐 직관적으로 이해할 수 있는 변수명으로 설정해줘야함.
		//input보다는 iwidth, iwidth로 쓰는게 더 의미있는 이름 같다.
		
		//intput값을 변수로 따로 만들고, 값을 치환하는 문장을 만드는 것 보다
		//16, 19번째 줄에서 String input = Integer.parseInt(reader.readLine());
		//28번째 줄에서 2*(width + height)가 나은거 같다.
	}

}

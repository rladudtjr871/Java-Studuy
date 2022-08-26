package com.test.java.question.variable;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Game369 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("입력: ");
		String input = reader.readLine(); //숫자 입력
		
		int num = Integer.parseInt(input);		
		int n = 1;
		int cnt = 0;
		
		while (n < num) {
			//System.out.println(1);
			int odd = n;
			
			while (odd != 0) {
				
				if (odd % 10 == 3 || odd % 10 == 6 || odd % 10 == 9 ) {			
					cnt++;
				}
				
				odd = odd / 10;
			}
			
			n++;
			
		}
		
		System.out.println(cnt);
		
	}

}
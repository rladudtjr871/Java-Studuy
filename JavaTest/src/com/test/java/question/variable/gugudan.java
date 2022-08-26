package com.test.java.question.variable;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class gugudan {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine();
		
		int num = Integer.parseInt(input);
		
		for (int i=num; i<num+1; i++) {
			
			for (int j=1; j<10; j++) {
				
				System.out.printf("%d x %d = %d\n", i, j, i*j);
				
			}
			
			System.out.println();
		}
		

	}

}

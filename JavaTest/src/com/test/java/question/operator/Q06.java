package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws Exception {
		
		
		//6.세금
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("한달 수입 금액(원) : ");
		String input = reader.readLine();
		
		
		double taxBefore = Double.parseDouble(input);
		double tax = taxBefore * 0.033;
		
		System.out.printf("세후 금액(원) : %,.0f\n", taxBefore - tax);
		System.out.printf("세후 금액(원) : %,.0f\n", tax);
		
		
		

	}

}

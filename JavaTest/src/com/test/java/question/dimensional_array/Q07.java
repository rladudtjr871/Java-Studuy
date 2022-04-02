package com.test.java.question.dimensional_array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws Exception{
		/*
		요구사항
		성적을 입력받아 아래와 같이 출력하시오.

		조건..
		String[][] score = new String[10][3];
		입력..
		국어 점수 : 80 

		영어 점수 : 50 

		수학 점수 : 70 

		출력..
		 	 	 
		 	 	 
		■		
		■		■
		■		■
		■	■	■
		■	■	■
		■	■	■
		■	■	■
		■	■	■
		국어	영어	수학
		
		
		설계]
		1.
		2.
		
		*/
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어 점수: ");
		int korPoint = Integer.parseInt(reader.readLine());
		
		System.out.print("영어 점수: ");
		int engPoint = Integer.parseInt(reader.readLine());
		
		System.out.print("수학 점수: ");
		int mathPoint = Integer.parseInt(reader.readLine());
		
		String[][] score = new String[10][3];
		
		
		arrScore(score, korPoint, engPoint, mathPoint);
		
		outScore(score);

	}//main
	
	
	private static void arrScore(String[][] score, int korPoint, int engPoint, int mathPoint) {
		
		
		for (int i=0; i<3; i++) {
			
			if (i==0) {
				int point = (int)(korPoint * 0.1);
		
				for (int j=9; j>=0; j--) {
					if (j>10-point) {
						score[j][0] = "  ■  ";
					}else {
						score[j][0] = "     ";
					}
				}
			}
			
			
			if (i==1) {
				int point = (int)(engPoint * 0.1);
		
				for (int j=9; j>=0; j--) {
					if (j>10-point) {
						score[j][1] = "  ■  ";
					}else {
						score[j][1] = "     ";
					}
				}
			}
			
			
			if (i==2) {
				int point = (int)(mathPoint * 0.1);
		
				for (int j=9; j>=0; j--) {
					if (j>10-point) {
						score[j][2] = "  ■  ";
					}else {
						score[j][2] = "     ";
					}
				}
			}
			
		}
		
		
		
	}//arrScore


	private static void outScore(String[][] score) {
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[3].length; j++) {
				
				System.out.printf("%s", score[i][j]);
				
			}
			
			System.out.println();
		}
		System.out.println("---------------");
		System.out.println(" 국어  영어  수학");
		
	}//outScore



}

package com.test.java.question.dimensional_array;

public class Q02 {

	public static void main(String[] args) {
		
		/*
		
		 	25	24	23	22	21
		 	20	19	18	17	16
			15	14	13	12	11
			10	 9	 8	 7	 6
			5	 4	 3	 2	 1
			
			설계]
		    1. 5x5 크기의 배열을 생성
		    2. 대회전과 소회전 모두 역순으로 한다.
		    
		 
		 */
		
		
		int[][] nums = new int[5][5];
		int num = 1;
		
		//배열에 값을 입력
		inChange(nums, num);
		
		
		//배열 안 값 출력
		outChange(nums);
		
		
		

	}//main

	
	public static void inChange(int[][] nums, int num) {
		
		for (int i=4; i>=0; i--) {
				for (int j=4; j>=0; j--) {
					nums[i][j] = num++;
					
				}
				
		}
			
		
	}//inChange
	
	
	
	public static void outChange(int[][] nums) {
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				
				System.out.printf("%5d", nums[i][j]);
				
			}
			System.out.println();
		}
		
	}//outChange
	
	
}

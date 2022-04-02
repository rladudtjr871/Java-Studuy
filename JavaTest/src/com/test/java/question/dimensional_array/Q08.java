package com.test.java.question.dimensional_array;

public class Q08 {

	public static void main(String[] args) {
		
		
		/*
			 1	 2	 4	 7	11
			 3	 5	 8	12	16
			 6	 9	13	17	20
			10	14	18	21	23
			15	19	22	24	25
		
		설계] 
		1.
	
	*/
		
		
		
		int[][] nums = new int[5][5];
		int num = 1;
		
		inChange(nums, num);
		
		outChange(nums);
		
		
		
		
	}//main

	private static void outChange(int[][] nums) {
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				
				System.out.printf("%5d", nums[i][j]);
				
			}
			
			System.out.println();
		}
		
		
	}//outChange

	private static void inChange(int[][] nums, int num) {
		
		int row;
		
		for(int i=0; i<5; i++) { //대각선으로 잘랐을 때 왼쪽부분
			
			row = i;
			for(int j=0; j<=i; j++) {
				
				nums[j][row] = num;
				num++;
				row--;
			}
		}
		
		for(int i=1; i<5; i++) { //대각선으로 잘랐을 때 오른쪽부분
			
			row = i;
			for(int j=4; j>=i; j--) {
				
				nums[row][j] = num;
				num++;
				
				row++;
			}
		}
		
		
		
		
	}//inChange

}

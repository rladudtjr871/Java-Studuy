package com.test.java.question.dimensional_array;

public class Q04 {

	public static void main(String[] args) {

		/*
			 1	 2	 3	 4	 5
			 6	 7	 8	 9	 0
			10	11	12	 0	 0
			13	14	 0	 0	 0
			15	 0	 0	 0	 0
			
			설계] 
			1.대회전 값이 줄어들게 한다,
			2.소회전은 늘어나게한다. 조건을 대회전값으로 해준다.
		
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
		
		int k = 5; //소회전 범위를 줄여줄 값
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<k; j++) {
				
				nums[i][j] = num;
				num++;
				
			}
			k--;
		}
		
	}//inChange

}

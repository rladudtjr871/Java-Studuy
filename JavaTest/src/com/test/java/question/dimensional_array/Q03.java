package com.test.java.question.dimensional_array;

public class Q03 {

	public static void main(String[] args) {

		/*
		   
		     1	 6	11	16	21
			 2	 7	12	17	22
			 3	 8	13	18	23
			 4	 9	14	19	24
			 5	10	15	20	25
			 
			 설계]
			 1. 5x5 크기의 배열을 생성
			 2. 소회전 안에 대회전을 넣는다. (소회전 { 대회전{ } })
		   
		 */

		int[][] nums = new int[5][5];
		int num = 1;
		
		//배열에 값 입력
		inChange(nums, num);
		
		
		//배열 값 출력
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


	public static void inChange(int[][] nums, int num) {
		
		for (int j=0; j<5; j++) {
			for (int i=0; i<5; i++) {
				
				nums[i][j] = num;
				
				num++;
			}
		}
		
		
	}//inChange

}

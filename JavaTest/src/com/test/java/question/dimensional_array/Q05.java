package com.test.java.question.dimensional_array;

public class Q05 {

	public static void main(String[] args) {

		
		/*
		 
		 	 0	 0	 1	 0	 0
			 0 	 2	 3	 4	 0
			 5	 6	 7	 8	 9
			 0	10	11	12	 0
			 0	 0	13	 0	 0

			설계]
			1. 5x5 배열을 만든다.
			2. 절반으로 나눠 생각하면 위는 증가 아래는 감소 
		 		
		 */
		
		int[][] nums = new int[5][5];
		int num = 1;
		
		//입력
		inChange(nums, num);
		
		//출력
		outChange(nums);
		
		
	}//main

	private static void outChange(int[][] nums) {

		for (int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
	}//outChange

	private static void inChange(int[][] nums, int num) {
		
		int start = 2;
		int end = 2;
		
		for (int i=0; i<5; i++) {
			for (int j=start; j<=end; j++) {
				
				nums[i][j] = num++;
					
			}
			//     start end
			//i:0   2     2
			//i:1   1     3
			//i:2   0     4
			//i:3   1     3
			//i:4   2     2
			if(i<2) { //위쪽 절반
				start--;
				end++;
			} else {  //아래쪽 절반
				start++;
				end--;
			}
			
		}
		
		
	}//inChange
		
}



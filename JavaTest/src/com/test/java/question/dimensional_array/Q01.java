package com.test.java.question.dimensional_array;

public class Q01 {

	public static void main(String[] args) {

		/*
		 
		   	 1	 2	 3	 4	 5
			10	 9 	 8	 7	 6
			11	12	13	14	15
			20	19	18	17	16
			21	22	23	24	25

		 	설계]
		 	1. 5x5 크기의 배열을 생성
		 	2. 대회전 즉 i가 홀수면 순서대로 값을 넣고
		 	3. i가 짝수면 역순으로 값을 넣는다.
		 	
		 */
		
		
		int[][] nums = new int[5][5];
		int num = 1;
		
		//배열에 값을 입력
		inChange(nums, num);
		
		
		//배열 안 값 출력
		outChange(nums);
		

		
	}//main
	
	public static void inChange(int[][] nums, int num) {
		
		for (int i=0; i<5; i++) {
			
			if (i==1 || i==3 || i==5) {
				for (int j=4; j>=0; j--) {
					nums[i][j] = num++;
				}
				
			}else {
				for (int j=0; j<5; j++) {
					nums[i][j] = num++;
				}
			}
		}
		
		
	}
	
	
	public static void outChange(int[][] nums) {
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				
				System.out.printf("%5d", nums[i][j]);
				
			}
			System.out.println();
		}
		
	}

}

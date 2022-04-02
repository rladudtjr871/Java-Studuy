package com.test.java.question.dimensional_array;

public class Q06 {

	public static void main(String[] args) {


		/*
		 
			 1	 2	 3	 4	 10
			 5	 6	 7	 8	 26
			 9	10	11	12	 42
			13	14	15	16	 58
			28	32	36	40	136

			설계]
			1. 5x5 배열을 만든다.
			2. [][4]와 [4][] 자리는 항상 합 값이 온다.
			3. 
	 		
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
		
		int sumRow = 0;
		int sumColumn = 0; 
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				
				if(j==4) { //값
					nums[i][j] = sumRow;
					
				} else { //오른쪽 끝 합
					nums[i][j] = num++;
					sumRow += nums[i][j];
				
				}
				
				if (i==4) { //아래쪽 합
					for (int k=0; k<4; k++) {
					sumColumn += nums[k][j];
					//nums[i][j] += nums[k][j];
					
					}
				}
				nums[4][j] = sumColumn; 
				sumColumn = 0;
				
			}
			
			sumRow = 0;
		}		
		
	}//inChange

}

package com.test.java.question.dimensional_array;

public class Q09 {

	public static void main(String[] args) {


		/*
		     1	 2	 3	 4	 5
			16	17	18	19	 6
			15	24	25	20	 7
			14	23	22	21	 8
1			 3	12	11	10	 9
		 */
		
		
		int[][] nums = new int[5][5];
		
		
		
		inChange(nums);
		
		outChange(nums);
		
		
	}//main

	private static void outChange(int[][] nums) {

		for (int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				
				System.out.printf("%3d", nums[i][j]);
				
			}
			System.out.println();
		}
		
		
	}//outChange
	
	private static void inChange(int[][] nums) {
		
		int cycleBig = 5;
		int cycle = cycleBig;
		int num = 1;
		int x = 0;
		int y = 0;
		
		for (int i=0; i<2*cycleBig-1; i++) { //5-4-4-3-3-2-2-1-1
			
			switch (i%4) {
				case 0: //go right
					for (int j=0; j<cycle; j++) { //i가 0과 4일경우 우측 이동
						nums[y][x] = num;
						x++;
						num++;
					}
					
					y++; //y는 1부터 시작
					x--; //for문 동작 후 5가 되므로 -1 해준다.
					cycle--; //4칸씩 채움
					break;
					
				case 1: //go down
					for (int j=0; j<cycle; j++) {
						nums[y][x] = num;
						y++;
						num++;
					}
					
					y--;
					x--;
					break;
					
				case 2: //go left
					for (int j=0; j<cycle; j++) {
						nums[y][x] = num;
						x--;
						num++;
					}
				x++;
				y--;
				cycle--;
				break;
				
				case 3: //go up
					for (int j=0; j<cycle; j++) {
						nums[y][x] = num;
						y--;
						num++;
					}
					y++;
					x++;
					break;
			}
			
		}
	}
}

//	private static void inChange(int[][] nums) {
//		
//		int cycle = 5;
//		int right = -1;
//		int down = 0;
//		int flag = 1;
//		int num = 1;
//		
//		for (int i=5; i>0; i--) {
//			
//			for (int j=0; j<cycle; j++) {
//				right += flag;
//				nums[down][right] = num; //down 고정 right 1씩 증가
//				num++;
//			}
//			
//			cycle--;
//			
//			//[1][1~4]
//			for (int j=0; j<cycle; j++) {
//				down += flag;
//				nums[down][right] = num; //down 1씩 증가 right:4 고정
//				num++;
//			}
//			
//			flag *= -1;
//			
//		}
//	}



package com.test.java.question.dimensional_array;

import java.util.Arrays;

public class Q10 {

	public static void main(String[] args) {
		/*
			2	7	6   6 1 8
			9	5	1   7 5 3
			4	3	8   2 9 4
		
		
		
			설계] 1. r(row), c(colunm)를 r=1, c=2로 시작위치를 잡는다.
				 2. 오른쪽 대각선 위로 이동하며 1씩 증가된 값을 넣는다.
				 3. r은 1씩 감소, c는 1씩 증가시키며 값을 넣는다.
				 4. 만약 r=-1이고 c=3이면 r=2로 c=0 으로 해준다.
				 5. 만약 진행방향에 이미 값이 있으면 바로 왼쪽(c-1)에 넣는다.
		*/
		int[][] mabang = new int[3][3];

		start(mabang);
		
		out(mabang);
		
		
		
		
		
		
		
	}//main


	private static void start(int[][] mabang) {
		
		
		int num = 1;
		int r = 1;
		int c = 2;
		while(num <= mabang.length * mabang.length) {
			
			
			if (r != -1 && c != 3) { //r이 -1아 아니고 c가 3이 아니면
				
				if (mabang[r][c] != 0 || (r==1 && c==2)) { //해당 위치 값이 0이 아니면
					
					mabang[r][c] = num;
					r--;
					c++;
					num++;
					
				} else {
					mabang[r][c-1] = num;
					c--;
					num++;
				}
				
				
				
			}
			
			if (r==-1) {
				r = 2;
				mabang[r][c] = num;
				r--;
				c++;
				num++;
			}
			
			if (c==3) {
				c = 0;
				mabang[r][c] = num;
				r--;
				c++;
				num++;
			}
		}

	}
	
	
	private static void out(int[][] mabang) {

		for(int i=0; i<mabang.length; i++) {
			for(int j=0; j<mabang.length; j++) {
				
				System.out.printf("%3d",mabang[i][j]);
				
			}
			System.out.println();
		}
		
		
	}


}//Q10

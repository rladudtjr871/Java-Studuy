package com.test.java;

public class Re_Array_dimensional {

	public static void main(String[] args) {

		
		//[SUMMARY] 다중 배열 만들기
		
		
		//배열 탐색(+조작)
		//- 1차원 배열 > 단일 for문
		//- 2차원 배열 > 2중 for문
		//- 3차원 배열 > 3중 for문
		
		
		//(Math.random() * 10) + 1 > 0~10 사이의 수 > 곱하는 값이 최대값

		
		/*
		Right Shift, 우측 시프트 > for 감소
		for (int i=nums.length-2; i>=index; i--) {
			nums[i+1] = nums[i]; //이동
		}	
		*/
		
		
		/*
		Left Shift, 좌측 시프트 > for 증가
		for (int i=index; i<nums.length-1; i++) {
			
			nums[i] = nums[i+1];
		}
		*/
	}

}

package com.test.java;

import java.util.Arrays;

public class Re_Array01 {

	public static void main(String[] args) {
		
		
		//[SUMMARY] 배열 만들기
		

		//Arrays.toString(변수명) > 덤프
		
		//printArray(변수명);  > 배열 안의 값 출력?
		
		/*
		배열 복사, Shallow Copy
		  1. 얕은 복사
			- 주소값 복사
			- Side Effect 발생 O
		
		  2. 깊은 복사, Deep Copy
		  	- 요소끼리의 복사 > 값복사
		  	- Side Effect 발생 x
		  	
		  	
		  * 개발자는 stack에 접근할 수 있지만 나머지(Heap)영역에는 직접 접근할 수 없다. (간접적으로는 가능) XXX
		*/
		
		
		
		//case 1.
		//int[] = int[]
		//참조형 복사 > 주소값을 복사한다.
		//copy = ns; //ns를 복사
				
		//참조형 복사 > 원본 수정 > 복사본 영향 있음 > Side Effect가 발생한다. > 주의!!!!!
		//ns[0] = 100;
			
		//System.out.println(ns[0]);  //100
		//System.out.println(copy[0]); //10(x) 100(o) > copy = ns는 주소를 복사했기때문에 ns 주소에 다른 값을 넣으면 copy도 주소를 참조하기때문에 반영
				
		
		
		//case 2.
		//값형 복사
		//int = int
		//copy[i] = ns[i];
	}

}

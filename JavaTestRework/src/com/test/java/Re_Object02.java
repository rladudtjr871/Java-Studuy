package com.test.java;

public class Re_Object02 {

	public static void main(String[] args) {


		/*
		  
		  [SUMMARY] Object 변수
		 
		  Object 변수
		  1. 모든걸 담을 수 있다.
		  2. 처음에 무언가를 담으면.. 죽을 때까지 그 자료형만 담는다.(*******)
		
		
		  Object 장점
		  1. 모든걸 담을 수 있다.
		
		  Object 단점
		  1. 다운 캐스팅이 종종 필요하다.
		  2. 다운 캐스팅 과정에서 원래 자료의 자료형을 유추하기가 힘들다.
		  
		  
		  
		  
		 1.
		 박싱(Boxing) - 오토 박싱
		  > 값형 데이터를 자동을 객체로 만드는 작업
		 Object o11 = 100;
		 Object o12 = new Integer(10);
		  
		 
		 2.
		 The operator * is undefined for the argument type(s) Object, int
		 System.out.println(o11 * 2); //참조형이기때문에 * 2 연산이 안된다.
		  
		  
		  
		 3.
		 언박싱(UnBoxing)
		  > Object 변수에 들어있는 값형 데이터를 원래 값형으로 자료형을 변환하는 작업
		 System.out.println((int)o11 * 2);
		 System.out.println((Integer)o11 * 2);
		  
		  
		 */

	}

}

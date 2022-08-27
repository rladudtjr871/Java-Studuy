package com.test.java;

public class Re_String02 {

	public static void main(String[] args) {
		
		
		//[SUMMARY] String 문자열 만들기
		
		
		//문자열을 대상하는 피해야 하는 행동 > 상황 파악을 해줘야함
		//1. 문자열의 잦은 수정
		//2. 큰 문자열의 수정
		
		//"문자열은 불변이다"

		//StringBuilder > 기존의 String보다 좋은 장점 > 수정 작업에 강하다!!!(속도 등)
		
		//일반적인 문자열 > String 사용
		//하드한 수정 작업 > StrignBuilder 사용
		
	
		StringBuilder txt2 = new StringBuilder("홍길동");
		
		for (int i=0; i<100000; i++) {
			//txt1 = txt1 + "."; //같은 행동
			txt2.append(".");  //가비지(Garbage) 발생 안함
			
		}
		
		System.out.println(txt2.length());
		

	}

}

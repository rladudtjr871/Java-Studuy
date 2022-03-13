package com.test.java.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws Exception{
		
		/*
		 -성적처리
		  요구사항] 국어, 영어, 수학 점수를 전달하면 '합격' 혹은 '불합격'이라는 단어를 반환하는 메소드를 선언하시오.
		  조건] String test(int kor, int eng, int math)
		  	   평균 점수 60점 이상은 '합격'이다.
		  	   평균 점수 60점 미만은 '불합격'이다.
		  	   과락: 한 과목 이상 40점 미만이면 불합격이다.
		  	   
		  입력] 국어:
		  	   영어:
		  	   수학:
		  	   
		  출력] 합겹입니다.
		  
		  설계] 1. 입력 받을 BufferdReader를 생성
		  	   2. 3과목 점수를 보고 합격여부를 판단하는 메소드를 생성
		  	   3. 메소드 호출
		*/
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어 : ");
		int kor = Integer.parseInt(reader.readLine());
		
		System.out.print("영어 : ");
		int eng = Integer.parseInt(reader.readLine());
		
		System.out.print("수학 : ");
		int math = Integer.parseInt(reader.readLine());
		
		  
		String result = test(kor, eng, math);
		System.out.println(result);
		
		
	}//main
	
	
	//국영수 평균(과락o)
	public static String test(int kor, int eng, int math) {
		
		String result = kor < 40 || eng < 40 || math < 40 ? "불합격입니다." : (kor + eng + math) / 3 < 60 ? "불합격입니다." : "합격입니다.";
		
		return result;
	}
	
}//Q07class

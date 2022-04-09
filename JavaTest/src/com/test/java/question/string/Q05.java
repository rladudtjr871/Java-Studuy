package com.test.java.question.string;

public class Q05 {

	public static void main(String[] args) {
		
		/*
		요구사항]
		특정 단어가 문장내에 몇회 있어있는지 수를 세시오.

		조건]
		대상 문자열: String content = "안녕~ 길동아~ 잘가~ 길동아~";
		검색 문자열: String word = "길동";
		출력]
		'길동'을 총 2회 발견했습니다.
		
		설계]
		1.문자열을 생성하고 무슨 단어를 셀건지 단어를 선정
		2.해당 단어를 기준으로 split하여 문자열배열을 생성
		3.길동으로 시작하고 길동으로 끝나면 또는 길동으로 끝나면 배열의 길이가 횟수
		5.문자열 앞뒤로 길동이 없거나 문자열 앞에만 길동이 있으면 > 배열의 길이 -1
		4.마지막 문자가 해당 문자로 끝나냐 아니냐에 따라 다르게한다.
		*/
		
		
		String content = "길동안녕~ 길동아~ 잘가~ 길동아~ 길동아"; //마지막 글자가 길동이 아닐경우
		//String content = "안녕~ 길동아~ 잘가~ 길동아~ 길동"; //마지막 글자가 길동으로 끝날경우
		//String content = "길동안녕~ 길동아~ 잘가~ 길동아~ 길동" // 앞뒤로 길동인 경우
		String word = "길동";
		
		
		
		String[] contentArr = content.split(word); 
													
		
		
		//contentArr에 앞뒤로 길동이 있고 길동을 기준으로 split하면 어떻게 저장이 되는지 궁금하여 dump했습니다.
		//문제에는 필요없는 부분 > 의문? > 구분자가 문자열 맨 앞에 있으면 > 빈 문자열을 배열에 넣는다? > 구분자가 맨 뒤일 때는 > 빈 문자열을 안 넣는다?
		for(int i=0; i<contentArr.length; i++) {
				
				System.out.printf("%s",contentArr[i]);
				System.out.println();
			}
		//--------------------------------------------------------
		
		
		if((content.endsWith("길동") == true && content.startsWith("길동") == true) || content.endsWith("길동") == true) {   
			System.out.printf("\'%s\'를 %d회 발견했습니다.", word, contentArr.length); 
		} else {									
			System.out.printf("\'%s\'를 %d회 발견했습니다.", word,contentArr.length-1); 
		}
		
		
		
	}//main

}

package com.test.java.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q04 {

	public static void main(String[] args) throws Exception {
		
		/*
		요구사항
		파일명 10개를 입력받아 각 확장자별로 총 개수를 출력하시오.

		조건]
		확장자는 다음으로 제한한다.
		mp3
		jpg
		java
		hwp
		doc
		
		입력]
		파일명: 인기가요.mp3 
		파일명: cat.jpg 
		파일명: 수업_정리.doc 
		파일명: Scanner.java 
		파일명: food.jpg 
		파일명: 이력서.hwp 
		...
		
		출력]
		mp3 : 2개
		jpg : 3개
		java : 2개
		hwp : 2개
		doc : 1개
		
		설계]
		1.파일명을 입력 받아 .을 기준으로 나누어 배열에 저장
		2.조건 비교에 필요한 확장자 부분만 소문자로 바꾸어준다.
		3.확장자에 해당하는 case로 이동해 +1해준다.
		4.출력
		*/
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int mp3 = 0;
		int jpg = 0;
		int java = 0;
		int hwp = 0;
		int doc = 0;
		
		for (int i=0; i<10; i++) {
		
			System.out.print("파일명: ");
			String inFile = reader.readLine();
			
			String[] file = inFile.split("[.]");
			//System.out.println(Arrays.toString(file));
			
			file[1].toLowerCase();
			
			switch(file[1]) {
				
				case "mp3":
					mp3++;
					break;
					
				case "jpg":
					jpg++;
					break;
					
				case "java":
					java++;
					break;
					
				case "hwp":
					hwp++;
					break;
					
				case "doc":
					doc++;
					break;
					
			}
		}
		
		System.out.printf("mp3: %d개\n", mp3);
		System.out.printf("jpg: %d개\n", jpg);
		System.out.printf("java: %d개\n", java);
		System.out.printf("hwp: %d개\n", hwp);
		System.out.printf("doc: %d개\n", doc);
		
		
		
	}//main

}

package com.test.java.question.io;

import java.io.File;
import java.util.ArrayList;

public class Q07 {

	public static void main(String[] args) {
		
		/*
		MusicA 폴더와 MusicB 폴더를 서로 비교해서 양쪽 폴더에 모두 존재하는 파일만을 출력하시오.

		조건..
		중복 파일을 찾아내시오.
		리소스..
		폴더 > 동일 파일
		파일 다운로드
		출력..
		BAAM - 모모랜드 (MOMOLAND).mp3 
		Dejavu - 볼빨간사춘기.mp3 
		SoulMate (Feat. 아이유) - 지코 (ZICO).mp3 
		..
		*/
		
		
		File fileA = new File("C:\\class\\qustion\\동일 파일\\MusicA");
		File fileB = new File("C:\\class\\qustion\\동일 파일\\MusicB");
		
		String[] listA = fileA.list();
		String[] listB = fileB.list();
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("시작");

		
		for(String i : listA) {
			for(String j : listB) {
				
				if(i.equals(j)) { 
					System.out.println(j);
					break;
				}
			}	
		}
		
			
	}

}

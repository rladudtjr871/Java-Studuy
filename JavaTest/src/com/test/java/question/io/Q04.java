package com.test.java.question.io;

import java.io.File;

public class Q04 {

	public static void main(String[] args) {
		/*
		요구사항
		음악 파일이 100개 있다. 파일명 앞에 일련 번호를 붙이시오.

		조건..
		'001'부터 3자리 형식으로 붙이시오.
		리소스..
		폴더 > 음악 파일
		파일 다운로드
		출력..
		[001]1도 없어 - Apink (에이핑크).mp3 
		[002]11 (Prod. 다이나믹듀오) - Wanna One (워너원) - 남바완.mp3 
		[003]134340 - 방탄소년단.mp3
		..
		[100]花요일 (Blooming Day) - EXO-CBX (첸백시).mp3
		*/
		
		
		//음악파일이 있는 파일로 객체를 생성
		//파일 안에 리스트들을 배열에 담는다.
		//리스트길이만큼 배열을 돌리는데 배열의 i값으로 번호를 매긴다
		// %3d(i) + 리스트 i번째 값으로 이름을 바꾼다.
		
		
		String musicDir = "C:\\class\\qustion\\음악 파일\\Music"; //음악 파일 위치
						
		File mfile = new File(musicDir);
		
		
		if(mfile.exists()) {
			
			rabel(mfile, musicDir);

			
		} else {
			
			System.out.println("폴더가 없습니다.");
			
		}
		
	}//main

	private static void rabel(File mfile, String musicDir) {
		
		File[] musicList = mfile.listFiles();
		
		
		
		for (int i=0; i<musicList.length; i++) {
			
			System.out.println(musicList[i].getName());
			
			String musicfile = String.format("%s\\[%03d]%s", musicDir, i+1, musicList[i].getName());
			
			File reMfile = new File(musicfile); //바꿀 이름 객체
			
			musicList[i].renameTo(reMfile); //이름 바꾸기
			
		}
	}

}//Q04

package com.test.java.question.io;

import java.io.File;

public class Q06 {
	
	public static void main(String[] args) {
		/*
		요구사항
		파일의 크기가 0byte인 파일만 삭제하시오.

		리소스..
		폴더 > 파일 제거
		파일 다운로드
		출력..
		총 34개의 파일을 삭제했습니다.
		*/
		
		
		File file = new File("C:\\class\\qustion\\파일 제거");
		
		if (file.exists()) {
			
			int cnt = 0;
			File[] list = file.listFiles();
			
			
			for (int i=0; i<list.length; i++) {
				
				if(list[i].length() == 0) {
					list[i].delete();
					cnt++;
				}
				
			}
			
			System.out.printf("총 %d개의 파일을 삭제했습니다.\n", cnt);
			
		} else {
			System.out.println("폴더가 없습니다.");
		}
		
		
		
	}
	
}

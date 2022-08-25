package com.test.java.question.io;

import java.io.File;

public class Q08 {
	
	private static int countFile = 0;
	private static int countDir = 0;
	
	public static void main(String[] args) {

		/*
		요구사항
		내용물이 있는 'delete' 폴더를 삭제하시오.

		조건..
		재귀 메소드 사용
		삭제된 파일과 자식 폴더 개수를 출력하시오.
		리소스..
		폴더 > 폴더 삭제
		파일 다운로드
		출력..
		폴더를 삭제했습니다. 
		삭제된 폴더는 3개이고, 파일은 6개입니다.
		*/
		
		
		File dir = new File("C:\\class\\qustion\\폴더 삭제\\delete");
		
		if(dir.exists()) {
			
			deletFile(dir);
			System.out.println("폴더를 삭제했습니다.");
			System.out.printf("삭제된 폴더는 %d개이고, 파일은 %d개입니다.", countDir, countFile);
			
			
		} else {
			System.out.println("폴더가 없습니다.");
		}

	}

	private static void deletFile(File dir) {

		File[] list = dir.listFiles();
		
		
		
		for(File defile : list) {
			if(defile.isFile()) {
				defile.delete();
				countFile++;
			}
							
		}
		
		for(File dedir : list) {
			if(dedir.isDirectory()) {
				boolean result = dedir.delete();
				//dedir.delete();
				if(!result) {
					deletFile(dedir);
				}
				
					dedir.delete();
					countDir++;

			}
		}
		
		boolean result = dir.delete();
		if(result) {
			countDir++;
		}
		
		
	}

}

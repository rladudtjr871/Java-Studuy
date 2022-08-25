package com.test.java.question.io;

import java.io.File;

public class Q10 {

	public static void main(String[] args) {
		/*
		요구사항
		아래의 조건에 따라 파일을 폴더별로 분류/이동하시오.

		조건..
		1차 : 직원 이름으로 폴더 생성
		2차 : 년도별로 폴더 생성
		3차 : 각 파일을 직원 > 년도 폴더에 이동
		리소스..
		폴더 > 직원
		파일 다운로드
		출력..
		분류가 완료되었습니다
		*/
		
		String path = "C:\\class\\qustion\\직원";
		File dir = new File(path);
		
		File[] list = dir.listFiles();
		
		
		for (File file : list) {
			
			if(file.isFile()) {
				
				String fileName = file.getName();
				
				String[] name = fileName.split("_"); //0번째에 직원이름 1번째에 년도
				
				
				File nameDir = new File(dir.getAbsolutePath() + "\\" + name[0] + "\\" + name[1]);
				
				nameDir.mkdirs();
				
				
				File move = new File(nameDir.getAbsolutePath() + "\\" + file.getName());
				
				file.renameTo(move);
				System.out.println("파일 이동");
			}
			
			
		}
		
		
	}

}

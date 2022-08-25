package com.test.java.question.io;

import java.io.File;

public class Sol10 {

	public static void main(String[] args) {
		
		
		File dir = new File("C:\\class\\qustion\\직원");
		
		File[] list = dir.listFiles();
		
		
		for (File file : list) {
			if (file.isFile()) {
				
				String filename = file.getName();
				
				//System.out.println(filename);
				
				//Parsing : 의미있는 부분들을 쪼개는 작업
				
				
				//"홍길동_2022_11.txt"; > 홍길동 : 2022 : 11
				//"홍길동__2022_11.txt"; > 홍길동 : 빈방 : 2022 : 11
				filename = filename.replace("__", "_"); //정규화
				
				String[] temp = filename.split("_");
				//0 - 직원명
				//1 - 년도
				
				//아무게_2014__17.txt
				//아무게_2014__30.txt
				
				File newDirectory = new File(dir.getAbsoluteFile() + "\\" + temp[0] + "\\" + temp[1]);
				
				newDirectory.mkdirs(); //뒤 날짜와 상관없이 이미 있으면 안 만듬
				
				
				File moveFile = new File(newDirectory.getAbsoluteFile() + "\\" + file.getName());
				
				file.renameTo(moveFile);
				
				System.out.println("이동완료");
				
				
			}
		}
		
		

	}

}

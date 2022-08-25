package com.test.java.question.io;

import java.io.File;

public class Sol08 {

	public static void main(String[] args) {

		File dir = new File("C:\\class\\qustion\\폴더 삭제\\delete");
		
		deleteDirectory(dir);
		
		

	}//main

	private static void deleteDirectory(File dir) {

		//1.
		File[] list = dir.listFiles();
		
		//2.
		for (File f : list) {
			if(f.isFile()) {
				f.delete();
			}
		}
		
		
		//3.
		for (File d : list) {
			if (d.isDirectory()) {
				deleteDirectory(d); //재귀
			}
		}
		
		
		//여기까지 도달 > dir이 빈폴더가 되었다.
		dir.delete();
		
		
	}

}

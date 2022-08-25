package com.test.java.question.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Q09 {

	private static int count = 1;
	
	public static void main(String[] args) {
		/*
		요구사항
		폴더 내의 모든 파일들을 찾아 크기를 비교하고, 크기가 큰 순으로 정렬하시오.

		조건..
		자식 폴더내의 파일도 모두 검색하시오.
		부모 자식 폴더에 상관없이 파일을 한번에 비교하시오.
		리소스..
		폴더 > 크기 정렬
		파일 다운로드
		출력..
		[파일명]      [크기]     [파일이 들어있는 폴더]
		aaa.exe    57KB    AAA 
		bbb.exe    50KB    BBB 
		ccc.dat     41KB    AAA 
		ddd.txt     20KB    CCC 
		..
		*/
		
		
		File dir = new File("C:\\class\\qustion\\크기 정렬");
		ArrayList<File> sortList = new ArrayList<File>();
		
		if (dir.exists()) {
			
			addfile(dir, sortList);
			sortfile(sortList);
			
		} else {
			System.out.println("폴더가 비었습니다.");
		}
		
		System.out.println("[파일명]\t\t\t\t[크기]\t  [파일이 들어있는 폴더]");
		
		for (File s : sortList) {
			System.out.printf("%-25s\t%5dKB\t\t%s\n", s.getName(), s.length()/1024, s.getParentFile().getName());
		}
	}
	

	private static void sortfile(ArrayList<File> sortList) {
		
		for (int i=0; i<sortList.size() - 1; i++) {
			for(int j=0; j<sortList.size() - i - 1; j++) {
				
				if(sortList.get(j).length() < sortList.get(j+1).length()) {
					
					File temp = sortList.get(j);
					sortList.set(j, sortList.get(j+1));
					sortList.set(j+1, temp);
					
				}
			}
		}
		
		
	}

	private static void addfile(File dir, ArrayList<File> sortList) {
		
		File[] list = dir.listFiles();
		
		

		for(File file : list) {
			if(file.isFile()) {
				
				sortList.add(file);
			}
			
		}
		
		
		for (File directory : list) {
			if(directory.isDirectory()) {
				addfile(directory, sortList);
			}
		}
	
	}
		
		
		
	

}

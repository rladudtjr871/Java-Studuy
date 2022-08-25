package com.test.java.question.io;

import java.io.File;
import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*
		요구사항
		지정한 폴더의 특정 파일(확장자)만을 출력하시오.

		조건..
		확장자 대소문자 구분없이 검색 가능
		입력..
		폴더: C:\class\eclipse 

		확장자: exe 

		출력..
		eclipse.exe 
		eclipsec.exe
		입력..
		폴더: C:\class\eclipse 

		확장자: xml 

		출력..
		artifacts.xml
		구글.XML
		 */
		
		
		//폴더 안에 파일 리스트를 전부 대문자로 변환
		//입력 받은 확장자도 대문자로 변환
		//리스트를 하나한 비교한다.
		//이때 각 파일(또는 디렉토리)의 이름을 뒤에서부터 해당 문자가 있는지 비교
		//있으면 해당 파일을 출력
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("폴더: ");
		File dir = new File(in.next());
		
		System.out.print("확장자: ");
		String extension = in.next().toUpperCase();
		
		//File dir = new File("C:\\class\\eclipse");
		
		
		File[] list = dir.listFiles();
		
		for(File f : list) {
			
			if(f.isFile()) {
				
				String file = String.format("%s", f).toUpperCase();
				
				if(file.lastIndexOf(extension) > -1) {
					System.out.println(f.getName());
				}
				
			}
			
		}
		
		
		
		
		
		
	}

}

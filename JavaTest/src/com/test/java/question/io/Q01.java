package com.test.java.question.io;

import java.io.File;
import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		요구사항
		파일의 경로를 입력받아 파일 정보를 출력하시오.

		조건..
		파일 크기 단위 변환 출력(소수이하 1자리까지) : B, KB, MB, GB, TB
		입력..
		파일 경로 : D:\class\java\file\test.txt 

		출력..
		파일명 : test.txt 
		종류 : txt 파일 
		파일 크기 : 45B 
		입력..
		파일 경로 : C:\movie\SpriderMan.mp4 

		출력..
		파일명 : SpriderMan.mp4
		종류 : mp4 파일 
		파일 크기 : 2.54TB
		*/
		
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("파일 경로: ");
		String path = in.nextLine();
		//String path = "C:\\class\\java\\file\\hello.txt";

		File file = new File(path);
		
		if(file.isFile()) {
			System.out.printf("파일명: %s\n", file.getName());
			
			//파일 종류
			int extensionPoint = file.getName().indexOf(".");
			//System.out.println(extensionPoint);
			String extension = file.getName().substring(extensionPoint + 1);
			System.out.printf("종류: %s파일\n", extension);
			
			
			//파일 단위에 따른 출력
			int length = (int)file.length();
			
			for(int i=0; i<4; i++) {
				
				if (length < 1024 && i == 0) {
					System.out.printf("파일 크기: %dB", length);
					break;
				} else if(length < 1024 && i == 1) {
					System.out.printf("파일 크기: %dKB", length);
					break;
				} else if(length < 1024 && i == 2) {
					System.out.printf("파일 크기: %dMB", length);
					break;
				}  else if(length < 1024 && i == 2) {
					System.out.printf("파일 크기: %dGB", length);
					break;
				}  else if(length < 1024 && i == 2) {
					System.out.printf("파일 크기: %dTB", length);
					break;
				}
				 
				length = length / 1024;
				
			}
	
			
		} else {
			System.out.println("파일이 아닙니다.");
		}
		
		
		
		
		
		

	}//main

}//Q01

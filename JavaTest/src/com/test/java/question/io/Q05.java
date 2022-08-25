package com.test.java.question.io;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class Q05 {

	public static void main(String[] args) {
		
		/*
		요구사항
		이미지 파일이 있다. 확장자별로 파일이 몇개 있는지 세시오.

		조건..
		새로운 확장자 파일이 추가되도 동작이 가능하게 구현하시오.
		'mouse.bmp' 추가를 하면.. 소스 수정 없이도 *.bmp : 1개 출력이 되게 하시오.
		리소스..
		폴더 > 확장자별 카운트
		파일 다운로드
		출력..
		*.gif : 10개 
		*.jpg : 5개 
		*.png : 3개 
		*/
		
		
		File file = new File("C:\\class\\qustion\\확장자별 카운트");
		
		
		
		if(file.exists()) {
			
			int count = 1;
			//ArrayList<String> name = new ArrayList<String>();
			
			String[] list = file.list();
			
			HashMap<String, Integer> fileMap = new HashMap<String, Integer>();
			
			
			//파일을 받고 확장자를 소문자로 f에 넣는다.
			for(String f : list) {
				
				int point = f.lastIndexOf(".");
				f = f.substring(point+1).toLowerCase();
					
				
				//filMap에 f(확장자)가 없으면 실행
				if(!fileMap.containsKey(f)) {
					fileMap.put(f, count);  //fileMap에 확장자, count값을 담는다.
					//name.add(f); //확장자를 arrayList에 추가한다.
					
				} else {
					fileMap.put(f, fileMap.get(f)+1); //확장자가 있으면 value(count)를 1증가
				}
			
			}
			
			for(String s : fileMap.keySet()) {
				System.out.printf("*%s : %d개\n", s, fileMap.get(s));
			}
			
			
		} else {
			System.out.println("폴더가 없습니다.");
		}
		
	}

}

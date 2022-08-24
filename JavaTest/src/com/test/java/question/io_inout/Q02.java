package com.test.java.question.io_inout;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Q02 {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("C:\\class\\q자료\\fileinout_Q\\숫자.dat");
			File reFile = new File("C:\\class\\q자료\\fileinout_Q\\숫자_변환.dat");
			
			if(file.exists()) {
				
				BufferedReader reader = new BufferedReader(new FileReader(file));
				BufferedWriter writer = new BufferedWriter(new FileWriter(reFile));
				
				String line = null;
				
				while ((line = reader.readLine()) != null) {
					
					//txt += line.replace("유재석", "메뚜기") + "\n";
					for (int i=0; i<line.length(); i++) {
						
						char c = line.charAt(i);
						
						if (contain(c)) {
							
							line = line.replace(c, number(c));
							
						}
					}
						
					writer.write(line+"\n");
					
				}
					
					
					reader.close();
					writer.close();
					
					file.delete();
					//boolean result = file.renameTo(reFile); //왜 실패?
					//System.out.println(result ? "변환 후 다른 이름으로 저장하였습니다." : "다른 이름으로 저장에 실패했습니다.");
					
					
			} else {
				System.out.println("해당 위치에 파일이 없습니다.");
			}
				
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Q01.main");
			e.printStackTrace();
		}
		
		
	}

	private static char number(char c) {
		
		switch(c) {
			
			case'0':
				return '영';
			case'1':
				return '일';
			case'2':
				return '이';
			case'3':
				return '삼';
			case'4':
				return '사';
			case'5':
				return '오';
			case'6':
				return '육';
			case'7':
				return '칠';
			case'8':
				return '팔';
			case'9':
				return '구';
			
		}
		
		return 0;
	}

	private static boolean contain(char c) {
		
		switch(c) {
			
			case'0':
				return true;
			case'1':
				return true;
			case'2':
				return true;
			case'3':
				return true;
			case'4':
				return true;
			case'5':
				return true;
			case'6':
				return true;
			case'7':
				return true;
			case'8':
				return true;
			case'9':
				return true;
			default:
				return false;
			
		}
		
	}

}

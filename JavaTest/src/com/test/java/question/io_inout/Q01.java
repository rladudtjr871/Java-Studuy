package com.test.java.question.io_inout;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Q01 {

	public static void main(String[] args) {


		try {
			
			File file = new File("C:\\class\\q자료\\fileinout_Q\\이름수정.dat");
			File reFile = new File("C:\\class\\q자료\\fileinout_Q\\이름수정_변환.dat");
			String txt = "";
			
			if(file.exists()) {
				
				BufferedReader reader = new BufferedReader(new FileReader(file));
				//BufferedWriter writer = new BufferedWriter(new FileWriter(file));
				
				String line = null;
				
				while ((line = reader.readLine()) != null) {
					
					txt += line.replace("유재석", "메뚜기") + "\n";
					//System.out.println(line);
					
				}
				
				//System.out.println("변환 후 다른 이름으로 저장하였습니다.");
				reader.close();
				//writer.close();
				
			} else {
				System.out.println("해당 위치에 파일이 없습니다.");
			}
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			
			writer.write(txt);
			
			writer.close();
			
			boolean result = file.renameTo(reFile);
			System.out.println(result ? "변환 후 다른 이름으로 저장하였습니다." : "다른 이름으로 저장에 실패했습니다.");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Q01.main");
			e.printStackTrace();
		}

	}

}

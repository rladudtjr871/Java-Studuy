package com.test.java.question.io_inout;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		
		
		try {
			
			File file = new File("C:\\class\\q자료\\fileinout_Q\\단일검색.dat");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			Scanner in = new Scanner(System.in);
			System.out.print("이름: ");
			String inname = in.next();
			
			
			
			String line = null;
			boolean flag = false;
			
			while ((line = reader.readLine()) != null) {
				if(line.contains(inname)) {
					line = line.replace(", ", ","); //, 방식 통일
					line = line.replace(" ,", ",");
					
					String num = line.split(",")[0];
					//String name = line.split(",")[1];
					String address = line.split(",")[2];
					String phoneNumber = line.split(",")[3];
					
					System.out.printf("[%s]\n", inname);
					System.out.printf("번호: %s\n", num);
					System.out.printf("주소: %s\n", address);
					System.out.printf("전화: %s\n", phoneNumber);
					flag = false;
					break;
				}
			}
			
			if(flag == false) {
				System.out.println("존재하지 않는 회원입니다.");
			}
			
			
		} catch (Exception e) {
		
			System.out.println("Q04.main");
			e.printStackTrace();
		}
		

	}

}

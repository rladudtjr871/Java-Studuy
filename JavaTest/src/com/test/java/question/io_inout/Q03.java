package com.test.java.question.io_inout;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;

public class Q03 {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("C:\\class\\q자료\\fileinout_Q\\성적.dat");
			
			BufferedReader reader = new BufferedReader(new FileReader(file));
			HashSet<String> passSet = new HashSet<String>();
			HashSet<String> failSet = new HashSet<String>();
			String passName = "";
			String failName = "";
			String line = null;
			int sum = 0;
			
			while((line = reader.readLine()) != null) {
				
				String[] score = line.split(",");
				
				passSet.add(score[0]); //모든 학생
				
				for(int i=1; i<score.length; i++) {
					
					sum += Integer.parseInt(score[i]);
				}
				
				int avg = sum / (score.length-1);
				
				//평균 미달
				if(avg < 60) {
					failSet.add(score[0]);
				}
				
				//과락
				for(int i=1; i<score.length; i++) {
					if (Integer.parseInt(score[i]) < 40)  {
						//failName += score[0] + "\n";
						failSet.add(score[0]);
					}
						
					
				}
				
				//모든 학생 - 불합격자 = 합격자
				passSet.removeAll(failSet);
				
				
				
			}
			
			System.out.println("[합격자]");
			for (String s : passSet) {
				System.out.println(s);
			}
			
			System.out.println();
			
			System.out.println("[불합격자]");
			for (String s : failSet) {
				System.out.println(s);
			}
			
//			System.out.println("[합격자]");
//			System.out.println(passName + "\n");
//			
//			System.out.println("[불합격자]");
//			System.out.println(failName + "\n");
//			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Q03.main");
			e.printStackTrace();
		}
		

	}

}

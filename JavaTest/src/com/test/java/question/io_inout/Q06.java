package com.test.java.question.io_inout;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Stack;

public class Q06 {

	public static void main(String[] args) {
		
		try {
			
			//File file = new File("C:\\class\\q자료\\fileinout_Q\\괄호.java");
			File file = new File("C:\\class\\q자료\\fileinout_Q\\안녕.txt");
			Stack<Character> stack = new Stack<Character>();
			
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				
				for(int i=0; i<line.length(); i++) {
					
					char c = line.charAt(i);
					
					
					if(c == '{' || c == '(') {	//있으면 넣기	
						stack.push(c);						
					}
					
					
					if(c == '}') {
						//if (stack.peek() == '{') {
							stack.pop();
						//}
					}
						
					if(c == ')') {
						//if (stack.peek() == '(') {
							stack.pop();				
						//}
					}
						
					

				}

				
			}
			reader.close();
			
			if(stack.size() == 0) {
				System.out.println("올바른 소스입니다.");
			} else {
				System.out.println("올바르지 않은 소스입니다.");
			}
			
			
			
			
		} catch (Exception e) {
			
			System.out.println("Q06.main");
			e.printStackTrace();
		}

		
	}

}

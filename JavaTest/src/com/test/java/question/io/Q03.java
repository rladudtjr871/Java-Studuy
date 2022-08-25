package com.test.java.question.io;

import java.io.File;
import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		요구사항
		지정한 파일을 다른 폴더로 이동하고, 이동한 파일과 동일한 파일명의 파일이 존재하는 경우 중복 처리하시오.

		조건..
		D:\class\java\file\AAA\test.txt → D:\class\java\file\BBB\test.txt 로 이동하는 것이 목적
		BBB 폴더에 이미 test.txt가 있을 경우 덮어쓰거나(y) 작업을 취소(n) 하시오.
		입력..
		파일 이동을 실행합니다.

		같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n) y 

		출력..
		y. 파일을 덮어썼습니다.
		입력..
		파일 이동을 실행합니다.

		같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n) n 

		출력..
		n. 작업을 취소합니다.
		*/
		
		
		//파일 이동을 시도한다.
		//true면 그냥 이동
		//만약 반환값이 false면 덮어쓸건지 물어본다
		//입력 받은 문자가 y이면
		//원래 파일을 삭제하고 이동시킨다.
		//n이면 작업 취소 메시지를 내보내고 이동 취소.
		
		
		
		File file = new File("C:\\class\\java\\move\\aaa\\hello.txt");
		File fileMove = new File("C:\\class\\java\\move\\bbb\\hello.txt");
		
		
		if(file.exists()) {
		
			System.out.println("파일 이동을 실행합니다.");
		
	
			move(file, fileMove); //파일 이동
		}
		
		
		
		
	}//main

	public static void move(File file, File fileMove) {

		boolean result = file.renameTo(fileMove);
		
		if(!result) { //이동에 실패할 경우(이미 있을경우)
			
			while(true) {
				
				System.out.print("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n)");
				
				Scanner in = new Scanner(System.in);
				String answer = in.next();
				
				if(answer.equals("y")) {
					
					fileMove.delete();
					boolean resultMove = file.renameTo(fileMove);
					
					if(resultMove) {
						System.out.println("y. 파일을 덮어썼습니다.");
					}
					
					break;
					
				} else if(answer.equals("n")) {
					System.out.println("n. 작업을 취소합니다.");
					break;
				} else {
					System.out.println("y 또는 n만 입력해주세요.");
					
					break;
				}
			
			}
			
		} else {
			System.out.println("파일을 이동했습니다.");
		}
		
	}

}//Q03

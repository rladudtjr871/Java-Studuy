package com.test.java;

public class Ex06_Escape {

	public static void main(String[] args) {
		
		
		//내가 만든 프로그램을 다른 사람에게 주고싶다!! > 배포
		//자바의 기본 배포 단위 > jar(소스파일의 컴파일 결과물, *.class) > 자바 압축 파일
		
		//----------------------------------------------------------------
		
		//특수문자 > Escape Sequence
		//-컴파일러가 번역을 할 때, 미리 약속된 포현을 만나면 그 표현을 바로 출력하지 않고,
		// 약속에 따라 처리를 한 후에 출력하는 구성 요소
		//-자료형 > char
		
		
		//1. \n
		//- new line, line feed
		//- 개행 문자
		
		char c1 = '\n';
		String str = "\n";
		
		//요구사항] "안녕하세요. 홍길동입니다." 출력해주세요.
		//수정사항] "안녕하세요.", "홍길동입니다." x 각각 다른 라인에 출력해주세요.
		String msg = "안녕하세요. 홍길동입니다.";
		System.out.println(msg);
		
		//수정 후
		String msg1 = "안녕하세요.\n홍길동입니다.";
		System.out.println(msg1);
		System.out.println();
		
		//2. \r
		//-carriage return
		//-커서(캐럿)의 위치를 현재 라인의 맨앞(첫번쨰 열)으로 이동
		//-키보드 > Home키
		//-이클립스 콘솔에서는 제대로 동작 안함
		msg = "안녕하세요.\r홍길동";
		System.out.println(msg);
		
		//운영체제(OS)
		//1. 윈도우: \r\n
		//2. 맥OS : \r
		//3. 리눅스: \n
		
		System.out.println("하나\r\n둘");
		System.out.println("하나\n둘");
		
		
		//3. \t
		//-탭문자, tab
		//-탭 > 행동(x) > 지표(o) > 이미 정해져있는 위치를 표시한 요소
		//-서식 작업(열 맞추기)
		
		msg = "하나\t둘\t셋\t넷";
		System.out.println(msg);
		
		msg = "하나	둘	셋	넷"; //편집기 상에서 탭이 눈에 안보여서 이 방식 불편
		System.out.println(msg);
		
		
		//4. \b
		//-Backspace
		//-콘솔 > 동작 o
		//-이클립스 콘솔 > 동작x
		msg = "홍길동\b입니다.";
		System.out.println(msg); //홍길입니다.

		
		//5. \", \', \\
		//-이미 무언가를 하는 문자들을 의미없게 만드는 역할
		
		//요구사항] 화면 > 홍길동: "안녕하세요."
		msg = "홍길동: \"안녕하세요.\"";
		System.out.println(msg);
		
		//요구사항] 수업 폴더의 경로를 출력하시오.
		//C:\class\java
		//Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
		msg = "C:\\class\\java";
		System.out.println(msg);
		
		
		//요구사항] 변수 2개, 숫자대입, 더하기연산 > 연산과정과 결과를 출력하세요.
		//10 + 20 = 30
		int a = 10;
		int b = 20;
		//System.out.println(a+b);
		
		//연산 방향
		System.out.println(a + " + " + b + " = " + (a + b)); //10+20=1020
		
		//a + " + " + b + " = " + a + b
		//10 + " + " + b + " = " + a + b
		//10 + 20 + " = " + a + b
		//10 + 20 = + a + b
		//10 + 20 = + 10 + b
		//10 + 20 = + 10 + 20
		//10 + 20 = + 1020
		
		
		//자바 > 변수를 만들고 초기화를 하지 않으면 사용이 불가능하다!
		
		//현재 num은 null 상태이다.
		//현재 num은 null값을 가집니다.
		//현재 num은 초기화되어 있지 않습니다.
		int num; //NULL상태
		
		//int result = num + 100; //100 + 무엇인가?
		//The local variable num may not have been initialized
		//System.out.println("숫자: " + num);
	}

}

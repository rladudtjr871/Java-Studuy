package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws Exception {


		//대소문자 변환
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자 입력 : ");
		String input = reader.readLine();
		
		char small = input.charAt(0);  //char이 아닌 int로 해버리면 형변환을 두번할 필요가 줄어든다. char은 숫자로 변환이 가능하기떄문.
		
		int change = (int)small - 32;
		
		char big = (char)change;
		
		
		System.out.printf("소문자 \'%s\'의 대문자는 \'%s\'입니다.", small, big); //int랑 char은 형변환이 필요없음?
		
		//소문자가 아닌 글자를 입력한다면?
		
		//int -> char로 형변환 할땐 명시적으로 해야하는데 printf 문장에서 %c로 int값이 들어가도 괜찮은가?
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//코드 리뷰
		//- 현업
		//- 작성된 코드를 리뷰
		
		//코드 리뷰 형태
		//1. 상급자 > 하급자 리뷰 > 검사
		//2. 동급자 > 브레인스토밍
		//3. 상급자 + 하급자 > 브레인스토밍
		
		//코드 리뷰 목적
		//1. 자신의 코드 상태 	  > 명확하게 인지
		//2. 다른 사람의 코드 상태 > 견문 확장
		
		
		
		//소회의실 > 팀별 > 팀원들 참여 >화상 회의
		//주제 > 모든 문제.. 1~7번까지
		//방식 > A와 B의 방식을 비교하여 어떤지 얘기
		//산출물 > 코드 리뷰 > 형식 자유 > 제출
		
		
		
		
		
		//바로 코딩 시작(x)
		//무조건 설계!!!
		
		//운동, 요리, 집짓기
		
		//문제를 풀기 위한 포르세스..
		//1. ex) 라벨을 출력한다. > "소문자 입력: "
		//2. 	 BufferdReader를 생성한다. > throws Exception 적는다.
		//3. 	 소문자를 입력 받는다. > reader.readLine()
		//4.	 3의 반환값(문자열)을 받아서 변수.charAt()을 이용해 문자로 받아낸다.
		//5.	 4의 char의 문자 코드값을 얻는다. > 형변환
		//6. 	 5의 문자 코드값에서 -32 > 대문자의 문자 코드값
		//7.	 6의 문자 코드값을 char 형변환
		//8.	 콘솔에 "소문자 'a'의 대문자는 'a'입니다." 출력합니다.
		
		//코드작성 > Rework 검색
		//Ctrl + Shift + L
		
		
	}

}

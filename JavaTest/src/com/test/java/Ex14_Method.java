package com.test.java;

public class Ex14_Method {

	public static void main(String[] args) {
		
		
		/*
		 
	 		public   static   void      hello() {
	 		
	 			System.out.println();
	 		}
	 	
	 	
			접근지정자  정적키워드  반환자료형  메소드명	 인자 리스트 {
		
				구현코드
				업무코드(비즈니스 코드)
			}
		
		
			메소드 매개변수
			- 호출 -> (데이터) -> 메소드
		
			메소드 반환값
			- 메소드가 실행 뒤 호출한 곳에 값을 돌려주는 행동
			- 메소드 -> (데이터) -> 호출
			- 목적: 메소드 내에서 업무 진행의 결과를 이어서 사용하고자 반환
		
	 
		 */
		//getNum();  //콘솔에 아무것도 안 나옴 > 10만 딸랑 있기때문
		System.out.println(getNum());  //10 출력
		
		
		int num = getNum();   //num에 메소드를 저장(x) > 메소드의 반환값을 저장
		System.out.println(num);

		
		int age = 25;
		String  result = checkAge(age);
		
		System.out.println(result);
		
		
	}//main
	
	
	public static int getNum() {  //This method must return a result of type int
		//		 반환값이 int
		//리턴문, 반환문
		//- getNum을 호출한 곳에 아래의 값을 돌려준다.
		//- 하나의 값만 반환 가능하다.
		
		return 10;
	}
	
	public static void tert() {
		
		//return 100; 에러
	}
	
	
	public static String checkAge(int age) {
		
		String result = age >= 19 ? "성인" : "미성년자";
		
		return result;
		
	}
	
	

}




















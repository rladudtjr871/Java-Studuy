package com.test.java;


public class Re_Exception {

	public static void main(String[] args) {


/*
 			[SUMMARY] Exception 만들기
 
 
 			예외 처리, Exception Handling
			1. 전통적인 방식
				- 제어문 사용(조건문)
				
			2. 전용 처리 방식
				- try catch finally문 사용
 
 	
 		try문
		- try: 비즈니스 코드 작성
		- catch: 예외 처리 코드 작성
		
		조건?
		1. 일단 try 내부의 코드를 실행한다. > 업무 코드라서..
		2. 아무 문제 없음
		3. 빠져나감 > catch 실행 안함
		
		1. 일단 try 내부의 코드를 실행한다. > 업무 코드라서..
		2. 에러 발생!!!
		3. 남아있는 업무코드의 실행을 중단!!!
		4. 즉시, catch로 이동한다.
		5. catch 실행
 	

 
 
 
 		권장 > if문에서 if부분에 비즈니스 코드(긍적적인)가 오는게 가독성이 좋다
		if (num != 0) {
			//비즈니스 코드(= 업무 코드) > 주목적!!!
			System.out.printf("100 / %d = %d\n", num, 100 / num);
			
		} else {
			//예외처리 코드
			System.out.println("0을 입력하면 안됩니다.");
			
		}
		
		
		
		
		* 예외 미루기
		- 해당 영역에서 예외 처리를 할만한 상황이 안되면 다른 곳으로 예외처리의 책임을 떠넘길 수 있다.
		- 누군가는 던져진 에러를 처리해야한다.
		- throws Exception
		
		
		
		
		* 예외 던지기
		요구사항] 숫자 입력 > 처리
		조건] 반드시 짝수만 입력
		  	홀수 > 에러
		try {
			if (num % 2 == 1) {
				throw new Exception("홀수를 입력했습니다."); //강제 에러 발생!!!
			}
			
			System.out.println("업무 코드..");
		} catch (Exception e) {
			System.out.println("예외 처리");
			System.out.println(e.getMessage());
		}
		
		
		
 */
		
		//Exception 객체의 역할 > 과정 예시
		try {
			int num = 10;
			System.out.println(100 / num); //A. ArithmeticException		
			
			//throw new ArithmeticException(); > 에러가 나는 순간 해당 코드가 실행된다. > 던진다.
			
			
			
			int[] nums = {10, 20, 30};
			System.out.println(nums[0]); //B. ArrayIndexOutOfBoundsException
	
			//thorw new ArrayIndexOutOfBoundsException();
			
			
			
			Parent p = new Parent();
			Child c;
			
			//c = (Child)p; //C. ClassCastException
			
			Parent p2 = null;
			System.out.println(p2.toString()); //NullReferenceException
			
		} catch(ArithmeticException e) { 
			//ArithmeticException e = new ArithmeticException();
			//ArithmeticException e = new ArrayIndexOutOfBoundsException();
			//ArithmeticException e = new ClassCastException();
			System.out.println("0으로 나누기");
			
		} catch(ArrayIndexOutOfBoundsException e) {
			//ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
			//ArrayIndexOutOfBoundsException e = new ClassCastException();
			System.out.println("배열 첨자 오류");
			
		} catch(ClassCastException e) {
			//ClassCastException e = new ClassCastException();
			System.out.println("형변환 오류");
			
		} catch (Exception e) {
			//Exception > 모든 ???Exception의 부모 클래스
			System.out.println("예외 처리");
			
		}
		
		
		
		
		
		

	}

}


class Parent {
	
}


class Child extends Parent {
	
}
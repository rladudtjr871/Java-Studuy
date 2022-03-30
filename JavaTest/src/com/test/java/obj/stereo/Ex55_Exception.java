package com.test.java.obj.stereo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex55_Exception {

	public static void main(String[] args) {

		/*
		 
		 
		 	예외, Exception
		 	- 컴파일 발견x > 실행 중 발견 o
		 	- 런타임 오류
		 	- 개발자 미리 예측 o, x
		 	
		 	카톡
		 	- 메시지 전송 기능
			
			
			
						
			예외 처리, Exception Handling
			1. 전통적인 방식
				- 제어문 사용(조건문)
				
			2. 전용 처리 방식
				- try catch finally문 사용
			
			
			
		 
		 
		 */
		//m3(10);
		//String result = m2();

		
		
		//밑에 static을 제거하면 > 에러 왜?
		//static > static메소드에서는 this 사용 불가
		//this.m1();  //this. 이 생략
		
		//Ex55_Exception.m1(); //FM 표기법
		//m1();
	
		
		//m1에 static이 없을 경우 > 객체를 생성해서 호출해야한다.
		//Ex55_Exception ex = new Ex55_Exception();
		//ex.m1();
		
		
		//m1()을 자동생성하면 왜 private으로 생성되는가
		// > main메소드가 static이기 때문에
		
		//m1();
		//m2();
		//m3();
		
		try {
			m4();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		m5();

	}//main
	
	
	private static void m5() {
		
		//예외 던지기
		
		//요구사항] 숫자 입력 > 처리
		//조건] 반드시 짝수만 입력
		//	   홀수 > 에러
		
		
		int num = 5;
		
		if (num % 2 == 0) {
			System.out.println("업무 코드..");
		} else {
			System.out.println("예외 처리");
		}
		
		
		try {
			if (num % 2 == 1) {
				throw new Exception("홀수를 입력했습니다."); //강제 에러 발생!!!
			}
			
			System.out.println("업무 코드..");
		} catch (Exception e) {
			System.out.println("예외 처리");
			System.out.println(e.getMessage());
		}
		
		
	}


	private static void m4() throws Exception {
		
		//예외 미루기
		//- 해당 영역에서 예외 처리를 할만한 상황이 안되면 다른 곳으로 예외처리의 책임을 떠넘길 수 있다.
		//- throws Exception
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//Unhandled exception type IOException
		
		//String input = reader.readLine();
		
	}


	private static void m3() {

		//Exception 객체의 역할
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
		
		System.out.println("종료");
		
		
//		catch (Exception e) {
//			
//			System.out.println("예외 처리");
//			System.out.println(e.getMessage());
//			
//		}
		
		
	}


	private static void m2() {
		
		//Exception 객체의 역할
		
		int num = 0;
		
		try {
			System.out.println(100 / num); //A
		} catch(Exception e) {
			System.out.println("0으로 나누기를 시도");
		}
		
		
		int[] nums = {10, 20, 30};
		
		try {
			System.out.println(nums[5]); //B
		} catch (Exception e) {
			System.out.println("배열 첨자 오류");
		}
		
		
		
		Parent p = new Parent();
		Child c;
		
		try {
			c = (Child)p; //C
		} catch (Exception e) {
			System.out.println("형변환 오류");
		}
		
		
		
		
	}

	
	

	//메소드 자동 생성 > 생각해보자
	//1. private > 사고방지 > 안정성
	//2. static > 
	//3. void
	//4. ()
	
	private static void m1() {  //static 있을 때 없을 때..
		
		//요구사항] 숫자를 입력받아 연산을 하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		
		int num = scan.nextInt(); //Integet.parseInt(reader.readLine())
		
		//전통적인 방식
		
		//권장
		if (num != 0) {
			//비즈니스 코드(= 업무 코드) > 주목적!!!
			System.out.printf("100 / %d = %d\n", num, 100 / num);
			
		} else {
			//예외처리 코드
			System.out.println("0을 입력하면 안됩니다.");
			
		}
		
		
		//비권장 > 가독성 낮음
		if(num == 0) {
			//예외처리 코드
			System.out.println("0을 입력하면 안됩니다.");
			
		} else {
			//비즈니스 코드(= 업무 코드) > 주목적!!!
			System.out.printf("100 / %d = %d\n", num, 100 / num);
			
		}
		
		
		
		/*
		   if (조건) {
		   		참 블럭 > 긍정적
		   } else {
		        거짓 블럭 > 부정적
		   }
		   
		 */
		
		
		
		//try문
		//- try: 비즈니스 코드 작성
		//- catch: 예외 처리 코드 작성
		
		//조건?
		//1. 일단 try 내부의 코드를 실행한다. > 업무 코드라서..
		//2. 아무 문제 없음
		//3. 빠져나감 > catch 실행 안함
		
		//1. 일단 try 내부의 코드를 실행한다. > 업무 코드라서..
		//2. 에러 발생!!!
		//3. 남아있는 업무코드의 실행을 중단!!!
		//4. 즉시, catch로 이동한다.
		//5. catch 실행
		
		//try의 영역 > 예외가 발생할 것 같다고 예측 가능한 최소한의 영역에만 적용.
		try {
			//비즈니스 코드(= 업무 코드) > 주목적!!!
			System.out.printf("100 / %d = %d\n", num, 100 / num);
			
			System.out.println("나머지 업무 코드");
			
		} catch (Exception e) {
			//예외처리 코드
			System.out.println("0을 입력하면 안됩니다.");
			
			//Exception e
			//- 예외 객체
			//- 예외가 발생한 상황에 대한 정보를 알려준다.
			System.out.println(e.getMessage()); //에러 메시지를 보여줌
			e.printStackTrace(); //에러메시지를 보여줌
		}
		
		System.out.println("종료");
		
		
		//if문 vs try문
		//- if문: 사전에 미리 검사를 해서 사고가 안나게 처리..
		//- try: 일단 실행 > 감시!! > 사고가 터지면 그때 처리..
		
		
		
		
		
	}
	
	
	
//	private static void m3(int i) {
//		
//		
//	}

//	private static String m2() {
//		
//		return null;
//	}

	

}//Ex55





class Parent {
	
}


class Child extends Parent {
	
}


















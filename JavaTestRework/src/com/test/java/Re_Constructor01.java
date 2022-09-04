package com.test.java;

public class Re_Constructor01 {

	public static void main(String[] args) {

		
		/*
		 
		 	 [SUMMARY] 생성자 만들기
		 	 
		 	 생성자, Constructor
		   - (특수한 목적을 가지는)메소드
		   - 객체 멤버(변수)를 초기화하는 역할을 가지는 메소드
		   - 일반 메소드처럼 마음대로 호출이 불가능하다. > 객체가 생성될 때 딱 1번만 호출된다.
		   	  > 그 뒤에는 호출이 불가능 > 1회용!!!
		   - 생성자 이름은 클래스이름과 동일하다.
		 	 
		 	 
		    //개발자가 기본 생성자를 만들고 일부 멤버를 초기화하지 않으면
			// > 그 일부 멤버에 한해서는 자동으로 초기화 코드가 작성된다.
			//**** > 객체의 멤버 변수는 반드시 초기화 과정을 거치게 된다.
		  
		  
		  
		    //기본 생성자
			//1. 메소드명 == 클래스명
			//2. 반환값 명시 안함 > 생성자 반환값을 가질 수 없다. > 표현 안함
			//3. return문을 가질 수 없다.
			//4. 구현부는 해당 클래스의 멤버를 초기화하는 코드를 작성한다.(****)
		  
		  
		  
		  
		    //setter와 생성자 사용의 차이
			//setter는 Null 값인 상태에서 set메소드로 값을 넣어줘야한다.(기본값이 Null)
			//생성자는 기본 값을 지정할 수 있다. 생성자 오버로딩을 통해 초기 상태를 바꿀 수 있다.(기본값이 있다.)
		    //Mouse m5 = new Mouse("A100"); //생성과 동시에 값이 있다.
		     
		     
		    Object Array(객체 배열) )*****
			객체 배열의 초기화

			//Main(실행 파일에서)
			TV tvArray [] = new TV[3];
			//객체명 배열명[] = new연산자 생성자명(=객체명)[배열의 크기];

			tvArray[0] = new TV("_INFINIA", 1500000, "LED TV")_;
			tvArray[1] = new TV(_"XCANVAS", 1000000, "LCD TV"_);
			tvArray[2] = new TV(_"CINEMA", 2000000, "3D TV"_);
			//배열명[인덱스] = new연산자 생성자명(파라미터1, 파라미터2, 파라미터3);
		     
		     
		     
		     
		    //생성자를 여러개 생성(생성자 오버로딩)
			//- 대부분의 생성자가 비슷한 행동을 한다.
			//- 중복 코드 발생!!! > 중복코드를 줄이자!
			//- 다른 생성자 호출 형태 코드 개선 > this(); //생성자 호출하는 표현
			 
		class Developer {
	
			private String name;
			private String language;
	
			//A < B < C
	
			//A.
			public Developer() {
				//this.name = "익명";
				//this.language = "없음";
				
				//C를 호출
				this("익명", "없음");
				
			}
			
			//B.
			public Developer(String name) {
				//this.name = name;
				//this.language = "없음";
				
				//C를 호출
				this(name, "없음");
				
			}
			
			//C.
			public Developer(String name, String language) {
				//이름 유효성 검사
				this.name = name;
				//언어 유효성 검사
				this.language = language;
				
			}
		}
			  
			 
		 */

		
		
	}

}

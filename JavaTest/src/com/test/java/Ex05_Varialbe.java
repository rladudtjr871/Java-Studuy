package com.test.java;

public class Ex05_Varialbe {

	public static void main(String[] args) {

		//1. 각 자료형별 변수 만들기
		//2. 각 자료형별 리터럴 만드는 방법

		//정수형 
		byte b1;
		b1 = 10;  //10 > 정수형 리터럴
		System.out.println(b1);
		
		b1 = 127;
		System.out.println(b1);
	  //에러
	  //b1 = 128;
	  //System.out.println(b1);
	  //b1 = -129;
	  //System.out.println(b1);
		
		b1 = Byte.MAX_VALUE; //JDK가 제공하는 상수(미리 만들어져있는 상수)
		System.out.println(b1);
		
		b1 = Byte.MIN_VALUE;
		System.out.println(b1);
		
		
		short s1;
		s1 = 3000;
		System.out.println(s1);
		s1 = -3000;
		System.out.println(s1);
		
		s1 = Short.MAX_VALUE;
		System.out.println(s1);
		s1 = Short.MIN_VALUE;
		System.out.println(s1);
		
		
		int n1;
		n1 = 1000000000;
		System.out.println(n1);

		n1 = Integer.MAX_VALUE;
		System.out.println(n1); //2147483647
		
		
		long l1;
		l1 = 1000000000;
		System.out.println(l1);
		
		//에러
		//l1 = 2300000000; The literal 2300000000 of type int is out of range
		//System.out.println(l1);
		//위 같은 오류가 뜨는 이유는 2300..이라는 값이 메모리에서 integer타입으로
		//잡고 l1에 복사하는 것이기 때문에 23..값을 Integer타입으로 담을 수 없어서 뜨는 오류
		//결론 > 정수형 리터럴은 int 범위를 벗어나 표현할 수 없다.
		
		l1 = 2300000000L; //Long형 리터럴 > 접미어로 (L) 을 붙임
		System.out.println(l1);
		
		l1 = Long.MAX_VALUE;
		System.out.println(l1); //9223372036854775807
		
		
		
		
		//변수만 자료형이 있는게 아니라, 모든 리터럴(상수)도 자료형이 있다.
		//10
		//=
		//byte b2 순서로 진행
		
		byte  b2 = 10; 
		short s2 = 10;
		int   n2 = 10;
		long  l2 = 10; 
		
		System.out.println(b2); //10 > byte
		System.out.println(s2);
		System.out.println(n2);
		System.out.println(l2); 
		System.out.println(10); //여기 10이라는 숫자는 어떤 자료형? > int
		
		//**정수형 리터럴은 int이다.
		//CPU + 운영체제 > 64bit운영체제 > 32bit운영체제 > 16bit > 8bit
		// -> CPU가 한번에 메모리로부터 가져와서 처리하는 데이터의 양
		//예로부터 프로그래밍 언어의 'int' 자료형은 운영체제의 bit와 동일하다.
		
		//int -> 64bit
		//int -> 32bit
		//int -> 16bit
		
		//데이터를 CPU가 바로 가져다 쓸 수 있게 하려면.. 데이터가 int가 되는 것!
		
		byte b3; //1byte -> + 3byte -> 4byte
		short s3; //2byte -> + 2byte -> 4byte
		long l3; //8byte -> 1/2 -> 4byte + 4byte
		int n3; //4byte -> 4byte
		//정수형 자료형 4개 중 > 거의 int만 사용한다. + 가끔씩 long을 사용한다.
		
		//------------------------------------------------------------
		
		//**정수형 리터럴은 int이다. > CPU때문
		//**실수형 리터럴은 double이다. > 정밀도가 높아서
		
		//실수형 리터럴(상수)는 float인가? double인가?
		
		
		//TODO 정밀도란 무엇인가?
		//float > 단정도형
		float f1;
		f1 = 3.14F; //실수형 리터럴 표기법 > 접미어로 F를 붙인다.
		System.out.println(f1);
		
		//double > 배정도형
		double d1;
		d1 = 3.14;
		System.out.println(d1);
		
		f1 = 123.123456789012345678901234567890F; //소스점 이하 5자리
		d1 = 123.123456789012345678901234567890D; //소수점 이하 14자리
		System.out.println(f1);
		System.out.println(d1);
		
		//           9223372036854775807
		//  1.2345679E26 * 10^26 = 1234567900000000000000000 손실분 발생
		f1 = 123456789123456789123456789F; //1.2345679E26
		//  1.2345678912345679E26 * 10^26 = ...위 보다는 적지만 손실분 발생
		d1 = 123456789123456789123456789D; //1.2345678912345679E26
		System.out.println(f1); 
		System.out.println(d1); 
		
		//보통 실수형은 잘 사용 안한다.
		//손실분 발생때문에 반드시 필요한 경우나 손실분이 미미한 경우에만 사용한다
		
		//컴파일러는 기본적으로 어떤 단어가 오면.. 무언가의 식별자나 예약된 키워드라고 판단한다.
		//문자형
		char c1;
		c1 = 'A'; //문자형 상수(리터럴) 표기법
		System.out.println(c1);
		
		c1 = '1'; // 1은 숫자가 아니라 문자로서의 1이다. 
		System.out.println(c1);
		
		//Invalid character constant
		//c1 = '홍길동'; //char형은 반드시 1개의 문자만 저장할 수 있다.
		//System.out.println(c1);
		
		
		//논리형
		//상수의 종류
		boolean flag;
		flag = true;  //논리형 리터럴(true)
		flag = false; //논리형 리터럴(false)
		System.out.println(flag);
		
		//10
		//10L
		//3.4F
		//3.4
		//3.4D
		//'A'
		//true
		
		//문자열, String
		//-추가 자료형
		//-참조형에 속함
		//-문자의 집합
		
		String name;
		name = "홍길동"; //문자열 리터럴(상수) 표기법
		System.out.println(name);
		
		//A -> 저장
		char m1 = 'A';
		String m2 = "A";
		
		//ABC -> 저장
		//char m3 = 'ABC';
		String m4 = "ABC";
		
		//보통 char보다 String을 많이 사용
		
		String m5 = " "; //0개의 문자열 > 빈문자열, Empty String
		//char m6 = ' ';  //char은 빈문자 안된다.
		char m7 = '\0'; //빈문자(NULL 문자)
		
		//9개의 자료형
		//값형(8개) + 참조형(1개)
		
		//똑같은 값을 가지는 변수 2개 필요
		int age = 20;   //변수 = 값;
		int copy = age; //변수 = 변수;
		
		//***변수끼리 값을 복사할 수 있다.
		
		String str1 = "안녕하세요.";
		String str2 = "홍길동입니다.";
		String str3 = str1 + str2; //산술 연산(x), 문자열 연산자 > Concat
		System.out.println(str3);
		
		int a1 = 100;
		int a2 = 200;
		int a3 = a1 + a2;
		System.out.println("100 + 200 = 300");
		System.out.println("100 + 200 = " + a3); //산술 연산 vs 문자열 연산
		System.out.println(a1 + " + " + a2 + " = " + a3);
		//식별자를 "" 안에 넣으면 식별자가 아닌 그냥 문자가 된다. > 의미를 잃어버린다.
		
		//숫자형 데이터를 저장할 변수를 만들 때 주의할 점! (자료형 변수)
		//-수치로서의 데이터 > 더하기 빼기 가능!
		//-수차가 아닌 데이터 > 문자열로 취급!
		
		//1.몸무게
		int weight;
		weight = 70;
		
		//2.주민등록번호 앞자리(생년월일)
		int jumin; //절대금지
		jumin = 951205;
		System.out.println(jumin);
		
		//3.상품번호
		int productNo;
		productNo = 123;
		System.out.println(productNo);
		
		//올해 태어난 아기
		//2000-03-07
		jumin = 000307;
		System.out.println(jumin); //199
		
		//자바의 기수 표기법
		//-데이터 표시는 아래와 같이 3개의 기수법을 제공한다.
		//-출력은 기수법과 상관없이 항상 10진수로 출력된다.
		//1. 10진수 > 100   > 10
		//2. 8진수  > 0100  > 010  > 8
		//3. 16진수 > 0x100 > 0x10 > 16
		
		String jumin1 = "000503";
		
		
		
		//과제
		//-초보자
		//-각 자료형(9개) > 변수 10개 > 문장으로 출력하시오.
		//-자료형 + 변수 + 리터럴 + 출력
		
		//예시
		//1. 주변의 데이터 검색! > 내 키(180cm)
		//2. 1의 데이터가 자바의 어떤 자료형과 적합한지? > 매칭 > 정수 vs 실수 + 길이 > double
		//3. 2의 자료형 > 변수 선언하기 > 의미있게
		//4. 3의 변수 > 데이터 대입(자료형에 맞는 리터럴 표기법)
		
		//자료형마다 아래의 예제 10번씩 (총 90개)
		double height = 180.5;
		System.out.println("제 키는 " + height + "cm입니다.");
		
		
	}

}

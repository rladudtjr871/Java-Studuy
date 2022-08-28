package com.test.java;

import java.util.HashSet;
import java.util.Iterator;

public class Re_HashSet01 {

	public static void main(String[] args) {

/*
   
      	[SUMMARY] HashSet 만들기
   
   
		1. List
			- 순서가 있는 데이터 집합(******************)
		   	- 첨자(방번호)
		   	- 데이터 중복을 허용한다.
		   	- 요소 일괄 접근 > 루프(for)
		   		
		2. Set
		   	- 순서가 없는 데이터 집합
		   	- 식별자가 없다. > 방과 방을 구분할 수 없다.
		   	- 데이터 중복을 허용하지 않는다.(*************************)
		   	- 요소 일괄 접근 불가능 > 루프(for) x
		   		
		   		
		3. Map
		   	- 순서가 없는 데이터 집합
		   	- 키 + 값 (한쌍) (********************)
		   	- 데이터 중복을 허용한다.
		   	- 요소 일괄 접근 불가능 > 루프(for) x
   
   	
   	
   		-java.util 패키지에 HashSet, Iterator(인터페이스)를 이용
   		
   		HashSet<String> set = new HashSet<String>();
   
   	
   		1.요소 추가하기
			set.add("바나나");
   	
   	
   		2.요소 개수
			System.out.println(set.size());
   	
   	
   		3.덤프
			System.out.println(set);
   	
   	
   		4.요소 추가하기	
			System.out.println(set.add("바나나")); //set은 중복 값을 가질 수 없다. > 바나나가 1개만 나옴
   	
   	
   		5.요소 삭제
   		set.remove("바나나");
   		
   		
   		
   		*** HashSet이 중복값을 체크할 때 equals()와 hashCode()메소드를 사용한다.
   		
   		
   		
   		HashSet의 탐색(읽기)
		- 방을 구분할 수 있는 방법이 없어서 > 식별자 x
		- Iterator 사용 > 컬렉션 탐색 도구의 일종
		
			HashSet<String> set = new HashSet<String>();
		
			set.add("마우스");
			set.add("키보드");
			set.add("모니터");
			set.add("노트북");
			set.add("패드");
		
			****
			Iterator<String> iter = set.iterator();
   		
   			System.out.println(iter.hasNext());  //set 안에 가져올 데이터가 있나?
			System.out.println(iter.next()); 	 //데이텨 가져오기
   		
   		
   		
   		
   		
   		
   		
   		
   		
   		
   		
   		
   		* 추가사항
   		Case 1.
			HashSet<Person> set = new HashSet<Person>();
		
			set.add(new Person("홍길동", 20)); //1.
			set.add(new Person("홍길동", 25)); //2.
			set.add(new Person("홍길동", 20)); //3. 내부 데이터가 동일하지만 1번과 다른 사람
		
		
		Case 2.
			Person p = new Person("???", ??);
		
		               	 객체였을 때 주소값  >  문자열로 바꾸면? > 같은 문자열이면 같은 주소값을 가진다.
			p1 > "홍길동", 20 > 250(주소값) > "홍길동20" > 100(주소값)
			p2 > "아무개", 25 > 130(주소값) > "아무개25" > 200
			p3 > "홍길동", 20 > 310(주소값) > "홍길동20" > 100
   		
   		
   		
   		결론 > 객체를 생성하면 같은 값이라도 다른 주소값을 가지지만
   			> Case 2처럼 같은 값은 같은 주소를 가져야할 경우 해당 값을 문자열로 바꿔주면
   			> 같은 문자열 값을 가지게되고 메모리에서 문자열이 같으면
   			> 같은 문자열로 된 객체를 2개 3개 만드는게 아니라 하나의 문자열을 같이 쓴다(?)
   			> 따라서 서로 다른 객체의 값을 문자열로 바꾸면 같은 주소값을 가지게된다.
   	
   	
   	
   	
   	
   	
   
   
   
   
 */

	}

}

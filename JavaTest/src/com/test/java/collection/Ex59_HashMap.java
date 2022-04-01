package com.test.java.collection;

import java.util.ArrayList;
import java.util.HashMap; //모든 컬렉션이 util패키지에 들어있음

public class Ex59_HashMap {

	public static void main(String[] args) {

		
		/*
		   
		   ArrayList (list는 방번호가 들어간다)
		   - 요소 접근 > 첨자(index) 사용
		   - 순서가 있는 데이터 집합(방번호 == 요소의 순서)
		   ex) 강의실 6개 > 1강의실, 2강의실, 3강의실... 6강의실
		   - 스칼라 배열(Scalar Array)
		   - 요소 일괄 접근 > 루프(for)
		   - 요소끼리 구분이 불편함 > 식별자만 가지고 판단이 힘듬 > 식별자가 숫자..
		   - 첨자(index)는 유일하다.(*****)
		   - 값(value)은 중복이 가능하다.(*****) > 방번호가 유일해서...
		   
		   HashMap (map은 키를 사용)
		   - 요소 접근 > 키(key) 사용
		   - 순서가 없는 데이터 집합 > 방번호 없음 >   
		   ex) 강의실 6개 > 햇님반, 달님반, 별님반... 지구반
		   - 요소끼리 구분이 용이함 > 식별자가 의미있는 단어
		   - 요소 일괄 접근 불가능 > 루프(for)x
		   - 요소 > 키(key) + 값(value) > 키와 값을 한 쌍으로 하는 데이터 구조
		   - 키(key)는 유일하다(*****)
		   - 값(value)은 중복이 가능하다.(*****) > 키가 유일해서..
		 */
		
		
		//방의 이름을 문자열로 적고, 방 안에는 숫자를 넣겠습니다.
		//       key     value                      key     value
		HashMap<String, Integer> map = new HashMap<String, Integer>(); // 숫자 배열
		
		//점수 입력(국어, 영어, 수학)
		
		
		//1. 요소 추가
		//- V put(K key, V value)
		map.put("국어", 100); //int 국어 = 100; 이런 느낌
		map.put("영어", 90);
		map.put("수학", 80);
		System.out.println();
		
		//2. 요소 개수
		//- int size()
		System.out.println(map.size());
		System.out.println();
		
		//3. 요소 읽기
		//- V get(K key)
		System.out.println(map.get("국어"));
		System.out.println(map.get("영어"));
		System.out.println(map.get("수어"));
		System.out.println(map.get("과학")); //없는 key > value: null > 에러가 안 난다.
		System.out.println();
		
		//4. 일괄 탐색 > for > 불가능
		
		
		//5. 요소 수정 (1번과 같은 명령어?)
		//- V put(K key, V value)
		map.put("국어", 99); //추가(x) 수정(o)인 > 이유? > HashMap의 키는 유일하기 때문에 키가 있으면 수정으로 처리
		System.out.println(map.get("국어"));
		System.out.println();
		
		
		//6. 요소 검색
		//- boolean containsKey(K key)
		//- boolean containsValue(V value)
		
		System.out.println(map.containsKey("국어")); //배열 안에 국어점수가 있냐?
		System.out.println(map.containsKey("사회")); 
		
		System.out.println(map.containsValue(90)); //90점 맞은 과목이 있냐?
		System.out.println(map.containsValue(100));
		System.out.println();
		
		//7. 요소 삭제
		//- V remove(K key)
		map.remove("국어");
		System.out.println(map.size());
		System.out.println();
		
		//8. 초기화
		map.clear();
		System.out.println();
		
		//배열이 비었는가?
		System.out.println(map.isEmpty());
		System.out.println();
		
		
		
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("빨강");
		a1.add("파랑");	
		a1.add("노랑");
		
		System.out.println(a1.get(0)); //페이지 번호 -> 데이터 접근
		System.out.println();
		
		
		HashMap<String, String> a2 = new HashMap<String, String>();
		a2.put("red", "빨강");
		a2.put("blue", "파랑");
		a2.put("Yellow", "노랑");
		
		//Map == 사전 구조 > Dictionary
		System.out.println(a2.get("red")); //단어 -> 데이터 접근
		System.out.println();
		
		
		
		//toString() 재정의 > 덤프
		System.out.println(a1); //[빨강, 파랑, 노랑]
		System.out.println(a2); //{red=빨강, blue=파랑, yellow=노랑}
		
		
		
		
		
		
		
		
		

	}//main

}//Ex59

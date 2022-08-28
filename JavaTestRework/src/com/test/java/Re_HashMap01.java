package com.test.java;

public class Re_HashMap01 {

	public static void main(String[] args) {
/*
   
   		[SUMMARY] HashMap 만들기
   
   
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
   
   	
   		//java.util 패키지에 HashMap을 이용
   
   
   
   				 Key     Value                      Key     Value
   		HashMap<String, Integer> map = new HashMap<String, Integer>();
   
   
   
   		1. 요소 추가
		- V put(K key, V value)
			map.put("국어", 100);
   
   
   		2. 요소 개수
		- int size()
			System.out.println(map.size());
   
   
   		3. 요소 읽기
		- V get(K key)
			System.out.println(map.get("국어"));
   
   
   		4. 일괄 탐색 > for > 불가능
   
   
   		5. 요소 수정 (1번과 같은 명령어?)
		- V put(K key, V value)
			map.put("국어", 99); //추가(x) 수정(o)인 > 이유? > HashMap의 키는 유일하기 때문에 키가 있으면 수정으로 처리
			System.out.println(map.get("국어"));
   
   
   		6. 요소 검색
		- boolean containsKey(K key)
		- boolean containsValue(V value)
			System.out.println(map.containsKey("국어")); //배열 안에 국어점수가 있냐?
			System.out.println(map.containsValue(90)); //90점 맞은 과목이 있냐?
		
		
		
		7. 요소 삭제
		- V remove(K key)
			map.remove("국어");
   
   
   		8. 초기화
			map.clear();
   
   
   		9.배열이 비었는가?
			System.out.println(map.isEmpty());
   
   
   
   
   
   
   
   		- 2차원 배열 (ArrayList + HashMap) ***
   			
			ArrayList<HashMap<String, Integer>> list = new ArrayList<HashMap<String,Integer>>();
		
			HashMap<String, Integer> s1 = new HashMap<String,Integer>();
			s1.put("국어", 100);
			s1.put("영어", 90);
			s1.put("수학", 80);
		
			list.add(s1); //2차원 배열.add(1차원 배열)
   
   
   

   
   
   
   
   		*추가사항
   
   
   		Case 1. Array(ArrayList)
		- 루프 사용
		- 비용 낮음
		- 가독성 문제 > 과목을 식별 > 방번호
   
   
   		Case 2. HashMap
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer> ();
		-가독성 높음 > 과목을 식벌 > 이름(Key)
		- 루프 사용 불가능
		- 비용 낮음 > 틀을 안 만든다. > 장점이자 단점!!! > Key값이 틀리면 큰일!!
		- 객체를 1개만 만들 때는 Class보다 유리
   
   
   
   		Case 3. Class
		- 가독성 높음, HashMap 유사
		- 멤버에 루프 적용 불가능, HashMap 유사
		- 비용 높음
		- 객체를 2개 이상 만들 땐 HashMap보다 유리(오타를 줄일 수 있음)
   
   
   
   
   
   
   
   
   
   
   
   
 */

	}

}

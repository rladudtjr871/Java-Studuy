package com.test.java.collection;

import java.util.TreeMap;

public class Ex71_TreeMap {
	
	public static void main(String[] args) {
		
		
	
		//Tree + Map
		//- 이진트리 구조의 Map
		//- 자동 정렬 + 범위 검색(추출) 용이
		
		
		TreeMap<String,String> map = new TreeMap<String,String>();
		
		map.put("white", "하양");
		map.put("black", "검정");
		map.put("yellow", "노랑");
		map.put("red", "빨강");
		map.put("blue", "파랑");
		
		System.out.println(map.size());
		
		System.out.println(map);
		
		System.out.println(map.firstKey());
		System.out.println(map.firstEntry()); //MyHashMap02 > Item
		System.out.println(map.lastKey());
		
		System.out.println(map.headMap("m")); //m 이전 값
		System.out.println(map.tailMap("m")); //m 이후 값(m포함)
		System.out.println(map.subMap("r", "w"));	
		
		
		
		/*
		  
		   *** 길이 가변(배열보다 좋은 점)
		   
		   처음 선택(1,5,7) 8시간 > 상황에 맞춰(2,3,4,6,8) 2시간
		   
		   List
		   1. ArrayList > 배열이 필요할 때, 삽입/삭제(x, 느림)
		   2. LinkedList > ArrayList 대체 + 삽입/삭제(o, 빠름)
		   3. Stack > 스택 구조
		   4. Queue > 큐 구조
		   
		   Set
		   5. HashSet > 중복값 배제 집합이 필요할 때
		   6. TreeSet > 5 + 정렬
		   
		   Map
		   7. HashMap > 키/값의 배열이 필요할 때
		   8. TreeMap > 7 + 정렬
		   
		   
		   
		 */
		
					
	}
}

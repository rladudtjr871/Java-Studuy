package com.test.java.question.collection;

public class Q05 {

	public static void main(String[] args) {


		//배열 생성
		MySet set = new MySet();

		//추가
		set.add("홍길동");
		set.add("아무개");
		set.add("하하하");
		System.out.println(set);
		System.out.println();
		
		//개수
		System.out.println(set.size());


		//삭제
		set.remove("아무개");
		System.out.println(set);
		System.out.println();

		//개수
		System.out.println(set.size());

		//탐색 + 읽기
		while (set.hasNext()) {
		      System.out.println(set.next());
		}

		//초기화
		set.clear();
		System.out.println(set.size());

	}//main

}//Q05

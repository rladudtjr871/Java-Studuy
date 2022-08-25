package com.test.java.question.io;

import java.io.File;
import java.util.HashSet;

public class Sol07 {

	public static void main(String[] args) {
		
	
		
		
	
		//sol01();
		sol02();
	}//main

	private static void sol02() {
		//HashSet > 중복값
		//1. 수업 중
		//2. 안 배운 기능도 추가
		
		//Set > 집합 > 교집합, 합집합, 차집합..
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		
		set1.add("빨강");
		set1.add("노랑");
		set1.add("파랑");
		set1.add("주황");
		set1.add("검정");
		
		set2.add("빨강"); //v
		set2.add("녹색");
		set2.add("분홍");
		set2.add("주황"); //v
		set2.add("검정"); //v
		
		
		//set1.addAll(set2);
		//System.out.println(set1); //합집합
		
		//set1.retainAll(set2);
		//System.out.println(set1); //교집합
		
		//set1.removeAll(set2);
		//System.out.println(set1); //차집합+
		
		
		File dirA = new File("C:\\class\\qustion\\동일 파일\\MusicA");
		File dirB = new File("C:\\class\\qustion\\동일 파일\\MusicB");
		
		
		String[] listA = dirA.list();
		String[] listB = dirB.list();
		
		HashSet<String> list1 = new HashSet<String>();
		HashSet<String> list2 = new HashSet<String>();
		
		
		for (String s : listA) {
			list1.add(s);
		}
		
		for (String s : listB) {
			list2.add(s);
		}
		
		list1.retainAll(list2);
		
		System.out.println(list1);
		
	}

	private static void sol01() {
		
		File dirA = new File("C:\\class\\qustion\\동일 파일\\MusicA");
		File dirB = new File("C:\\class\\qustion\\동일 파일\\MusicB");
		
		
		String[] listA = dirA.list();
		String[] listB = dirB.list();
		
		
		for (String s1 : listA) {
			for (String s2 : listB) {
				if(s1.equals(s2)) {
					System.out.println(s1);
					break;
				}
				
				
			}
		}
		
	}

	
}

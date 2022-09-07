package com.test.java;



public class Re_ArrayList {

	public static void main(String[] args) {

/*
 	
 			[SUMMARY] 컬렉션, Collection 만들기
 			
 			컬렉션, Collection
		   - JCF, Java Collection Framework
		   - (향상된) 배열
		   - 기존의 순수 배열의 성능 향상(입출력), 사용법 개량
		   - 내부에 순수 배열을 가지고 있다. > public 메소드들을 통해서 성능 or 사용법 개량
		   - 길이 가변 > 방의 개수를 마음대로 늘리고 줄이는게 가능
		   - 자료구조
 			
 			
 			
 		   컬렉션 종류
		   1. List 계열
		   		- ArrayList
		   		- LinkedList
		   		- Queue
		   		- Stack
		   		- Vecter(legacy)
		   		
		   2. Set 계열
		   		- HashSet
		   		- TreeSet
		   
		   4. Map 계열
		   		- HashMap
		   		- TreeMap
		   		- Properties(legacy)
		   		- HashTable(legacy)
 			
 			
 			
 		   interface
		   - collection
		   		-List
		   			- ArrayList
		   			- Queue
		   			- Stack
		   		-Set
		   		
		   - Map
		   
		   
		   
 			
 			ArrayList 클래스
		   - ArrayList(C) -> List(I) -> Collection(I)
		   - 순수 배열과 구조가 가장 유사함
		   - 첨자(index)를 사용해서 요소(element)에 접근
 			
 			
	 		//컬렉션
			//- 타입 명시(Integer) > 제네릭
			//- 길이 명시 > ??? > 가변
			
			ArrayList<Integer> list1 = new ArrayList<Integer>();
 			
 			
 			
 		   ArrayList 사용법
			ArrayList<String> list = new ArrayList<String>(); //문자열 배열
 			
 			
 			
 			//1. 요소 추가하기
			//- boolean add(T value)
			//- 배열의 맨 마지막에 추가하기 > Append Mode
			
				list.add("바나나");

 			//2. 요소의 개수
			//- int size()
			
				System.out.println(list.size());

			//3. 요소의 접근
			//- T get(int index)
			
				System.out.println(list.get(0));

			//4. 요소의 수정
			//- list[0] = 10; 대입, 수정
			//- String set(int index, T new Value)
			//String temp = list.set(2, "파인애플");
			
				list.set(2, "파인애플");

			//5. 요소의 삭제
			//- 순수 배열은 요소 삭제 불가능
			//- 컬렉션은 요소 삭제 가능
			//- T remove(int index) > 방 번호를 찾아서 삭제
			//- boolean remove(T value) > 값을 찾아서 삭제 > 처음 만나는 요소만 삭제
			//- ***** 시프트가 발생한다!!! > 삭제된 방 이후의 모든 요소는 모두 방번호 -1 감소

 				list.remove(2);

			//6. 탐색
			//- 루프(for..)
 			//반복문 > for, while, do while, for

			//배열값을 하나씩 변수에 담고 쓰는 행위를 반복
			//for (변수 : 배열(컬랙션)) {
	    	//}
		
				for (String item : list) {
					System.out.println(item);
				}

			//7. 요소의 추가
			//- 배열의 원하는 위치에 요소를 추가
			//- 삽입(새치기)
			//- void add(int index, T value)
			//- ***** 시프트가 발생한다. > 삽입된  방 이후의 모든 요소가 방번호 + 1
			
				list.add(2, "망고");

			//8. 요소의 검색
			//- int indexOf(T value)
			//- int lastIndexOf(T value)
			//- boolean contains(T value)
			
				System.out.println(list.indexOf("사과"));
				System.out.println(list.contains("사과"));

			//9. 초기화
			//- 모든 요소 삭제
			//- void clear()

				list.clear();

			//10. 빈 배열 확인?
			//- boolean isEmpty()
			
				System.out.println(list.size() == 0);
				System.out.println(list.isEmpty());
			
			
			
			

 			
 			무슨 배열을 쓸지 고민일때
 			- 길이로 선택!!
			- 배열(고정) vs ArrayList(불확실)
 			
 			
 			
 			--------------------------------------------------
 			ArrayList 다차원
 			
 		int[] ns1 = new int[3];
		int[][] ns2 = new int[2][3];
		int[][][] ns3 = new int[2][3][3];
		
		//ns1 > 1차원 정수 배열
		ArrayList<Integer> ms1 =new ArrayList<Integer>();
		
		//ns2 > 2차원 정수 배열
		ArrayList<ArrayList<Integer>> ms2 = new ArrayList<ArrayList<Integer>>();
		
		//ns3 > 3차원 정수 배열
		ArrayList<ArrayList<ArrayList<Integer>>> ms3 = new ArrayList<ArrayList<ArrayList<Integer>>>();
		
		
		
		//2차원 배열 초기화
		ns2[0][0] = 10; //*****
		
		//2차원 컬렉션의 초기화
		ArrayList<Integer> list = new ArrayList<Integer>(); //*****
		list.add(10);										//*****
		ms2.add(list);	
 			
 			
 		--------------------------------------------------------------
 		
 		
 		배열에 객체 넣기
 		Cup[] clist = new Cup[5];
		
		clist[0] = new Cup("", 0); //1번째 컵 객체
		clist[1] = new Cup("", 0); //2번째 컵 객체
		clist[2] = new Cup("", 0); //3번째 컵 객체
		clist[3] = new Cup("", 0); //4번째 컵 객체
		clist[4] = new Cup("", 0); //5번째 컵 객체
		
		
		
		
		ArrayList<Cup> list = new ArrayList<Cup>();
		
		list.add(new Cup("", 0)); //1번째 컵
		list.add(new Cup("", 0)); //2번째 컵
		list.add(new Cup("", 0)); //3번째 컵
		list.add(new Cup("", 0)); //4번째 컵
		list.add(new Cup("", 0)); //5번째 컵
 	
 
 */

	}

}

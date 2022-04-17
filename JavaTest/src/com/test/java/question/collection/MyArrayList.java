package com.test.java.question.collection;

//ArrayList와 동일한 동작을 하는 클래스를 선언하시오.
//모든 기능의 디테일 > 실제 ArrayList와 비교

public class MyArrayList {
	
	private String[] list; //ArrayList의 내부 배열(*****)
	private String[] list2;
	private int index; 		// **** 가장 중요한 역할
	private String s;
	private int point;
	
	public MyArrayList() {
		this.index = 0;
		this.s = "";
	}

	//list.add("홍길동")
	public boolean add(String value) {
		//배열 길이 늘리고 원래 값 어찌 옮기지?
		
		
		//첫 add 인지?
		if (this.index == 0) {
			this.list = new String[4];
		}
		

			
		//배열의 길이를 2배로
		if (this.index == this.list.length) {
			
			for (int i=0; i<this.list.length; i++) {
				s += this.list[i] + ",";
			}

			list = new String[this.list.length * 2];
			list = s.split(","); //얘가 문제
			
			
		}
		
		
			
		
		//현재 배열의 길이보다 많은 데이터를 입력하려고 하는지?
		// > 배열을 2배로 늘려 + 복사 + 교체
		
		this.list[this.index] = value;
		this.index++;
		//this.list[1] = value;
		
		return true;
	}
	
	
	//요소를 가져온다.
	public String get(int index) {
		
		//없는 방번호를 요청했을 때?
		if(list[index] == null || list.length <= index) {
			return "잘못된 위치의 방 번호 입니다.";
		}
		
		
		return this.list[index];
	}
	
	
	//요소의 개수
	public int size() {
		
		
		return this.index;
	}
	
	
	
	public String set(int index, String value) {
		//-원하는 위치의 요소를 다른 값으로 수정한다.
		//-return: 수정하기 전 요소의 값
		
		String temp = this.list[index];
		this.list[index] = value;
		
		return temp;
	}
	
	
	public String remove(int index) {
		//원하는 위치의 요소를 삭제한다.
		//index: 삭제할 요소의 위치
		//return: 삭제된 요소의 값
		
		//list[index] = null;
		for(int i=this.list.length-1; i>=index; i--) {
			this.list[index] = this.list[index+1];
		}
		
		this.list[this.list.length-1] = null;
		
		return this.list[index];
	}
	
	
	public boolean add(int index, String value) {
		//Insert 모드로 원하는 위치에 요소를 삽입한다.
		//index: 수정할 요소의 위치
		//value: 수정할 요소의 값
		//return: 성공 유무
		
		if(-1<index && index<list.length) {
			list[index] = value;
			return true;
		} else {
			return false;
		}
		
	}
	
	
	public int indexOf(String value) {
		//원하는 요소가 몇번째 위치에 있는지 위치값을 반환한다.
		//value: 검색할 요소의 값
		//return: 검색된 요소의 위치
		
		for(int i=0; i<list.length; i++) {
			
			if(list[i].equals(value)) {
				return i;
			}	
		}
		return -1;	
	}
	

	public int lastIndexOf(String value) {
		//원하는 요소가 몇번째 위치에 있는지 위치값을 반환한다.
		//value: 검색할 요소의 값
		//return: 검색된 요소의 위치
		
		for (int i=this.list.length-1; i>=0; i--) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		
		return -1;
		
	}
	
	
	public void clear() {
		//배열의 모든 요소를 삭제한다.
		
		for(int i=0; i<this.list.length; i++) {
			this.list[i] = null;
		}
		
	}
	
	
	public void trimToSize() {
		//배열안의 요소의 개수만큼 배열의 길이를 줄인다.
		for(int i=0; i<this.list.length; i++) {
			if (this.list[i].equals(null)) {
				this.point = i;
				break;
			}
		}
		
		this.list = new String[this.point]; //길이는 줄였지만 값은 어찌 옮기지?
		
	}
	
	
}

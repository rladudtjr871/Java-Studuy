package com.test.java.question.collection;

import java.util.Arrays;

public class MySet {


	private String[] set;
	private int index;
	private int removeIndex;
	private int setIndex;
	
	public MySet() {
		this.set = new String[4];
		this.index = 0;
		this.setIndex = 0;
	}
	
	
	
	public boolean add(String value) {
		//배열에 요소를 추가한다.
		//value: 추가할 요소
		//return: 성공 유무
		
		if(checkIndex(value)) { //이미 있을경우
			return false;
		}
		
		
		if(checkLength()) {
			doubleLength();
		}
		
		
		this.set[index] = value;
		this.index ++;
		return true;
		
		
		
	}
	
	//배열 길이 두배로 중가
	private void doubleLength() {

		String[] temp = new String[set.length * 2];
		
		for(int i=0; i<index; i++) {
			temp[i] = set[i];
			
		}
		
		set = temp;
	}


	//배열이 꽉찰 경우
	private boolean checkLength() {

		if(this.set.length == this.index) {
			return true;
		}
		
		return false;
	}


	//이미 값이 있을 경우
	private boolean checkIndex(String value) {
		
		for(int i=0; i<index; i++) {
			if(set[i].equals(value)) {
				this.removeIndex = i;
				return true;
			}
		}
		
		return false;
	}



	public int size() {
		//요소의 개수를 반환한다.
		//return: 요소의 개수
		
		return index;
		
	}
	
	public boolean remove(String value) {
		//배열의 요소를 삭제한다.
		//s: 삭제할 요소
		//return: 성공 유무
		
		if (checkIndex(value)) {
			for(int i=this.removeIndex; i<this.set.length-1; i++) {
				this.set[i] = this.set[i+1];
			}
			this.index--;
			return true;
		}
		
	return false;	
	}
	

	public void clear() {
		//배열의 모든 요소를 삭제한다.
		
		this.index = 0;
		
	}
	
	
	public boolean hasNext() {
		//다음 요소가 있는지 확인한다.
		//return: 존재 유무
		
		if(this.setIndex < this.index) {
			return true;
		}
		return false;
		
	}
	
	public String next() {
		//다음 요소를 반환한다.
		//return: 다음 요소
		
		this.setIndex++;

		return this.set[this.setIndex-1];
		
	}



	@Override
	public String toString() {
		return "MySet [set=" + Arrays.toString(set) + ", index=" + index + ", removeIndex="
				+ removeIndex + "]";
	}
	
	
	
	
	
}

package com.test.java.question.collection;

import java.util.Arrays;

public class MyHashMap {

	private String[] key;
	private String[] value;
	private int index;
	
	public MyHashMap() {
		index = 0;
	}
	
	public String put(String key, String value) {
		//키와 값을 요소로 추가한다.
		//key: 추가할 요소의 키
		//value: 추가할 요소의 값
		//return: null
		
		if (index == 0) {
			this.key = new String[4];
			this.value = new String[4];
		}
		
		int index2 = checkKey(key);
			
		if (index2 > -1) {
			String tmp = this.value[index2];
			this.value[index2] = value;
			return tmp;
		}
		
		if (checkLength()) {
			doubleLength();
		}
		
		
		
		
		
		this.key[index] = key;
		this.value[index] = value;
		this.index++;
		
		return null;
	}
	
	
	private int checkKey(String key) {
		
		for (int i=0; i<this.index; i++) {
			if (this.key[i].equals(key)) {
				return i;
			}
		}

		
		return -1;
	}

	private void doubleLength() {
		
		String[] copyKey = new String[this.key.length * 2];
		String[] copyValue = new String[this.value.length * 2];
		
		for (int i=0; i<key.length; i++) {
			copyKey[i] = key[i];
			copyValue[i] = value[i];
		}
		
		key = copyKey;
		value = copyValue;
		
		
	}

	private boolean checkLength() {

		if (index == key.length) {
			return true;
		}
		
		return false;
	}

	public String get(String key) {
		//키에 대응하는 요소의 값을 가져온다.
		//key: 가져올 요소의 키
		//return: 가져올 요소의 값
		
		for(int i=0; i<index; i++) {
			
			if(this.key[i].equals(key)) {
				return value[i];
			}
			
		}
		
		return null;
	}
	
	
	public int size() {
		//요소의 개수를 반환한다.
		//return: 요소의 개수
					
		return this.index;
	}
	
	
	
	public String remove(String key) {
		//원하는 키의 요소를 삭제한다.
		//key: 삭제할 요소의 키
		//return: 삭제된 요소의 값

		int index2 = checkKey(key);
		
		if(index2 == -1) {
			return null;
		}
		
		
		for(int i=index2; i<this.key.length-1; i++) {
			this.key[i] = this.key[i+1];
			this.value[i] = this.value[i+1];
		}
				
			
		this.index--;
		

		
		return null;

	}
	
	
	public boolean containKey(String key) {
		//해당 키가 존재하는지 확인한다.
		//key: 확인할 키
		//return: 키의 존재 유무
		
		if (checkKey(key) > -1) {
			
			return true;
		}
		
		return false;
	}
	
	
	public boolean containsValue(String value) {
		//해당 값이 존재하는지 확인한다.
		//value: 확인할 값
		//return: 값의 존재 유무
		
		for(int i=0; i<index; i++) {
			if(this.value[i].equals(value)) {
				return true;
			}
		}
		
		return false;
		
	}
	
	public void clear() {
		//배열의 모든 요소를 삭제한다.
		
		this.index = 0;
		
	}
	
	
	public void trimToSize() {
		//배열안의 요소의 개수만큼 배열의 길이를 줄인다.
		
		String[] copyKey = new String[this.index];
		String[] copyValue = new String[this.index];
		
		for(int i=0; i<index; i++) {
			copyKey[i] = this.key[i];
			copyValue[i] = this.value[i];
		}
		
		this.key = copyKey;
		this.value = copyValue;
		
	}

	
	
	@Override
	public String toString() {
		return "MyHashMap [key=" + Arrays.toString(key) + ", value=" + Arrays.toString(value)
				+ ", index=" + index + "]";
	}
	
	
	
	

}

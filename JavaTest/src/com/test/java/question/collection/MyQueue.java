package com.test.java.question.collection;

import java.util.Arrays;

public class MyQueue {

	private String[] queue;
	private int index;
	private String txt;
	
	public MyQueue() {
		this.index = 0;
	}
	
	
	public boolean add(String value) {
		//값을 순차적으로 추가한다.
		//value: 추가할 요소의 값
		//return: 성공 유무
		try {
			init();
			
			if(checkLength()) {
				doubleLengtn();
			}
			
			this.queue[index] = value;
			index++;
			
			return true;
		
		} catch (Exception e){
			return false;
		}
		
	}

	
	private void doubleLengtn() {
		
		String[] temp = new String[this.queue.length * 2];
		
		for(int i=0; i<this.queue.length; i++) {
			temp[i] = this.queue[i];
		}
		this.queue = temp;
	}


	private boolean checkLength() {
		
		if(index == this.queue.length) {
			return true;
		}
		
		return false;
	}


	private void init() {
		
		if(index == 0) {
			this.queue = new String[4];
		}
		
	}


	public String poll() {
		//값을 순차적으로 가져온다.
		//return: 가져올 요소의 값
		
		if(!checkNull()) {
			throw new NullPointerException();
		}
		
		
		txt = this.queue[0];
		
		for (int i=0; i<this.index-1; i++) {
			
				this.queue[i] = this.queue[i+1];

		}
		this.queue[index-1] = null;
		this.index--;
		
		return txt;
	}
	
	
	private boolean checkNull() {

		if(this.queue[0] == null) {
			return false;
		}
		
		return true;
	}


	public int size() {
		//요소의 개수를 반환한다.
		//return: 요소의 개수
		
		return this.index;
		
	}
	
	
	public String peek() {
		//이번에 가져올 값을 확인한다.
		//value: 값 반환
		
		return queue[0];
	}
	
	
	public void clear() {
		//배열의 모든 요소를 삭제한다.
		
		for(int i=0; i<index; i++) {
			
			queue[i] = null;
			
		}
		index = 0;
		
	}
	
	
	public void trimToSize() {
		//배열안의 요소의 개수만큼 배열의 길이를 줄인다.
		
		String[] temp = new String[index];
		
		for (int i=0; i<index; i++) {
			temp[i] = queue[i];
		}
		
		queue = temp;
		
	}


	@Override
	public String toString() {
		String temp = "";
		temp += "\r\n";
		temp += String.format("length: %d\n", this.queue.length); //배열의 실제 길이
		temp += String.format("index: %d\n", this.index);
		temp += String.format("[\n");
		
		for (int i=0; i<this.queue.length; i++) {
			temp += String.format("  %d: %s,\n", i, queue[i]);
		}
		
		
		temp += String.format("]\n");
		return temp;
	}
	
	
	
	
}

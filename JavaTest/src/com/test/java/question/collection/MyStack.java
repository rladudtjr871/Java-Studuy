package com.test.java.question.collection;

public class MyStack {
	
	private String[] stack;
	private int index;
	private String txt;
	
	public MyStack() {
		this.index = 0;
	}
	
	
	public boolean push(String value) {
		//값을 순차적으로 추가한다.
		//value: 추가할 요소의 값
		//return: 성공 유무
		
		init();
		
		if(checkLength()) {
			doubleLength();
		}
		
		this.stack[index] = value;
		this.index++;
		
		return true;
		
	}
	
	
	
	private boolean checkLength() {

		if(this.stack.length == this.index) {
			return true;
		}
		
		return false;
	}


	private void doubleLength() {

		String[] temp = new String[this.stack.length * 2];
		
		for (int i=0; i<this.stack.length; i++) {
			temp[i] = this.stack[i];
		}
		
		this.stack = temp;
		
	}


	private void init() {
		
		if(index == 0) {
			stack = new String[4];
		}
		
		
	}


	public String pop() {
		//값을 순차적으로 가져온다.
		//return: 가져올 요소의 값
		txt = this.stack[index-1];
		
		this.stack[index-1] = null;
		this.index--;
		
		return txt;
		
	}
	
	
	
	public int size() {
		//요소의 개수를 반환한다
		//return: 요소의 개수
		
		
		return index;
		
	}
	
	
	public String peek() {
		//이번에 가져올 값을 확인한다.
		//value: 값 반환
		
		return stack[this.index-1];
		
		
		
	}
	
	
	public void clear() {
		//배열의 모든 요소를 삭제한다.
		
		this.index = 0; //0부터 다시 시작
		
	}
	
	
	public void trimToSize() {
		//배열안의 요소의 개수만큼 배열의 길이를 줄인다.
		
		String[] temp = new String[index];
		
		for(int i=0; i<index; i++) {
			temp[i] = stack[i];
		}
		
		stack = temp;
		
	}
	
	
	@Override
	public String toString() {
		
		String temp = "";
		temp += "\r\n";
		temp += String.format("length: %d\n", this.stack.length);
		temp += String.format("index: %d\n", this.index);
		temp += "[\n";
		for(int i=0; i<this.stack.length; i++) {
			temp += String.format("  %d: %s,\n", i, this.stack[i]);
		}
		temp +=" ]\n";
		
		return temp;
	}
	
	
}

package com.test.java.question.collection;

public class Q02 {

	public static void main(String[] args) {


		//배열 생성
		MyStack stack = new MyStack();
		
		//추가
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		stack.push("주황");
		stack.push("검정");
		
		System.out.println(stack);
		
		//읽기
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		
		System.out.println(stack);
		
		
		//개수
		System.out.println(stack.size());
		
		
		//확인
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
		
		//크기 조절
		stack.trimToSize();
		System.out.println(stack);
		
		//초기화
		stack.clear();
		System.out.println(stack.size());

		
		

	}

}

package com.test.java.obj.inheritance;

public class Ex42_Object {

	public static void main(String[] args) {


		
		//Object 클래스
		//- 사용자가 만드는 모든 클래스는 자동으로 Object 클래스를 상속받는다.
		//- 모든 클래스의 근원 클래스, Root Class
		//- 모든 클래스는 Object 클래스로부터 파생된다. > ex)단군 할아버지
		//- Object 멤버는 모든 클래스에게 상속된다. > 모든 클래스들에게 필요하다고 생각된느 공통 기능을 구현해놨다.
		
		//root(뿌리) > Node(줄기) > Leaf Node (리프 노드), Terminal Node
		
		//- Class Object is the root of the class hierarchy.
		//- Every class has Object as a superclass.
		//- All objects,including arrays, implement the methods of this class.
		
		
		
		Object o1 = new Object();
		
		
		int[] a1 = new int[5];
		
		
		Test t1 = new Test();
		
		
		
		

	}//main

}//Ex42


class Test extends Object {
	
	public int a;
	public int b;
	
}

class Other extends Test {
	
	public int c;
	public int d;
	
}







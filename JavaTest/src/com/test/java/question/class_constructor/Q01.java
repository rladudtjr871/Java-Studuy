package com.test.java.question.class_constructor;

public class Q01 {

	public static void main(String[] args) {

		//학생 1
		Student s1 = new Student(); //기본 생성자 호출
		System.out.println(s1.info());

		//학생 2
		Student s2= new Student("홍길동", 13); //오버로딩 생성자 호출
		System.out.println(s2.info());

		//학생 3
		Student s3= new Student(3, 10, 30); //오버로딩 생성자 호출
		System.out.println(s3.info());

		//학생 4
		Student s4= new Student("아무개", 12, 1, 5, 11); //오버로딩 생성자 호출
		System.out.println(s4.info());

	}//main

}//Q01







class Student {
	
	private String name;
//	private int age;
//	private int grade;
//	private int classNumber;
//	private int number;
	
	private String ageTxt;
	private String gradeTxt;
	private String classNumberTxt;
	private String numberTxt;
	
	public Student() {
		
		this("미정", 0, 0, 0, 0);
	}
	
	public Student(String name, int age, int grade, int classNumber, int number) {
		
		if (age == 0) {
			this.ageTxt = "미정";
		} else {
			this.ageTxt = age + "세";
		}
			
		if(grade == 0) {
			this.gradeTxt = "미정";
		} else {
			this.gradeTxt = grade + "";
		}
		
		if(classNumber == 0) {
			this.classNumberTxt = "미정";
		} else {
			this.classNumberTxt = classNumber + "";
		}
		
		if(number == 0) {
			this.numberTxt = "미정";
		} else {
			this.numberTxt = number + "";
		}
		
		this.name = name;
		
		
		
	}
	
	public Student(String name, int age) {
		
		this(name, age, 0, 0, 0);
		
	}
	
	public Student(int grade, int classNumber, int number) {
		
		this("미정", 0, grade, classNumber, number);
		
	}
	
	String info() {
		
		String txt;
		
		
		txt = String.format("%s(나이: %s, 학년: %s, 반: %s, 번호: %s)\n"
				, this.name
				, this.ageTxt
				, this.gradeTxt
				, this.classNumberTxt
				, this.numberTxt);
				
		return txt;
	}
	
	
	
}











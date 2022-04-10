package com.test.java.question.class_access;

public class Q04 {

	public static void main(String[] args) {

		Employee e1 = new Employee();

		e1.setName("홍길동");
		e1.setDepartment("홍보부");
		e1.setPosition("대리");
		e1.setTel("010-1234-5678");
		e1.setBoss(null); //직속 상사 없음

		e1.info();


		Employee e2 = new Employee();

		e2.setName("아무개");
		e2.setDepartment("홍보부");
		e2.setPosition("사원");
		e2.setTel("010-2441-8569");
		e2.setBoss(e1); //직속 상사 e1(홍길동)

		e2.info();
		

	}//main

}//Q04



class Employee {
	
	private String name;
	private String department;
	private String position;
	private String tel;
	private Employee boss;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		
		if(checkName(name)) {
			this.name = name;
		} else {
			System.out.println("잘못된 이름을 입력했습니다.");
		}
		
		
	}





	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		
		switch(department) {
			
			case "영업부":
				this.department = department;
				break;
				
			case "기획부":
				this.department = department;
				break;
				
			case "총무부":
				this.department = department;
				break;
				
			case "개발부":
				this.department = department;
				break;
				
			case "홍보부":
				this.department = department;
				break;
				
			default:
				System.out.println("잘못된 부서를 입력했습니다.");
				break;
		}
		
		
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		
		switch(position) {
			case "부장":
				this.position = position;
				break;
			case "과장":
				this.position = position;
				break;
			case "대리":
				this.position = position;
				break;
			case "사원":
				this.position = position;
				break;
			default:
				System.out.println("직책을 잘못 입력하셨습니다.");
				break;
		}
		
		
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		
		if (Checktel(tel)) {
			this.tel = tel;
		} else {
			System.out.println("잘못된 양식의 번호를 입력했습니다.");
		}
	}



	public Employee getBoss() {
		return boss;
	}



	public void setBoss(Employee boss) {
		

		if (boss != null) {
			if(this.department.equals(boss.getDepartment())) {
				this.boss = boss;
			} else {
				System.out.println("직속상사를 잘못 입력 했습니다.");
			}
			
		} 
	}


	
	//이름 검사
	private boolean checkName(String name) {
		
		if (name.length() < 2 || name.length() > 5) {
			return false;
		}
		
		for (int i=0; i<name.length(); i++) {
			
			char c = name.charAt(i);
			
			if(c < '가' || c > '힣') {
				return false;
			}
			
			
		}
		
		return true;
		
	}
	
	
	//전화번호 검사
	private boolean Checktel(String tel) {
		
		
		String number = "010-";
		if (tel.substring(0, 3).equals(number)) {
			return false;
		}
	
		for (int i=0; i<tel.length(); i++) {
			
			
			if (tel.charAt(i) == '-') {
				continue;
			} else if ('0' > tel.charAt(i) || tel.charAt(i) > '9') {
				return false;
			}
				

			
		} 
		return true;
		
	}

	public void info() {
		
		if (boss != null) {
			System.out.printf("[%s]\n", this.name);
			System.out.printf("- 부서: %s\n", this.department);
			System.out.printf("- 직위: %s\n", this.position);
			System.out.printf("- 연락처: %s\n", this.tel);
			System.out.printf("- 직속상사 %s(%s %s)\n\n", this.boss.name, this.boss.department, this.boss.position);
			System.out.println();
		} else {

			System.out.printf("[%s]\n", this.name);
			System.out.printf("- 부서: %s\n", this.department);
			System.out.printf("- 직위: %s\n", this.position);
			System.out.printf("- 연락처: %s\n", this.tel);
			System.out.println("- 직속상사: 없음");
			System.out.println();
		}
	}
	
	
}
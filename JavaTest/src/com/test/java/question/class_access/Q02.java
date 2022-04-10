package com.test.java.question.class_access;

public class Q02 {

	public static void main(String[] args) {

		
		
		Note note = new Note();

		note.setSize("B4");
		note.setColor("노란색");
		note.setPage(25);
		note.setOwner("홍길동");

		System.out.println(note.info());
		
		
		Note note2 = new Note();

		note2.setSize("A4");
		note2.setColor("검정색");
		note2.setPage(100);

		System.out.println(note2.info());
		
	}//main

}//Q02


class Note {
	
	private String size;
	private String color;
	private int page;
	private String owner = "";
	private int price;
	private String pageThick = "";
	private int addFee = 500;
	private String txt = "";

	public void setSize(String size) {
		if(checkSize(size)) {
			this.size = size;
		} else {
			System.out.println("잘못된 사이즈를 입력했습니다.");
			
		}
		

	}
	

	private boolean checkSize(String size) {
		
		switch(size) {
			case "A3":
				addFee += 400;
				return true;
						 	
			case "A4":
				addFee += 200;
				return true;
				
			case "A5":
				return true;
				 
			case "B3":
				addFee += 500;
				return true;
				 
			case "B4":
				addFee += 300;
				return true;
				 
			case "B5":
				addFee += 100;
				return true;
				 
			default:
				return false;

		}
	}


	public void setColor(String color) {
		
		switch(color) {
			case "검정색":
				addFee += 100;
				this.color = color;
			break;
			
			case "흰색":
				
				this.color = color;
			break;
			
			case "노란색":
				addFee += 200;
				this.color = color;
			break;
			
			case "파란색":
				addFee += 200;
				this.color = color;
			break;
			
			default:
				System.out.println("잘못된 색상을 입력했습니다.");
				this.color = " ";
				break;
		}
	}
	

	public void setPage(int page) {
		
		if (page >= 10 && page <= 200) {
			this.page = page;
			
			if (9<page && page<51) {
				addFee += (page-10)*10;
				this.pageThick = "얇은";
				
			} else if(50<page && page<101) {
				addFee += (page-10)*10;
				this.pageThick = "보통";
				
			} else if(100<page && page<201) {
				addFee += (page-10)*10;
				this.pageThick = "두꺼운";
				
			} else {
			System.out.println("잘못된 페이지 수입니다.");
			}
		}
			
	}




	public void setOwner(String owner) {
		
		
			if(checkOwner(owner)) {
				this.owner = owner;
			} else {
				System.out.println("주인 없는 노트");
			}
		
	}


	private boolean checkOwner(String owner) {
		
		

			for(int i=0; i<owner.length(); i++) {
				char c = owner.charAt(i);
				
				if(c < '가' 
					|| c > '힣' 
					|| owner.length() > 5 
					|| owner.length() < 2) {
					return false;
				}
					
			}
		
		
		return true;
	}
	
	public String info() {
		
		if (this.owner == "") {
			txt = "■■■■■■ 노트 정보 ■■■■■■\n주인 없는 노트\n■■■■■■■■■■■■■■■■■■■■■■\n";
			return txt;
		}
		String txt = String.format("■■■■■■ 노트 정보 ■■■■■■\n소유자: %s\n특성: %s %s %s노트\n가격: %,d\n■■■■■■■■■■■■■■■■■■■■■■"
						, this.owner
						, this.color
						, this.pageThick
						, this.size
						, this.addFee);
		
		return txt;
	}
	
	
}
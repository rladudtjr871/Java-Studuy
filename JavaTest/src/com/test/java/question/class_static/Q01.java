package com.test.java.question.class_static;

public class Q01 {

	public static void main(String[] args) {

		//포장 직원
		Packer packer = new Packer();
		
		//연필
		Pencil p1 = new Pencil();
		p1.setHardness("HB");
		packer.packing(p1);
		
		Pencil p2 = new Pencil();
		p2.setHardness("4B");
		packer.packing(p2);
		
		
		//지우개
		Eraser e1 = new Eraser();
		e1.setSize("Large");
		packer.packing(e1);
		
		
		//볼펜
		BallPointPen b1 = new BallPointPen();
		b1.setThickness(0.3);
		b1.setColor("black");
		packer.packing(b1);

		BallPointPen b2 = new BallPointPen();
		b2.setThickness(1.5);
		b2.setColor("red");
		packer.packing(b2);

		
		//자
		Ruler r1 = new Ruler();
		r1.setLength(30);
		r1.setShape("줄자");
		packer.packing(r1);

		
		//결과 확인
		packer.countPacking(0);
		System.out.println();
		packer.countPacking(1);
		System.out.println();
		packer.countPacking(2);
		System.out.println();
		packer.countPacking(3);
		System.out.println();
		packer.countPacking(4);
		
		
		
	}//main

}//Q08




class Packer {
	
	private static int pencilCount = 0;
	private static int eraserCount = 0;
	private static int ballPointPenCount = 0;
	private static int rulerCount = 0;
	private int type;
	
	public void packing(Pencil pencil) {
		//연필을 검수하고 포장한다.
		//Pencil pencil : 연필
		if (pencil.getHardness().equals("")) {
			System.out.println("잘못된 흑연 등급입니다.");
			System.out.println("포장에 실패했습니다.");
		} else {
			System.out.println(pencil.info());
			Packer.pencilCount++;
			
		}

	}
	
	public void packing(Eraser eraser) {
		//지우개를 검수하고 포장한다.
		//Eraser eraser : 지우개
		if (eraser.getSize().equals("")) {
			System.out.println("잘못된 지우개 크기입니다.");
			System.out.println("포장에 실패했습니다.");
			
		} else {
			System.out.println(eraser.info());
			Packer.eraserCount++;
		}
	}
	public void packing(BallPointPen ballPointPen) {
		//볼펜을 검수하고 포장한다.
		//BallPointPen ballPointPen : 볼펜
		if (ballPointPen.getThickness() == 0 || ballPointPen.getColor().equals("")) {
			if (ballPointPen.getThickness() == 0) {
				System.out.println("잘못된 볼팬 두께입니다.");
				System.out.println("포장에 실패했습니다.");
			} else {
				System.out.println("잘못된 볼펜 색상입니다.");
				System.out.println("포장에 실패했습니다.");
			}
			
		} else {
			System.out.println(ballPointPen.info());
			Packer.ballPointPenCount++;
		}
	}


	public void packing(Ruler ruler) {
		//자를 검수하고 포장한다.
		//Ruler ruler : 자

		if(ruler.getLength() == 0 || ruler.getShape().equals("")) {
			if(ruler.getLength() == 0) {
				System.out.println("잘못된 길이의 자입니다.");
				System.out.println("포장에 실패했습니다.");
			} else {
				System.out.println("잘못된 형태의 자입니다.");
				System.out.println("포장에 실패했습니다.");
			}
			
		} else {
			System.out.println(ruler.info());
			Packer.rulerCount++;
		}
	}
	public void countPacking(int type) {
//		포장한 내용물 개수를 출력한다.
//		int type : 출력할 내용물의 종류
//		0 : 모든 내용물
//		1 : 연필
//		2 : 지우개
//		3 : 볼펜
//		4 : 자
		System.out.println("=====================");
		System.out.println("포장 결과");
		System.out.println("=====================");
		
		switch(type) {
			case 0:
				System.out.printf("연필: %d회\n", Packer.pencilCount);
				System.out.printf("지우개: %d회\n", Packer.eraserCount);
				System.out.printf("볼펜: %d회\n", Packer.ballPointPenCount);
				System.out.printf("자: %d회\n", Packer.rulerCount);
				break;
				
			case 1:
				System.out.printf("연필: %d회\n", Packer.pencilCount);
				break;
			case 2:
				System.out.printf("지우개: %d회\n", Packer.eraserCount);
				break;
			case 3:
				System.out.printf("볼펜: %d회\n", Packer.ballPointPenCount);
				break;
			case 4:
				System.out.printf("자: %d회\n", Packer.rulerCount);
				break;
		}
		
	}
	
}//Packer




class Pencil {
	private String hardness;
	//private boolean flag = false;
	
	public String getHardness() {
		return hardness;
	}

	public void setHardness(String hardness) {
		//흑연 등급(4B, 3B, 2B, B, HB, H, 2H, 3H, 4H)
		if (checkHardness(hardness)) {
			this.hardness = hardness;
		} else {
//		System.out.println("잘못된 흑연 등급입니다.");
//		System.out.println("포장에 실패했습니다.");
			this.hardness = "";
		}
		
	}
	
	private boolean checkHardness(String hardness) {
		if (!hardness.equals("4B")
				&& !hardness.equals("3B")
				&& !hardness.equals("2B")
				&& !hardness.equals("B")
				&& !hardness.equals("HB")
				&& !hardness.equals("2H")
				&& !hardness.equals("3H")
				&& !hardness.equals("4H")
				&& !hardness.equals("H")) {
			//flag = false;
			return false;
			
		}
		//flag = true;
		return true;
	}

	public String info() {
		//if (flag) {
		return String.format("포장 전 검수: %s 진하기 연필입니다.\n포장을 완료했습니다.", this.hardness);
		//}
		//밑에 문장은 아닐경우 어차피 출력 안된다.
		//return String.format("잘못된 흑연 등급입니다.\n포장에 실패했습니다.", null);
	}

}//Pencil




class Eraser {
	
	private String size;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		//지우개 크기(Large, Medium, Small)
		if (checkSize(size)) {
			this.size = size;
		} else {
		this.size = "";
		}
	}
	
	private boolean checkSize(String size) {

		if (!size.equals("Large")
				&& !size.equals("Medium")
				&& !size.equals("Small")) {
			return false;
		}
		return true;
		
	}

	public String info() {
		
		return String.format("포장 전 검수: %s 사이즈 지우개입니다.\n포장을 완료했습니다.", this.size);
	}
	
}//Eraser




class BallPointPen {
	
	private double thickness;
	private String color;
	
	
	public double getThickness() {
		return thickness;
	}
	
	public void setThickness(double thickness) {
		//볼펜 심 두께(0.3mm, 0.5mm, 0.7mm, 1mm, 1.5mm)
		if (checkThickness(thickness)){
		this.thickness = thickness;
		} else {
			this.thickness = 0;
		}
		
	}
	


	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		//볼펜 색상(red, blue, green, black)
		
		if(checkColor(color)) {				
			this.color = color;
		} else {
			this.color = "";
		}
	}
	
	private boolean checkThickness(double thickness) {
		
		if (thickness != 0.3
				&& thickness != 0.5
				&& thickness != 0.7
				&& thickness != 1.0
				&& thickness != 1.5) {
			return false;
		}
		return true;
	}
	
	private boolean checkColor(String color) {
		if (color != "red"
				&& color != "blue"
				&& color != "green"
				&& color != "black") {
			return false;
		}
		return true;
	}

	public String info() {
		
		return String.format("포장 전 검수: %s 색상 %.1fmm볼펜입니다.\n포장을 완료했습니다.", this.color, this.thickness);
	}
	
	
}//BallPointPen



class Ruler {
	
	private int length;
	private String shape;
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		//자 길이(30cm, 50cm, 100cm)
		
		if (checkRulerLength(length)) {
			this.length = length;
		} else {
			this.length = 0;
		}
		
	}

	public String getShape() {
		return shape;
	}
	
	public void setShape(String shape) {
		//자 형태(줄자, 운형자, 삼각자)
		if (checkRulerShape(shape)) {
			this.shape = shape;
		} else {
			this.shape = "";
		}
		
	}
	
	

	private boolean checkRulerLength(int length) {

		if (length != 30 && length != 50 && length != 100) {
			return false;
		}
		
		return true;
	}
	
	private boolean checkRulerShape(String shape) {
		if (shape.equals("줄자") && shape.equals("운형자") && shape.equals("삼각자")) {
			return false;
		}
		return true;
	}
	
	public String info() {
		
		return String.format("포장 전 검수: %dcm %s입니다.\n포장을 완료했습니다.", this.length, this.shape);
	}
	
}//Ruler

















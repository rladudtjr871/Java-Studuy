package com.test.java.question.class_access;

import java.util.Calendar;

public class Q06 {

	public static void main(String[] args) {


		Refrigerator r = new Refrigerator();

		Item item1 = new Item();
		item1.setName("김치");
		item1.setExpiration("2022-4-8");
		r.add(item1);// 냉장고에 넣기

		Item item2 = new Item();
		item2.setName("깍두기");
		item2.setExpiration("2022-4-1");
		r.add(item2);// 냉장고에 넣기

		Item item3 = new Item();
		item3.setName("멸치볶음");
		item3.setExpiration("2022-4-3");
		r.add(item3);// 냉장고에 넣기

		Item item4 = r.get("깍두기");// 냉장고에서 꺼내기
		System.out.printf("%s의 유통기한 : %s\n", item4.getName(), item4.getExpiration());

		System.out.printf("냉장고 안의 총 아이템 개수 : %d개\n", r.count());

		r.listItem();


	}// main

}// Q06



class Refrigerator {


	private int i = 0;
	private Item[] items = new Item[100];

	public void add(Item item) {
		this.items[i] = item;
		System.out.printf("\'%s\'를 냉장고에 넣었습니다.\n", this.items[i].getName());
		i++;
	}

	public Item get(String name) {
		
		int cnt = 0;
		
		for (int j=0; j<i; j++) {
			if (items[j].getName().equals(name)) {
				break;
			} else {
				cnt++;
			}
		}
		
		Item a = items[cnt];
		
		for (int j=cnt; j<items.length-1; j++) {
			items[j] = items[j+1];
		}
		i++;
		return a;
	}

	public int count() {
		return i;
	}

	public void listItem() {
		//StringBuilder s = new StringBuilder();
		System.out.println();
		System.out.println("[냉장고 아이템 목록]");
		//s.append("\r\n");
		
		for(int j=0; j<i; j++) {
			if (items[j] != null) {
				System.out.printf("%s(%s)\n", items[j].getName(), items[j].getExpiration());
			}
		}
		
	}


}


class Item {
	private String name;
	private String expiration;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		
		this.expiration = expiration;
	}

}



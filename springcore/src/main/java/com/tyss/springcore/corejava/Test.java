package com.tyss.springcore.corejava;

public class Test {

	public static void main(String[] args) {

		MyArrayList list = new MyArrayList(5);

		list.add(25);
		list.add(20);
		list.add(35);
		list.add(56);
		list.add(45);
		list.add(40);

		System.out.println(list);

		System.out.println("specific element");
		System.out.println(list.get(2));

	}

}

package com.tyss.springcore.corejava;

import java.util.Arrays;

public class MyArrayList {

	Object[] array;
	Object[] default_array = {};

	private int position = 0;

	public MyArrayList() {
		array = default_array;
	}

	public MyArrayList(int size) {
		array = new Object[size];
	}

	public void add(Object element) {
		if (size() >= array.length) {
			grow();
		}
		array[position++] = element;

	}

	public Object get(int index) {

		return array[index];

	}

	public void set(int element, int index) {

		array[index] = element;

	}

	public int size() {
		return position;
	}

	public void grow() {

		Object[] temp = new Object[array.length + 7];

		System.arraycopy(array, 0, temp, 0, array.length);

		array = temp;

	}

	public Object remove(int index) {

		Object deleted_value = array[index];
		System.arraycopy(array, index, deleted_value, index - 1, array.length - 1);
		array[--position] = 0;
	
		return deleted_value;

	}

	public String toString() {
		
		
		for (int i = 0; i < array.length; i++) {

			if (array[i] != null) {
				System.out.println(array[i]);
			}
		}

		return "";

	}

}

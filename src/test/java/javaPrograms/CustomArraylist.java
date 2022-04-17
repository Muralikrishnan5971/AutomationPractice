package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArraylist<T> {

	private Object[] data;
	private static int DEFAULT_SIZE = 10;
	private int size = 0;

	private CustomArraylist() {

		this.data = new Object[DEFAULT_SIZE];
	}

	public void add(int num) {

		if (isFull()) {

			reSize();
		}

		data[size++] = num;
	}

	private void reSize() {

		Object[] temp = new Object[data.length * 2];

		// copy the items in current array to new array
		for (int i = 0; i < data.length; i++) {

			temp[i] = data[i];
		}

		data = temp;
	}

	private boolean isFull() {

		return size == data.length;
	}

	public T remove() {

		T removed = (T) (data[--size]);

		return removed;
	}

	public T get(int index) {

		return (T) data[index];
	}

	public int size() {

		return size;
	}

	public void set(int index, T value) {

		data[index] = value;
	}

	@Override
	public String toString() {

		return Arrays.toString(data);
	}

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		CustomArraylist<Integer> customList = new CustomArraylist();
		customList.add(5);
		customList.add(9);
		customList.add(7);
		// customList.add("murali");
		// customList.add(1);

		System.out.println(customList);
		System.out.println(customList.size);

	}
}

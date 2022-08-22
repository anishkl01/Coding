package stackusingarrays;

import java.util.Arrays;

public class StackArray {
	int[] arr = new int[5];
	int count=0;

	@Override
	public String toString() {
		int[] contains = Arrays.copyOfRange(arr, 0, count);
		return Arrays.toString(contains);

	}
	public boolean isEmpty() {
		return count == 0;
	}
	public boolean isFull() {
		return count == arr.length;
	}

	public void push(int value) {
		if (isFull()) {
			System.out.println("Stack is Full");
		} else {
			arr[count] = value;
			count++;
		}
	}

	public int pop() {
		if (isEmpty())
			System.out.println("Stack is Empty");

		return arr[--count];
	}
	public int peek() {
		if(isEmpty())
			System.out.println("Stack is Empty");
		return arr[count-1];
	}
}

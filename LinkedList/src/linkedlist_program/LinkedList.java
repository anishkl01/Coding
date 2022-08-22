package linkedlist_program;

import java.util.Arrays;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size;

	@Override
	public String toString() {
		return head + " ";
	}

	private class Node {
		private int value;
		private Node next;

		public String toString() {
			return value + "->" + next;
		}

	}

	public void addFirst(int data) {
		size++;
		Node newnode = new Node();
		newnode.value = data;
		if (head == null) {
			head = tail = newnode;
			return;
		}
		newnode.next = head;
		head = newnode;
	}

	public void addLast(int data) {
		size++;
		Node newnode = new Node();
		newnode.value = data;

		if (head == null) {
			head = tail = newnode;
		} else {
			tail.next = newnode;
			tail = newnode;
		}

	}

	public void removeFirst() {
		size--;
		if (head == null) {
			head = tail = null;
		} else {
			Node temp = head.next;
			head.next = null;
			head = temp;
		}

	}

	public Node previousNode(Node node) {
		Node temp = head;
		while (temp != null) {
			if (temp.next == node) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}

	public void removeLast() {
		size--;
		if (head == null) {
			head = tail = null;
		} else {
			Node previous = previousNode(tail);
			previous.next = null;
			tail = previous;
		}

	}

	public int size() {
		return size;
	}

	public int indexOf(int data) {
		int index = 0;
		Node temp = head;
		while (temp != null) {
			if (temp.value == data) {
				return index;
			}
			temp = temp.next;
			index++;

		}
		return -1;
	}

	public boolean contains(int data) {
		Node temp = head;
		while (temp != null) {
			if (temp.value == data) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public void reverse() {
		Node previous = head;
		Node current = head.next;
		while (current != null) {
			Node next = current.next;
			current.next = previous;

			// update
			previous = current;
			current = next;

		}
		head.next = null;
		head = previous;

	}

	public int kthNode(int k) {
		Node s = head;
		Node f = head;

		for (int i = 0; i < k - 1; i++) {
			f = f.next;
		}
		while (f != tail) {
			s = s.next;
			f = f.next;
		}
		return s.value;
	}

	public void toArray() {
		int[] arr = new int[size];
		int index = 0;
		Node temp = head;
		while (temp != null) {
			arr[index] = temp.value;
			index++;
			temp = temp.next;
		}
		System.out.println(Arrays.toString(arr));
	}

}

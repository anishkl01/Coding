import java.util.Arrays;

public class Linkedlist {
	private Node head;
	private Node tail;
	private int size;

	@Override
	public String toString() {
		return head + " ";
	}

	private class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

		@Override
		public String toString() {
			return data + " -> " + next;
		}

	}

	public void addFirst(int data) {
		size++;
		Node newnode = new Node(data);

		if (head == null) {
			head = tail = newnode;

		}
		newnode.next = head;
		head = newnode;
	}

	public void addLast(int data) {
		size++;
		Node newnode = new Node(data);

		if (head == null) {
			head = tail = newnode;
		}
		tail.next = newnode;
		tail = newnode;
	}

	public void removeFirst() {
		size--;
		if (head == null) {
			head = tail = null;
		}
		Node temp = head.next;
		head.next = null;
		head = temp;
	}

	private Node previousNode(Node node) {
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
		if (head == null)
			head = tail = null;

		Node previous = previousNode(tail);
		previous.next = null;
		tail = previous;
	}

	public boolean contains(int data) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == data) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public int size() {
		return size;
	}

	public int indexOf(int data) {
		Node temp = head;
		int index = 0;
		while (temp != null) {
			if (temp.data == data) {
				return index;
			}
			temp = temp.next;
			index++;
		}
		return -1;
	}

	public void toArray() {
		int[] arr = new int[size];
		Node temp = head;
		int index = 0;
		while (temp != null) {
			arr[index++] = temp.data;
			temp = temp.next;
		}
		System.out.println(Arrays.toString(arr));
	}

	public void reverse() {
		Node previous = head;
		Node current = head.next;

		while (current != null) {
			Node next = current.next;
			current.next = previous;

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
		return s.data;
	}

	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		list.addFirst(12);
		list.addFirst(90);
		list.addFirst(10);
		list.addFirst(11);
		list.addLast(67);
		list.removeFirst();
		System.out.println(list);

		System.out.println(list.contains(900));
		System.out.println(list.kthNode(1));
		list.reverse();
		System.out.println(list);
//		System.out.println(list.indexOf(12));
//		list.toArray();

	}
}

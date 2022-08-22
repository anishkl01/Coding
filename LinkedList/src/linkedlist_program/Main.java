package linkedlist_program;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		list.addLast(50);
		list.addLast(70);
		list.addLast(48);
		list.addLast(90);
		list.addLast(78);
		list.addLast(67);

		System.out.println(list);
		list.removeLast();
		System.out.println(list);

		list.toArray();

		System.out.println(list.kthNode(6));

		list.reverse();
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.indexOf(67));
		System.out.println(list.contains(89));
	}
}

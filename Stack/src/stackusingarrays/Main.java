package stackusingarrays;

public class Main {
	public static void main(String[] args) {
		StackArray sa = new StackArray();
		sa.push(10);
		sa.push(20);
		sa.push(30);
		sa.push(70);
		sa.push(56);
		System.out.println(sa);
		System.out.println(sa.peek());
		sa.pop();
		sa.pop();
		System.out.println(sa.peek());
		System.out.println(sa);

	}
}

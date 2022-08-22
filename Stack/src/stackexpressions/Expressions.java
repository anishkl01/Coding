package stackexpressions;

import java.util.Stack;

public class Expressions {

	public boolean isbalanced(String input) {
		Stack<Character> stack = new Stack<>();
		for (char ch : input.toCharArray()) {
			if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				if (!stack.isEmpty()) {
					stack.pop();
					return true;
				}
			}
		}
		return false;
	}
}
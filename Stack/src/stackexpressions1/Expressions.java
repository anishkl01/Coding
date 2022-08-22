package stackexpressions1;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class Expressions {
	private final List<Character> leftbrackets = Arrays.asList('(', '[', '{', '<');
	private final List<Character> rightbrackets = Arrays.asList(')', ']', '}', '>');

	public boolean isBalanced(String input) {
		Stack<Character> stack = new Stack<>();

		for (char ch : input.toCharArray()) {
			if (isLeftBrackets(ch)) {
				stack.push(ch);

			}
			if (isRightBrackets(ch)) {
				if (stack.isEmpty())
					return false;
				var top = stack.pop();
				if (isBracketsMatched(top, ch)) {
					return true;
				}

			}

		}
		return false;
	}

	public boolean isLeftBrackets(char ch) {
		return leftbrackets.contains(ch);
	}

	public boolean isRightBrackets(char ch) {
		return rightbrackets.contains(ch);
	}

	public boolean isBracketsMatched(char left, char right) {
		return leftbrackets.indexOf(left) == rightbrackets.indexOf(right);
		
	}
	
	

}

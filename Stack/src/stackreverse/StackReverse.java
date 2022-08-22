package stackreverse;

import java.util.Stack;

public class StackReverse {

	public String reverse(String input) {
		Stack<Character> s1 = new Stack<>();
		for(char ch : input.toCharArray()) {
			s1.push(ch);
		}
		StringBuffer reverse = new StringBuffer();
		while(!s1.empty()) {
			reverse.append(s1.pop());
		}
		return reverse.toString();
	}

}
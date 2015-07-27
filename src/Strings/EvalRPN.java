package Strings;

import java.util.Stack;

public class EvalRPN {

	public int calcEvalRPN(String tokens[]) {
		
		String operator = "+-*/";
		Stack<String> stack = new Stack<>();

		for (String str : tokens) {
			if (!operator.contains(str)) {
				stack.add(str);

			} else {
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				int index = operator.indexOf(str);
				switch (index) {
				case 0:
					stack.push(String.valueOf((a+b)));
					break;
				case 1:
					stack.push(String.valueOf((b-a)));
					break;
				case 2:
					stack.push(String.valueOf((a*b)));
					break;
				case 3:
					stack.push(String.valueOf((b/a)));
					break;
				}
			}
		}

		return Integer.valueOf(stack.pop());
	}
}

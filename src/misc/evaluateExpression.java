package misc;

import java.util.Stack;

public class evaluateExpression {

	public int evaluatePostfix(String str) {
		int result = 0;
		Stack<Integer> stack = new Stack<>();
		char tokens[] = str.toCharArray();
		System.out.println(tokens[3]=='+');
		for (int i = 0; i < str.length(); i++) {
			System.out.print(tokens[i]+" ");
			if (tokens[i] == ' ')
				continue;

			if (tokens[i] >= '0' && tokens[i] <= '9') {
				StringBuffer sbuf = new StringBuffer();
				// There may be more than one digits in number
				while (i < tokens.length && tokens[i] >= '0'
						&& tokens[i] <= '9')
					sbuf.append(tokens[i++]);
				stack.push(Integer.parseInt(sbuf.toString()));
			} else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*'
					|| tokens[i] == '/') {
				result = applyOps(tokens[i], stack);
				stack.push(result);
			}

		}

		return stack.pop();
	}

	public int applyOps(char c, Stack<Integer> stack) {
		int result = 0;
		int a = stack.pop();
		int b = stack.pop();
		switch (c) {
		case '+':
			result = (a + b);
			break;
		case '-':
			result = (a - b);
			break;
		case '*':
			result = (a * b);
			break;
		case '/':
			if (b == 0)
				return 0;
			else {
				result = (a * b);
				break;
			}
		}
		return result;
	}
}

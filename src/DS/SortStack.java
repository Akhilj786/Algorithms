package DS;

import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s1 = new Stack<Integer>();
		int array[] = { 2,1,8,9,6 };
		for (int i : array)
			s1.add(i);
		System.out.println(sortStack(s1));
	}

	public static Stack<Integer> sortStack(Stack<Integer> s1) {
		if (s1 == null)
			return null;
		if (s1.isEmpty() || s1.size() == 1)
			return s1;
		Stack<Integer> s2 = new Stack<>();
		while (!s1.isEmpty()) {
			int temp = s1.pop();

			while (!s2.isEmpty() && s2.peek() > temp)
				s1.push(s2.pop());
			s2.push(temp);

		}
		return s2;
	}

}

package misc;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.Stack;

public class parathensis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check Paranthensis:" + isbalanced1("({)}"));
		String strings[] = { "Abcd", "{}", "{abc}", "{av(ac)", "{}()[]{([])}" };
		for (String s : strings)
			System.out.println("" + checkParanthesis(s));
	}

	@SuppressWarnings("unchecked")
	public static boolean isbalanced1(String str) {
		if (str.length() % 2 != 0)
			return false;
		Hashtable<Character, Character> ht = new Hashtable<Character, Character>();
		ht.put('(', ')');
		ht.put('{', '}');
		ht.put('[', ']');

		Set<Character> open = new HashSet<Character>();
		open.add('(');
		open.add('{');
		open.add('[');

		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (open.contains(ch))
				st.add(ch);
			else {
				if (st.isEmpty())
					return false;
				else {
					char c = st.pop();
					if (ch != ht.get(c))
						return false;
				}
			}
		}

		return true;
	}

	public static boolean checkParanthesis(String str) {
		Stack<Character> s = new Stack<Character>();
		String bracket = "(){}[]";
		boolean flag = true;
		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			int index = bracket.indexOf(current);
			if (index != -1 && index % 2 == 1) {
				char prev = bracket.charAt(index - 1);
				while (!s.isEmpty() && s.peek() != prev
						&& bracket.indexOf(s.peek()) < 0) {
					s.pop();
				}
				if (s.peek() == prev)
					s.pop();
				else
					return false;
				// if (s.isEmpty() || bracket.indexOf(s.peek())>0)
				// return false;
				// s.pop();
			} else {
				if (index != -1 && index % 2 == 0)
					flag = false;
				s.push(current);
			}

		}
		return (s.isEmpty() || flag);
	}
}
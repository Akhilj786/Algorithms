package Strings;
/*
 * https://github.com/techpanja/interviewproblems/blob/master/src/strings/isomorphicstrings/Isomorphic.java
 */

import java.util.Hashtable;

public class stringIsomorphic {

	public boolean checkIsomorphic(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s1.length();
		if (len1 != len2)
			return false;
		Hashtable<Character, Character> hash = new Hashtable<>();
		for (int i = 0; i < len1; i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			if ((!hash.containsKey(c1)) && (!hash.containsValue(c2)))
				hash.put(c1, c2);
			if (hash.get(c1) == null)
				return false;
			if (!hash.get(c1).equals(c2))
				return false;
		}
		return true;
	}
}

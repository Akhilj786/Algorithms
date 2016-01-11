package Strings;

import java.util.HashSet;
import java.util.Hashtable;

public class LongestCompoundString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "cat", "cats", "catsdogcats", "catxdogcatsrat", "dog",
				"dogcatsdog", "hippopotamuses", "rat", "ratcat", "ratcatdog",
				 };
		longestCompoundStr(str);
	}

	public static HashSet<String> generateHash(String str[]) {
		HashSet<String> set = new HashSet<>();
		for (String s : str)
			set.add(s);
		return set;
	}

	public static void longestCompoundStr(String str[]) {
		Hashtable<String, Integer> hash = new Hashtable<>();
		HashSet<String> set = generateHash(str);
		int max_count = 0;
		String max_str = "";
		for (String s : str) {
			int count = getCount(set, s);
			if (count > max_count) {
				max_count = count;
				max_str = s;
			}
		}
		System.out.println(max_count + "->" + max_str);
	}

	public static int getCount(HashSet<String> set, String word) {
		int count = 0;
		String s = "";
		for (int i = 0; i < word.length(); i++) {
			s += word.charAt(i);
			if (set.contains(s) && !s.equals(word)) {
				count++;
				s = "";
			}
		}
		return count;
	}

}

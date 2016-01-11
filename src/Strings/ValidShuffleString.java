package Strings;

public class ValidShuffleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = "def";
		String s3 = "deabcg";
		System.out.println(isValid(s1, s2, s3));
	}

	public static boolean isValid(String s1, String s2, String s3) {
		if ((s1.length() + s2.length()) != s3.length())
			return false;
		char c1='\0', c2='\0', c3='\0';
		int i = 0, j = 0, k = 0;
		while (k < s3.length()) {
			if (i < s1.length())
				c1 = s1.charAt(i);
			if (j < s2.length())
				c2 = s2.charAt(j);
			c3 = s3.charAt(k);
			if (c1 == c3) {
				i++;
				k++;
			} else if (c2 == c3) {
				j++;
				k++;

			} else {
				return false;
			}

		}
		return true;
	}

}

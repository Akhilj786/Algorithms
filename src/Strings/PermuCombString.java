package Strings;

/*
 * Various question could be made
 * 1) Same length combination e.g str=abc o/p={abc,acb,bac,bca,cab,cba}; 
 * 2) All combination with different length: str=ab o/p={ ,a,b,ab,ba};
 * 3) All combination with different length  but not reverse like if ab is there then be can't be there.
 * 4) K length all combination
 * 5) k length combination with no left repeated. 
 */

public class PermuCombString {

	public void permutateString(String str) {
		permuateHelper1("", str);
		System.out.println();
		permuateHelper2("", str);
		System.out.println();
		permuateHelper3("", str, 0);
		System.out.println();
		permuateHelper4("", "abcde", 2);
		System.out.println();
		permuateHelper5("", "abcde",0, 3);
	}

	public void permuateHelper1(String prefix, String str) {
		int len = str.length();

		if (len == 0) {
			System.out.print(prefix + " ");
			return;
		}
		for (int i = 0; i < len; i++) {
			permuateHelper1(prefix + str.charAt(i),
					str.substring(0, i) + str.substring(i + 1, len));
		}

	}

	public void permuateHelper2(String prefix, String str) {
		int len = str.length();

		System.out.print(prefix + " ");

		for (int i = 0; i < len; i++) {
			permuateHelper2(prefix + str.charAt(i),
					str.substring(0, i) + str.substring(i + 1, len));
		}

	}

	public void permuateHelper3(String prefix, String str, int k) {
		int len = str.length();
		System.out.print(prefix + " ");

		for (int i = k; i < len; i++) {
			permuateHelper3(prefix + str.charAt(i),
					str.substring(0, i) + str.substring(i + 1, len), i);
		}

	}

	public void permuateHelper4(String prefix, String str, int k) {
		int len = str.length();

		if (k == prefix.length())
			System.out.print(prefix + " ");
		for (int i = 0; i < len; i++) {
			permuateHelper4(prefix + str.charAt(i),
					str.substring(0, i) + str.substring(i + 1, len), k);
		}

	}
	
	public void permuateHelper5(String prefix, String str,int p, int k) {
		int len = str.length();

		if (k == prefix.length())
			System.out.print(prefix + " ");
		for (int i = p; i < len; i++) {
			permuateHelper5(prefix + str.charAt(i),
					str.substring(0, i) + str.substring(i + 1, len),i, k);
		}

	}
}

package Strings;

public class isPermutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1[] = { "","Nib", "act", "a ct" };
		String str2[] = { "bar","bin", "cat", "cat " };
		for (int i = 0; i < str1.length; i++) {
			String s1 = str1[i];
			String s2 = str2[i];
			System.out.println(isPermute1(s1, s2));
		}

	}

	// Ascii 256 int Array
	public static boolean isPermute1(String str1, String str2) {
		int flag[] = new int[256];
		int len1 = str1.length();
		int len2 = str2.length();
		if (len1 != len2)
			return false;
		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			flag[c]++;
		}
		for (int i = 0; i < str2.length(); i++) {
			char c = str2.charAt(i);
			if (flag[c] <= 0)
				return false;
			flag[c]--;
		}
		return true;
	}
	
	// Another method involve using hashtable.

}

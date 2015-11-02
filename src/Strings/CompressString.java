package Strings;

public class CompressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { null, "", "AABBCC", "AAABCCDDDD" };
		for (String s : str) {
			System.out.println(compressString(s));
		}
	}

	public static String compressString(String str) {
		if (str == null || str.length() == 0)
			return str;

		StringBuilder s = new StringBuilder();
		int count = 1;
		char prev = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			char current = str.charAt(i);
			if (prev == current)
				count++;
			else {
				s.append(prev + "" + count);
				count = 1;
				prev = current;
			}
		}

		s.append(prev + "" + count);
		if (s.length() >= str.length())
			return str;
		return new String(s);
	}

}

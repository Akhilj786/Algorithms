package Strings;

public class ReplaceChar {
	public static void main(String str[]) {
		String st[] = { null, "", "abca", "abac", "abc", "xyz" };
		char to_Remove = 'a';

		for (String s : st) {
			System.out.println(replaceCharacter(s, to_Remove));
		}
	}

	public static String replaceCharacter(String str, char to_remove) {
		if (str == null)
			return str;
		else if (str.length() == 0)
			return str;
		int i = -1;
		int j = 0;
		char charArr[] = str.toCharArray();

		while (j < str.length()) {
			char c = charArr[j];
			if (c == to_remove) {
				if (i == -1)
					i = j;

			} else {
				if (i != -1) {
					char temp = charArr[j];
					charArr[j] = charArr[i];
					charArr[i] = temp;
					i++;
				}
			}
			j++;
		}
		if (i != -1) {
			StringBuilder strBuilder = new StringBuilder();
			for (int k = 0; k < i; k++)
				strBuilder.append(charArr[k]);

			return new String(strBuilder);
		} else if (i == 0)
			return null;
		else
			return str;

	}
}

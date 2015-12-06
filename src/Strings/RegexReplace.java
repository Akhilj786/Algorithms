package Strings;

import javax.print.attribute.standard.OrientationRequested;

public class RegexReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "0101?1?";
		int count = countMark(str);
		if (count > 0) {
			for (int i = 0; i < Math.pow(2, count); i++) {
				String append = toBinaryString(i, count);
				System.out.println(replaceMark(str, append, count));

			}
		}
	}

	public static String toBinaryString(int num, int size) {
		char c[] = new char[size];
		for (int i = 0; i < size; i++) {
			c[i] = '0';
		}
		int i = 0;
		while (num > 0 && i < size) {
			int rem = num % 2;
			num = num / 2;
			c[size - i - 1] = (char) (rem + '0');
			i++;
		}

		return new String(c);
	}

	public static int countMark(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '?')
				count++;
		}
		return count;
	}

	public static String replaceMark(String original, String append,
			int markCount) {
		char c[] = original.toCharArray();
		int count = 0;
		for (int i = 0; i < original.length(); i++) {
			if (c[i] == '?') {
				c[i] = append.charAt(count);
				count++;
			}

		}
		return new String(c);
	}

}

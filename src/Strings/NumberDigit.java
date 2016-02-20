package Strings;

public class NumberDigit {
	private static String NumberString[] = { "0", "1", "ABC", "DEF", "GHI",
			"JKL", "MNO", "PQRS", "TUV", "WXYZ" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "2276696";
		convertToString(num);
	}

	public static void convertToString(String num) {
		phone_to_string(num, "", 0);
	}

	public static void phone_to_string(String num, String ans, int d) {
		if (d == num.length() - 1) {
			System.out.println(ans);
		} else {
			int i = num.charAt(d) - '0';
			String s = NumberString[i];
			for (int j = 0; j < s.length(); j++) {
				ans += s.charAt(j);
				phone_to_string(num, ans, d + 1);
			}
		}
	}

}

package DynamicProgram;

public class LongestRepeatingSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "GEEKSFORGEEKS", "AAAAAAAAAA", "ABCDEFG", "ABABABA",
				"ATCGATCGA", "banana", "abcpqrabpqpq" };
		for (String s : str) {
			System.out.print(longestRepeatSubString(s)+" ");
		}
	}

	public static int longestRepeatSubString(String str) {
		int max_length = 0;
		int sLength = str.length();
		int c[][] = new int[sLength + 1][sLength + 1];
		int index = str.length() + 1;
		for (int i = 0; i <= sLength; ++i) {
			c[i][0] = 0;
			c[0][i] = 0;
		}

		for (int i = 1; i <= sLength; i++) {
			for (int j = 1; j <= sLength; j++) {
				char c1 = str.charAt(i - 1);
				char c2 = str.charAt(j - 1);
				if (c1 == c2 && i != j) {
					c[i][j] = c[i - 1][j - 1] + 1;
					if (c[i][j] > max_length) {
						max_length = c[i][j];
						index = Math.min(i, j);
					}

				} else {
					c[i][j] = 0;

				}
			}
		}
		
		return max_length;
	}

}

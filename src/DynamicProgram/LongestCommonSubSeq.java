package DynamicProgram;

public class LongestCommonSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Length="+longestCommonSubseq("ABCDGH", "AEDFHR"));
	}
	public static int longestCommonSubseq(String s1, String s2) {

		int c[][] = new int[s1.length() + 1][s2.length() + 1];
		c[0][0] = 0;
		int index = Integer.MAX_VALUE;
		
		for (int i = 0; i <= s1.length(); i++) {
			for (int j = 0; j <= s2.length(); j++) {
				if (i == 0 || j == 0)
					c[i][j] = 0;
				else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					c[i][j] = c[i - 1][j - 1] + 1;
					System.out.print(s1.charAt(i - 1));
				} else {
					c[i][j] = Math.max(c[i - 1][j], c[i][j - 1]);
					int temp = Math.max(i, j);
					index = Math.min(temp, index);
				}

			}
		}
		System.out.println();
		return c[s1.length()][s2.length()];
	}

}

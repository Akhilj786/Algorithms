package DynamicProgram;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		LongestCommonPrefix lcs = new LongestCommonPrefix();
		String[] input = { "r", "rockbottom", "rollingstone","r"};
		System.out.println(lcs.getSubstring(input));
	}

	public String getSubstring(String[] input) {
		int minLen=Integer.MAX_VALUE;
		for(int i=0;i<input.length;i++)
			if(minLen>input[i].length())
				minLen=input[i].length();
		
		String base = input[0];
		for (int i = 0; i < minLen; i++) {
			for (int j = 1; j < input.length; j++) { // Run for all words
				String comparer = input[j];
				if (i >= comparer.length()
						|| comparer.charAt(i) != base.charAt(i))
					return base.substring(0, i);
			}
		}
		return "";
	}
	
	public String getSubstring2(String[] input) {
		String base = input[0];
		for (int i = 0; i < base.length(); i++) {
			for (int j = 1; j < input.length; j++) { // Run for all words
				String comparer = input[j];
				if (i >= comparer.length()
						|| comparer.charAt(i) != base.charAt(i))
					return base.substring(0, i);
			}
		}
		return "";
	}
}

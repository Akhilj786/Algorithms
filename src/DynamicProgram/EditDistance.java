package DynamicProgram;
//https://web.stanford.edu/class/cs124/lec/med.pdf
//Check if two strings are One Edit distance away.
public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(editDistance("antichrist", "synchronicity"));
	}

	public static int editDistance(String s1, String s2) {
		if (s1 == null || s2 == null)
			return 0;
		int len1 = s1.length();
		int len2 = s2.length();
		int d[][] = new int[len1 + 1][len2 + 1];
		for (int i = 0; i <= len1; i++)
			d[i][0] = i;

		for (int j = 0; j <= len2; j++)
			d[0][j] = j;

		
		for (int i = 1; i < len1; i++){
			for (int j = 1; j < len2; j++) {
				

					char c1 = s1.charAt(i-1);
					char c2 = s2.charAt(j-1);
					int minVal = Math.min(d[i - 1][j] + 1, d[i][j - 1] + 1);
					int temp = d[i - 1][j - 1];
					if (c1 != c2)
						temp += 1;
					d[i][j] = Math.min(minVal, temp);
				//	System.out.print(d[i][j]+" ");
				
			}
			//System.out.println();
	}
		return d[len1-1 ][len2-1 ];
	}

}

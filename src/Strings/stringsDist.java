package Strings;

public class stringsDist {

	public void minDist(String str[], String str1, String str2) {
		int array[] = new int[str.length];
		int current = 0;
		for (String s : str) {
			if (s.equals(str1))
				array[current++] = 1;
			else if (s.equals(str2))
				array[current++] = 2;
			else
				array[current++] = 0;
		}
		System.out.println(minStringsDist(array, 1, 2));
	}

	public int minStringsDist(int array[], int a, int b) {
		int minDist = Integer.MAX_VALUE;
		int prev = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == a || array[i] == b) {
				prev = i;
				break;

			}
		}

		for (int i = prev + 1; i < array.length; i++) {
			if (array[i] == a || array[i] == b) {
				if (array[prev] != array[i] && (i - prev) < minDist) {
					minDist = i - prev;

				}
				prev = i;
			}
		}

		return minDist;
	}
}

package Arrays;

import java.util.Arrays;

//http://www.quora.com/Google-Interview-Questions/Given-three-arrays-A-B-and-C-what-is-the-best-algorithm-to-find-the-minimum-value-of-a-b-+-b-c-+-c-a-where-a-in-A-b-in-B-c-in-C
public class ThreeArrayMinVal {
	int array1[], array2[], array3[];

	public ThreeArrayMinVal() {
		this.array1 = new int[] { 1, 5, 9, 11, 15 };
		this.array2 = new int[] { 6, 8, 18, 19, 25 };
		this.array3 = new int[] { 4, 7, 13, 20 };
	}

	public int minimumVal() {
		int minVal = Integer.MAX_VALUE;
		int i = 0, j = 0, k = 0;
		Arrays.sort(array1);
		Arrays.sort(array2);
		Arrays.sort(array3);
		while (i < array1.length && j < array2.length && k < array3.length) {
			int currMin = Math.abs(array1[i] - array2[j])
					+ Math.abs(array2[j] - array3[k])
					+ Math.abs(array3[k] - array1[i]);
			if (minVal > currMin) {
				minVal = currMin;

			}
			int minIndex = findMinIndex(array1[i], array2[j], array3[k]);
			if (minIndex == array1[i])
				i++;
			else if (minIndex == array2[j])
				j++;
			else
				k++;
		}
		return minVal;
	}

	public int findMinIndex(int a, int b, int c) {
		int minIndex = a;
		if (minIndex > b) {
			minIndex = b;
			if (minIndex > c)
				minIndex = c;
		} else {
			if (minIndex > c)
				minIndex = c;
		}
		return minIndex;
	}
}

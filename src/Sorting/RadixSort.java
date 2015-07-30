package Sorting;

/*
 * Maximum gap problem
 * http://yucoding.blogspot.com/2014/12/leetcode-question-maximum-gap.html
 */

public class RadixSort {

	public int radixSort(int array[]) {
		if (array.length < 2)
			return 0;
		int max = getMax(array);
		for (int nofDigit = 1; max / nofDigit > 0; nofDigit *= 10)
			countSort(array, nofDigit);
		// Print Array
		/*
		 * for (int i : array) { System.out.print(i+" "); }
		 */
		int adjMax = array[1] - array[0];
		for (int i = 2; i < array.length; i++) {
			int tempMax = array[i] - array[i - 1];
			adjMax = Math.max(tempMax, adjMax);
		}
		return adjMax;

	}

	public int getMax(int array[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			max = Math.max(array[i], max);
		}
		return max;
	}

	public void countSort(int array[], int nd) {
		int outArray[] = new int[array.length];
		int count[] = new int[10];

		for (int i = 0; i < array.length; i++)
			count[(array[i] / nd) % 10]++;

		for (int i = 1; i < 10; i++) {
			count[i] += count[i - 1];
		}

		for (int i = array.length - 1; i >= 0; i--) {
			outArray[count[(array[i] / nd) % 10] - 1] = array[i];
			count[(array[i] / nd) % 10]--;
		}

		for (int i = 0; i < array.length; i++) {
			array[i] = outArray[i];
		}
	}

}

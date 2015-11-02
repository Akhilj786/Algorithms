package Arrays;

import java.util.Arrays;

//http://www.geeksforgeeks.org/find-the-maximum-repeating-number-in-ok-time/
public class MaxFrequencyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 2, 3, 2, 5, 2, 4, 1, 7, 7, 7, 7, 2, 2 };
		int k = 8;
		System.out.println(maxFrequency(array));
		System.out.println(maxRepeating(array, k));
	}

	// O(nlogn) Solution
	public static int maxFrequency(int array[]) {
		int res = 0;
		Arrays.sort(array);
		int prev = array[0];
		int count = 0;
		int maxCount = Integer.MIN_VALUE;
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			if (current == prev)
				count++;
			else {
				if (count > maxCount) {
					maxCount = count;
					res = prev;

				}
				prev = current;
				count = 1;
			}
		}

		if (prev == array[array.length - 1] && (count + 1) > maxCount)
			res = prev;

		return res;
	}

	/*
	 * O(n) with O(1)Space.Condition is if we have a k-range data
	 */

	public static int maxRepeating(int array[], int k) {
		int res = 0;

		for (int i = 0; i < array.length; i++)
			array[array[i] % k] += k;
		int maxCount = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxCount) {
				maxCount = array[i];
				res = i;
			}

		}
		return res;
	}
}

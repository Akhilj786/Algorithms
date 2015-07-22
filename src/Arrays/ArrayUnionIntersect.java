package Arrays;

import java.util.Arrays;

/*
 * Find Union and intersect from two unsorted array
 */
public class ArrayUnionIntersect {

	/*
	 * Three possible ways to solve : (1#) Dont sort and just compare every
	 * value of array1 with every value of array2 Time:O(mn) (2#) Sort both
	 * arrays and start with compare each other.. Time:O(mlogm + nlogn +m +n)
	 * (3#) Sort smaller array and then use larger array to Binary Search on it.
	 * Works best if there is significant size diff Time: min(mLogm + nLogm,
	 * mLogn + nLogn) i.e min((m+n)logm, (m+n)logn)
	 */

	// Method 3:
	public void arrayUI(int array1[], int array2[]) {
		int length1 = array1.length - 1;
		int length2 = array1.length - 1;

		if (length1 > length2) {
			// Sort arr2 and search array1 in array2.
			arrayUnionFunc(array2, array1);
			arrayIntersectFunc(array2, array1);
		} else {
			// sort array1 and search array2 in array1.
			arrayUnionFunc(array1, array2);
			arrayIntersectFunc(array2, array1);
		}

	}

	public void arrayUnionFunc(int array1[], int array2[]) {
		Arrays.sort(array1);
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		for (int j = 0; j < array2.length; j++) {
			if (ArrayBinarySearch.binarySearch(array1, array2[j], 0,
					array1.length - 1) == -1)
				System.out.print(array2[j] + " ");
		}
		System.out.println();

	}

	public void arrayIntersectFunc(int array1[], int array2[]) {
		Arrays.sort(array1);

		for (int j = 0; j < array2.length; j++) {
			if (ArrayBinarySearch.binarySearch(array1, array2[j], 0,
					array1.length - 1) != -1)
				System.out.print(array2[j] + " ");
		}

	}

	public void ArrayUnionIntersectFill() {
		int array1[] = { 1, 2, 4 };
		int array2[] = { 2 };
		arrayUI(array1, array2);

	}

}

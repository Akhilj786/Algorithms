package Arrays;

public class MaxDiff {
	public int maxDifference(int array[]) {
		int max_diff = array[1] - array[0];
		int min = array[0];
		int maxIndex=0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] - min > max_diff) {
				max_diff = array[i] - min;
				maxIndex=i;
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.print("\nValues:"+array[maxIndex]+","+(array[maxIndex]-max_diff));
		return max_diff;
	}

	public void insertArray() {
		int arr[] = { 1, 2, 6, 80, 100 };
		System.out.println("\nMaximum Difference=" + maxDifference(arr));
	}
}

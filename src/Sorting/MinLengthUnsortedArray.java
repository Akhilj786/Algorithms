package Sorting;
//http://www.geeksforgeeks.org/minimum-length-unsorted-subarray-sorting-which-makes-the-complete-array-sorted/
public class MinLengthUnsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60 };
		printUnsortedArray(array);
	}

	public static void printUnsortedArray(int array[]) {
		int start = -1;
		int end = -1;
		int len = array.length - 1;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				start = i;
				break;
			}
		}
		if (start == len) {
			System.out.println("Already sorted");
			return;
		}
		for (int i = len; i > 0; i--) {
			if (array[i] < array[i - 1]) {
				end = i;
				break;
			}
		}
		
		int min = array[start];
		int max = array[start];
		for (int i = start + 1; i <= end; i++) {
			if (array[i] > max)
				max = array[i];
			if (array[i] < min)
				min = array[i];
		}

		for (int i = 0; i < start; i++) {
			if (array[i] > min) {
				start = i;
				break;

			}
		}

		for (int i = len; i >= end + 1; i--) {
			if (array[i] < max) {
				end = i;
				break;
			}
		}

		System.out.println("Unsorted Array between:" + array[start] + "-"
				+ array[end]);
	}

}

package Arrays;

public class ModifiedBinarySearch {

	// Value greater than target
	public int valGreat(int array[], int target) {
		int low = 0;
		int high = array.length - 1;
		int greater = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] > target) {
				greater = mid;
				high = mid - 1;
			} else
				low = mid + 1;
		}

		return greater;
	}

	public int valLesser(int array[], int target) {
		int low = 0;
		int high = array.length - 1;
		int lesser = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] > target) 
				high = mid - 1;
			 else {
				lesser = mid;
				low = mid + 1;
			}
		}

		return lesser;
	}
}

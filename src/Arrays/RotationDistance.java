package Arrays;

public class RotationDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub {4, 5, 6, 1, 2, 3}, {1, 2, 3, 4, 5,

		int array[] = { 5, 6, 7, 1, 2, 3, 4 };
		System.out.println(rotateDist(array));
	}

	public static int rotateDist(int array[]) {

		int low = 0;
		int high = array.length - 1;

		while (array[low] > array[high]) {
			int mid = (low + high) / 2;
			if (array[mid] > array[high]) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return low;

	}

}

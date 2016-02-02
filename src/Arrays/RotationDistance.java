package Arrays;

public class RotationDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub {4, 5, 6, 1, 2, 3}, {1, 2, 3, 4, 5,

		int array[] = { 1,2 };
		System.out.println(rotateDist(array));
		System.out.println(rotateDist1(array));
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
	public static int rotateDist1(int array[]) {

		int low = 0;
		int high = array.length - 1;

		while (low<=high) {
			int mid = (low + high) / 2;
			if (array[mid] < array[high]) {
				high=mid;
			} else {
				low=mid+1;
			}
		}
		return high;

	}	


}

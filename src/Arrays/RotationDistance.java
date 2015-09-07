package Arrays;

public class RotationDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub {4, 5, 6, 1, 2, 3}, {1, 2, 3, 4, 5,
		// 6}
		int array[] = {4, 5, 6, 1, 2, 3 };
		System.out.println(rotateDist(array));
	}

	public static int rotateDist(int array[]) {
		int mid = -1;
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			mid = (low + high) / 2;

			if (array[low] <= array[mid]) {
				if (array[mid] >= array[high])
					low = mid + 1;
				else
					high = mid - 1;
			} else {
				high = mid - 1;
			}

		}

		return mid;
	}

}

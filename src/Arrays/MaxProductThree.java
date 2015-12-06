package Arrays;

public class MaxProductThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { -5, -7, 4, 2, 1, 9 };
		int[] arr2 = { 4, 5, -19, 3 };
		System.out.println(threeMaxProduct(arr1));
		System.out.println(threeMaxProduct(arr2));
	}

	public static int threeMaxProduct(int array[]) {
		if (array.length < 3)
			return -1;
		int res = 0;
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max1) {
				max3 = max2;
				max2 = max1;
				max1 = array[i];

			} else if (array[i] > max2) {
				max3 = max2;
				max2 = array[i];

			} else if (array[i] > max3) {
				max3 = array[i];

			}
			if (array[i] < min1) {
				min2 = min1;
				min1 = array[i];

			} else if (array[i] < min2) {
				min2 = array[i];

			}

		}

		System.out.println(min1 + " " + min2 + " " + max3 + " " + max2 + " "
				+ max1);
		res = Math.max(max1 * max2 * max3, max1 * min1 * min2);
		return res;
	}

}

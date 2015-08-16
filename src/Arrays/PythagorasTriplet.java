package Arrays;

import java.util.Arrays;

/*
 * http://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/
 */
public class PythagorasTriplet {

	public void findPythagoras(int array[]) {
		for (int i = 0; i < array.length; i++)
			array[i] *= array[i];

		Arrays.sort(array);
		System.out.println("Pythagoras Triplet");
		for (int i = array.length - 1; i >=2; i--) {
			int left = 0;
			int right = i - 1;
			while (left < right) {
				int small = array[left] + array[right];
				if (small == array[i]) {
					System.out.println(array[left] + "+" + array[right] + " "
							+ array[i]);
					break;
				} else if (small < array[i])
					left++;
				else
					right--;
			}
		}

	}
}

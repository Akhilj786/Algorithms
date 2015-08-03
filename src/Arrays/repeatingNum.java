package Arrays;

import java.util.HashSet;
import java.util.Set;

/*
 * There are few methods to do this:
 * 1) Brute force: O(n^2)
 * 2) Sorting: O(nlogn)
 * 3) Extra Space->O(n) and time->O(n)
 * 4) Specail case: if numbers lie between 0-n-1. 
 * Here i will solve last 2 methods.
 */
public class repeatingNum {
	public int array[];

	public void printRepeating3(int array[]) {
		System.out.println("Repeating arrays-Method3");
		Set<Integer> setNo = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			if (setNo.contains(array[i]))
				System.out.print(array[i] + " ");
			else
				setNo.add(array[i]);
		}
		System.out.println();
	}

	public void printRepeating4(int array[]) {
		System.out.println("Repeating array-Method4");
		for (int i = 0; i < array.length; i++) {
			if (array[Math.abs(array[i])] >= 0)
				array[Math.abs(array[i])] = -1 * array[Math.abs(array[i])];
			else
				System.out.print(Math.abs(array[i]) + " ");
		}
		System.out.println();
	}

}

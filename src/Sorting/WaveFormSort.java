package Sorting;

import java.util.Arrays;

// http://www.geeksforgeeks.org/sort-array-wave-form-2/
public class WaveFormSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = { 10, 90, 49, 2, 1, 5, 23 };
		waveForm1(array1);
		printArray(array1);
		System.out.println();
		int array2[] = { 10, 90, 49, 2, 1, 5, 23 };
		waveForm1(array2);
		printArray(array2);
	}

	/*
	 * Sort and swap alternate numbers(increment factor is 2). Time complexity:
	 * O(nlogn).
	 */

	public static void waveForm1(int array[]) {
		Arrays.sort(array);
		for (int i = 0; i < array.length - 1; i += 2) {
			//if (array[i] < array[i + 1])
				swap(array, i);
		}
	}

	public static void swap(int array[], int i) {
		int temp = array[i];
		array[i] = array[i + 1];
		array[i + 1] = temp;
	}

	public static void printArray(int array[]) {
		for (int i : array) {
			System.out.print(i+" ");
		}
	}
	
	/*
	 * Logic: If we make sure all our even position is greater than odd then we should be fine. 
	 * Time Complexity: O(n).
	 */
	public static void waveForm2(int array[]){
		for(int i=0;i<array.length;i+=2){
			if(i>0 && array[i]<array[i-1])
				swap(array,i-1);
			if(i<array.length-1 && array[i]<array[i+1])
				swap(array,i);
		}
	}
}

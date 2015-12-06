package Arrays;

import java.util.regex.Pattern;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1, 5, 3, 5, 9, 3, 1, 10};
		removeDuplicate(arr);
		
		
	}

	public static void removeDuplicate(int array[]) {
		int newLen = array.length - 1;
		for (int i = 0; i < newLen - 1; i++) {
			for (int j = i + 1; j < array.length && j <= newLen; j++) {
				if (array[i] == array[j]) {
					int temp = array[j];
					array[j] = array[newLen];
					array[newLen] = temp;
					newLen--;
				}

			}
		}

		for (int i = 0; i <= newLen; i++)
			System.out.print(array[i] + " ");

	}
}

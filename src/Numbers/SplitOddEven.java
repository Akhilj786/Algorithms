package Numbers;

public class SplitOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={1,2,4,6,9,11,13,14};
		splitOddEven(array);
	}

	public static void splitOddEven(int array[]) {
		int even = -1;
		int odd = 0;
		printArray(array);
		while (odd < array.length) {
			if (array[odd] % 2 != 0)
				odd++;
			else {
				swap(array, even + 1, odd);
				even++;
				odd++;
			}
		}
		System.out.println();
		printArray(array);
	}

	public static void swap(int array[], int even, int odd) {
		int temp = array[even];
		array[even] = array[odd];
		array[odd] = temp;

	}
	
	public static void printArray(int array[]){
		for(int i:array)
			System.out.print(i+" ");
	}

}

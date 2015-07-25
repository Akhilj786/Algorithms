package Interview;

public class StartUp {
	/*
	 * For a starup in Menlo Park. I was asked 4 question 1) Given a matrix of
	 * one's and zero's..find groups of ones.
	 * http://codercareer.blogspot.com/2013/02/no-41-group-of-1s-in-matrix.html
	 * 2) Maximum Profit in buy-sell 3) Various Combination of String 4) Binary
	 * Search
	 */
	public void callFunc() {
		int matrix[][] = { { 1, 1, 0, 0, 1 }, { 1, 0, 0, 1, 0 },
				{ 1, 1, 0, 1, 0 }, { 0, 0, 1, 0, 0 }, };

		System.out.println("Total Group:" + countGroups(matrix));

		int array[] = { 1, 2, 10, 0, 9 };
		System.out.println("Maximum Profit:"+maxProfit(array));

	}

	/*
	 * Question1 could be solved by marking each 1's adjacent position as zero.
	 */

	public static int countGroups(int matrix[][]) {
		int result = 0;
		int m = matrix.length - 1;
		int n = matrix[0].length - 1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1) {
					makeAdjacentZero(matrix, i, j, m, n);
					result++;
					// Print Groups
					// System.out.println("I:" + (i + 1) + "J:" + (j + 1));
				}
			}
		}
		return result;
	}

	public static void makeAdjacentZero(int a[][], int i, int j, int m, int n) {
		// Down
		if (i < m) {
			if (a[i + 1][j] == 1) {
				a[i + 1][j] = 0;
				makeAdjacentZero(a, i + 1, j, m, n);
			}
		}
		// Right
		if (j < n) {
			if (a[i][j + 1] == 1) {
				a[i][j + 1] = 0;
				makeAdjacentZero(a, i, j + 1, m, n);
			}
		}
		// Up
		if (i > 0) {
			if (a[i - 1][j] == 1) {
				a[i - 1][j] = 0;
				makeAdjacentZero(a, i - 1, j, m, n);
			}
		}
		// Left
		if (j > 0) {
			if (a[i][j - 1] == 1) {
				a[i][j - 1] = 0;
				makeAdjacentZero(a, i, j - 1, m, n);
			}
		}
	}
	
	// Buy and sell problem
	public static int maxProfit(int array[]) {
		int min = array[0];
		int sell = 0;
		int profit = 0;
		int buy = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] - min > profit) {
				profit = array[i] - min;
				if (array[i] > sell) {
					sell = array[i];
					buy = min;
				}
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Buy:" + buy + " Sell:" + sell);
		return profit;
	}
}

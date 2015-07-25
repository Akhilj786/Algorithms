package Matrix;

import java.util.ArrayDeque;
import java.util.Queue;

/*
 * http://codercareer.blogspot.com/2014/10/no-56-maximal-value-of-gifts.html
 * 
 * Three approaches in my mind.
 * 1) Making use of visited and queue and finding maximum among down and right.Marking highest as visited and move on.
 * 2) Dynamic Programming: Making use of memoziation. Iterate over the array and find the max value from up and left
 * store it in (i,j). i.e maxProfit[i][j]=Max(matrix[i-1][j],matrix[i][j-1])+matrix[i][j].
 * 3) Optimization to above code. By just using array approach.
 */
public class FindMaxGift {

	public void fillMatrix() {

		int matrix[][] = { { 1, 10, 3, 8 }, { 12, 2, 9, 6 }, { 5, 7, 4, 11 },
				{ 3, 7, 16, 5 } };
		System.out.println("Max Value of Gifts:" + getMaxValue1(matrix));
		System.out.println("Max Value of Gifts:" + getMaxValue2(matrix));
		System.out.println("Max Value of Gifts:" + getMaxValue3(matrix));
	}

	// Method 1
	public int getMaxValue1(int matrix[][]) {
		boolean visited[][] = new boolean[matrix.length][matrix.length];
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix.length; j++)
				visited[i][j] = false;

		int maxResult = 0;
		visited[0][0] = true;
		Queue<Pair> q = new ArrayDeque<Pair>();
		Pair p = new Pair();
		p.x = 0;
		p.y = 0;
		q.add(p);
		// q.add(matrix[0][0]);
		int i = 0;
		int j = 0;
		int m = matrix.length - 1;
		int n = matrix[0].length - 1;
		while (!q.isEmpty()) {
			Pair currentPair = q.remove();

			maxResult += matrix[currentPair.x][currentPair.y];
			Pair adjPair = findMaxPosition(matrix, currentPair.x,
					currentPair.y, visited);
			q.add(adjPair);
			visited[adjPair.x][adjPair.y] = true;
			i = adjPair.x;
			j = adjPair.y;
			if (i == m && j == n) {
				maxResult += matrix[i][j];
				break;
			}

		}
		return maxResult;
	}

	public Pair findMaxPosition(int matrix[][], int i, int j,
			boolean visited[][]) {
		// Last Row
		Pair p = new Pair();

		if (i == matrix.length - 1) {
			if (!visited[i][j + 1]) {
				p.x = i;
				p.y = j + 1;
				return p;
			} else
				return null;
		}

		if (j == matrix[0].length - 1) {
			if (!visited[i + 1][j]) {
				p.x = i + 1;
				p.y = j;
				return p;
			} else
				return null;

		}

		if (matrix[i + 1][j] > matrix[i][j + 1]) {
			p.x = i + 1;
			p.y = j;

		}

		else {
			p.x = i;
			p.y = j + 1;
		}
		return p;

	}

	public int getMaxValue2(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int[][] maxValues = new int[rows][cols];

		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				int left = 0;
				int up = 0;

				if (i > 0) {
					up = maxValues[i - 1][j];
				}

				if (j > 0) {
					left = maxValues[i][j - 1];
				}

				maxValues[i][j] = Math.max(left, up) + matrix[i][j];
			}
		}

		return maxValues[rows - 1][cols - 1];
	}

	public static int getMaxValue3(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		int[] maxValues = new int[cols];
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				int left = 0;
				int up = 0;

				if (i > 0) {
					up = maxValues[j];
				}

				if (j > 0) {
					left = maxValues[j - 1];
				}

				maxValues[j] = Math.max(left, up) + matrix[i][j];
			}
		}

		return maxValues[cols - 1];
	}

}

class Pair {
	int x;
	int y;

	Pair() {

	}
}

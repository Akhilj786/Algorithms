package DynamicProgram;

/*
 * Count no of unique BST that could be formed from 'n' numbers
 */
public class CountBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 0, 1, 2, 3, 4 };
		for (int i : array)
			System.out.println(countHelper(i));

	}

	public static int countHelper(int n) {
		int solutions[] = new int[n];
		for (int i = 0; i < n; i++)
			solutions[i] = -1;
		return countBst(n, solutions);
	}

	public static int countBst(int n, int solutions[]) {
		if (n < 0)
			return 0; // error handling : Invalid input

		else if ((n == 1) || (n == 0))
			return 1; // Base cases

		int possiblities = 0;

		for (int i = 0; i < n; i++) {
			if (solutions[i] == -1)
				solutions[i] = countBst(i, solutions);
			if (solutions[n - i - 1] == -1)
				solutions[n - i - 1] = countBst(n - i - 1, solutions);
			possiblities += solutions[n - i - 1] * solutions[i];
		}

		return possiblities;
	}

}

package Matrix;

public class Maze {
	static int solutionMaze[][] = new int[100][100];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 },
				{ 1, 1, 1, 1 } };
		int matrix[][]={{1,2,3},{2,1,3},{1,0,0}};
		System.out.println(noWays(matrix,matrix.length,matrix[0].length));
		if (solvemaze(maze, 0, 0))
			printMaze(maze.length);
	}

	// Print maze
	public static void printMaze(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(solutionMaze[i][j] + " ");
			System.out.println();
		}

	}

	// Solution for a maze if there are blocker in between
	public static boolean solvemaze(int maze[][], int x, int y) {
		if (x == maze.length - 1 && y == maze.length - 1) {
			solutionMaze[x][y] = 1;
			return true;
		}
		if (isSafe(maze, x, y)) {
			solutionMaze[x][y] = 1;

			return (solvemaze(maze, x + 1, y) || solvemaze(maze, x, y + 1));

		}

		return false;
	}

	// Helper Function
	public static boolean isSafe(int maze[][], int x, int y) {
		if (x >= 0 && y >= 0 && x < maze.length && y < maze.length
				&& maze[x][y] == 1)
			return true;
		return false;
	}

	public static int noWays(int matrix[][], int m, int n) {
		int solveMatrix[][] = new int[m][n];

		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0)
					solveMatrix[i][j] = 1;
				else
					solveMatrix[i][j] = solveMatrix[i - 1][j]
							+ solveMatrix[i][j - 1];
			}

		return solveMatrix[m - 1][n - 1];
	}

}

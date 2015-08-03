package Interview;

import java.util.Arrays;
import java.util.Stack;

import Strings.stringsDist;

// LinkedIn Interview 
public class LinkInterview {

	/*
	 * Given an input find sum from a nested string. e.g: {1,{4,{6}}} should
	 * give 27 as 1+4*2+6*3=27. It based on opening paranthesis.
	 */
	public int sumNested(String str) {
		int result = 0;
		int mul = 0;
		String ops = "{},";
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (ops.indexOf(c) != -1 || Character.isDigit(c))
				switch (c) {
				case '{':
					stack.push(c);
					mul++;
					break;
				case '}':
					if (stack.isEmpty())
						return -1;
					else {
						stack.pop();
						mul--;
						break;
					}
				case ',':
					break;
				default:
					int temp = Character.getNumericValue(c);
					result += temp * mul;
				}
			else {
				System.out.println("Error in input");
				return -1;
			}
		}

		return result;
	}

	// http://www.geeksforgeeks.org/find-number-of-triangles-possible/
	public int noOfTriangle(int array[]) {
		if (array.length <= 2)
			return -1;

		int countTriangle = 0;

		Arrays.sort(array);
		for (int i = 0; i < array.length - 2; i++) {
			int k = i + 2;
			for (int j = i + 1; j < array.length; j++) {
				while (k < array.length && (array[i] + array[j] > array[k])) {
					System.out.println("<" + array[i] + "," + array[j] + ","
							+ array[k] + ">");
					k++;

				}
				countTriangle += k - j - 1;
			}
		}
		return countTriangle;

	}

	/*
	 * Product Array Puzzle:
	 * http://www.geeksforgeeks.org/a-product-array-puzzle/ Given an array of
	 * numbers , replace each number with the product of all the numbers divided
	 * by the number at that index without using the division operator
	 */

	public void puzzleArray(int array[]) {
		int length = array.length;
		int left[] = new int[length];
		int right[] = new int[length];

		System.out.println("BeforeTransformation");
		printArray(array);

		left[0] = 1;
		right[length - 1] = 1;

		for (int i = 1; i < length; i++)
			left[i] = left[i - 1] * array[i - 1];

		for (int j = length - 2; j >= 0; j--)
			right[j] = right[j + 1] * array[j + 1];

		for (int i = 0; i < length; i++)
			array[i] = left[i] * right[i];
		System.out.println("AfterTransformation");
		printArray(array);

	}

	public void printArray(int array[]) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	// isNumber(String). Given a string check whether its a no.

	public boolean isNumber(String str) {
		if (null == str || str.length() <= 0)
			return false;

		boolean signChar = false;
		boolean dotChar = false;
		boolean started = false;
		for (char c : str.toCharArray()) {
			switch (c) {
			case '+':
				if (started || dotChar || signChar)
					return false;
				else
					signChar = true;
				break;
			case '-':
				if (started || dotChar || signChar)
					return false;
				else
					signChar = true;
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9': {
				started = true;
				break;
			}

			case '.':
				if (dotChar)
					return false;
				else
					dotChar = true;
				break;
			default:
				return false;

			}

		}
		return true;

	}

	/*
	 * http://www.geeksforgeeks.org/write-a-c-program-to-calculate-powxn/ 1)
	 * Below code actually recalculate half value again 2) Improvement could be
	 * to store result.
	 */
	public int pow1(int a, int b) {
		if (b == 0)
			return 1;
		if (b == 1)
			return a;
		return (pow1(a, b / 2) * pow1(a, (b - b / 2)));

	}

	public float pow2(int a, int b) {
		float temp;
		if (b == 0)
			return 1;
		if (b == 1)
			return a;
		temp = pow2(a, b / 2);
		if (b % 2 == 0)
			return (temp * temp);
		else {
			if (b > 0)
				return (a * temp * temp);
			else
				return (temp * temp / a);
		}

	}

	/*
	 * Word Distance problem i.e given an array of Strings and 2 search Strings.
	 * Find the minimum distance between them. Here we mark strings as:
	 * String1=1;String2=2 rest of other strings as 0 in integer array. Then
	 * call min distance calculation method on that integer array.
	 */

	public void minDist(String str[], String str1, String str2) {
		stringsDist st = new stringsDist();
		st.minDist(str, str1, str2);
	}

}

package Strings;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "AABBC", "AABBCCDEEFF", "Abcd", "AAAb",
				"GeeksforGeeks", "GeeksQuiz" };
		for (String s : str)
			System.out.print(firstNonRepeat(s) + "->");
		System.out.println();
		for (String s : str)
			System.out.print(firstNonRepeatChar(s) + "->");

	}

	// This solution is for consecutive repeat checking
	public static char firstNonRepeat(String str) {
		boolean prevFlag = true;
		char prevChar = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if (currentChar == prevChar)
				prevFlag = false;
			else {
				if (prevFlag)
					return prevChar;
				else if (i == str.length() - 1)
					return currentChar;
				prevFlag = true;

			}
			prevChar = currentChar;
		}
		return '\0';
	}

	// Function which checks if the character is anywhere in the string
	public static str[] getCharCount(String fullString) {
		str[] count = new str[256];
		for (int i = 0; i < 256; i++) {
			count[i] = new str();
		}
		for (int i = 0; i < fullString.length(); i++) {

			int value = fullString.charAt(i);
			count[value].count++;
			if (count[value].count == 1)
				count[value].index = i;
		}
		return count;
	}
	
	/*
	 * Logic: Here we keep a count,index of a each ascii-256 characters.
	 */
	public static char firstNonRepeatChar(String str) {
		str[] count = getCharCount(str);
		char c = '\0';
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < 256; i++) {
			if (count[i].count == 1 && result > count[i].index)
				result = count[i].index;
		}

		c = str.charAt(result);
		return c;
	}
}

class str {
	int count;
	int index;
}
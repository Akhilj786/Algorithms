package Strings;

public class RotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "a12345";
		System.out.println(rotateString(str, 6));
	}

	public static String rotateString(String str, int count) {
		char ch[] = str.toCharArray();
		int len = ch.length - 1;
		reverseString(ch, 0, len);
		reverseString(ch, 0, len - count % (len + 1));
		reverseString(ch, len+1-count % (len + 1), len);
		return new String(ch);
	}

	public static void reverseString(char ch[], int left, int right) {
		while (left <= right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}
	}

}

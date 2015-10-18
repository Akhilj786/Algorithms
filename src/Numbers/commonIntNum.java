package Numbers;

public class commonIntNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Count digits Call
		int testCase[]={-10,0,10,1000};
		for(int i:testCase)
			System.out.println(i+"->"+countDigits(i));
	}

	// Count no of digits in a number
	public static int countDigits(int num) {
		if (num == 0)
			return 1;
		num = Math.abs(num);
		int count = 0;
		while (num > 0) {
			num /= 10;
			count++;
		}
		return count;
	}

}

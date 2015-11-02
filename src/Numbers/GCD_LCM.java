package Numbers;

public class GCD_LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1 = 64;
		int no2 = 40;
		System.out.println(gcd(no1, no2));
	}

	public static int gcd(int a, int b) {
		if (a < b)
			swap(a, b);
		
		while (b>0) {
			int temp = b;
	        b = a % b; // % is remainder
	        a = temp;
		}
		return a;
	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}

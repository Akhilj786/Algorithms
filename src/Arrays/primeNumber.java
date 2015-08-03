package Arrays;

import java.util.HashSet;
import java.util.Set;

public class primeNumber {
	static boolean b[];

	public boolean checkPrime(int n) {
		if (n < 0)
			return false;
		else if (n % 2 == 0)
			return false;
		else {
			int sqrt = (int) Math.sqrt(n);
			for (int i = 3; i <= sqrt; i++) {
				if (n % i == 0)
					return false;
			}

		}
		return true;
	}

	public void totalPrime(int n) {
		if (n >= 2) {
			b = new boolean[n + 1];
			for (int i = 0; i <= n; i++)
				b[i] = false;

			for (int i = 2; i <= n; i++) {
				if (!b[i]) {
					System.out.print(i + " ");
					set(i, n);
				}
			}

		}
	}

	public void set(int k, int n) {
		int i = 2;
		while ((k * i) <= n) {
			b[k * i] = true;
			i++;
		}
	}

	/*
	 * Prime factors of a Number 1) Extra Space 2) No extra space
	 */
	// Find
	public void findPrimeSpace(int n) {
		if (n >= 2) {
			b = new boolean[n + 1];
			for (int i = 0; i <= n; i++)
				b[i] = false;
			System.out.println("Prime Factors of " + n);

			for (int i = 2; i <= n; i++) {
				if (!b[i] && n % i == 0) {
					System.out.println(i);
					set(i, n);
				}
			}

		}
	}

	public void findPrimenoSpace(int num) {
		System.out.println("Prime Number of:"+num);
		while (num % 2 == 0) {
			System.out.print(2+" ");
			num = num / 2;
		}
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			while (num % i == 0) {
				System.out.print(i+" ");
				num = num / i;
			}
		}
		if (num > 2)
			System.out.println(num);
	}

	public static void factors(int n) {
		Set<Integer> set = new HashSet<Integer>();
		System.out.println("Factors:");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && (!set.contains(i))) {
				set.add(i);
				set.add(n / i);
				System.out.println(i + "*" + (n / i));

			}
		}
	}

}

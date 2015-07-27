/**
 * 
 */
package DynamicProgram;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Akhil
 * 
 */
public class LongestConsecutiveSequence {

	public int longestConsecutive(int array[]) {
		if (array.length < 1)
			return 0;
		int countSeq = 0;
		Set<Integer> set = new HashSet<>();
		for (int num : array) {
			set.add(num);
		}

		for (int num : array) {
			int left = num - 1;
			int right = num + 1;
			while (set.contains(left)) {
				countSeq++;
				set.remove(left);
				// print element
				System.out.print(left+" ");
				left--;
			}

			while (set.contains(right)) {
				countSeq++;
				set.remove(right);
				// print element
				System.out.print(right+" ");
				right++;
			}
		}
		System.out.println();
		return countSeq;
	}

}

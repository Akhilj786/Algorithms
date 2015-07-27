package DynamicProgram;

import java.util.ArrayList;
//import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
//import java.util.Set;

/*
 * http://www.geeksforgeeks.org/length-of-the-longest-arithmatic-progression-in-a-sorted-array/
 * There are 2 method 
 * 1) Simple with extraSpace in hashTable. http://codercareer.blogspot.com/search?updated-max=2014-08-09T23:11:00%2B08:00&max-results=7
 * 2) DP. http://www.geeksforgeeks.org/length-of-the-longest-arithmatic-progression-in-a-sorted-array/
 */
public class LongestArithematicProgression {

	public void fillArray() {
		int array[] = { 1, 7, 10, 15, 27, 29 };

		Hashtable<Integer, List<Pair>> hash = buildHash(array);
		System.out.println("LAP:" + LAP(hash));
	}

	public int LAP(Hashtable<Integer, List<Pair>> hash) {
		int result = 0;
		int resultIndex = 0;
		//Set<Integer> set = new HashSet<Integer>();
		for (int key : hash.keySet()) {
			int length = hash.get(key).size();
			if (result < length) {
				result = length;
				resultIndex = key;
			}
		}
		
		System.out.println(hash.get(resultIndex));
		return (result + 1);

	}

	public Hashtable<Integer, List<Pair>> buildHash(int array[]) {
		Hashtable<Integer, List<Pair>> hash = new Hashtable<>();
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {

				Pair p = new Pair(array[i], array[j]);
				List<Pair> list = new ArrayList<Pair>();
				int diff = array[j] - array[i];
				if (hash.containsKey(diff)) {

					list = hash.get(diff);

				}
				list.add(p);
				hash.put(diff, list);
			}

		}
		return hash;

	}
}

class Pair {
	int i;
	int j;

	Pair(int x, int y) {
		this.i = x;
		this.j = y;
	}

	public String toString() {
		return ("<" + this.i + "," + this.j + ">");
	}

}
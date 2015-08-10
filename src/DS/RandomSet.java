package DS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
 * Implement a data structure that supports the following three operations, each in O(1) time --
 * 1. add(E elem)
 * 2. remove(E elem)
 * 3. removeRandomElement()
 */

public class RandomSet<E> {
	List<E> dta = new ArrayList<E>();
	Map<E, Integer> idx = new HashMap<E, Integer>();

	public RandomSet() {

	}

	public boolean add(E item) {
		if (idx.containsKey(item)) {
			return false;

		}
		idx.put(item, dta.size());
		dta.add(item);
		return true;
	}

	public E removeAt(int id) {
		if (id >= dta.size())
			return null;
		E res = dta.get(id);
		idx.remove(res);
		E last = dta.remove(dta.size() - 1);
		if (id < dta.size()) {
			idx.put(last, id);
			dta.set(id, last);
		}
		return res;
	}

	public boolean remove(E item) {

		Integer id = idx.get(item);
		if (id == null)
			return false;
		removeAt(id);
		return true;

	}

	public E get(int i) {
		return dta.get(i);
	}

	public E removeRandom() {
		Random rnd = new Random();
		if (dta.isEmpty()) {
			return null;

		}
		int id = rnd.nextInt(dta.size());
		return removeAt(id);

	}

	public int size() {
		return dta.size();
	}

	public void print() {
		System.out.println(dta);
	}
}

package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

public class MergeInterval {

	public void fillInterval() {
		ArrayList<Point> list = new ArrayList<Point>();
		int x[] = { 5, 8, 27, 31 };
		int y[] = { 13, 19, 39, 37 };
		for (int i = 0; i < x.length; i++) {
			Point p = new Point(x[i], y[i]);
			list.add(p);
		}
		System.out.println(list);

		Collections.sort(list, new pointSort());
		// System.out.println(list);
		System.out.println(mergeAllInterval(list));

	}

	public Stack<Point> mergeAllInterval(ArrayList<Point> list) {
		Stack<Point> stack = new Stack<Point>();
		stack.add(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			Point p1 = stack.peek();
			Point p2 = list.get(i);
			if (overlap(p1, p2)) {
				// Update the merge stack

				if (p1.y < p2.y)
					p1.y = p2.y;

				stack.pop();
				stack.push(p1);

			} else {
				stack.add(p2);
			}

		}

		return stack;
	}

	public boolean overlap(Point p1, Point p2) {
		boolean flag = false;

		if (p1.x <= p2.x && p1.y >= p2.x)
			flag = true;

		return flag;
	}
}

class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		String str = "<" + this.x + "," + this.y + ">";
		return str;

	}
}

class pointSort implements Comparator<Point> {

	@Override
	public int compare(Point o1, Point o2) {
		// TODO Auto-generated method stub
		return (o1.x > o2.x) ? 1 : -1;
	}

}
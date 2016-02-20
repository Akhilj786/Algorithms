package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/*
 * Interval Scheduling
 */
public class MaxIntervalSchedule {

	public static void main(String args[]) {
		//int start[] = { 15, 10, 17, 5, 12, 30 };
		//int end[] = { 20, 30, 19, 20, 15, 40 };
		int start[]={ 5, 8, 27, 31 };
		int end[]={ 13, 19, 39, 37 };
		ArrayList<SingleRequest> list = new ArrayList<SingleRequest>(
				start.length);
		SingleRequest sr[] = new SingleRequest[start.length];
		for (int i = 0; i < sr.length; i++) {
			SingleRequest temp = new SingleRequest(start[i], end[i]);
			list.add(temp);
		}
		Collections.sort(list);
		System.out.println(list);
		System.out.println(countMaxInterval(list));
	}

	public static int countMaxInterval(ArrayList<SingleRequest> list) {
		int count = 0;
		Stack<SingleRequest> stack = new Stack<>();
		stack.add(list.get(0));
		count++;
		for (int i = 1; i < list.size(); i++) {
			SingleRequest peek = stack.peek();
			SingleRequest top = list.get(i);
			if (!isOverlap(peek, top)) {
				stack.push(top);
				count++;
			}
		}
		System.out.println(stack);
		return count;

	}

	public static boolean isOverlap(SingleRequest sr1, SingleRequest sr2) {
		boolean flag = false;

		if((sr1.start<=sr2.start && sr1.end>=sr2.start)||(sr1.start>=sr2.start && sr1.end>=sr2.start))
			flag=true;
		
	//	if (sr1.start <= sr2.start && sr1.end >= sr2.start)
		//	flag = true;

		return flag;
	}

}

class SingleRequest implements Comparable<SingleRequest> {
	int start;
	int end;

	public SingleRequest(int s, int e) {
		// TODO Auto-generated constructor stub
		this.start = s;
		this.end = e;
	}

	@Override
	public int compareTo(SingleRequest sr2) {
		// TODO Auto-generated method stub
		if (this.end == sr2.end)
			return (this.start > sr2.start ? 1 : -1);
		else
			return (this.end > sr2.end ? 1 : -1);

	}

	@Override
	public String toString() {
		return new String(start + "->" + end + "\n");
	}
}

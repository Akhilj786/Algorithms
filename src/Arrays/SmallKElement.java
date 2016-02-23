package Arrays;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class SmallKElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={4,2,10,9,16,15,-2};
		Queue<Integer> q= new PriorityQueue<>(2,new SmallKElement.maxHeapCompare());
		System.out.println(q.size());
		for(int i:array)
			kthMax(q, i);
		System.out.print(q);
	}
	
	public static void kthMax(Queue<Integer> q,int k){
		if(q.size()<2)
			q.add(k);
		else if(q.peek()>k){
				q.poll();
				q.add(k);
			}
		else;
	}
	
	private static class maxHeapCompare  implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
	}

}

package Arrays;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MedianOfIntegerStream {
	public Queue<Integer> minHeap;
	public Queue<Integer> maxHeap;
	public int noElements=0;
	public MedianOfIntegerStream(){
		minHeap=new PriorityQueue<>();
		maxHeap=new PriorityQueue<>(10, new MaxHeapComparator());
	}
	
	public void insertStream(int num){
		maxHeap.add(num);
		if(noElements%2==0){
			if(minHeap.isEmpty()){
				noElements++;
				return;
			}
			else if(maxHeap.peek()>minHeap.peek()){
				Integer maxHeapRoot=maxHeap.poll();
				Integer minHeapRoot=minHeap.poll();
				minHeap.add(maxHeapRoot);
				maxHeap.add(minHeapRoot);
			}
		}
		else{
			minHeap.add(maxHeap.poll());
		}
		noElements++;
	}
	
	public int getMedian(){
		if(noElements==0)
			return -1;
		else if(noElements%2!=0)
			return maxHeap.peek();
		else
			return((maxHeap.peek()+minHeap.peek())/2);
	}
	
	
	
	private class MaxHeapComparator implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MedianOfIntegerStream streamMedian = new MedianOfIntegerStream();
		
		streamMedian.insertStream(1);
		System.out.println(streamMedian.getMedian()); // should be 1
		
		streamMedian.insertStream(5);
		streamMedian.insertStream(10);
		streamMedian.insertStream(12);
		streamMedian.insertStream(2);
		System.out.println(streamMedian.getMedian()); // should be 5
		
		streamMedian.insertStream(3);
		streamMedian.insertStream(8);
		streamMedian.insertStream(9);
		System.out.println(streamMedian.getMedian()); // should be 6.5
	}
}

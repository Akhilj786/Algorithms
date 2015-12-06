package Arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class TopkElement {
	public Queue<Integer> minHeap;
	public int count;

	public TopkElement() {
		// TODO Auto-generated constructor stub
		minHeap = new PriorityQueue<>(4);
		count = 0;
	}

	public void insertStream(int num) {
		if (count < 4) {
			minHeap.add(num);
			count++;
		} else {
			if (minHeap.peek() < num) {
				minHeap.remove(minHeap.peek());
				minHeap.add(num);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopkElement top = new TopkElement();
		Random r = new Random();
		int array[]=new int[10];		
		for (int i = 0; i < 10; i++) {
			int num = r.nextInt(10);
			System.out.println(num);
			top.insertStream(num);
			array[i]=num;
		}
		System.out.println("Sorted Array");
		Arrays.sort(array);
		for(int i:array)
			System.out.print(i+ " ");
		System.out.println("\n---Numbers----"); 
		
		top.printTopK();
	}

	public void printTopK() {
		Iterator<Integer> it = minHeap.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}

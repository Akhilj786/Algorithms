import Arrays.ArrayUnionIntersect;
import Arrays.MaxDiff;
import Arrays.MergeInterval;
import DS.myStack;
import DynamicProgram.LongestArithematicProgression;
import DynamicProgram.LongestConsecutiveSequence;
import Interview.StartUp;
import LinkedList.LRUCache;
import LinkedList.LinkedList;
import LinkedList.RemoveNode;
import LinkedList.ReverseList;
import LinkedList.checkPalindrome;
import LinkedList.kthLastList;
import Matrix.FindMaxGift;
import Sorting.RadixSort;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Kth Largest
		LinkedList head5 = new LinkedList(5);
		LinkedList head4 = new LinkedList(10, head5);
		LinkedList head3 = new LinkedList(20, head4);
		LinkedList head2 = new LinkedList(20, head3);
		LinkedList head1 = new LinkedList(10, head2);
		LinkedList head = new LinkedList(5, head1);

		// Check Palindrome
		// checkPalindrome isPalin = new checkPalindrome();
		// System.out.println(isPalin.isPalindrome1(head));
		// System.out.println(isPalin.isPalindrome2(head));

		LinkedList result = kthLastList.last2KList(head, 3);
		System.out.println("Result=" + result.getData());

		// Remove Node
		RemoveNode rn = new RemoveNode();
		rn.printList(head);
		rn.remove(head, 5);
		System.out.println();
		rn.printList(head);

		// Array Union and Intersect
		ArrayUnionIntersect UI = new ArrayUnionIntersect();
		UI.ArrayUnionIntersectFill();

		// Maximum difference in an array given a[i]>a[j] and i>j.
		MaxDiff md = new MaxDiff();
		md.insertArray();

		// Origami Logic Interview
		StartUp s = new StartUp();
		s.callFunc();

		// Matrix Function
		FindMaxGift f = new FindMaxGift();
		f.fillMatrix();

		// Merge Interval
		MergeInterval mi = new MergeInterval();
		mi.fillInterval();
		LongestArithematicProgression lap = new LongestArithematicProgression();
		lap.fillArray();

		int LcsArray[] = { 100, 4, 200, 1, 3, 2 };
		LongestConsecutiveSequence lc = new LongestConsecutiveSequence();
		System.out.println(lc.longestConsecutive(LcsArray));

		// Implementation of LRU Cache
		LRUCache lru = new LRUCache(5);
		lru.set(1, 50);
		lru.set(2, 60);
		lru.set(3, 70);
		lru.set(4, 80);
		lru.set(5, 90);
		lru.printNode();
		lru.set(6, 100);
		lru.printNode();
		System.out.println(lru.get(2));
		lru.printNode();

		// Reverse List Iterative
		ReverseList rList = new ReverseList();
		rList.reverseLinkedList(head); // Iterative
		rList.reverseLinkedListR(null, head); // Recursive

		// Stack implementation using 2 queue
		myStack stack = new myStack();
		stack.push(1);
		stack.push(2);
		System.out.println("\n\n" + stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
		// Radix Sort
		int rsortArray[]={100, 4, 200, 1, 3, 2};
		RadixSort rSort=new RadixSort();
		System.out.println("\nMaximum Gap="+rSort.radixSort(rsortArray));
	}

}

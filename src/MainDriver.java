import misc.evaluateExpression;
import Arrays.ArrayUnionIntersect;
import Arrays.MaxDiff;
import Arrays.MergeInterval;
import Arrays.primeNumber;
import Arrays.repeatingNum;
import DS.myStack;
import DynamicProgram.LongestArithematicProgression;
import DynamicProgram.LongestConsecutiveSequence;
import Interview.StartUp;
import Interview.LinkInterview;
import LinkedList.LRUCache;
import LinkedList.LinkedList;
import LinkedList.RemoveNode;
import LinkedList.ReverseList;
//import LinkedList.checkPalindrome;
import LinkedList.kthLastList;
import Matrix.FindMaxGift;
import Sorting.RadixSort;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Arrays packages
		 */

		// Array Union and Intersect
		ArrayUnionIntersect UI = new ArrayUnionIntersect();
		UI.ArrayUnionIntersectFill();

		// Maximum difference in an array given a[i]>a[j] and i>j.
		MaxDiff md = new MaxDiff();
		md.insertArray();

		// Merge Interval
		MergeInterval mi = new MergeInterval();
		mi.fillInterval();
		LongestArithematicProgression lap = new LongestArithematicProgression();
		lap.fillArray();

		// Prime Number
		primeNumber pnum = new primeNumber();
		pnum.findPrimenoSpace(15);

		// repeatingNum
		repeatingNum rNum = new repeatingNum();
		int array1[] = { 10, 1, 2, 3, 10,2,2,3,3 };
		int array2[] = { 1, 2, 1, 3,2,2 };
		rNum.array = array1;
		rNum.printRepeating3(rNum.array);
		rNum.array = array2;
		rNum.printRepeating4(rNum.array);

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

		// Origami Logic Interview
		StartUp s = new StartUp();
		s.callFunc();

		// Matrix Function
		FindMaxGift f = new FindMaxGift();
		f.fillMatrix();

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
		int rsortArray[] = { 100, 4, 200, 1, 3, 2 };
		RadixSort rSort = new RadixSort();
		System.out.println("\nMaximum Gap=" + rSort.radixSort(rsortArray));

		// LinkInterview
		LinkInterview link = new LinkInterview();
		int linkArray[] = { 4, 6, 3, 7 };
		System.out.println("Sum:" + link.sumNested("{1,{4,{6}}}"));
		System.out.println("NoofTriangle:" + link.noOfTriangle(linkArray));
		link.puzzleArray(linkArray);
		String checkNumber[] = { null, "abc", "+123", "-123", "+123.3", "23.4",
				"234.5.6" };
		for (String str : checkNumber)
			System.out.print(link.isNumber(str) + " ");
		int powerVar[] = { -2, -1, 0, 1, 2, 3 }; // Power Function
		for (int i : powerVar)
			System.out.println("\nPower=" + link.pow2(2, i));

		// Misc
		evaluateExpression evaluateE = new evaluateExpression();
		System.out.println("Postfix:" + evaluateE.evaluatePostfix("2 3 +"));

	}

}

import misc.evaluateExpression;
import Arrays.ArrayUnionIntersect;
import Arrays.MaxDiff;
import Arrays.MergeInterval;
import Arrays.PythagorasTriplet;
import Arrays.ThreeArrayMinVal;
import Arrays.primeNumber;
import Arrays.repeatingNum;
import DS.RandomSet;
import DS.myStack;
import DynamicProgram.LongestArithematicProgression;
import DynamicProgram.LongestConsecutiveSequence;
import Graph.Graph;
import Interview.StartUp;
import Interview.LinkInterview;
import LinkedList.Findcycle;
import LinkedList.LRUCache;
import LinkedList.LinkedList;
import LinkedList.RemoveNode;
import LinkedList.ReverseList;
//import LinkedList.checkPalindrome;
import LinkedList.kthLastList;
import Matrix.FindMaxGift;
import Sorting.RadixSort;
import Trees.IsBalanced;
import Trees.OrderStatsTree;
import Trees.OrderStatsTreeCall;
import Trees.TreeCheck;
import Trees.TreeNode;
import Trees.TreeNodeCall;

public class MainDriver {

	public static void main(String[] args) {

		/*
		 * Arrays packages
		 */
/*
		ArrayUnionIntersect UI = new ArrayUnionIntersect();// Array Union and
															// Intersect
		UI.ArrayUnionIntersectFill();

		MaxDiff md = new MaxDiff(); // Maximum difference in an array given
									// a[i]>a[j] and i>j.
		md.insertArray();

		MergeInterval mi = new MergeInterval(); // Merge Interval
		mi.fillInterval();
		/*	LongestArithematicProgression lap = new LongestArithematicProgression();
		lap.fillArray();

		primeNumber pnum = new primeNumber(); // Prime Number
		pnum.findPrimenoSpace(15);

		repeatingNum rNum = new repeatingNum(); // repeatingNum
		int array1[] = { 10, 1, 2, 3, 10, 2, 2, 3, 3 };
		int array2[] = { 1, 2, 1, 3, 2, 2 };
		rNum.array = array1;
		rNum.printRepeating3(rNum.array);
		rNum.array = array2;
		rNum.printRepeating4(rNum.array);

		int pyArray[] = { 3, 1, 4, 6, 5 };
		PythagorasTriplet ptriplet = new PythagorasTriplet();// Pythagoras
																// Triplet
		ptriplet.findPythagoras(pyArray);

		ThreeArrayMinVal MinArrays = new ThreeArrayMinVal();
		System.out.println("3 Arrays Minimum Sum:" + MinArrays.minimumVal());

		// LinkedList
	*/		LinkedList head5 = new LinkedList(5); // Kth Largest
		LinkedList head4 = new LinkedList(10, head5);
		LinkedList head3 = new LinkedList(20, head4);
		LinkedList head2 = new LinkedList(20, head3);
		LinkedList head1 = new LinkedList(10, head2);
		LinkedList head = new LinkedList(5, head1);
	
		// Check if linkedlist contains a cycle
		Findcycle iscycle= new Findcycle();
		LinkedList res=iscycle.findCycle(head);
		System.out.println("--Is there cycle %s -- "+res);
		
		/*
		
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
		System.out.println("\n\n" + stack.peek1());
		System.out.println(stack.pop1());
		System.out.println(stack.peek1());
		System.out.println(stack.peek1());
		System.out.println(stack.pop1());
		
/*
		// Radix Sort
		int rsortArray[] = { 100, 4, 200, 1, 3, 2 };
		RadixSort rSort = new RadixSort();
		System.out.println("\nMaximum Gap=" + rSort.radixSort(rsortArray));

		/*
		 * LinkInterview
		 */
/*		LinkInterview link = new LinkInterview();
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
		// Minimum Window to find T in substring of S
		link.minWindow("ADOBECODEBANC", "ABC");

		// Misc
		evaluateExpression evaluateE = new evaluateExpression();
		System.out.println("Postfix:" + evaluateE.evaluatePostfix("2 3 +"));

		RandomSet<Integer> rSet = new RandomSet<Integer>();
		rSet.add(10);
		rSet.add(20);
		rSet.add(30);
		rSet.add(40);
		rSet.print();
		rSet.remove(40);
		rSet.print();
		rSet.removeRandom();
		rSet.print();
*/
		// Trees
		TreeNode root1 = new TreeNode(12);
		TreeNodeCall.insert(root1, 10);
		TreeNodeCall.insert(root1, 30);
		TreeNodeCall.insert(root1, 11);
		TreeNodeCall.insert(root1, 40);
		
		TreeNodeCall.leftView(root1);
		TreeNodeCall.verticalOrder(root1);
		System.out.println("\nLeftView Iterative");
		TreeNodeCall.leftViewIterative(root1);
		System.out.println("\nLeftView Iterative");
		
		System.out.println("\nLeftView Iterative");
		TreeNodeCall.rightViewIterative(root1);
		System.out.println("\nLeftView Iterative");
		
		System.out.println();TreeNodeCall.printByLevel(root1);
		System.out.println("Is this BT Complete:"+TreeCheck.isComplete(root1));
		System.out.println("Is this BST:"+TreeCheck.isBST(root1));
		System.out.println("IS Balanced:"+ new IsBalanced().isBalanced(root1));
		
	/*	// Order Statistics Tree:
		System.out.println();
		OrderStatsTree root2 = new OrderStatsTree(10);
		OrderStatsTreeCall.insert(root2, 5);
		OrderStatsTreeCall.insert(root2, 15);
		OrderStatsTreeCall.insert(root2, 1);
		OrderStatsTreeCall.insert(root2, 9);
		OrderStatsTreeCall.insert(root2, 19);
		OrderStatsTreeCall.insert(root2, 11);
		OrderStatsTreeCall.arrangeSize(root2);
		OrderStatsTreeCall.inorderPrintSize(root2); // Print no of elements down
													// the subtree
		for (int i = 1; i < 8; i++)
			System.out.println("At:" + OrderStatsTreeCall.selectIth(root2, i)); // Smallest
																				// Ith
																				// No
		int array[] = { 10, 5, 15, 1, 9, 11, 19 };
		for (int num : array) {
			OrderStatsTree temp = new OrderStatsTree(num);// Rank of Xth Node
			System.out.println(num + "->"
					+ OrderStatsTreeCall.getRank(root2, temp));
		}

		// Graph
		GraphClass();
*/
	}

	public static void GraphClass() {
		Graph g = new Graph(7, 10);
		g.fillGraph();
		System.out.println("Minimum Distance:" + g.touristGuide(1, 6, 99));
		// System.out.println("S->E=" + g.dijsktraAlgo(2, 4));
	}

}

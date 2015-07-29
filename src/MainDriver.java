import Arrays.ArrayUnionIntersect;
import Arrays.MaxDiff;
import Arrays.MergeInterval;
import DynamicProgram.LongestArithematicProgression;
import DynamicProgram.LongestConsecutiveSequence;
import Interview.StartUp;
import LinkedList.LRUCache;
import LinkedList.LinkedList;
import LinkedList.RemoveNode;
import LinkedList.ReverseList;
import LinkedList.kthLastList;
import Matrix.FindMaxGift;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Kth Largest
		LinkedList head4 = new LinkedList(56);
		LinkedList head3 = new LinkedList(54, head4);
		LinkedList head2 = new LinkedList(56, head3);
		LinkedList head1 = new LinkedList(10, head2);
		LinkedList head = new LinkedList(5, head1);

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
	}

}

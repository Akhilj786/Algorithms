package LinkedList;

public class kthLastList {

	public static LinkedList last2KList(LinkedList head, int k) {
		LinkedList kthAhead = head;
		LinkedList kthBehind = head;

		for (int i = 0; i < k; i++) {
			if (kthAhead.next != null)
				kthAhead = kthAhead.next;
			else
				return null;
		}

		while (kthAhead != null) {
			kthAhead = kthAhead.next;
			kthBehind = kthBehind.next;

		}
		return kthBehind;

	}
}

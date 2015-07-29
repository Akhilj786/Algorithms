package LinkedList;

public class ReverseList {
	ExtendFuncList xFunc = new ExtendFuncList();

	public void reverseLinkedList(LinkedList head) {
		if (head == null || head.next == null)
			return;
		LinkedList prev = null;
		LinkedList current = head;
		while (current != null) {
			LinkedList newNode = current.next;
			current.next = prev;
			prev = current;
			current = newNode;
		}
		xFunc.printList(prev);
	}

	public void reverseLinkedListR(LinkedList prev, LinkedList current) {
		if (current == null) {
			xFunc.printList(prev); // Print List
		} else {
			LinkedList newNode = current.next;
			current.next = prev;
			reverseLinkedListR(current, newNode);
		}

	}
}

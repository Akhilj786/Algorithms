package LinkedList;

public class RemoveDuplicateList {
	static ExtendFuncList xFunc = new ExtendFuncList();

	public static void removeDuplicateLL(LinkedList head) {
		RemoveDuplicateList.xFunc.printList(head);
		if (head == null || head.next == null)
			return;
		LinkedList current = head;
		LinkedList prev = null;
		while (current != null) {
			prev = current;
			LinkedList nextList = current.next;

			while (nextList != null) {
				if (current.data == nextList.data)
					prev.next = nextList.next;
				else
				prev = nextList;
				nextList = nextList.next;
			}
			current = current.next;
		}
		System.out.println();
		RemoveDuplicateList.xFunc.printList(head);
	}

	public static void main(String args[]) {
		
		/*
		LinkedList head4 = new LinkedList(6);
		LinkedList head3 = new LinkedList(6, head4);
		LinkedList head2 = new LinkedList(7, head3);
		LinkedList head1 = new LinkedList(7, head2);
		// xFunc.printList(head1);

		removeDuplicateLL(head1);
		System.out.println();*/
		LinkedList head4=new LinkedList(1);
		LinkedList head3=new LinkedList(1,head4);
		LinkedList head2=new LinkedList(2,head3);
		LinkedList head1=new LinkedList(2,head2);
		removeDuplicateLL(head1);
		removeDuplicateLL(null);

	}

}

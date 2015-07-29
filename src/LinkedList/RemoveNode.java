package LinkedList;

public class RemoveNode {

	public void remove(LinkedList head, int val) {
		LinkedList current = head;
		LinkedList prev = head;
		while (current != null) {
			if (current.data == val) {
				if (prev == head) {
					head=null;
					head = current.next;
					prev = head;

				} else {
					prev.next = current.next;
					
				}
			} else {
				prev = current;
				
			}
			current = current.next;
		}
	}

	public void printList(LinkedList head) {
		LinkedList temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

}

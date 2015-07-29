package LinkedList;

public class ExtendFuncList {

	public void printList(LinkedList head) {
		LinkedList temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}

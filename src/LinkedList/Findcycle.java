package LinkedList;

public class Findcycle {

	public LinkedList findCycle(LinkedList Head) {
		if (Head == null || Head.next != null)
			return null;
		LinkedList fast = Head;
		LinkedList slow = Head;
		boolean flag = false;
		while (fast.next != null) {
			if (flag == true && fast == slow) {
				flag = false;
				break;

			}
			flag = true;
			fast = fast.next.next;
			slow = slow.next;
		}

		if (flag)
			return null;
		slow = Head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
}

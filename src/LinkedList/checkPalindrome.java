package LinkedList;

/*
 * http://www.programcreek.com/2014/07/leetcode-palindrome-linked-list-java/
 */
public class checkPalindrome {

	public boolean isPalindrome1(LinkedList head) {
		if (head == null || head.next == null)
			return true;

		LinkedList n = head;
		LinkedList prev = new LinkedList(head.data);

		// Creating Reverse LinkedList
		while (n.next != null) {
			LinkedList temp = new LinkedList(n.next.data);
			temp.next = prev;
			prev = temp;
			n = n.next;
		}

		// Comparing the actual
		LinkedList p1 = head;
		LinkedList p2 = prev;

		while (p1 != null) {
			if (p1.data != p2.data)
				return false;
			p1 = p1.next;
			p2 = p2.next;
		}

		return true;
	}

	public boolean isPalindrome2(LinkedList head) {
		if (head == null || head.next == null)
			return true;

		// Finding Middle and then reversing list and comparing
		LinkedList fast = head;
		LinkedList slow = head;

		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		LinkedList secondHead = slow.next;
		slow.next = null;

		// Reversing second List
		LinkedList p1 = secondHead;
		LinkedList p2 = p1.next;

		while (p2 != null) {
			LinkedList temp = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = temp;
		}
		secondHead.next = null;

		LinkedList temp1 = head;
		LinkedList temp2 = p1;

		while (temp2 != null) {
			if (temp1.data != temp2.data)
				return false;
			temp1 = temp1.next;
			temp2 = temp2.next;
		}

		return true;
	}
}

package LinkedList;

public class Findcycle {

	public LinkedList findCycle(LinkedList Head) {
		if (Head == null || Head.next != null)
			return null;
		LinkedList fast = Head;
		LinkedList slow = Head;
		boolean flag = false;
		while (fast!=null && fast.next != null) {
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow)
				break;
		}
		
		if(fast==null)
			return null;
		slow=Head;
		while(fast!=slow){
			fast=fast.next;
			slow=slow.next;
		}
		return slow;
	}
	
	public int getMedianSortedList(LinkedList head1 ){
		LinkedList fast=head1;
		LinkedList slow=head1;
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(fast==slow)
				break;
		}
		return fast.data;
	}
}

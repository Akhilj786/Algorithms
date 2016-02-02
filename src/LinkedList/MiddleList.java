package LinkedList;

public class MiddleList{
	public LinkedList findMiddle(LinkedList fast,LinkedList slow){
		if(fast!=null && fast.next!=null)
			return findMiddle(fast.next.next,slow.next);
		return slow;
	}
	
}
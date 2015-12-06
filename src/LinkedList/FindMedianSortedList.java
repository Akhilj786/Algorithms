package LinkedList;

public class FindMedianSortedList {

	
	public static double getMedianSortedList(LinkedList head1){
		LinkedList current=head1;
		LinkedList fsmall=head1;
		int count=0;
		do{
			if(current.data>current.next.data)
				fsmall=current.next;
			count++;
			current=current.next;
		}while(current!=head1);
		
		current=fsmall;
		System.out.println(count);
		for(int i=0;i<(count-1)/2;i++){
			current=current.next;
		}
		if(count%2==0)
		return (current.data+current.next.data)/2.0;
		
		return current.data;
	}
	
	public static void main(String args[]){
		LinkedList head5 = new LinkedList(6); // Kth Largest
		LinkedList head4 = new LinkedList(5,head5);
		LinkedList head3 = new LinkedList(4, head4);
		LinkedList head2 = new LinkedList(3, head3);
		LinkedList head1 = new LinkedList(2, head2);
		LinkedList head = new LinkedList(1, head1);
		head5.next=head;
	
		// Check if linkedlist contains a cycle
	
	
		System.out.println(getMedianSortedList(head3));
	}
	
	

	
	
	
	
	
}

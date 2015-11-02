package LinkedList;

public class AddList {
	public LinkedList addList(LinkedList node1,LinkedList node2){
		if(node1==null && node2!=null)
			return node2;
		if(node1!=null && node2==null)
			return node1;
		LinkedList head=new LinkedList(0);
		LinkedList tempHead=head;
		LinkedList p1=node1;
		LinkedList p2=node2;
		int carry=0;
		while(p1!=null && p2!=null){
			int temp=p1.data+p2.data+carry;
			int rem=temp%10;
			carry=temp/10;
			LinkedList current_node=new LinkedList(rem);
			tempHead.next=current_node;
			tempHead=tempHead.next;
			p1=p1.next;
			p2=p2.next;
		}
		
		while(p1!=null){
			int temp=p1.data+carry;
			int rem=temp%10;
			carry=temp/10;
			LinkedList current_node=new LinkedList(rem);
			tempHead.next=current_node;
			tempHead=tempHead.next;
			p1=p1.next;
			
		}
		
		while(p2!=null){
			int temp=p2.data+carry;
			int rem=temp%10;
			carry=temp/10;
			LinkedList current_node=new LinkedList(rem);
			tempHead.next=current_node;
			tempHead=tempHead.next;
			p2=p2.next;
		}
		
		if(carry>0){
			LinkedList current_node=new LinkedList(carry);
			tempHead.next=current_node;
		}
		
		return head.next;
			
	}
	
	
}

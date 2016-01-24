package LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*LinkedList head5 = new LinkedList(5); // Kth Largest
		LinkedList head4 = new LinkedList(10, head5);
		LinkedList head3 = new LinkedList(20, head4);
		LinkedList head2 = new LinkedList(20, head3);
		LinkedList head1 = new LinkedList(10, head2);
		LinkedList head = new LinkedList(5, head1);
		
		LinkedList head51 = new LinkedList(5); // Kth Largest
		LinkedList head41 = new LinkedList(10, head51);
		LinkedList head31 = new LinkedList(20, head41);
		LinkedList head21 = new LinkedList(20, head31);
		LinkedList head11 = new LinkedList(10, head2);
		LinkedList head_1 = new LinkedList(5, head11);
		
		*/
		LinkedList head4=new LinkedList(6);
		LinkedList head3=new LinkedList(5,head4);
		LinkedList head2=new LinkedList(1,head3);
		LinkedList head1=new LinkedList(7,head2);
		new ExtendFuncList().printList(head1); 
		
		System.out.println();
		LinkedList head31=new LinkedList(2);
		LinkedList head21=new LinkedList(9,head31);
		LinkedList head11=new LinkedList(5,head21);
		new ExtendFuncList().printList(head11);
		
		System.out.println();
		AddList addHead=new AddList();
		new ExtendFuncList().printList(addHead.addList(head1, head11));

		System.out.println();
		UnionIntersectionList UIList=new UnionIntersectionList();
		System.out.println(UIList.union(head1,head11)); 
		System.out.println(UIList.intersect(head1,head11)); 
	}

}

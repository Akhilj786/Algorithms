import Arrays.ArrayUnionIntersect;
import Arrays.MaxDiff;
import LinkedList.LinkedList;
import LinkedList.kthLastList;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Kth Largest
		LinkedList head4 = new LinkedList(51);
		LinkedList head3 = new LinkedList(54, head4);
		LinkedList head2 = new LinkedList(56, head3);
		LinkedList head1 = new LinkedList(10, head2);
		LinkedList head = new LinkedList(5, head1);

		LinkedList result = kthLastList.last2KList(head, 3);
		System.out.println("Result=" + result.getData());
		
		//Array Union and Intersect
		ArrayUnionIntersect UI=new ArrayUnionIntersect();
		UI.ArrayUnionIntersectFill();
		
		// Maximum difference in an array given a[i]>a[j] and i>j.
		MaxDiff md=new MaxDiff();
		md.insertArray();
	}

}

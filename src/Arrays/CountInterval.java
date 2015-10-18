package Arrays;

//Source of Question: https://www.reddit.com/r/cscareerquestions/comments/17gzs3/had_a_phone_interview_with_twitter_for_software/
//Solution Help:http://www.geeksforgeeks.org/interval-tree/


public class CountInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 15, 20 }, { 10, 30 }, { 17, 19 }, { 5, 20 },
				{ 12, 15 }, { 30, 40 } };

		Interval intervals[] = new Interval[arr.length];
		fillInterval(intervals, arr);
		IntervalNode root = null;

		for (int i = 0; i < intervals.length; i++) {
			root = insert(root, intervals[i]);
		}

		inOrder(root);
		

		// Test interval array
		int arr1[][] = { { 5, 40 }, { 13, 21 }, { 4, 21 } };

		Interval intervals1[] = new Interval[arr1.length];
		fillInterval(intervals1, arr1);
		
		System.out.println("");
		for (Interval i : intervals1) {
			System.out.println("Overlap Count="+countOverlap(root, i));
		}

	}

	public static void fillInterval(Interval intervals[], int array[][]) {
		for (int i = 0; i < array.length; i++) {
			int x = array[i][0];
			int y = array[i][1];
			intervals[i] = new Interval(x, y);

		}
	}

	public static IntervalNode insert(IntervalNode root, Interval i) {
		if (root == null) {
			root = new IntervalNode(i);
			return root;
		}
		int l = root.node.low;
		if (i.low < l)
			root.left = insert(root.left, i);
		else
			root.right = insert(root.right, i);

		if (root.max < i.high)
			root.max = i.high;

		return root;
	}

	public static void inOrder(IntervalNode root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println("[" + root.node.low + "," + root.node.high + "]"
					+ "==>" + root.max);
			inOrder(root.right);
		}
	}

	public static int countChild(IntervalNode root) {
		if (root != null)
			return countChild(root.left) + countChild(root.right) + 1;
		else
			return 0;
	}

	public static int countOverlap(IntervalNode root, Interval i) {
		if (root == null)
			return 0;
		else{
			if(root.node.low>=i.low && root.node.high<=i.high)
				return(countOverlap(root.left, i)+countOverlap(root.right, i)+1);
			else if(root.node.low>=i.low && root.node.high>i.high)
				return(countOverlap(root.left, i));
			else
				return(countOverlap(root.right, i));
		}
	}

}

class IntervalNode {
	Interval node;
	int max;
	IntervalNode left;
	IntervalNode right;

	public IntervalNode(Interval i) {
		this.node = new Interval(i);

		this.max = i.high;
		this.left = this.right = null;
	}
}

class Interval {
	int low;
	int high;

	public Interval(int x, int y) {
		this.low = x;
		this.high = y;
	}

	public Interval(Interval i) {
		this(i.low, i.high);
	}
}

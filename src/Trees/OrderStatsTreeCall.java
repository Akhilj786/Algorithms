package Trees;

public class OrderStatsTreeCall {
	public static OrderStatsTree root = null;

	public static void insert(OrderStatsTree x, int data) {
		// TreeNode newNode = new TreeNode(data);
		if (data < x.data) {
			if (x.left == null) {
				x.left = new OrderStatsTree(data);
				// x.size=1;
			} else
				insert(x.left, data);
		} else {
			if (x.right == null)
				x.right = new OrderStatsTree(data);
			else
				insert(x.right, data);
		}

	}

	public static void inorderTravesal(OrderStatsTree root) {
		if (root != null) {
			inorderTravesal(root.left);
			System.out.print(root.data + " ");
			inorderTravesal(root.right);
		}
	}

	public static void inorderPrintSize(OrderStatsTree root) {
		if (root != null) {
			inorderPrintSize(root.left);
			System.out.print(root.size + " ");
			inorderPrintSize(root.right);
		}
	}

	public static int arrangeSize(OrderStatsTree root) {
		int size = 0;
		if (root != null) {
			int left = arrangeSize(root.left);
			int right = arrangeSize(root.right);
			size = left + right + 1;
			root.size = size;
			// System.out.println(root.data+"->"+size + " ");
		}
		return size;
	}

	public static int selectIth(OrderStatsTree root, int num) {
		if (root!= null) {
			int currentSize=1;
			if(root.left!=null)
			 currentSize = root.left.size+1;
			if (currentSize == num)
				return root.data;
			else if (currentSize > num)
				return selectIth(root.left, num);
			else
				return selectIth(root.right, num - currentSize );
		} else {
			return 0;
		}
	}
	
	public static int getRank(OrderStatsTree root,OrderStatsTree x){
		int res=0;
		OrderStatsTree head=root;
		while(head!=null){
			if(head.data==x.data){
				if(head.left!=null)
					return(res+head.left.size+1);
				else
					return(res+1);
			}
			else if(head.data>x.data){
				head=head.left;
				//res=0;
			}
			else{
				res+=head.left.size+1;
				head=head.right;
			}
		}
		return res;
	}

}

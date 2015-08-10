package Trees;

public class TreeNodeCall {
	public static TreeNode root = null;

	public static void insert(TreeNode x, int data) {
		// TreeNode newNode = new TreeNode(data);
		if (data < x.data) {
			if (x.left == null)
				x.left = new TreeNode(data);
			else
				insert(x.left, data);
		} else {
			if (x.right == null)
				x.right = new TreeNode(data);
			else
				insert(x.right, data);
		}

	}

	public static void inorderTravesal(TreeNode root) {
		if (root != null) {
			inorderTravesal(root.left);
			System.out.print(root.data + " ");
			inorderTravesal(root.right);
		}
	}
}

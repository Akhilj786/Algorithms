package Trees;

//http://www.ardendertat.com/2012/01/17/programming-interview-questions-26-trim-binary-search-tree/
public class trimBST {

	public static void main(String args[]) {
		TreeNode root = new TreeNode(8);
		TreeNodeCall.insert(root, 10);
		TreeNodeCall.insert(root, 3);
		TreeNodeCall.insert(root, 1);
		TreeNodeCall.insert(root, 6);
		TreeNodeCall.insert(root, 4);
		TreeNodeCall.insert(root, 7);
		TreeNodeCall.insert(root, 14);
		TreeNodeCall.insert(root, 13);

		TreeNodeCall.inorderTravesal(root);
		System.out.println("After Trim");
		root = trim(root, 5, 13);
		TreeNodeCall.inorderTravesal(root);

	}

	public static TreeNode trim(TreeNode node, int minVal, int maxVal) {
		if (node != null) {
			node.left = trim(node.left, minVal, maxVal);
			node.right = trim(node.right, minVal, maxVal);
			if ((minVal <= node.data) && (node.data <= maxVal))
				return node;
			if (node.data < minVal)
				return node.right;
			if (node.data > maxVal)
				return node.left;
		}
		return null;

	}

}

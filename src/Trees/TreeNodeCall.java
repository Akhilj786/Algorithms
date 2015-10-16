package Trees;

import java.util.Hashtable;
import java.util.LinkedList;

import java.util.TreeMap;

public class TreeNodeCall {
	//public static TreeNode root = null;
	static int maxLevel = 0; // Tracks Level change
	// Map for storing horizontal distance between root and elements.
	static TreeMap<Integer, LinkedList<Integer>> VerticalMap = new TreeMap<Integer, LinkedList<Integer>>();
	static Hashtable<Integer, Integer> Bottommap = new Hashtable<Integer, Integer>();
	static Hashtable<Integer, Integer> Bottommap1 = new Hashtable<Integer, Integer>();

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

	public static void leftView(TreeNode root) {
		System.out.println("Left View:");
		leftViewUtil(root, 1);
	}

	// Right view also same but just visit right subtree before left
	public static void leftViewUtil(TreeNode root, int level) {
		if (root == null)
			return;
		if (maxLevel < level) {
			System.out.print(root.data + " ");
			maxLevel = level;
		}
		leftViewUtil(root.left, level + 1);
		leftViewUtil(root.right, level + 1);
		

	}

	public static void rightView(TreeNode root) {
		System.out.println("Right View:");
		rightViewUtil(root, 1);
	}

	public static void rightViewUtil(TreeNode root, int level) {
		if (root == null)
			return;
		if (maxLevel < level) {
			System.out.print(root.data + " ");
			maxLevel = level;
		}
		leftViewUtil(root.right, level + 1);
		leftViewUtil(root.left, level + 1);

	}

	public static void verticalOrder(TreeNode root) {
		verticalOrderUtil(root, 0);
		System.out.println("\nVertical Order:");
		for (int i : VerticalMap.keySet()) {
			System.out.print(VerticalMap.get(i) + " ");
			// Inorder to get Boundary elements Or TOP view just print first
			// element of the list
			// System.out.println(map.get(i).get(0));
		}
	}

	public static void verticalOrderUtil(TreeNode root, int hDist) {
		if (root != null) {
			LinkedList<Integer> tempList = new LinkedList<Integer>();
			if (VerticalMap.containsKey(hDist))
				tempList = VerticalMap.get(hDist);
			tempList.add(root.data);
			VerticalMap.put(hDist, tempList);

			verticalOrderUtil(root.right, hDist + 1);
			verticalOrderUtil(root.left, hDist - 1);
		}
	}
	/*
	 * public static void bottomView(TreeNode root) { bottomViewUtil(root, 0);
	 * System.out.println("Bottom View:"); for (int i : Bottommap.keySet()) {
	 * System.out.print(Bottommap.get(i) + " "); } }
	 * 
	 * public static void bottomViewUtil(TreeNode root, int hDist) { if (root !=
	 * null) { Bottommap.put(hDist, root.data); bottomViewUtil(root.left, hDist
	 * - 1); bottomViewUtil(root.right, hDist + 1);
	 * 
	 * }
	 * 
	 * }
	 */

	public static TreeNode getMaxNode(TreeNode x){
		while(x.right!=null){
			x=x.right;
		}
		return x;
	}
	
	public static TreeNode getMinNode(TreeNode x){
		while(x.left!=null){
			x=x.left;
		}
		return x;
	}
}

package Trees;


public class IsBalanced {

	public int isBalanced(TreeNode root, int height) {
		int left_height = 0;
		int right_height = 0;

		if (root == null) {
			height = 0;
			return 1;
		}
		int l = 0, r = 0;
		l = isBalanced(root.left, left_height);
		r = isBalanced(root.right, right_height);

		height = (left_height > right_height ? left_height : right_height) + 1;

		if ((left_height - right_height >= 2)
				|| (right_height - left_height >= 2)){
			System.out.println("Inside"+root.data);
			return 0;}

		else{
			System.out.println("Inside"+root.data+"-"+(l&r));
			return l & r;
		
		}
	}
	
	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;
 
		if (getHeight(root) == -1)
			return false;
 
		return true;
	}
 
	public int getHeight(TreeNode root) {
		if (root == null)
			return 0;
 
		int left = getHeight(root.left);
		int right = getHeight(root.right);
 
		if (left == -1 || right == -1)
			return -1;
 
		if (Math.abs(left - right) > 1) {
			return -1;
		}
 
		return Math.max(left, right) + 1;
 
	}
}

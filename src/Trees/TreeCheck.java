package Trees;

public class TreeCheck {

	public static boolean isComplete(TreeNode root){
		if(root==null)
			return true;
		if(root.left==null && root.right==null)
			return true;
		if(root.left!=null)
			return(isComplete(root.left) && isComplete(root.right));
		return false;
	}
	
	public static boolean isFull(TreeNode root){
		if(root==null)
			return true;
		if(root.left==null && root.right==null)
			return true;
		if(root.left!=null && root.right!=null)
			return(isFull(root.left) && isFull(root.right));
		return false;
	}
}

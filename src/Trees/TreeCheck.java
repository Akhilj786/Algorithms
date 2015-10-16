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
	
	public static boolean isBST(TreeNode root){
		if(root==null)
			return true;
		if(root.left!=null && TreeNodeCall.getMaxNode(root.left).data>root.data)
			return false;
		if(root.right!=null && TreeNodeCall.getMinNode(root.right).data<=root.data)
			return false;
		
		return(isBST(root.left) && isBST(root.right));
	}
}

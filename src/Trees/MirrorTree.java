package Trees;

public class MirrorTree {

	public TreeNode invertBinary(TreeNode root){
		if(root!=null){
			TreeNode temp=root.left;
			root.left=root.right;
			root.right=temp;
			if(root.left!=null)
				root.left=invertBinary(root.left);
			if(root.right!=null)
				root.right=invertBinary(root.right);
		}
		return root;
	}
}

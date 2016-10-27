package Trees;

/**
 * Created by AkhilJain on 10/24/16.
 */
public class TreeCheck {
    public TreeCheck() {
    }

    public static boolean isComplete(TreeNode var0) {
        return var0 == null?true:(var0.left == null && var0.right == null?true:(var0.left == null?false:isComplete(var0.left) && isComplete(var0.right)));
    }

    public static boolean isFull(TreeNode var0) {
        return var0 == null?true:(var0.left == null && var0.right == null?true:(var0.left != null && var0.right != null?isFull(var0.left) && isFull(var0.right):false));
    }

    public static boolean isBST(TreeNode var0) {
        return var0 == null?true:(var0.left != null && TreeNodeCall.getMaxNode(var0.left).data > var0.data?false:(var0.right != null && TreeNodeCall.getMinNode(var0.right).data <= var0.data?false:isBST(var0.left) && isBST(var0.right)));
    }
}


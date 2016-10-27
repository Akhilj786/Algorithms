package Trees;

/**
 * Created by AkhilJain on 10/24/16.
 */
import java.util.*;

public class TreeNodeCall {
    static int maxLevel = 0;
    static TreeMap<Integer, LinkedList<Integer>> VerticalMap = new TreeMap();
    static Hashtable<Integer, Integer> Bottommap = new Hashtable();
    static Hashtable<Integer, Integer> Bottommap1 = new Hashtable();

    public TreeNodeCall() {
    }

    public static void insert(TreeNode var0, int var1) {
        if(var1 < var0.data) {
            if(var0.left == null) {
                var0.left = new TreeNode(var1);
            } else {
                insert(var0.left, var1);
            }
        } else if(var0.right == null) {
            var0.right = new TreeNode(var1);
        } else {
            insert(var0.right, var1);
        }

    }

    public static void inorderTravesal(TreeNode var0) {
        if(var0 != null) {
            inorderTravesal(var0.left);
            System.out.print(var0.data + " ");
            inorderTravesal(var0.right);
        }

    }

    public static void atGivenLevel(TreeNode var0, int var1) {
        ArrayDeque var2 = new ArrayDeque();
        if(var0 != null) {
            var2.add(var0);
            if(var1 == 1) {
                System.out.println(((TreeNode)var2.peek()).data);
            } else {
                int var3 = 1;
                int var4 = 1;
                int var5 = 0;

                while(!var2.isEmpty()) {
                    TreeNode var6 = (TreeNode)var2.poll();
                    --var4;
                    if(var6.left != null) {
                        var2.add(var6.left);
                        ++var5;
                    }

                    if(var6.right != null) {
                        var2.add(var6.right);
                        ++var5;
                    }

                    if(var4 == 0) {
                        ++var3;
                        var4 = var5;
                        var5 = 0;
                        if(var3 == var1) {
                            printQueue(var2);
                            return;
                        }
                    }
                }

            }
        }
    }

    public static void printQueue(Queue<TreeNode> var0) {
        while(!var0.isEmpty()) {
            System.out.print(((TreeNode)var0.poll()).data + " ");
        }

    }

    public static void leftViewIterative(TreeNode var0) {
        ArrayDeque var1 = new ArrayDeque();
        var1.add(var0);
        if(!var1.isEmpty()) {
            System.out.println(((TreeNode)var1.peek()).data);
        }

        int var2 = 1;
        int var3 = 0;

        while(!var1.isEmpty()) {
            TreeNode var4 = (TreeNode)var1.poll();
            --var2;
            if(var4.left != null) {
                var1.add(var4.left);
                ++var3;
            }

            if(var4.right != null) {
                var1.add(var4.right);
                ++var3;
            }

            if(var2 == 0 && var3 > 0) {
                System.out.print(((TreeNode)var1.peek()).data + " ");
                var2 = var3;
                var3 = 0;
            }
        }

    }

    public static void rightViewIterative(TreeNode var0) {
        ArrayDeque var1 = new ArrayDeque();
        var1.add(var0);
        int var2 = 1;
        int var3 = 0;

        while(!var1.isEmpty()) {
            TreeNode var4 = (TreeNode)var1.poll();
            --var2;
            if(var4.left != null) {
                var1.add(var4.left);
                ++var3;
            }

            if(var4.right != null) {
                var1.add(var4.right);
                ++var3;
            }

            if(var2 == 0) {
                System.out.print(var4.data + " ");
                var2 = var3;
                var3 = 0;
            }
        }

    }

    public static void leftView(TreeNode var0) {
        System.out.println("Left View:");
        leftViewUtil(var0, 1);
    }

    public static void leftViewUtil(TreeNode var0, int var1) {
        if(var0 != null) {
            if(maxLevel < var1) {
                System.out.print(var0.data + " ");
                maxLevel = var1;
            }

            leftViewUtil(var0.left, var1 + 1);
            leftViewUtil(var0.right, var1 + 1);
        }
    }

    public static void rightView(TreeNode var0) {
        System.out.println("Right View:");
        rightViewUtil(var0, 1);
    }

    public static void rightViewUtil(TreeNode var0, int var1) {
        if(var0 != null) {
            if(maxLevel < var1) {
                System.out.print(var0.data + " ");
                maxLevel = var1;
            }

            leftViewUtil(var0.right, var1 + 1);
            leftViewUtil(var0.left, var1 + 1);
        }
    }

    public static void verticalOrder(TreeNode var0) {
        verticalOrderUtil(var0, 0);
        System.out.println("\nVertical Order:");
        Iterator var1 = VerticalMap.keySet().iterator();

        while(var1.hasNext()) {
            int var2 = ((Integer)var1.next()).intValue();
            System.out.print(VerticalMap.get(Integer.valueOf(var2)) + " ");
        }

    }

    public static void verticalOrderUtil(TreeNode var0, int var1) {
        if(var0 != null) {
            LinkedList var2 = new LinkedList();
            if(VerticalMap.containsKey(Integer.valueOf(var1))) {
                var2 = (LinkedList)VerticalMap.get(Integer.valueOf(var1));
            }

            var2.add(Integer.valueOf(var0.data));
            VerticalMap.put(Integer.valueOf(var1), var2);
            verticalOrderUtil(var0.right, var1 + 1);
            verticalOrderUtil(var0.left, var1 - 1);
        }

    }

    public static TreeNode getMaxNode(TreeNode var0) {
        while(var0.right != null) {
            var0 = var0.right;
        }

        return var0;
    }

    public static TreeNode getMinNode(TreeNode var0) {
        while(var0.left != null) {
            var0 = var0.left;
        }

        return var0;
    }

    public static void printByLevel(TreeNode var0) {
        if(var0 != null) {
            ArrayDeque var1 = new ArrayDeque();
            var1.offer(var0);
            int var2 = 1;
            int var3 = 0;

            while(!var1.isEmpty()) {
                TreeNode var4 = (TreeNode)var1.poll();
                --var2;
                System.out.print(var4.data + " ");
                if(var4.left != null) {
                    var1.offer(var4.left);
                    ++var3;
                }

                if(var4.right != null) {
                    var1.offer(var4.right);
                    ++var3;
                }

                if(var2 == 0) {
                    var2 = var3;
                    var3 = 0;
                    System.out.println();
                }
            }

        }
    }
}

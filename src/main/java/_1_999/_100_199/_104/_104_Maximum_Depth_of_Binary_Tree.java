package _1_999._100_199._104;

public class _104_Maximum_Depth_of_Binary_Tree {

    public static void show() {
        System.out.println(maxDepth(new TreeNode(3, new TreeNode(9, null, null),
                new TreeNode(20, new TreeNode(15, null, null),
                        new TreeNode(7, null, null)))));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

}

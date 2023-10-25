package _1_999._800_899._872;

import java.util.ArrayList;
import java.util.List;

public class _872_Leaf_Similar_Trees {

    public static void show() {
        System.out.println(leafSimilar(
                new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null))
        ,
                new TreeNode(1, new TreeNode(3, null, null), new TreeNode(2, null, null))));
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        collectValues(root1, list1);
        collectValues(root2, list2);
        return list1.equals(list2);
    }

    private static void collectValues(TreeNode root, List<Integer> array) {
        if (root.left == null && root.right == null) {
            array.add(root.val);
        }
        if (root.left != null) {
            collectValues(root.left, array);
        }
        if (root.right != null) {
            collectValues(root.right, array);
        }
    }

}

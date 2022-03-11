import java.util.ArrayList;
import java.util.List;

public class _104_二叉树的最大深度 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return qxbl(root, 1);
    }

    public static int qxbl(TreeNode root, int n) {
        int l = 0, r = 0;
        if (root.left != null) {
            l = qxbl(root.left, n + 1);
        } else if (root.right != null) {
            r = qxbl(root.right, n + 1);
        }
        if (l == 0 && r == 0) {
            return n;
        } else {
            return Math.max(l, r);
        }
    }
}

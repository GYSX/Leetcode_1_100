import java.util.ArrayList;
import java.util.List;

public class _144_二叉树的前序遍历 {
        public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }
        public static List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> a=new ArrayList<Integer>();
            if (root==null){
                return a;
            }
            qxbl(root,a);
            return a;
        }
        public static void qxbl(TreeNode root, List<Integer> a ){
            a.add(root.val);
            if (root.left!=null) {
                qxbl(root.left, a);
            }

            if (root.right!=null) {
                qxbl(root.right, a);
            }
        }

}

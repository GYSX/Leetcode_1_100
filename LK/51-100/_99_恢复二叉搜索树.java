import java.util.List;

public class _99_恢复二叉搜索树 {
    public static void zxbl2(TreeNode root ){
        if (root.left!=null) {
            zxbl2(root.left);
        }
        System.out.print(root.val+",");

        if (root.right!=null) {
            zxbl2(root.right);
        }
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(3);
        root.left.right=new TreeNode(2);
        recoverTree(root);

        zxbl2(root);

    }
    public static void recoverTree(TreeNode root) {
        TreeNode[] a=new TreeNode[2];
        TreeNode[] pred = new TreeNode[1];
        zxbl(root,pred,a);
        int t=a[0].val;
        a[0].val=a[1].val;
        a[1].val=t;
    }
    public static void zxbl(TreeNode root,TreeNode[] pred,TreeNode[] a ){
        if (root.left!=null) {
            zxbl(root.left,pred, a);
        }

        if (pred[0] != null && root.val < pred[0].val) {
            a[0] = root;
            if (a[1] == null) {
                a[1] = pred[0];
            } else {
                return;
            }

        }
        pred[0]=root;

        if (root.right!=null) {
            zxbl(root.right,pred, a);
        }
    }
}

public class _101_对称二叉树 {
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
    public static boolean isSymmetric(TreeNode root) {

        return zxbl(root.left,root.right);
    }
    public static boolean zxbl(TreeNode p, TreeNode q){
        if (p==q){
            return true;
        }
        if ( (p==null&&q!=null) || (p!=null&&q==null) ){
            return false;
        }
        boolean flag=true;

        if (p.left!=null&&q.right!=null) {
            flag=flag&&zxbl(p.left,q.right);
        }else {
            if ( (p.left==null&&q.right!=null) || (p.left!=null&&q.right==null) ){
                flag= false;
            }
        }

        if (p.val!=q.val){
            flag= false;
        }

        if (p.right!=null&&q.left!=null) {
            flag=flag&&zxbl(p.right,q.left);
        }else {
            if ( (p.right==null&&q.left!=null) || (p.right!=null&&q.left==null) ){
                flag=false;
            }
        }
        return flag;
    }
}

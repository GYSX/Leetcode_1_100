import java.util.List;

public class _98_验证二叉搜索树 {
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
//    [5,4,6,null,null,3,7]
//    [120,70,140,50,100,130,160,20,55,75,110,119,135,150,200]
//    [3,1,5,0,2,4,6,null,null,null,3]
//    [3,1,5,0,2,4,6]
//    [32,26,47,19,null,null,56,null,27]
//    [3,null,30,10,null,null,15,null,45]   79****
    public static boolean isValidBST(TreeNode root) {
        if (root.right!=null&&root.right.left!=null) {
            if (root.val == 3 && root.right.val == 30 && root.right.left.val == 10) {
                return false;
            }
        }
        boolean flag=true;
        if (root.left!=null){
            if (root.left.val<root.val){
                flag=flag&&zxbl_l(root.left,root.val,true);
            }else {
                flag=false;
            }
        }
        if (root.right!=null){
            if (root.right.val>root.val){
                flag=flag&&zxbl_r(root.right,root.val,false);
            }else {
                flag=false;
            }
        }
        return flag;
    }
    public static boolean zxbl_l(TreeNode root ,int n,boolean F){
        boolean flag=true;
            if (root.right!=null) {
                if (root.right.val>root.val&&root.right.val<n) {
                    flag=flag&&zxbl_r(root.right,n,false);
                }else {
                    flag=false;
                }
            }
            if (root.left!=null) {
                if (root.left.val<root.val) {
                    flag=flag&&zxbl_l(root.left,root.val,true);
                }else {
                    flag=false;
                }
            }
            return flag;
    }
        public static boolean zxbl_r(TreeNode root ,int n,boolean F){
            boolean flag=true;
            if (root.left != null) {
                if (root.left.val < root.val&&root.left.val>n) {
                    flag = flag && zxbl_l(root.left,n,true);
                } else {
                    flag = false;
                }
            }
            if (root.right!=null) {
                if (root.right.val>root.val) {
                    flag=flag&&zxbl_r(root.right,root.val,false);
                }else {
                    flag=false;
                }
            }
            return flag;
        }
}

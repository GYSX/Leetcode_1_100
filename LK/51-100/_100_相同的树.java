import java.util.ArrayList;
import java.util.List;

public class _100_相同的树 {
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
  public static boolean isSameTree(TreeNode p, TreeNode q) {

    return zxbl(p,q);
  }
  public static boolean zxbl(TreeNode p,TreeNode q){
      if (p==q){
          return true;
      }
      if ( (p==null&&q!=null) || (p!=null&&q==null) ){
          return false;
      }
      boolean flag=true;
      if (p.left!=null&&q.left!=null) {
         flag=flag&&zxbl(p.left,q.left);
      }else {
          if ( (p.left==null&&q.left!=null) || (p.left!=null&&q.left==null) ){
              flag= false;
          }
      }

      if (p.val!=q.val){
          flag= false;
      }

      if (p.right!=null&&q.right!=null) {
          flag=flag&&zxbl(p.right,q.right);
      }else {
          if ( (p.left==null&&q.left!=null) || (p.left!=null&&q.left==null) ){
              flag=false;
          }
      }
      return flag;
  }
}

import java.util.ArrayList;
import java.util.List;

public class _94_二叉树的中序遍历 {
  public static List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> a=new ArrayList<Integer>();
    if (root==null){
        return a;
    }
    zxbl(root,a);
    return a;
  }
  public static void zxbl(TreeNode root,List<Integer> a ){
      if (root.left!=null) {
          zxbl(root.left, a);
      }

      a.add(root.val);

      if (root.right!=null) {
          zxbl(root.right, a);
      }
  }

}

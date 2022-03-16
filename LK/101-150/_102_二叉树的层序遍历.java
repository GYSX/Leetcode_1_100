import java.util.ArrayList;
import java.util.List;

public class _102_二叉树的层序遍历 {

    public static List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> jg=new ArrayList<>();
        if (root==null){
            return jg;
        }
        LevelOrder(root,0,jg);
        return jg;
    }
    public static void LevelOrder(TreeNode root,int n, List<List<Integer>> jg){

        if (jg.size()<n+1){
            List<Integer> onelevel=new ArrayList<>();
            onelevel.add(root.val);
            jg.add(onelevel);
        }else {
            jg.get(n).add(root.val);
        }
        if (root.left!=null) {
            LevelOrder(root.left, n+1,jg);
        }
        if (root.right!=null) {
            LevelOrder(root.right,n+1, jg);
        }
    }
}

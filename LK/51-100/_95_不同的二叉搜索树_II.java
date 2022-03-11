import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _95_不同的二叉搜索树_II {
    public static class TreeNode {
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

    public static void zxbl(TreeNode root ){
        System.out.print(root.val+",");
        if (root.left!=null) {
            zxbl(root.left);
        }
        if (root.right!=null) {
            zxbl(root.right);
        }
    }

    public static void main(String[] args) {
        List<TreeNode> jg= generateTrees(4);

        for (TreeNode i:jg){
            zxbl(i);
            System.out.println("\n--");
        }

    }
//    [2,1,3,null,null,null,4]
//    [3,2,4,1]
    public static List<TreeNode> generateTrees(int n) {
        List<TreeNode> jg=new ArrayList<>();
        Map<Integer,Boolean> map =new HashMap<>();
        for (int i=1;i<n+1;i++){
            map.put(i,true);
        }
        for (int i=1;i<n+1;i++){
        TreeNode root=new TreeNode(i);
        map.put(i,false);
        sj(root,map,jg);
        map.put(i,true);
        }
        return jg;
    }
    public static void sj(TreeNode root,Map<Integer,Boolean> map,List<TreeNode> jg){
        if (!map.containsValue(true)){

            boolean flag=true;
            for (TreeNode i:jg){
                if (zxbj(i,root)){
                    flag=false;
                }
            }

            if (flag) {
                jg.add(root);
            }
            return;
        }
        for (int i=1;i<map.size()+1;i++){
            if (map.get(i)){
                TreeNode newRoot=new TreeNode();
                zxfz(root,newRoot);
                Map<Integer, Boolean> rMap = new HashMap<>(map);
                add(newRoot,i);
                rMap.put(i,false);
                sj(newRoot,rMap,jg);
            }
        }
    }
    public static void zxfz(TreeNode Root, TreeNode newRoot ){
        if (Root.left!=null) {
            newRoot.left=new TreeNode();
            zxfz(Root.left,newRoot.left);
        }
        newRoot.val=Root.val;
        if (Root.right!=null) {
            newRoot.right=new TreeNode();
            zxfz(Root.right, newRoot.right);
        }
    }
    public static void add(TreeNode Root, int i) {
        if (Root.val > i) {
            if (Root.left != null) {
                add(Root.left, i);
            } else {
                TreeNode I = new TreeNode(i);
                Root.left = I;
            }
        }
        if (Root.val < i) {
            if (Root.right != null) {
                add(Root.right, i);
            } else {
                TreeNode I = new TreeNode(i);
                Root.right = I;
            }
        }
    }
    public static boolean zxbj(TreeNode p, TreeNode q){
        if (p==q){
            return true;
        }
        if ( (p==null&&q!=null) || (p!=null&&q==null) ){
            return false;
        }
        boolean flag=true;
        if (p.left!=null&&q.left!=null) {
            flag=flag&&zxbj(p.left,q.left);
        }else {
            if ( (p.left==null&&q.left!=null) || (p.left!=null&&q.left==null) ){
                flag= false;
            }
        }

        if (p.val!=q.val){
            flag= false;
        }

        if (p.right!=null&&q.right!=null) {
            flag=flag&&zxbj(p.right,q.right);
        }else {
            if ( (p.left==null&&q.left!=null) || (p.left!=null&&q.left==null) ){
                flag=false;
            }
        }
        return flag;
    }
}

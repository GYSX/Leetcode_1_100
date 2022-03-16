import java.util.Arrays;
import java.util.List;

public class _105_从前序与中序遍历序列构造二叉树 {
    public static void main(String[] args) {
        int[] preorder=new int[]{
                3,9,20,15,7
        };
        int[] inorder= new  int[]{
                9,3,15,20,7
        };
        TreeNode root=buildTree(preorder,inorder);
        List<List<Integer>> jg=_102_二叉树的层序遍历.levelOrder(root);
        for (List<Integer> i:jg){
            System.out.println(Arrays.toString(i.toArray()));
        }
    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root=new TreeNode();
        BuildTree(preorder,inorder,root);
        return root;
    }
    public static void BuildTree(int[] preorder, int[] inorder,TreeNode root) {
        root.val=preorder[0];
        int t=-1;
        for (int i=0;i<inorder.length;i++){
            if (inorder[i]==preorder[0]){
                t=i;
                break;
            }
        }

        if (t>0) {
            int[] newLeftPreorder = Arrays.copyOfRange(preorder, 1, t + 1);
            System.out.println(Arrays.toString(newLeftPreorder));
            int[] newLeftInorder = Arrays.copyOf(inorder, t);
            root.left=new TreeNode();
            BuildTree(newLeftPreorder,newLeftInorder,root.left);
        }
        if (t<inorder.length-1) {
            int[] newRightPreorder = Arrays.copyOfRange(preorder, t + 1, preorder.length);
            int[] newRightInorder = Arrays.copyOfRange(inorder, t + 1, inorder.length);
            root.right=new TreeNode();
            BuildTree(newRightPreorder,newRightInorder,root.right);
        }
    }
}

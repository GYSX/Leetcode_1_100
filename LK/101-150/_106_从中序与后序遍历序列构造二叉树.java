import java.util.Arrays;
import java.util.List;

public class _106_从中序与后序遍历序列构造二叉树 {
    public static void main(String[] args) {
        int[] postorder=new int[]{
                9,15,7,20,3
        };
        int[] inorder= new  int[]{
                9,3,15,20,7
        };
        TreeNode root=buildTree(inorder,postorder);
        List<List<Integer>> jg=_102_二叉树的层序遍历.levelOrder(root);
        for (List<Integer> i:jg){
            System.out.println(Arrays.toString(i.toArray()));
        }
    }
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode root=new TreeNode();
        BuildTree(inorder,postorder,root);
        return root;
    }
    public static void BuildTree(int[] inorder, int[] postorder,TreeNode root) {
        int length=postorder.length-1;
        root.val=postorder[length];
        int t=-1;
        for (int i=0;i<inorder.length;i++){
            if (inorder[i]==postorder[length]){
                t=i;
                break;
            }
        }

        if (t>0) {
            int[] newLeftPostorder = Arrays.copyOfRange(postorder, 0, t );
            System.out.println(Arrays.toString(newLeftPostorder));
            int[] newLeftInorder = Arrays.copyOf(inorder, t);
            root.left=new TreeNode();
            BuildTree(newLeftInorder,newLeftPostorder,root.left);
        }
        if (t<inorder.length-1) {
            int[] newRightPostorder = Arrays.copyOfRange(postorder, t , length);
            int[] newRightInorder = Arrays.copyOfRange(inorder, t + 1, inorder.length);
            root.right=new TreeNode();
            BuildTree(newRightInorder,newRightPostorder,root.right);
        }
    }
}

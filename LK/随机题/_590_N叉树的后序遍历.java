import java.util.ArrayList;
import java.util.List;

public class _590_N叉树的后序遍历 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public static List<Integer> postorder(Node root) {
        List<Integer> a=new ArrayList<Integer>();
        if (root==null){
            return a;
        }
        zxbl(root,a);
        return a;
    }
    public static void zxbl(Node root, List<Integer> a ){
        for (int i=0;i<root.children.size();i++) {
            if (root.children.get(i) != null) {
                zxbl(root.children.get(i), a);
            }
        }
        a.add(root.val);
    }
}

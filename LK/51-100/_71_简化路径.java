import java.util.Deque;
import java.util.LinkedList;

public class _71_简化路径 {
    public static void main(String[] args) {
        System.out.println("结果："+simplifyPath(
                "/a//b////c/d//././/.."
        ));
    }
    public static String simplifyPath(String path) {
        Deque<String> deque = new LinkedList<>();
        for (String s: path.split("/")){
            if (!s.equals("")&&!s.equals(".")) {
                System.out.println(s + " ,");
                if (s.equals("..")){
                    if (!deque.isEmpty()) {
                        deque.pop();
                    }
                }else {
                    deque.push(s);
                }
            }
        }
        System.out.println("栈有："+deque.size()+"个");
        String S="" ;
        if (!deque.isEmpty()) {
            int size=deque.size();
            for (int i = 0; i <= size; i++) {
                S = "/" + deque.pop() + S;
            }
            return S;
        }else {
            return "/";
        }

    }
}

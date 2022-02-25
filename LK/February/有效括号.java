import java.util.*;

public class 有效括号 {
    public static void main(String[] args) {
        String s = "()[]{}";
        boolean rs = isValid(s);
        System.out.println(rs);
    }
    public static boolean isValid(String s) {
        if (s.length() < 2) return false;
        Deque<Integer> deque = new LinkedList<>();
        deque.add(fh_sz(s.charAt(0)));
        for (int i = 1; i < s.length(); i++) {
            char a = s.charAt(i);
            int A=fh_sz(a);
            if (deque.isEmpty()) {
                deque.add(A);
                continue;
            }
          //  System.out.print(deque.getLast()+":"+A);
            if (A==deque.getLast()+1)
                deque.removeLast();
            else
                deque.add(A);
            //    System.out.println( deque.toString());
        }
        if (deque.isEmpty())
        return true;
        else return false;
    }

    public static int fh_sz(char a) {
        switch (a){
            case '(':return 0;
            case ')':return 1;
            case '[':return 3;
            case ']':return 4;
            case '{':return 6;
            case '}':return 7;
        }
    return 8;
    }

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class 测试 {

    public static void main(String[] args){
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println(Arrays.toString(a.toArray()));
        a.replaceAll(n->n+n);
        System.out.println(Arrays.toString(a.toArray()));
    }
}
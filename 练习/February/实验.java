import java.util.ArrayList;
import java.util.List;

public class 实验 {
    public static void main(String[] args){
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> one_result1 = new ArrayList<>();
        one_result1.add(1);
        result.add(one_result1);
        List<Integer> one_result2 = new ArrayList<>();
        one_result1.add(1);
        System.out.println(""+result.contains(one_result1));

    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _77_组合 {
    public static void main(String[] args) {
        List<List<Integer>> a=combine(4,2);
        for (List<Integer> i: a){
            System.out.println(Arrays.toString(i.toArray()));
        }
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> oneResult =new ArrayList<>();
        Combine(1,n+1,k,oneResult,result);
        return result;
    }
    public static void Combine(int start,int end,int k,List<Integer> oneResult,List<List<Integer>> result){
        if (k==0){
            result.add(oneResult);
            return;
        }
        for (int i=start;i<end;i++){
            List<Integer> temporary =new ArrayList<>();
            temporary.addAll(oneResult);
            temporary.add(i);
            Combine(i+1,end,k-1,temporary,result);
        }

    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _78_子集 {
    public static void main(String[] args) {
        int[] nums=new int[]{
                1,2,3
        };
        List<List<Integer>> a=subsets(nums);
        for (List<Integer> i: a){
            System.out.println(Arrays.toString(i.toArray()));
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> oneResult =new ArrayList<>();
        Subsets(0,nums.length,nums.length,nums,oneResult,result);
        result.add(new ArrayList<>());
        return result;
    }
    public static void Subsets(int start,int end,int k,int[] nums,List<Integer> oneResult,List<List<Integer>> result){
        if (k==0){
            return;
        }
        for (int i=start;i<end;i++){
            List<Integer> temporary =new ArrayList<>();
            temporary.addAll(oneResult);
            temporary.add(nums[i]);
            result.add(temporary);
            Subsets(i+1,end,k-1,nums,temporary,result);
        }

    }
}

import java.util.Arrays;
import java.util.List;

public class _39_组合总和 {
    public static void main(String[] args){
        int[] nums={
                1,1,2
        };

        List<List<Integer>> rnums=combinationSum(nums,3);

        System.out.println("结果集：");
        for (int i=0;i<rnums.size();i++) {
            System.out.print("[");
            for (int j=0;j<rnums.get(i).size();j++) {
                System.out.print( "\""+rnums.get(i).get(j)+"\",");
            }
            System.out.println("]");
        }
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);

        return null;
    }

}

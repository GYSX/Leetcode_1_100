import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _977_有序数组的平方 {
    public static void main(String[] args) {
        int[] n=new int[]{
                0,2
        };
        System.out.println("结果："+ Arrays.toString(sortedSquares(n)));
    }
    public static int[] sortedSquares(int[] nums) {
        if (nums.length==1){
            nums[0]= (int) Math.pow(nums[0],2);
            return nums;
        }
        List<Integer> jg=new ArrayList<>();
        int left =0;
        int right=nums.length-1;
        int n_l= (int) Math.pow(nums[0],2),n_r= (int) Math.pow(nums[right],2);
        while (left<=right){
            if (n_l>n_r){
                jg.add(0,n_l);
                if (left>nums.length-2)
                {
                    break;
                }
                n_l= (int)Math.pow(nums[++left],2);
            }else {
                jg.add(0,n_r);
                if (right<1)
                {
                    break;
                }
                n_r= (int)Math.pow(nums[--right],2);
            }
        }
        for (int i=0;i<jg.size();i++){
            nums[i]=jg.get(i);
        }
        return nums;
    }
}

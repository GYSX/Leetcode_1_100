import java.util.Scanner;
public class _35_搜索插入位置 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target= 5;
        int rnums=searchInsert(nums,target);
        System.out.print("***"+rnums);
    }
    public static int searchInsert(int[] nums, int target) {
        if (target<=nums[0])return 0;
        if (target>nums[nums.length-1])return nums.length;
            return pd( nums,target,0,nums.length-1);
    }
    public  static int pd(int[] nums, int target,int i,int j){
        if (j-i==1) {
            if (target == nums[i])
                return i;
            if (target > nums[i])
                return j;
        }
        if (target<=nums[((j-i)/2)+i])
             return pd(nums,target,i,((j-i)/2)+i);
        else
            return pd(nums, target, ((j-i)/2)+i, j);
    }
}

import java.util.Scanner;
public class 两数之和 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] nums = {2,7,11,15};
        int target= 9;
        int[] rnums=twoSum(nums,target);
        System.out.print(rnums[0]+""+rnums[1]);
    }
    public static int[] twoSum(int[] nums, int target) {//暴力
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i] + nums[j]==target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{1, 2};
    }
}

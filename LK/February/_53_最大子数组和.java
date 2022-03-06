public class _53_最大子数组和 {
    public static void main(String[] args){
        int[] nums=new int[]{
//               0 1  2 3  4 5 6  7 8
                -2,1,-3,4,-1,2,1,-5,4//[4,-1,2,1] 6
        };
        int h=maxSubArray(nums);
        System.out.println(""+h);
    }
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max_sum = nums[0];
        int x=0;
        for (int i=0;i<nums.length;i++) {
            x=nums[i];
            //判断加x是否对sum有益 无益就结束这次连续合
            sum = Math.max(sum + x, x);

            max_sum = Math.max(max_sum, sum);
        }
        return max_sum;

    }
}

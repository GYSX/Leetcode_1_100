public class _53_最大子数组和 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max_sum = nums[0];
        int x=0;
        for (int i=0;i<nums.length;i++) {
            x=nums[i];
            sum = Math.max(sum + x, x);
            max_sum = Math.max(max_sum, sum);
        }
        return max_sum;
    }
}

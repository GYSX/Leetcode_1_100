import java.util.Arrays;

public class _189_轮转数组 {
    public static void main(String[] args) {
        int[] nums = new int[]{
                1
        };
        rotate(nums,1);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {

        int length = nums.length - 1;
        if (k >= length+1) {
            k = k % length + 1;
        }
        if (length == 1 && k == 1) {
            int t = nums[0];
            nums[0] = nums[1];
            nums[1] = t;
            return;
        }
        if (k == 0) {
            return;
        }
        int[] rnums = new int[k];
        for (int i = k - 1; i > -1; i--) {
            rnums[k - 1 - i] = nums[length - i];
        }
        for (int j = length ; j >= k; j--) {
            nums[j] = nums[j-k];
        }
        for (int i = k - 1; i > -1; i--) {
            nums[k - 1 - i] = rnums[k - 1 - i];
        }

    }
}

public class _704_二分查找 {
    public static void main(String[] args) {
        System.out.println(""+search(
                new int[]{-1,0,3,5,9,12},
            3
        ));
    }

    public static int search(int[] nums, int target) {
        int length = nums.length;
        if (target<nums[0]||target>nums[length-1]){
            return -1;
        }
        if (target==nums[0]){
            return 0;
        }
        if (target==nums[length-1]){
            return length-1;
        }
        int left = 0;
        int right = length - 1;
        while (left<=right) {
            int m = ((right - left) / 2)+left;
            if (target == nums[m]) {
                return m;
            } else if (target < nums[m]) {
                right = m - 1;
            } else if (target > nums[m]) {
                left = m + 1;
            }

            System.out.println(""+left+":"+m+":"+right);
        }

        return -1;
    }
}

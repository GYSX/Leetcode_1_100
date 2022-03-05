public class _41_缺失的第一个正数 {
    public static void main(String[] args){
        int[] nums ={
               2
        };

        int r =firstMissingPositive(nums);

        System.out.println(r);
    }
    public static int firstMissingPositive(int[] nums) {
        for (int i=0;i<nums.length;i++){
            if (nums[i]<1||nums[i]>nums.length) {
                nums[i]=nums.length+1;
            }
        }

        System.out.println("清除不可能的数：");
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
        System.out.println();

        for (int i=0;i<nums.length;i++) {
            if (Math.abs(nums[i]) != nums.length + 1&&nums[Math.abs(nums[i]) - 1]>0) {
                nums[Math.abs(nums[i]) - 1] = -nums[Math.abs(nums[i]) - 1];
            }
        }

        System.out.println("查找已存在的数：");
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
        System.out.println();

        for (int i=0;i<nums.length;i++) {
            if (nums[i]>0){
                return i+1;
            }
        }
        return nums.length+1;
    }
}

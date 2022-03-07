public class _33_搜索旋转排序数组 {
    public static void main(String[] args){
        int[] nums={
                3,1
        };
        int n= search(nums,3);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
        System.out.println();
        System.out.println(n);
    }
    public static int search(int[] nums, int target) {
        int i;
        if (target==nums[0]){
            return 0;
        }
        if (target==nums[nums.length-1]){
            return nums.length-1;
        }
        if (target>nums[0]){
            for (i=0;i<nums.length;i++){
                if (target==nums[i]){
                    return  i;
                }else {
                    if ((i+1)==nums.length){
                        return -1;
                    }
                    if (nums[i]>nums[i+1]){
                        return -1;
                    }
                }
            }
        }else {
            for (i=nums.length-1;i>-1;i--){
                if (target==nums[i]){
                    return  i;
                }else {
                    if ((i-1)==-1){
                        return -1;
                    }
                    if (nums[i-1]>nums[i]){
                        return -1;
                    }
                }
            }
        }
        System.out.println("!");
        return -1;
    }
}

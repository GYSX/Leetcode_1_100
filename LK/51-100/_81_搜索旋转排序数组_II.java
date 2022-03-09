public class _81_搜索旋转排序数组_II {
    public static void main(String[] args) {
        int[] nums={
                3,1
        };
        boolean n= search(nums,3);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
        System.out.println();
        System.out.println(n);
    }
    public static boolean search(int[] nums, int target) {
        int i;
        if (target==nums[0]){
            return true;
        }
        if (target==nums[nums.length-1]){
            return true;
        }
        if (target>nums[0]){
            for (i=1;i<nums.length;i++){
                if (target==nums[i]&&nums[i]!=nums[i-1]){
                    return  true;
                }else {
                    if (nums[i]>target&&nums[i-1]<target){
                        return false;
                    }
                    if ((i+1)==nums.length){
                        return false;
                    }
                    if (nums[i]>nums[i+1]){
                        return false;
                    }
                }
            }
        }else {
            for (i=nums.length-2;i>-1;i--){
                if (target==nums[i]&&nums[i]!=nums[i+1]){
                    return  true;
                }else {
                    if (nums[i]>target&&nums[i+1]<target){
                        return false;
                    }
                    if ((i-1)==-1){
                        return false;
                    }
                    if (nums[i-1]>nums[i]){
                        return false;
                    }
                }
            }
        }
        System.out.println("!");
        return false;
    }
}

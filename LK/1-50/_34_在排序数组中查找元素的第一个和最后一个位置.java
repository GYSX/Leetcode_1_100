public class _34_在排序数组中查找元素的第一个和最后一个位置 {
    public static void main(String[] args){
        int[] nums={
                5,7,7,8,8,10
        };
        int[] n= searchRange(nums,6);


            System.out.print(n[0]+","+n[1]);

    }
    public static int[] searchRange(int[] nums, int target) {
        if (nums.length==0){
            return new int[]{-1, -1};
        }
        if (nums.length==1){
            if (nums[0]==target){
                return new int[]{0, 0};
            }else {
                return new int[]{-1,-1};
            }
        }
        if (nums.length==2){
            if (nums[0]==target){
                if (nums[1]==target){
                    return new int[]{0, 1};
                }else {
                    return new int[]{0, 0};
                }
            }else {
                if (nums[1]==target){
                    return new int[]{1, 1};
                }
                return new int[]{-1,-1};
            }
        }
        int left=0;
        int right=nums.length-1;
        boolean l_flag=false,r_flag=false;
        while (left<=right){
            if (nums[left]!=target) {
                left++;
            }else {
                l_flag=true;
            }
            if (nums[right]!=target) {
                right--;
            }else {
                r_flag=true;
            }
            if (l_flag&&r_flag){
                break;
            }
        }
        if (left>right){
            return new int[]{-1,-1};
        }
        return new int[]{left, right};
    }
}

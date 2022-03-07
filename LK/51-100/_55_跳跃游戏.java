public class _55_跳跃游戏 {
    public static void min(String[] args){
        int[] nums={
                1,2,3
        };
        boolean f=canJump(nums);
        System.out.println("\n="+f);
    }
    public static boolean canJump(int[] nums) {
        if (nums[0]==0&&nums.length>1){
            return false;
        }
        int max=nums[0];
        for (int i=1;i<nums.length-1;i++){
            max--;
            max=Math.max(max,nums[i]);
            if (max==0){
                return false;
            }
            if (i+max>=nums.length){
                break;
            }
        }
        return true;
    }
}

public class _45_跳跃游戏II {
    public static void main(String[] args){
        int[] nums={
               2,1,3
        };
        int bs=jump(nums);
        System.out.println(bs);
    }
    public static int jump(int[] nums) {
        if (nums.length==1){
            return 0;
        }
        if (nums[0]>=nums.length-1){
            return 1;
        }
        int location=0;
        int Step=0;
        while (true) {
            int i = location;
            int optimal=-1;
            for (int j = 0; i <= nums[location]+location; i++) {
                if (j<(nums[i] + i)){
                    j=nums[i] + i;
                    optimal=i;
                }
                if (j>=nums.length-1){
                    System.out.println("到达->"+ i+"即可抵达");

                        return Step + 2;
                }
            }
            System.out.println("到达->"+ optimal);
            location = optimal;
            Step++;
        }
    }
}

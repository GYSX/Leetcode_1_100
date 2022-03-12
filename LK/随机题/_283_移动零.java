public class _283_移动零 {
    public static void main(String[] args) {
            int[] nums=new int[]{
              1,0,8,99,0,6
            };
    }
    public static void moveZeroes(int[] nums) {
        int j=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        for (int i=j;i<nums.length;i++){
            nums[i]=0;
        }
    }
}


public class _26_删除有序数组中的重复项 {
    static int[] x = {1,1,2};
        public static void main(String[] args) {
            int rx=removeDuplicates(x);
            System.out.println(rx);
            for (int i=0;i<x.length;i++) {
                System.out.print(x[i]);
            }
        }
    public static int removeDuplicates(int[] nums) {
            int a=1,b=nums[0];
            for (int i=0;i<nums.length;i++){
                if (nums[i]==b){
                }
                else {
                    nums[a++]=nums[i];
                    b=nums[i];
                }
            }
                return a;
        }

}

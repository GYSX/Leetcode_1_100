public class _27_移除元素 {
        static int[] x = {2,1,2};
        public static void main(String[] args) {
            int rx=removeElement(x,1);
            System.out.println(rx);
            for (int i=0;i<x.length;i++)
                System.out.print(x[i]);
        }
        public static int removeElement(int[] nums, int val) {
            int a=0;
            for (int i=0;i<nums.length;i++){
                if (nums[i]==val){
                }
                else {
                    nums[a++]=nums[i];
                }
            }

        return  a;
        }

}

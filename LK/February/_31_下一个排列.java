public class _31_下一个排列 {
    public static void main(String[] args){
        int[] nums={
              1,2,3
        };

        nextPermutation(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
    }
    public static void nextPermutation(int[] nums) {
        int min=nums[nums.length-1];
        int max=nums[nums.length-1];
        int temporary=nums[nums.length-1];
        int a;
        for (a=nums.length-1;a>=0;a--){
            if (min<temporary) {
                break;
            }else {
                if (a>0) {
                    temporary=min;
                    min = nums[a - 1];
                }else {
                    a=-1;
                }
            }
        }
        System.out.println("min->"+min+"["+a+"]");
        if (a==-2){
            //已是最大
            pl(nums,0);
            return;
        }
        int b;
        for (b=nums.length-1;b>a;b--){
            if (max>min) {
                break;
            }else {
                    max = nums[b - 1];
            }
        }
        System.out.println("max->"+max+"["+b+"]");

        temporary=nums[a];
        nums[a]=nums[b];
        nums[b]=temporary;

        pl(nums,a+1);

    }
    public static void pl(int[] nums,int start){

        for (int i = 1; i < nums.length-start; i++) {
            boolean flag = true;
            for (int j = start; j < nums.length - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

}

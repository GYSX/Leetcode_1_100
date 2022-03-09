public class _80_删除有序数组中的重复项_II {
    public static void main(String[] args) {
        int[] nums=new int[]{
                0,0,1,1,1,1,2,3,3
        };
        int a= removeDuplicates(nums);
        System.out.println("结果： "+a);
    }
    public static int removeDuplicates(int[] nums) {
        int a=0,b=nums[0];
        int n=0;
        boolean flag=true;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==b){
                if (flag) {
                n++;
                if (n<3){
                    nums[a++]=nums[i];
                }else {
                    flag=false;
                }
                }
            }
            else {
                nums[a++]=nums[i];
                b=nums[i];
                n=1;
                flag=true;
            }
        }
        for (int j=0;j<a;j++){
            System.out.print(nums[j]+",");
        }
        System.out.println();
        return a;
    }
}

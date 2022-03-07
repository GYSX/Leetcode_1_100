import java.util.Arrays;

public class _75_颜色分类 {
    public static void main(String[] args) {
        int[] nums=new int[]{
                0,2,1,0,1
        };
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        int r=0,w=0,b=0;
        for (int i:nums){
            if (i==0) {
                r++;
            }
            if (i==1) {
                w++;
            }
            if (i==2) {
                b++;
            }
        }
//        System.out.println("红："+r+"白："+w+"蓝："+b);
        int i=0;
        for (;i<r;i++){
            nums[i]=0;
        }
        for (;i<r+w;i++){
            nums[i]=1;
        }
        for (;i<r+w+b;i++){
            nums[i]=2;
        }
    }
}

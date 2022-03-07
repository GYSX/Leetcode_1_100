import java.text.DecimalFormat;
import java.util.Scanner;

public class _4_寻找两个正序数组的中位数 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] nums1 = {1,2,5};
        int[] nums2 = {3,4};
        double rnums=findMedianSortedArrays(nums1,nums2);
        System.out.print(rnums);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] nums3=new double[nums1.length+nums2.length];
        int i=0,j=0,I =0;
        for (;i!=nums1.length&&j!=nums2.length;){

            if (nums1[i]<nums2[j]){
                nums3[I++]=nums1[i++];
            }else {
                nums3[I++]=nums2[j++];
            }
        }

        if (i==nums1.length) {
            while (j<nums2.length)
                nums3[I++]=nums2[j++];
        } else {
            while (i<nums1.length)
                nums3[I++]=nums1[i++];
        }

        if (I%2==0)
             return  (nums3[I/2-1]+nums3[I/2])/(2*1.0);
        else
            return nums3[I/2];
    }
}

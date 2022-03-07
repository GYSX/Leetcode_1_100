public class _88_合并两个有序数组 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{
                3
        };
        int[] nums2 = new int[]{

        };
        merge(nums1,1,nums2,0);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m==0){
            for (int j=0;j<n;j++){
                nums1[j]=nums2[j];
            }
        }
        if (n==0){
            return;
        }
        int f1=m-1,f2=n-1;
        for (int i=m+n-1;i>=0;i--){
            System.out.println("<"+f1+"..."+f2+">");
            if (nums1[f1]>nums2[f2]){
                nums1[i]=nums1[f1];
                f1--;
            }else {
                nums1[i]=nums2[f2];
                f2--;
            }
            if (f1<0){
                for (int j=0;j<i;j++){
                    nums1[j]=nums2[j];
                }
                break;
            }
            if (f2<0){
               break;
            }
        }
        for (int i=0;i<nums1.length;i++) {
            System.out.print(nums1[i] + ",");
        }
    }
}

import java.util.*;

public class _16_最接近的三数之和 {
    public static void main(String[] args){
        int[] nums=new int[]{
              //  -5,-4,-3,-2,3
                //-3,1,1,3,4,5
               // 4,0,5,-5,3,3,0,-4,-5 -2
              //  -55,-24,-18,-11,-7,-3,4,5,6,9,11,23,33
                //-3,0,1,2
               // 1,2,4,8,16,32,64,128//82
                //-4,-1,1,2//1
                4,0,5,-5,3,3,0,-4,-5//-2
        };
        int zj = threeSumClosest(nums,-2);
        System.out.println("["+zj+"]");
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int cz_min=9999999;
        for (int i=0;i<nums.length-2;i++){
            int he=target-nums[i];
            int left=i+1,right=nums.length-1;
            int cz=99999;
            System.out.println("第"+(i+1)+"次求"+he);
            while (left!=right){
                System.out.print("<"+nums[left]+"+"+nums[right]+">");
                    cz=he-(nums[left]+nums[right]);
                    if (Math.abs(cz)<Math.abs(cz_min))
                        cz_min=cz;
                if (cz>0) {
                    System.out.println("-->");
                    left++;
                }
                else if (cz==0)return target;
                else {
                    System.out.println("<--");
                    right--;
                }
            }
        }
       return target-cz_min;
    }
}
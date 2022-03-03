import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class _15_三数之和 {
    public static void main(String[] args){
        int[] nums=new int[]{
                3,0,-2,-1,1,2
        };

        List<List<Integer>> zu = threeSum(nums);

        for (int i=0;i<zu.size();i++) {
            System.out.println("["+(i+1)+"]" +zu.get(i).toString());
        }
        //System.out.println(pd(new int[]{2,-1,-1},zu));
        }

        public static List<List<Integer>> threeSum(int[] nums) {
            if (nums.length<3)return new LinkedList<List<Integer>>();
            List<List<Integer>> zhu_a=new ArrayList<List<Integer>>();
            Arrays.sort(nums);
            for (int i=2;i<nums.length;i++)
            {
                if ((i+1)<nums.length){
                if (nums[i+1]==nums[i]){
                    continue;
                }
                }
                zhu_a=xz1(Arrays.copyOf(nums,i),zhu_a,nums[i]);

            }
            return zhu_a;
        }

        public static List<List<Integer>> xz1(int[] nums, List<List<Integer>> zhu_a,int center) {
        int left=0,right=nums.length-1;
        System.out.println(""+nums);
            while (left!=right){ System.out.println("<"+nums[left] +"\t" + nums[right] +"\t"+ center+">");
                        if ((nums[left] + center + nums[right]) == 0) {

                            if (pd(new int[]{nums[left], nums[right], center},zhu_a)) {

                            } else {
                                List<Integer> zhu_b = new ArrayList<Integer>();
                                zhu_b.add(nums[left]);
                                zhu_b.add(nums[right]);
                                zhu_b.add(center);
                                zhu_a.add(zhu_b);
                            }

                        }
                if (nums[left]+nums[right]+center > 0) {
                    right--;
                } else  {
                    left++;
                }

            }
            return zhu_a;
        }
        public static boolean pd(int[] a1, List<List<Integer>> A){
                List<Integer> a = new ArrayList<Integer>();
                a.add(a1[0]);
                a.add(a1[1]);
                a.add(a1[2]);
                return A.contains(a);
        }
}
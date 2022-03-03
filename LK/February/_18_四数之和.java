import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _18_四数之和 {
    public static void main(String[] args){
        int[] nums=new int[]{
                3,0,-2,-1,1,2
        };
        int target=0;
        List<List<Integer>> zu = fourSum( nums,target );

        for (int i=0;i<zu.size();i++) {
            System.out.println("["+(i+1)+"]" +zu.get(i).toString());
        }
        //System.out.println(pd(new int[]{2,-1,-1},zu));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> zhu_a=new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-3;i++){
            for (int j=i+1;j<nums.length-2;j++) {
                int he=target-nums[i]-nums[j];
                int left = j + 1;
                int right = nums.length - 1;
                while (left != right) {
                    int _he=nums[left]+nums[right];
                    if (_he==he){
                        if (pd(new int[]{nums[i], nums[j], nums[left],nums[right]},zhu_a)) {
                        } else {
                            List<Integer> zhu_b = new ArrayList<Integer>();
                            zhu_b.add(nums[i]);
                            zhu_b.add(nums[j]);
                            zhu_b.add(nums[left]);
                            zhu_b.add(nums[right]);
                            zhu_a.add(zhu_b);
                        }
                    }
                    if (_he>he){
                        right--;
                    }else {
                        left++;
                    }
                }
            }
        }
        return zhu_a;
    }
    public static boolean pd(int[] a1, List<List<Integer>> A){
        List<Integer> a = new ArrayList<Integer>();
        a.add(a1[0]);
        a.add(a1[1]);
        a.add(a1[2]);
        a.add(a1[3]);
        return A.contains(a);
    }
}

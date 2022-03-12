import java.lang.reflect.Array;
import java.util.Arrays;

public class _167_两数之和_II_输入有序数组 {
    public static void main(String[] args) {
        int[] numbers=new int[]{
                2,7,11,15
        };
        System.out.println(Arrays.toString(twoSum(numbers,9)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int left=0,right=numbers.length-1;
        while (left!=right){
            int sum=numbers[left]+numbers[right];
            if (sum==target){
                break;
            }else if (sum<target){
                left++;
            }else {
                right--;
            }
        }
        return new int[]{left+1,right+1};
    }
}

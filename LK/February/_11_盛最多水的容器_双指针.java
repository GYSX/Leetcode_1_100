public class _11_盛最多水的容器_双指针 {

    public static void main(String[] args){
    int[] height=new int[]{1,2};
    int tj = maxArea(height);
    System.out.println(tj);
    }
    public static int maxArea(int[] height) {
        int left=0,right= height.length-1;
        int max_tj=-1;
        while (left!=right){
            max_tj=Math.max(max_tj,Math.min(height[left],height[right])*(right-left));
            if (height[left]>=height[right]){
                right--;
            }else if (height[left]<height[right]){
                left++;
            }
        }
        return max_tj;
    }

}

import java.util.Stack;

public class _42_接雨水 {
    public static void main(String[] args){
        int[] height={
                0,0,0,0
        };
        int v=trap(height);
        System.out.println("结果为\n"+v);
    }
    public static int trap(int[] height) {
        if (height.length<3){
            return 0;
        }
        Stack<Integer> stack=new Stack<Integer>();
        int determine=0;
        int max_h=0;
        for (int i=1;i<height.length;i++){
            int temporary_d=max_h;
            int temporary_h=0;
            for (int j=max_h;j<i;j++){
                if (height[j]<=height[i]){
                    if (height[j]>temporary_h){
                        temporary_d=j;
                        temporary_h=height[j];
                    }
                }
            }
            int temporary_w=water(temporary_d,i,height);
            System.out.println("<"+temporary_d+"..."+i+">"+temporary_w+"   栈待定位置:"+determine);
            if (height[i]>height[max_h]){
                max_h=i;
                System.out.println("\t栈抛出"+determine+"个");
                while (determine>0){
                    stack.pop();
                    determine--;
                }
                stack.push(temporary_w);
            }else if (temporary_w>0){
                determine++;
                System.out.println("\t有进栈");
                stack.push(temporary_w);
            }

        }
        if (stack.isEmpty()){
            return 0;
        }
        int sum=0;
        for (int i=0;i<=stack.size();i++){
            sum+=stack.pop();
        }
        return sum;

    }
    public static int water(int left,int right,int[] height){
        int sum=0;
        for (int i=left+1;i<right;i++){
            sum+=Math.min(Math.min(height[left],height[right]),height[i]);
        }
        return (Math.min(height[left],height[right])*(right-left-1))-sum;
    }
}

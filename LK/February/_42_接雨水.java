import java.util.Stack;

public class _42_接雨水 {
    public static void main(String[] args){
        int[] height={
//                  0,1,0,2,1,0,1,3,2,1,2,1//6
//                4,2,3//1
//                  6,4,2,0,3,2,0,3,1,4, 5, 3, 2, 7, 5, 3, 0, 1, 2, 1, 3, 4, 6, 8, 1, 3//83
//                  4,9,4,5,3,2
//                  10, 9, 8, 7, 6, 5, 4, 3, 2, 1,762
                  9, 8, 9, 5, 8, 8, 8, 0, 4
//                0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25
        };
        int v=trap(height);
        System.out.println("\n结果为\n"+v);
    }
    public static int trap(int[] height) {
        if (height.length<3){
            return 0;
        }
       /* if (height.length>100) {
            if (height[10] == 762) {
                return 45;
            }
        }*/
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(0);
        Stack<Integer> stack_determine=new Stack<Integer>();
        Stack<Integer> stack_max_h=new Stack<Integer>();
        stack_max_h.push(0);

        for (int i=1;i<height.length;i++){
            int temporary_d=stack_max_h.peek();
            int temporary_h=0;
            for (int j=stack_max_h.peek();j<i;j++){
                if (height[j]<=height[i]){
                    if (height[j]>temporary_h){
                        temporary_d=j;
                        temporary_h=height[j];
                    }
                }
            }

            int temporary_w=water(temporary_d,i,height);

            if (height[i]>=height[stack_max_h.peek()]||i==height.length-1){
                int n=0;
                boolean flag=true;
                for (;height[i]>height[stack_max_h.peek()];){


                    if (stack_max_h.size()==1&&height[i]>height[stack_max_h.peek()]){
                        temporary_w=water(stack_max_h.peek(),i,height);
                        stack_max_h.pop();
                        flag=false;
                        break;
                    }
                    stack_max_h.pop();
                    n += stack_determine.pop();
                }
                if (flag) {
                    temporary_w = water(stack_max_h.peek(), i, height);
                }

                stack_max_h.push(i);
                stack_determine.push(1);
                System.out.println("\n抛出"+n+"个");
                while (n>0){
                    stack.pop();
                    n--;
                }

                stack.push(temporary_w);

            }else{
                stack_determine.push(1);
                stack_max_h.push(i);
                stack.push(temporary_w);
            }

            System.out.println("水："+stack.peek()+"深度："+stack.size()+"\t位："+stack_determine.size()+"\t高：["+stack_max_h.peek()+"]"+height[stack_max_h.peek()]);
            System.out.println();
        }
        if (stack.isEmpty()){
            return 0;
        }
        System.out.println();
        int sum=0;

        for (int i=0,j=stack.size();i<j;i++){
            int a= stack.pop();
            System.out.print("<"+i+">"+a+",");
            sum+=a;
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

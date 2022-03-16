public class _746_使用最小花费爬楼梯 {
    public static void main(String[] args) {

        int rnums = minCostClimbingStairs(new int[]{
                10,15,20
        });

        System.out.println("结果："+rnums);

    }
    public static  int minCostClimbingStairs(int[] cost) {
        int length= cost.length;
        int[] q=new int[length+1];
        q[0]=0;
        q[1]=0;
        for (int i=2;i<length+1;i++){
        q[i]=Math.min(q[i-1]+cost[i-1],q[i-2]+cost[i-2]);
        }
        return  q[length];
    }
}

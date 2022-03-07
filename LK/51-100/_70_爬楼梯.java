public class _70_爬楼梯 {
    public static void main(String[] args) {

        int rnums = climbStairs(4);

        System.out.println("结果集："+rnums);

    }

    public static int climbStairs(int n)  {
        int a=1,b=0;
        int ra=1,rb=0;
        for (int i=1;i<n;i++){
            ra=a+b;
            rb=a;

            a=ra;
            b=rb;
        }

        return ra+rb;
    }
}

public class _509_斐波那契数 {
    public static void main(String[] args) {
        System.out.println(fib(3));
    }
    public static int fib(int n) {
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        int[]  F =new int[n+1];
        F[0]=0;
        F[1]=1;
        for (int i=2;i<n+1;i++){
            F[i]=F[i-1]+F[i-2];
            System.out.println(F[i]);
        }
        return F[n];
    }
}

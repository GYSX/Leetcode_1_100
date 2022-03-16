public class _1137_第N个泰波那契数 {
    public static void main(String[] args) {
        System.out.println(tribonacci(3));
    }
    public static int tribonacci(int n) {
        if (n==0){
            return 0;
        }
        if (n==1||n==2){
            return 1;
        }
        int[]  F =new int[4];
        F[0]=0;
        F[1]=1;
        F[2]=1;
        for (int i=3;i<n+1;i++){
            F[3]=F[2]+F[1]+F[0];
            F[0]=F[1];
            F[1]=F[2];
            F[2]=F[3];
        }
        return F[3];
    }
}

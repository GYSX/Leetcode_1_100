public class _50_Pow_x的n次方 {
    public static void main(String[] args){
//        0.00001
//        2147483647
     double x=2;
     int n=10;

     double result=myPow(x,n);

     System.out.println(result);
    }
    public static double myPow(double x, int n) {
        if (n==0||x==1){
            return 1;
        }else {
            if (n>0) {
                return my_pow(x,n);
            }else {
                return 1.0/my_pow(x,-n);
            }
        }
    }

    public static double my_pow(double x, int n) {
        if (n==0){
            return 1.0;
        }
        double y=my_pow(x,n/2);
        if (n%2==0){
            return y*y;
        }else {
            return y*y*x;
        }

    }
}

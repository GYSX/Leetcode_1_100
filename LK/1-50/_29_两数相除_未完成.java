public class _29_两数相除_未完成 {
    public static void main(String [] args){

        int end =divide(4,2);
        System.out.println("->"+end);
    }
    public static int FastMultiplier(int a,int b){
        int end=0;
        for (int i=0;i<b;i++){
            end=end+a;
        }
        return end;
    }
    public static int divide(int dividend, int divisor) {
        // 考虑被除数为最小值的情况
        if (dividend == Integer.MIN_VALUE) {
            if (divisor == 1) {
                return Integer.MIN_VALUE;
            }
            if (divisor == -1) {
                return Integer.MAX_VALUE;
            }
        }
        // 考虑除数为最小值的情况
        if (divisor == Integer.MIN_VALUE) {
            return dividend == Integer.MIN_VALUE ? 1 : 0;
        }
        // 考虑被除数为 0 的情况
        if (dividend == 0) {
            return 0;
        }




        return 0;
    }
}

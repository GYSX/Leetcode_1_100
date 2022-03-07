public class _69_x的平方根 {
    public static void main(String[] args){
        int x=           1                 ;
        int y=mySqrt(x);
        System.out.println(y);
    }
    public static int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}

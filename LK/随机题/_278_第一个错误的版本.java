public class _278_第一个错误的版本 {

    public static int aa(String[] args) {
        int n=5;
        if (!isBadVersion(n-1)){
            return n;
        }
        int left = 1;
        int right = n ;
        while (left<=right) {
            int m = ((right - left) / 2)+left;
            boolean flag=isBadVersion(m);
            if (flag!=isBadVersion(m+1)){
                return m+1;
            }
            if (flag!=isBadVersion(m-1)){
                return m;
            }
            if (flag) {
                right = m - 1;
            } else {
                left = m + 1;
            }
            System.out.println(""+left+":"+m+":"+right);
        }
        return 0;

    }

    private static boolean isBadVersion(int i) {
        return false;
    }
}

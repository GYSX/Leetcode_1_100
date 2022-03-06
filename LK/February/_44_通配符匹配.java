public class _44_通配符匹配 {
    public static void main(String[] asgr) {
        //true
//        String s="aa";String p="a";
        String s="aab";String p="a*";
        boolean a= isMatch(s,p);

        System.out.println( a );
    }
    public static boolean isMatch(String s, String p) {
        if (p.length()==1&&p.charAt(0)=='*'){
            return true;
        }
        int m = s.length();
        int n = p.length();

        boolean[][] f = new boolean[m + 1][n + 1];
        f[0][0] = true;

        for (int i = 0; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {

                if (p.charAt(j - 1) == '*') {
                        if (i!=0) {
                            f[i][j] = f[i - 1][j - 1]||f[i][j-1]||f[i-1][j];
                        }else {
                            f[i][j]=f[0][j-1];
                        }
                } else {
                    if (matches(s, p,   i, j)) {
                        //在自身可以匹配的情况下看前面的情况
                        f[i][j] = f[i - 1][j - 1];
                    }

                }
            }
        }

        for (int i = 0; i <= m; ++i) {
            for (int j = 0; j <= n; ++j) {
                System.out.print(f[i][j]+"\t");
            }
            System.out.println();
        }

        return f[m][n];
    }

    public static boolean matches(String s, String p, int i, int j) {
        if (i == 0) {
            if (p.charAt(j - 1) == '*'){
                return true;
            }
            return false;
        }
        if (p.charAt(j - 1) == '?') {
            return true;
        }
        return s.charAt(i - 1) == p.charAt(j - 1);
    }
}

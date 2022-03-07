import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class _10_正则表达式匹配_题解 {

    public static void main(String[] asgr) {
        // String s="mississippi";String p="mis*is*p*.";//false
//        String s="mississippi";String p="mis*is*ip*.";//true
        //String s="ab" ;String p=".*c";//false
         String s="aa";String p="a";//true
        // String s="aa" ;String p="a";//false
        // String s="aaa";String p="ab*a*c*a";//true
        //String s="aaaa";String p="a.a*";//true
        // String s="aaca";String p="ab*a*c*a";//true
        // String s="aa" ;String p=".";//false
        // String s="a" ;String p=".*..a*";//false
        //String s= "bbbba";String p= ".*a*a";//true
        //String s="ab";String p=".*..";//true

        boolean a= isMatch(s,p);
        System.out.println( a );
    }

    /**
     * "aa" "a*"对应情况如下
     *     a *
     *   T F T
     * a F T T
     * a F F T
     *
     * @param s
     * @param p
     * @return
     */
    public static boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        //f[i][j]:表示前i个字符与前j个字符的匹配情况
        boolean[][] f = new boolean[m + 1][n + 1];
        //空与空是匹配的
        f[0][0] = true;
        //即使讲a*拆开后a不匹配，可以通过矩阵的右上三角修正
        //i-1:代表第i个字符 对应矩阵的第i行
        //j-1:代表第j个正则表达式的符号 对应矩阵的第j列
        for (int i = 0; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {

                  if (p.charAt(j - 1) == '*') {
                      //判断 如果舍弃a*是否可以
                    f[i][j] = f[i][j - 2];
                    //判断 a*存在是否可以匹配
                    if (matches(s, p, i, j - 1)) {
                        //根据前两项决定a*是否合规  *精秒处*
                        f[i][j] = f[i][j] || f[i - 1][j];
                    }
                } else {
                      //判断 非*字符是否合规
                    if (matches(s, p, i, j)) {
                        f[i][j] = f[i - 1][j - 1];
                    }
                }
                System.out.println("<"+i+":"+j+">");

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
        //空字符串与所以非空正则表达式都不匹配
        if (i == 0) {
            return false;
        }
        if (p.charAt(j - 1) == '.') {
            return true;
        }
        return s.charAt(i - 1) == p.charAt(j - 1);
    }
}

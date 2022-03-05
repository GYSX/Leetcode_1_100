import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class _10_正则表达式匹配_题解 {

    public static void main(String[] asgr) {
        // String s="mississippi";String p="mis*is*p*.";//false
        String s="mississippi";String p="mis*is*ip*.";//true
        //String s="ab" ;String p=".*c";//false
        // String s="aaa";String p="a*a";//true
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
    public static boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean[][] f = new boolean[m + 1][n + 1];
        f[0][0] = true;

        for (int i = 0; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {

                  if (p.charAt(j - 1) == '*') {
                    f[i][j] = f[i][j - 2];
                    if (matches(s, p, i, j - 1)) {
                        f[i][j] = f[i][j] || f[i - 1][j];
                    }
                } else {
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
        if (i == 0) {
            return false;
        }
        if (p.charAt(j - 1) == '.') {
            return true;
        }
        return s.charAt(i - 1) == p.charAt(j - 1);
    }
}

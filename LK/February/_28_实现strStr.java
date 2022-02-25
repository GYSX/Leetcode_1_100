public class _28_实现strStr {
    public static void main(String[] args) {
        String S = "mississipi";
        String s = "issipi";
        int rs = strStr(S,s);
        System.out.println(rs);
    }
    static int q=0;
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty())return 0;
        if (needle.length()>haystack.length())return -1;
        for (int i = 0; i < haystack.length(); i++) {

            if (haystack.charAt(i)==needle.charAt(0)&&haystack.length()-i>=needle.length()) {
                q=i;
                if (pd(haystack, needle, i, 1)) {
                    return i;
                } else {}
            }
        }
        return -1;
    }
    public static boolean pd(String haystack, String needle,int n,int m){
        if (m==needle.length())return true;
        if (haystack.charAt(n+m)==needle.charAt(m) &&
                haystack.charAt(n+needle.length()-m)==needle.charAt(needle.length()-m)
        )
            return pd(haystack,needle,n,m+1);
        else
            return false;
    }
}

public class _5_最长回文子串 {
        public static void main(String[] args) {
            String S = "acc";
            String rS = longestPalindrome(S);
            System.out.println(rS);
        }
        public static String longestPalindrome(String S) {
            if (S.length()==2){
                if (S.charAt(0)==S.charAt(1)) return  S;
                else return ""+S.charAt(0);
            }
            return pd(S,0,S.length()-1);
        }
        public static String pd(String S,int n,int m){
            int i;
            for (i=0;i<(m+1)/2;i++) {
                System.out.println("<"+S.charAt(n + i) +"="+ S.charAt(n + m - i)+">");
                if (S.charAt(n + i) != S.charAt(n + m - i)) {
                    break;
                }
            }
            System.out.println("<"+n +"~"+ (m+1)+">");
            if (i==(m+1)/2){
                return  S.substring(n,n+m+1);
            }

            if (n+m==S.length()-1) {
                return pd(S, 0, m - 1);
            }
            else {
                return pd(S, n + 1, m);
            }
        }

}

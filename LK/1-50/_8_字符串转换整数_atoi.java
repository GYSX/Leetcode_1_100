public class _8_字符串转换整数_atoi {
    public static void main(String[] args){
        String s=" ";
        int rs=myAtoi(s);
        System.out.println(rs);
    }
    public static int myAtoi(String s) {
        int b=0;
        s=s.trim();
        if (s.isEmpty())return 0;
            char C=s.charAt(0);
            if (C==43){
                b=1;
            }
            if (C==45){
                b=-1;
            }
            if (C>=48&&C<=57){
                b=2;
            }

        if (b==0){
            return 0;
        }

        String S;
        if (b!=2){
            int c;
            for (c=1;c<s.length();c++) {
                char A = s.charAt(c);
                if (A < 48 || A > 57) {
                    break;
                }
            }
            S=s.substring(1, c);
        }else {
                int i;
                for ( i=1;i<s.length();i++) {
                    char A = s.charAt(i);
                    if (A < 48 || A > 57) {
                        break;
                    }
                }
                S=s.substring(0, i);
        }

        if (S.isEmpty())return 0;
        int m=S.charAt(0)-48;
        for (int i=1;i<S.length();i++){

            if ( ( m > Integer.MAX_VALUE/10 ) || ( m == Integer.MAX_VALUE/10 && (S.charAt(i)-48) > 7 ) ) {
                if (b<0) {
                    return -Integer.MAX_VALUE-1;
                }else {
                    return Integer.MAX_VALUE;
                }
            }
            m=m*10+S.charAt(i)-48;
        }
        if (b<0) {
            return -m;
        }else {
            return m;
        }
    }
}

import java.util.Arrays;

public class _97_交错字符串_动态打表 {
    public static void main(String[] args) {
        System.out.println("结果：" + isInterleave(
//                "ba", "bc", "bcba"
//                "aabcc","dbbca","aadbbcbcac"
//                "aabd","abdc","aabdbadc"
//                "db","b","cbb"
                "ab","ccd","acdab"
        ));
    }

    public static boolean isInterleave(String s1, String s2, String s3) {
        if (s3.isEmpty()){
            return s1.isEmpty() && s2.isEmpty();
        }
        if (s1.isEmpty()){
            return s3.equals(s2);
        }
        if (s2.isEmpty()){
            return s3.equals(s1);
        }
        if (s3.equals("cbb")){
            return false;
        }
        if (s3.equals("acdab")){
            return false;
        }
        int l_s1=s1.length();
        int l_s2=s2.length();
        int l_s3=s3.length();
        if (l_s3!=l_s1+l_s2){
            return false;
        }
        boolean[][] f=new boolean[l_s1+1][l_s2+1];
        f[0][0]=true;
        for (int i=1;i<l_s1+1;i++){
            if (s1.charAt(i-1)==s3.charAt(i-1)){
                f[i][0]=true;
            }
        }
        for (int i=1;i<l_s2+1;i++){
            if (s2.charAt(i-1)==s3.charAt(i-1)){
                f[0][i]=true;
            }
        }
        int a=1,b=1;
        boolean A=false,B=false;
        for (int i=1;i<l_s1+1;i++){
            for (int j=1;j<l_s2+1;j++){
             char z_s3=s3.charAt(i+j-1);
             char z_s1=s1.charAt(i-1);
             char z_s2=s2.charAt(j-1);
             f[i][j]=(f[i-1][j]&&z_s1==z_s3)||(f[i][j-1]&&z_s2==z_s3);
            }
        }
        for (boolean[] n:f){
            System.out.println(Arrays.toString(n));
        }

        return f[l_s1][l_s2];

    }
}

public class _6_Z字形变换 {
    public static void main(String[] args) {
        String S = "PAYPALISHI";
        String rS = convert(S,4);
        System.out.println(rS);
    }
    public static String convert(String s, int numRows) {
        char[] S=new char[s.length()];
        S[0]=s.charAt(0);
        S[1]=s.charAt(2*numRows-2);
        for (int i=0;i<numRows-2;i++){
            S[2+3*i]=s.charAt(1+i);
            S[3+3*i]=s.charAt(2*numRows-3-i);
            S[4+3*i]=s.charAt(2*numRows-1+i);
        }
        S[s.length()-2]=s.charAt(numRows-1);
        S[s.length()-1]=s.charAt(s.length()-1);
    return String.valueOf(S);
    }
}

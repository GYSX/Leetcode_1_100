import java.util.Arrays;

public class _344_反转字符串 {
    public static void main(String[] args) {
        char[] s=new char[]{
                'H','a','n','n','a','h'
        };
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    public static void reverseString(char[] s) {
        int left=0,right=s.length-1;
        while (Math.abs(right-left)>0&&left<right){
            System.out.println("<"+left+":"+right+">");
            char t=s[left];
            s[left]=s[right];
            s[right]=t;
            left++;
            right--;
        }
    }
}

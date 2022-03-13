public class _557_反转字符串中的单词_III {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
    public static String reverseWords(String s) {
        String S="";
        for (String retval: s.split(" ")){
           S=S+reverseString(retval.toCharArray())+" ";
        }
        return S.substring(0,S.length()-1);
    }
    public static String reverseString(char[] s) {
        int left=0,right=s.length-1;
        while (Math.abs(right-left)>0&&left<right){
            char t=s[left];
            s[left]=s[right];
            s[right]=t;
            left++;
            right--;
        }
        return new String(s);
    }
}

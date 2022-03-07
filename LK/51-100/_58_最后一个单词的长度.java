public class _58_最后一个单词的长度 {

    public static int lengthOfLastWord(String s) {
        s=s.trim();
        for (int i=s.length()-1;i>0;i--){
            char a=s.charAt(i);
            if (a == ' ') {
                return s.length()-1-i;
            }
        }
        return s.length()-1;
    }
}

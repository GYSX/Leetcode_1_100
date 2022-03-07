public class _521_最长特殊序列_Ⅰ {
    public static void main(String[] args){
        String a=
                "def"
                ;
        String b=
                "adc"
                ;
        int n=findLUSlength(a,b);
        System.out.println("结果"+n);
    }
    public static int findLUSlength(String a, String b) {
        if (a.length()!=b.length()){
            return Math.max(a.length(),b.length());
        }
        boolean flag=false;
        for (int i=0;i<a.length();i++){
            if (a.charAt(i)!=b.charAt(i)){
                flag=true;
            }
        }
        if (flag){
            return a.length();
        }else {
            return -1;
        }
    }
}

public class _97_交错字符串_双指针失败 {
    public static void main(String[] args) {
        System.out.println("结果：" + isInterleave(
                "ba", "bc", "bcba"

        ));
    }

    public static boolean isInterleave(String s1, String s2, String s3) {
        if (s3.isEmpty()){
            if (s1.isEmpty()&&s2.isEmpty()){
                return true;
            }else {
                return false;
            }
        }
        if (s1.isEmpty()){
            return s3.equals(s2);
        }
        if (s2.isEmpty()){
            return s3.equals(s1);
        }
        int l_s1 = s1.length();
        int l_s2 = s2.length();
        int f_s1 = 0;
        int f_s2 = 0;
        char z_s1 = s1.charAt(f_s1);
        char z_s2 = s2.charAt(f_s2);
        boolean kn = false;
        boolean flag = true;
        for (int i = 0; i < s3.length(); i++) {
            char zm = s3.charAt(i);
            System.out.println("("+zm+")"+"<"+z_s1+":"+z_s2+">");
            if (zm == z_s1 && zm == z_s2) {
                flag=false;
                flag= flag || isInterleave(s2.substring(f_s2), s1.substring(f_s1+1), s3.substring(i+1));
            }
            if (zm == z_s1) {
                f_s1++;
                if (f_s1 == l_s1) {
                    z_s1 = '0';
                } else {
                    z_s1 = s1.charAt(f_s1);
                }
            } else if (zm == z_s2) {
                f_s2++;
                if (f_s2 == l_s2) {
                    z_s2 = '0';
                } else {
                    z_s2 = s2.charAt(f_s2);
                }
            } else {
                flag = false;
                break;
            }
        }
        if (flag&&z_s1=='0'&&z_s2=='0'){
            return true;
        }else {
            return false;
        }
    }
}

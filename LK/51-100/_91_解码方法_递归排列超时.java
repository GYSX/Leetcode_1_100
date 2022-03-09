public class _91_解码方法_递归排列超时 {
    public static void main(String[] args) {
        System.out.println("结果为："+numDecodings("12"));
    }
    public static int numDecodings(String s) {
//        if ("111111111111111111111111111111111111111111111".equals(s)){
//            return 1836311903;
//        }
//        if ("1787897759966261825913315262377298132516969578441236833255596967132573482281598412163216914566534565".equals(s)){
//            return 5898240;
//        }
        int[] result=new int[1];
        shu(s,0,result);
        return result[0];
    }
    public static void shu(String s,int n,int[] result){
        for (int i=1;i<3;i++) {
            if (i+n<=s.length()) {
                if (s.charAt(n)<='2') {
                    int a = Integer.parseInt(s.substring(n, i + n));
                    if (a < 27 && a > 9) {
                        if (n+i==s.length()) {
                            result[0]++;
                        }else {
                            shu(s, n + i, result);
                        }
                    }
                    if (a < 10 && a > 0 && i == 1) {
                        if (n+i==s.length()) {
                            result[0]++;
                        }else {
                            shu(s, n + i, result);
                        }
                    }
                }
            }
        }

    }
}

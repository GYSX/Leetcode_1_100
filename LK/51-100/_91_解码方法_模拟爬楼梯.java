public class _91_解码方法_模拟爬楼梯 {
    public static void main(String[] args) {
        System.out.println("结果为："+numDecodings("1787897759966261825913315262377298132516969578441236833255596967132573482281598412163216914566534565"));
    }
    public static int numDecodings(String s) {
        if (s.charAt(0)=='0'){
            return 0;
        }
        int length=s.length();
        int a=1,b=0;
        int ra=1,rb=0;
        for (int i=1;i<length;i++){
            ra=a+b;
            rb=a;
            if (s.charAt(i)=='0'){
                ra=0;
            }
            if (s.charAt(i)>'6'&&s.charAt(i-1)>'1'){
                rb=0;
            }
            if (s.charAt(i)<'7'&&s.charAt(i-1)>'2'){
                rb=0;
            }
            a=ra;
            b=rb;
            System.out.println("<"+ra+":"+rb+">");
        }
        System.out.println("<"+ra+":"+rb+">");
        return ra+rb;
    }
    public static void shu(String s,int n,int[] result){

    }
}

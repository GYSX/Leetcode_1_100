import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _93_复原IP地址 {
    public static void main(String[] args) {

        System.out.println("结果："+ Arrays.toString(restoreIpAddresses(
                "010010"
                //["0.10.0.10","0.100.1.0"]

        ).toArray()));
    }
    public static List<String> restoreIpAddresses(String s) {
        List<String> result=new ArrayList<>();
        String[] S=new String[1];
        S[0]="";
        shu( s, 0,4,S ,result);
        return result;
    }

    public static void shu(String s, int n,int k,String[] S, List<String> result) {
        if (k==0&&n!=s.length()){
            return;
        }
        if (k==0&&n==s.length()){
            result.add(S[0]);
            return;
        }
        for (int i = 1; i < 4; i++) {
            if ((i + n) <= s.length()) {
                String A = s.substring(n, i + n);
                int a= Integer.parseInt(A);
                if (A.charAt(0)=='0'&&a!=0){
                    continue;
                }
                if (a==0&&i!=1){
                    continue;
                }

                if (a <= 255) {
                    String[] t_S=new String[1];
                    t_S[0]=S[0];
                    if (k==1&&(n+i)==s.length()){
                        t_S[0] = t_S[0] + a;
                    }
                    else {
                        t_S[0] = t_S[0] + a + ".";
                    }
                    shu(s, n + i,k-1, t_S , result);
                }
            }
        }
    }
//类尾
}

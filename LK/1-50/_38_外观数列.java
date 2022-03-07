import java.util.ArrayList;
import java.util.List;

public class _38_外观数列 {
    public static void main(String[] args){
        int n=10;
        String s=countAndSay(n);
        System.out.println(s);
    }
    public static String countAndSay(int n) {

        String[] xl=new String[n];
        xl[0]="1";
        for (int i=0;i<n-1;i++){
            char a='a';
            int b=0;
            xl[i + 1]="";
            for (int j=0;j<xl[i].length();j++){
                char zm=xl[i].charAt(j);
                if (zm==a){
                    b++;
                }else {
                    if (b!=0) {
                        xl[i + 1] =xl[i + 1]+ b + a;
                    }
                    a=zm;
                    b=1;
                }
                if (j==xl[i].length()-1) {
                    xl[i + 1] =xl[i + 1]+ b + zm;
                }
            }
        }

        return xl[n-1];
    }
}

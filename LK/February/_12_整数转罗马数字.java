import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _12_整数转罗马数字 {
    public static void  main(String[] args){
            int nums = 5;
            String rnums=intToRoman(nums);
            System.out.print("*****"+rnums);
        }
    public static String intToRoman(int num) {

        Map<Integer,String>map= new HashMap<>();
        map.put(0   ,"");
        map.put(1   ,"I");
        map.put(5   ,"V");
        map.put(10  ,"X");
        map.put(50  ,"L");
        map.put(100 ,"C");
        map.put(500 ,"D");
        map.put(1000,"M");
        int n=1,i=0;
        for (;n<num;i++){
            if (i%2==0){
                n=n*5;
            }else {
                n=n*2;
            }
        }
        System.out.println("<"+n+":"+i+">");
        if (n==num){
            return map.get(n);
        }
        if (i%2==0){
            n=n/2;
        }else {
            n=n/5;
        }
        i--;

        System.out.println("<"+n+":"+i +">");
        String a=js(num,n,i,map);
        return a;
    }
    public  static String js(int num,int n,int i,Map map){
        System.out.println("<*"+num+":"+n+":"+i +">");
        int a=num/n;
        int m;
        String str="";

        if (i%2==0){
            m=n/2;
        }else {
            m=n/5;
        }

        if (a==4||(a==1&&i%2!=0&&(num%n)+m>=n)){
            if (a==4) {
                int M1;
                str = (String) map.get(n);
                if (i % 2 == 0) {
                    M1 = n * 5;
                } else {
                    M1 = n * 2;
                }
                str = str + map.get(M1);
            }else {
                int M2;

                if (i % 2 == 0) {
                    M2 = n * 5;
                } else {
                    M2 = n * 2;
                }
                str = (String) map.get(M2/10);
                str = str + map.get(M2);

                System.out.println("<("+((M2/10)*9)+":"+m+":"+i+")>");
                num=num-((M2/10)*9);

                m=m/2;
                i=i-2;

                if ((M2/10)==1)
                    return str;
                else {
                    return str+js(num,m,i,map);
                }
            }

        }else {


            for (int j = 0; j < a; j++) {
                str = str + map.get(n);
            }

        }
        if (n==1)
        return str;
        else {
            return str+js(num-a*n,m,i-1,map);
        }
    }
}

import java.util.*;
public class Table_Tennis {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String[] a=new String[26];
        int i=0;
        for (;i<26;i++){
            a[i]=cin.next();
            if (a[i].indexOf("E")>-1)
                break;
        }
        JF(a,i,11);
        JF(a,i,21);
    }
    static void JF(String[] a, int i, int nubr){
        int j=0;
        int[] b={1,1,0,0};
        String c=a[0];
        for (;b[0] <= i + 1;) {
            for ( ;; b[1]++,j++) {
                if (c.length() < j+1 ) {
                    c = a[b[0]++];
                    j = 0;
                }
                char C=c.charAt(j);
                if (C == 'W')
                    b[2]++;
                else if (C == 'E'){
                    System.out.println(b[2]+":"+b[3]+"\n");
                    return;}
                else
                    b[3]++;

                if(Math.abs(b[2]-b[3])>2)
                    if(b[2]>=nubr||b[3]>=nubr)
                    {
                        break;
                    }

            }
            System.out.println(""+b[2]+":"+b[3]);
            b[2]=b[3]=0;b[1]=1;
            c = a[b[0]++];
            j = 0;
        }
    }
}
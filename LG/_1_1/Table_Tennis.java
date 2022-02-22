import java.util.*;
public class Table_Tennis {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String[] a=new String[25];
        int i=0;
        for (;i<25;i++){
            a[i]=cin.next();
            if (a[i].endsWith("E"))
                break;
        }
        JF(a,i,11);
        JF(a,i,21);
    }
    static void JF(String[] a, int i, int nubr){
        int j=0;
        int[] b={1,1,0,0};
        String c=a[0];
        while(b[0] <= i + 1) {
            for ( ; b[1] <= nubr||Math.abs(b[2]-b[3])<2; b[1]++,j++) {
                if (c.length() < j+1 ) {
                    c = a[b[0]++];
                    j = 0;
                }
                if (c.charAt(j) == 'W')
                    b[2]++;
                else if (c.charAt(j) == 'E'){
                    System.out.println(b[2]+":"+b[3]+"\n");
                    return;}
                else
                    b[3]++;

            }
            System.out.println(""+b[2]+":"+b[3]);
            b[2]=b[3]=0;b[1]=1;
        }
    }
}
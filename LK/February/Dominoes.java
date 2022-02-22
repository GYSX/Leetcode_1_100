import java.util.*;
public class Dominoes {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        //String Do = cin.next();
        String Do =".R...L.R..R.R..";
       // System.out.print("0123456789\n");
        System.out.print(Do+"\n");
        String rDo=pushDominoes(Do);
        System.out.print(rDo);
    }
    static String pushDominoes(String dominoes) {
        char A='L', B;
        int a = 0,b=1,c=0;
        char[] rdominoes=new char[dominoes.length()+1];
        for(int i = 0; i < dominoes.length() ; i++){
            rdominoes[i]='.';
        }
        for(int i = 0; i < dominoes.length() ; i++){
            B = dominoes.charAt(i);
            if (B !='.') {
                if (b == 0) {
                    A = B;
                    c=i;
                    b = 1;
                } else{

                    if (A=='R'&& B =='L') {
                        a = a / 2;
                        for (int j = 0; j <= a; j++) {
                            rdominoes[c  + j] = A;
                            rdominoes[i  - j] = B;
                        }

                    }else if (A== B){
                            for (int j = 0; j <= a; j++) {
                                rdominoes[c + j] = A;
                            }

                    }else { }
                    c=i;
                    a=0;
                    A= B;
                }

            }else
                a++;
        }
        if (A=='R')
            for (int j = 0; j <= a; j++) {
                rdominoes[c + j] = A;
            }
    return String.valueOf(rdominoes);
    }
}

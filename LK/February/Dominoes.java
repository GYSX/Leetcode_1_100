import java.util.*;
public class Dominoes {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String Do = cin.next();
        System.out.print("0123456789\n");
        System.out.print(Do+"\n");
        String rDo=pushDominoes(Do);
        System.out.print(rDo);
    }
    static String pushDominoes(String dominoes) {
        char A='L', B;
        int a = 0, b =0,c=1;
        char[] rdominoes=new char[dominoes.length()];
        for(int i = 0; i < dominoes.length() ; i++){
            rdominoes[i]='.';
        }
        for(int i = 0; i < dominoes.length() ; i++){
            B = dominoes.charAt(i);
            if (B !='.') {

                    if (A=='R'&& B =='L') {
                        a = a / 2;
                        for (int j = 0; j <= a; j++) {
                            rdominoes[b + j] = A;
                            rdominoes[i  - j] = B;
                        }

                    }else if (A== B){
                        if (c==1)
                            b=-1;
                            for (int j = 0; j <= a; j++) {
                                rdominoes[b +1+ j] = A;
                            }

                    }else { rdominoes[i] = B; }
                    b =i;
                    a=0;
                    A= B;
                    c=2;

            }else
                a++;
            if (a == dominoes.length())return dominoes;
        }
        if (A=='R') {
            for (int j = 0; j <= a; j++) {
                rdominoes[b + j] = A;
            }
        }
        else
            rdominoes[b] = A;
    return String.valueOf(rdominoes);
    }
}

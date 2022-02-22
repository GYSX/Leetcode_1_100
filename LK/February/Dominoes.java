import java.util.*;
public class Dominoes {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String Do = cin.next();
        System.out.print(Do+"\n");
        String rDo=pushDominoes(Do);
        System.out.print(rDo);
    }

    static String pushDominoes(String dominoes) {
        char A='L', B;//利用队列的思想，A为头B为尾，初始存入一个“L”
        int a = 0, b =0,c=1;//标记变量，a记录AB间的间隔，b记录A的位置，c标识第一次推到情况
        char[] rdominoes=new char[dominoes.length()];//创建结果集
        for(int i = 0; i < dominoes.length() ; i++){
            rdominoes[i]='.';
        }
        for(int i = 0; i < dominoes.length() ; i++){
            B = dominoes.charAt(i);
            if (B !='.') {//遇到新的方向则开始分析AB间的情况

                    if (A=='R'&& B =='L') {//相会情况处理
                        a = a / 2;
                        for (int j = 0; j <= a; j++) {
                            rdominoes[b + j] = A;
                            rdominoes[i  - j] = B;
                        }

                    }else if (A== B){//同向情况处理
                        if (c==1)//左端点设置为”L“虚拟骨牌
                            b=-1;
                            for (int j = 0; j <= a; j++) {
                                rdominoes[b +1+ j] = A;
                            }

                    }else { rdominoes[i] = B; }//远离情况处理
                    b =i;A= B;//尾变头
                    a=0;//计数归零
                    c=2;//去除左端点设置为”L“虚拟骨牌
            }else
                a++;
            if (a == dominoes.length())return dominoes;//无推到情况处理
        }
        if (A=='R') {//右端点情况处理
            for (int j = 0; j <= a; j++) {
                rdominoes[b + j] = A;
            }
        }
    return String.valueOf(rdominoes);
    }
}

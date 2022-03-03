import java.util.ArrayList;
import java.util.List;

public class _22_括号生成 {
    public static void main(String[] args){
        int a= 3;
        List<String> zu = generateParenthesis( a );

        for (int i=0;i<zu.size();i++) {
            System.out.println("["+(i+1)+"]" +zu.get(i));
        }
    }
    public static List<String> generateParenthesis(int n) {
        List<String> s=new ArrayList<String>();
        String S="(";
        sc(S,s,n-1,n);

        return s;
    }
    public static void sc(String S,List<String> s,int i,int j){
        String rS=S;
        if (i>0){
            rS=rS+"(";
            sc(rS,s,i-1,j);
            rS=S;
        }
        if (j>i){
            rS=rS+")";
            sc(rS,s,i,j-1);
            rS=S;
        }
        if (i==0&&j==1){
            rS=rS+")";
            s.add(rS);
        }
    }

}

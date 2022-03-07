import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _51_N皇后 {
    public static void main(String[] args){


        List<List<String>> a= solveNQueens(5);
        for (List<String> b: a) {
            for (String s:b){
                System.out.print(s+"]  , [");
            }
            System.out.println();
        }
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> jg=new ArrayList<List<String>>();
        for (int i=0;i<n;i++){
            boolean[][] qp= new boolean[n][n];
            for (int j=1;j<n;j++){
                Arrays.fill(qp[j],true);
            }
            jy_qp(0,i,n,qp);

            List<String> one_jg=new ArrayList<>();
            String row="";
            for (int j=0;j<n;j++){
                if (j==i){
                    row=row+"Q";
                }else {
                    row = row + ".";
                }
            }
            one_jg.add(row);

            mj(1,n,qp,one_jg,jg);
        }

        return jg;
    }
    public static void mj(int x,int n,boolean[][] qp,List<String> one_jg,List<List<String>> jg){
        if (x==n){
            jg.add(one_jg);
            return;
        }
        for (int i=0;i<n;i++){
            if (qp[x][i]) {
                boolean[][] QP=new boolean[n][n];
                for (int j=0;j<n;j++) {
                   for (int k=0;k<n;k++){
                       QP[j][k]=qp[j][k];
                   }
                }
                jy_qp(x,i, n, QP);
                //深拷贝
                List<String> oneJg = new ArrayList<String>(one_jg);
                String row="";
                for (int j=0;j<n;j++){
                    if (j==i){
                        row=row+"Q";
                    }else {
                        row = row + ".";
                    }
                }
                oneJg .add(row);
                mj(x+1,n,QP,oneJg ,jg);
            }
        }
    }
    public static void jy_qp(int x,int y,int n,boolean[][] qp){
        int l_X=x+1,l_Y=y-1;
        int r_X=x+1,r_Y=y+1;
        for (int i=x+1;i<n;i++){
            for(int j=0;j<n;j++){
                if (j==y){
                    qp[i][j]=false;
                }
                if (i==l_X&&j==l_Y){
                    qp[i][j]=false;
                    l_X++;
                    l_Y--;
                }
                if (i==r_X&&j==r_Y){
                    qp[i][j]=false;
                    r_X++;
                    r_Y++;
                }
            }
        }

    }
}

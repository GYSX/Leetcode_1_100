import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _118_杨辉三角 {
    public static void main(String[] args) {
        List<List<Integer>> jg=generate(3);
        for (List<Integer> i:jg){
            System.out.println(Arrays.toString(i.toArray()));
        }
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> jg=new ArrayList<>();
        List<Integer> T=new ArrayList<>();
        T.add(1);
        jg.add(T);
        for (int i=1;i<numRows;i++){
            List<Integer> one=new ArrayList<>();
            for (int j=0;j<i+1;j++){
                if (j==0||j==i){
                    one.add(1);
                }else {
                    List<Integer> t=jg.get(i-1);
                    one.add(t.get(j-1)+t.get(j));
                }
            }
            jg.add(one);
        }
        return jg;

    }
}

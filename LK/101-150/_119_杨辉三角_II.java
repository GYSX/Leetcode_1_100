import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _119_杨辉三角_II {
    public static void main(String[] args) {
            List<Integer> jg=getRow(3);
            System.out.println(Arrays.toString(jg.toArray()));
    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> jg=new ArrayList<>();
        jg.add(1);
        for (int i=1;i<rowIndex+1;i++){
            List<Integer> one=new ArrayList<>();
            for (int j=0;j<i+1;j++){
                if (j==0||j==i){
                    one.add(1);
                }else {
                    one.add(jg.get(j-1)+jg.get(j));
                }
            }
            jg=one;
        }
        return jg;

    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _89_格雷编码 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(grayCode(
                4
        ).toArray()));
    }
    public static List<Integer> grayCode(int n) {
        List<Integer> result=new ArrayList<Integer>();
        int fh=1;
        int number=0;
        result.add(number);
        for (int i=0;i<n;i++){
            int leng=result.size()-1;
            int M= (int) Math.pow(2,i);
            for (int j=leng;j>-1;j--){
                int date=result.get(j)+M;
                result.add(date);
            }
        }
        return result;
    }
}

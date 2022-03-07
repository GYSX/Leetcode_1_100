import java.util.ArrayList;
import java.util.List;

public class _66_加一 {
    public static void main(String[] args){
        int[] digits=new int[]{
          9
        };
        int[] r=plusOne(digits);
        for (int i=0;i<r.length;i++){
            System.out.print(r[i]+",");
        }
    }
    public static int[] plusOne(int[] digits) {
        int add=0;
        List<Integer> rdigits=new ArrayList<Integer>();
        for (int i=digits.length-1;i>=0;i--){
            add=(digits[i]+1)/10;
            digits[i]=(digits[i]+1)%10;
            if (add==0){
                return digits;
            }
            rdigits.add(digits[i]);
        }
        rdigits.add(0,add);
        int[] arr;
        arr=rdigits.stream().mapToInt(Integer::valueOf).toArray();
        return arr;
    }
}

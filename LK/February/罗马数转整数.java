import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class 罗马数转整数 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String nums = "LVIII";
        int rnums=romanToInt(nums);
        System.out.print("*****"+rnums);
    }
    public static int romanToInt(String s) {
        Map<Character, Integer>map= new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char a='M';
        int A=0;
        for (int i=0;i<s.length();i++){
            char b=s.charAt(i);
            if (map.get(b)<=map.get(a))
                A=A+map.get(b);
            else
                A=A-(map.get(a)*2)+map.get(b);
            a=b;
        }

        return A;
    }
}
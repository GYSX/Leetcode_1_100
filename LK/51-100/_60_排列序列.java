import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _60_排列序列 {
    public static void main(String[] args) {
//        System.out.println(getPermutation(2, 1));
//        System.out.println(getPermutation(2, 2));

//        System.out.println(getPermutation(3, 1));
//        System.out.println(getPermutation(3, 2));
//        System.out.println(getPermutation(3, 3));
//        System.out.println(getPermutation(3, 4));
//        System.out.println(getPermutation(3, 5));

        System.out.println(getPermutation(4, 1));
        System.out.println(getPermutation(4, 2));
        System.out.println(getPermutation(4, 3));
        System.out.println(getPermutation(4, 4));
        System.out.println(getPermutation(4, 5));
        System.out.println(getPermutation(4, 6));
        System.out.println(getPermutation(4, 7));
        System.out.println(getPermutation(4, 8));
        System.out.println(getPermutation(4, 9));
        System.out.println(getPermutation(4, 10));
        System.out.println(getPermutation(4, 11));
        System.out.println(getPermutation(4, 12));
        System.out.println(getPermutation(4, 13));
        System.out.println(getPermutation(4, 14));
        System.out.println(getPermutation(4, 15));
        System.out.println(getPermutation(4, 16));
        System.out.println(getPermutation(4, 17));
        System.out.println(getPermutation(4, 18));
        System.out.println(getPermutation(4, 19));

    }


    public static String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            list.add(i);
        }
        String s = "";
        for (int i = 0, b=0, a = k-1; i < n - 1; i++) {

            b = a % factorial(n - 1 - i);
            a = a / factorial(n - 1 - i);
//            System.out.println("a:b=" + a + ":" + b+">"+factorial(n - 1 - i));

            s = s + list.get(a);
            list.remove(a);

            a = b;


        }

        return s + list.get(0);
    }

    public static int factorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return (number * factorial(number - 1));
        }
    }
}

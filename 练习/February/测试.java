import java.util.*;

public class 测试 {
    public static void main(String[] args){
       int[] n=new int[]{
               1,1,1,1,1,80,1,1
       };
       int[] N=new int[]{
               80
       };
       int t=Arrays.binarySearch(n,N[0]);
        System.out.println(t);
    }
}
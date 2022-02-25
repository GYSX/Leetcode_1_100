import java.util.Scanner;
public class 回文数 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x = 121;
        boolean rx=isPalindrome(x);
        System.out.print(rx);
    }
    public static boolean isPalindrome(int x) {
        int n=0,i=0;
        if (x<0)
        return false;
        else{
            for(;Math.pow(10,n)<=x;n++){}
        for (;n==i;){
            if(x/Math.pow(10,n)==(x/Math.pow(10,i+1))/Math.pow(10,i)){
                n--;i++;
            }
            else
            return false;
           
        }
        return true;
        }
        
    }
}

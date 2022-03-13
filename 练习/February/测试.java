import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 测试 {
    interface  ab{
        abstract int ADD(int a,int b);
    }
    public static void main(String[] args){
        ab A =(int a,int b) ->{
            return a+b;
        };
        System.out.println(A.ADD(1,3));
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 实验 {

    public static class ab{ }
    public static class a extends ab{
        int value=1;
    }
    public static class b extends ab{
        int value=1;
    }
    public static void main(String[] args){
        ab a=new a();
        a A=new a();
        ab b=new b();
        b B=new b();

        a c=new a();
        b C=new b();
        System.out.println(a==A); //false
        System.out.println(a==b); //false
        System.out.println(A==B); //false
//        System.out.println(c==C); //编译错误
    }
}

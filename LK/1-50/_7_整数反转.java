import java.util.Scanner;

public class _7_整数反转 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x = 2147447413;
        int rx=reverse(x);
        System.out.print(rx);
    }
    public static void show(ListNode list){
        System.out.print(list.val+",");
        for (;list.next!=null;){
            list=list.next;
            System.out.print(list.val+",");
        }
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    public static int reverse(int x) {

        ListNode N =new ListNode( (x%10) );
        x= ( (x-(x%10)) /10  );
        ListNode N_top=N;
        for (int i=2;x!=0;i++){
            //System.out.println("<"+i+">");
            N.next=new ListNode( (x%10) );
            N=N.next;
            x= ( (x-(x%10)) /10  );
            //System.out.println("<*"+x+"*>");
        }

        System.out.println("<");
        /*
      show(N_top);*/

        int m=N_top.val;
        for (;N_top.next!=null;){
            N_top=N_top.next;

            if ( ( Math.abs(m) > Integer.MAX_VALUE/10 ) || ( Math.abs(m) > Integer.MAX_VALUE/10 && N_top.val > 7 ) ) {
                    return 0;
            }
            m=m*10+N_top.val;
            System.out.println("<"+m+">");
        }

            return m;
    }
}

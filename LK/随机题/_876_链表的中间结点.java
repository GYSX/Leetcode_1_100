public class _876_链表的中间结点 {
    public static void show(ListNode list3){
        ListNode a=list3;
        System.out.print(a.val+",");
        for (;a.next!=null;){
            a=a.next;
            System.out.print(a.val+",");
        }
    }
    public static void main(String[] args){
        ListNode head =new ListNode(1);
        ListNode bottom=head;
        int[] nuber={
                1,2,3,4
        };
        int n =1;

        for (int i=0;i<nuber.length;i++){
            bottom.val=nuber[i];
            if (i!=nuber.length-1) {
                bottom.next = new ListNode();
                bottom = bottom.next;
            }
        }


        System.out.println("");
        show(head);
        System.out.println("");

        head=middleNode(head);

        System.out.println("");
        show(head);
        System.out.println("");
    }
    public static ListNode middleNode(ListNode head) {
        if (head.next==null){
            return head;
        }
        ListNode bottom=head;
        int i,j;

        ListNode next_D=head;
        for (i=0,j=0;bottom.next!=null;i++){
            int n=i/2;
            if (j<=n){
                next_D=next_D.next;
                j++;
            }
            bottom=bottom.next;
        }
        if (i==0){
            return null;
        }

        return  next_D;
    }
}

public class _19_删除链表的倒数第N个结点 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
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
                1
        };
        int n =1;

        for (int i=0;i<nuber.length;i++){
            bottom.val=nuber[i];
            if (i!=nuber.length-1) {
                bottom.next = new ListNode();
                bottom = bottom.next;
            }
        }


        System.out.print("");
        show(head);
        System.out.print("");

        head=removeNthFromEnd(head,n);

        System.out.print("");
        show(head);
        System.out.print("");
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode bottom=head;
        int i;
        ListNode next_D=head;
        for (i=0;bottom.next!=null;i++){
            //与走过第n个节点在记录前置节点
            if (i>=n){
                next_D=next_D.next;
            }
            bottom=bottom.next;
        }
        if (i==0){
            return null;
        }
        if (n>i){
            head=head.next;
        }
        if (next_D.next.next!=null)
            next_D.next=next_D.next.next;
        else
            next_D.next=null;

        return  head;
    }
}

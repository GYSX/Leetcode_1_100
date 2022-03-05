public class _24_两两交换链表中的节点 {
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
    public static void main( String[] args) {
        ListNode L1=new ListNode(1);
        L1.next=new ListNode(4);
        L1.next.next=new ListNode(5);
        L1.next.next.next=new ListNode(6);

        ListNode rlist=swapPairs(L1);

        System.out.println();
        show(rlist);
    }
    public static ListNode swapPairs(ListNode head) {
        if(head.next==null){ return head; }
            ListNode rhead =head.next;
            head.next=head.next.next;
            rhead.next=head;

        ListNode front =head;
        ListNode bottom=head.next;

        System.out.println();
        show(rhead);
        System.out.println();

        for (int i=0;bottom!=null;i++){


                ListNode temporary_node=bottom.next;
                if (bottom.next==null){
                    break;
                }
                bottom.next=bottom.next.next;
                temporary_node.next=bottom;
                front.next=temporary_node;
                front=bottom;

                System.out.println("("+bottom.val+"<-"+temporary_node.val+")");
                System.out.println("("+"|---^"+")");

                bottom=bottom.next;
        }
        System.out.println();
        show(rhead);

        return  rhead;
    }
}

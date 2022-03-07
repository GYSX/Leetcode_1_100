public class _61_旋转链表 {
    public static class ListNode {
        int val;
         ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,  ListNode next) { this.val = val; this.next = next; }
    }
    public static void show( ListNode list3){
         ListNode a=list3;
        System.out.print(a.val+",");
        for (;a.next!=null;){
            a=a.next;
            System.out.print(a.val+",");
        }
    }
    public static void main(String[] args){
         ListNode head =new  ListNode(1);
         ListNode bottom=head;
        int[] nuber={
                1
        };
        int n =1;

        for (int i=0;i<nuber.length;i++){
            bottom.val=nuber[i];
            if (i!=nuber.length-1) {
                bottom.next = new  ListNode();
                bottom = bottom.next;
            }
        }


        System.out.print("");
        show(head);
        System.out.print("");

        head= rotateRight(head,n);

        System.out.print("");
        show(head);
        System.out.print("");
    }
    public static  ListNode rotateRight(ListNode head, int k) {
            if (head==null){
                return null;
            }
            if (k==0){
                return head;
            }
         ListNode bottom=head;
         ListNode next_D=head;
         int i;
        for (i=0;bottom.next!=null;i++){
            if (i>=k){
                next_D=next_D.next;
            }
            bottom=bottom.next;
        }
        if (i==0){
            return null;
        }
        if (k>i){
            System.out.println("->"+i);
            return rotateRight(head,k%i);
        }
        bottom.next=head;
        head=next_D.next;
        next_D.next = null;

        return  head;
    }
}

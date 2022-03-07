public class _83_删除排序链表中的重复元素 {
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
        ListNode head =new ListNode();
        ListNode bottom=head;
        int[] nuber={

        };
//
//        for (int i=0;i<nuber.length;i++){
//            bottom.val=nuber[i];
//            if (i!=nuber.length-1) {
//                bottom.next = new ListNode();
//                bottom = bottom.next;
//            }
//        }


        System.out.println("");
        show(head);
        System.out.println("");

        head=deleteDuplicates(head);

        System.out.println("");
        show(head);
        System.out.println("");
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode bottom=head.next;
        ListNode next_D=head;
        for (;bottom.next!=null;){
            if (bottom.val!=next_D.val){
                next_D=next_D.next;
            }else {
                next_D.next=bottom.next;
            }
            bottom=bottom.next;
        }
        if (bottom.val!=next_D.val){
            next_D=next_D.next;
        }else {
            next_D.next=null;
        }
        return  head;
    }
}

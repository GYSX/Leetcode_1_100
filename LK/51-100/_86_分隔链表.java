public class _86_分隔链表 {
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
        public static void main(String[] args) {
            ListNode head =new ListNode();
            ListNode bottom=head;
            int[] nuber={
                    1,4,3,2,5,2//3
            };
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

            head=partition(head,3);

            System.out.println("");
            show(head);
            System.out.println("");
        }
        public static ListNode partition(ListNode head, int x) {
            ListNode nullNode_1=new ListNode();
            ListNode nullNode_2=new ListNode();
            ListNode before=nullNode_1;
            ListNode later=nullNode_2;
            while (head!=null){
                if (head.val<x){
                    before.next=head;
                    before=before.next;
                }else {
                    later.next=head;
                    later=later.next;
                }
                head=head.next;
            }
            before.next=nullNode_2.next;
            later.next=null;
            return nullNode_1.next;
        }
}

public class _25_K个一组翻转链表 {
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
            L1.next=new ListNode(2);
            L1.next.next=new ListNode(3);
            L1.next.next.next=new ListNode(4);
            L1.next.next.next.next=new ListNode(5);
            L1.next.next.next.next.next=new ListNode(6);
            /*L1.next.next.next.next.next.next=new ListNode(9);*/

//            ListNode temporary_node=L1.next;
//            L1.next=null;
//            L1=upside_down(L1,temporary_node);
//            System.out.println();
//            show(L1);

            ListNode rlist=reverseKGroup(L1,2);

            System.out.println();
            show(rlist);
        }
        public static ListNode reverseKGroup(ListNode head, int k) {
            if (k==1) {
                return head;
            }

            ListNode r_head=head;
            ListNode front =head;
            ListNode bottom=head;

            for (int i=0;bottom!=null;i++){
                if ((i%k==0&&i!=0)){
                    front.next=null;
                    ListNode temporary_node=head.next;
                    head.next=bottom;
                    r_head=upside_down(head,temporary_node);
                    break;
                }
                if (i%k==k-1&&bottom.next==null){
                    ListNode temporary_node=head.next;
                    head.next=null;
                    r_head=upside_down(head,temporary_node);
                    return r_head;
                }
                front=bottom;
                bottom=bottom.next;
            }
            if (r_head.toString().equals(head.toString())){
                return head;
            }
            ListNode temporary_head=bottom;

            for (int i=0;bottom!=null;i++){
                System.out.println();
                show(r_head);
                System.out.println("->"+i);
                if (i%k==0&&i!=0){
                    front.next=null;
                    ListNode temporary_node=temporary_head.next;
                    temporary_head.next=bottom;
                    head.next=upside_down(temporary_head,temporary_node);
                    head=temporary_head;
                    temporary_head=bottom;
                    i=-1;
                }else {
                    if (i%k==k-1&&bottom.next==null){
                        ListNode temporary_node=temporary_head.next;
                        temporary_head.next=null;
                        head.next=upside_down(temporary_head,temporary_node);
                        return r_head;
                    }
                    front = bottom;
                    bottom = bottom.next;
                }
            }

            return  r_head;
        }

    /**
     * 基本用法：
     * ListNode temporary_node=L1.next;
     * L1.next=null;
     * L1=upside_down(L1,temporary_node);
     * @param r_head 倒置前的head  (要断开r_head与head间的连接)
     * @param head 倒置前head的后继
     * @return 倒置后的head
     */
        public static ListNode upside_down(ListNode r_head, ListNode head){

            ListNode temporary_node =head.next;
            head.next= r_head;
            if (temporary_node!=null) {
                return upside_down(head, temporary_node);
            }
            else {
                return head;
            }
        }
}

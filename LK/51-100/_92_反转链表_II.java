public class _92_反转链表_II {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void show(ListNode list3) {
        ListNode a = list3;
        System.out.print(a.val + ",");
        while (a.next != null) {
            a = a.next;
            System.out.print(a.val + ",");
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode bottom = head;
        int[] nuber = {
                1,2,3,4,5
        };
        for (int i = 0; i < nuber.length; i++) {
            bottom.val = nuber[i];
            if (i != nuber.length - 1) {
                bottom.next = new ListNode();
                bottom = bottom.next;
            }
        }

        System.out.println("");
        show(head);
        System.out.println("");

        head = reverseBetween(head, 1, 5);

        System.out.println("");
        show(head);
        System.out.println("");
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (left==right){
            return head;
        }
        boolean flag=false;
        if (left==1){
            ListNode nullNode=new ListNode();
            nullNode.next=head;
            head=nullNode;
            right++;
            flag=true;
        }
        ListNode Left=head;
        ListNode Right=head;
        for (int i=1;i<right;i++){
            if (i<left-1) {
                Left = Left.next;
            }
            Right=Right.next;
        }
        //断开尾，记录位置信息
        ListNode t=Left.next;
        ListNode T=Right.next;
        Right.next=null;
        //断开头，准备倒转
        ListNode temporary_node = Left.next.next;
        Left.next.next = null;
        //倒转，并连回头
        Left.next = upside_down(Left.next, temporary_node);
        //重新连接尾
        t.next=T;
        if (flag){
            return head.next;
        }else {
            return head;
        }
    }
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

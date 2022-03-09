import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _82_删除排序链表中的重复元素_II {
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
//                1,2,3,4,4,5,5,6
//                1,2,2
//                1,1,2
//                1,1,1,2
                0,0,0,1,1,2,3,4,4
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

        head=deleteDuplicates(head);

        System.out.println("");
        show(head);
        System.out.println("");
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        if (head.next.next==null){
            if (head.val==head.next.val){
                return null;
            }else {
                return head;
            }
        }
        ListNode nullNode = new ListNode();
        nullNode.next=head;

        ListNode cur = nullNode;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int x = cur.next.val;
                //跳过重复值
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }

        return nullNode.next;

    }
}

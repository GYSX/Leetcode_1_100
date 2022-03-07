public class _2_两数相加 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
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

        ListNode l1=new ListNode(1);
/*
        l1.next=new ListNode(6);
        l1.next.next=new ListNode(9);
        l1.next.next.next=new ListNode(9);*/

        ListNode l2=new ListNode(9);

        l2.next=new ListNode(9); /*
        l2.next.next=new ListNode(9);
        l2.next.next.next=new ListNode(9);
        l2.next.next.next.next=new ListNode(9);*/

        ListNode l3=addTwoNumbers(l1,l2);
        System.out.println(""+l3.val+""+l3.next.val);
        /*
        System.out.println();
        show(l3);
        */

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        if (l1.val==0&&l1.next==null){return l2;}
        if (l2.val==0&&l2.next==null){return l1;}
        ListNode l3=new ListNode();
        ListNode l4=l3;

        l3.val=(l1.val+l2.val)%10;
        ListNode Add=null;
        if (l1.next==null&&l2.next==null)
        {
            if ((l1.val+l2.val)>=10){
                l3.next=new ListNode((l1.val+l2.val)/10);
            }
            return l4;
        }
        else if (l1.next==null) {
            if ((l1.val+l2.val)>=10) {
                Add=l2.next;
                Add.val = l2.next.val+((l1.val + l2.val) / 10);
                l3.next=Add;
            }else {}
        }
        else if (l2.next==null){
            if ((l1.val+l2.val)>=10) {
                Add=l1.next;
                Add.val = l1.next.val+((l1.val + l2.val) / 10);
                l3.next=Add;
            }else {}
        }
        else {
            Add = add(l1.next, l2.next, l3, (l1.val + l2.val) / 10);
        }
        int i=0,j=0;
        if (Add!=null) {
            if (Add.val>=10) {
                while (true){
                    j = (Add.val + i) / 10;
                    Add.val = (Add.val + i) % 10;
                    if (Add.next==null) {
                        if (j!=0)Add.next=new ListNode(j);
                        break;
                    }
                    else {Add=Add.next;}
                    i=j;
                }
            }else {}
        }
        return l4;
    }
    public static ListNode add( ListNode l1,ListNode l2,ListNode l3,int Add ){
        l3.next=new ListNode();
        l3.next.val=(l1.val+l2.val+Add)%10;
        if (l1.next==null&&l2.next==null) {
            if (((l1.val+l2.val+Add)/10)==0){
                return null;
            }else {
                l3.next.next=new ListNode((l1.val+l2.val+Add)/10);
                return null;
            }
        }
        else if (l1.next==null) {
            l3.next.next=l2.next;
            l2.next.val=l2.next.val+((l1.val+l2.val+Add)/10);
            return l2.next;
        }
        else if (l2.next==null) {
            l3.next.next=l1.next;
            l1.next.val=l1.next.val+((l1.val+l2.val+Add)/10);
            return l1.next;
        }
        else  return add(l1.next,l2.next,l3.next,(l1.val+l2.val+Add)/10 );
    }
}

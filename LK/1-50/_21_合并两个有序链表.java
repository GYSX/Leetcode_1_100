public class _21_合并两个有序链表 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main( String[] args) {


        ListNode list1= new ListNode(-9);
        ListNode L1=list1;

        for (int i=1;i<0;i++){
            ListNode list=new ListNode(i*2);
            list1.next=list;
            list1=list1.next;
         }

        ListNode list2= new ListNode(1);
        ListNode L2=list2;

        for (int i=1;i<3;i++){
            ListNode list=new ListNode(i*3);
            list2.next=list;
            list2=list2.next;
        }
        show(L1);
        System.out.println();
        show(L2);

        ListNode list3=mergeTwoLists(L1,L2);
        System.out.println();
        show(list3);
    }
    public static void show(ListNode list3){
        ListNode a=list3;
        System.out.print(a.val+",");
        for (;a.next!=null;){
            a=a.next;
            System.out.print(a.val+",");
        }
    }
        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null) return list2;
        if (list2==null) return list1;
        if (list1.next==null&&list2.next==null)
        {
            if (list1.val<list2.val){
                list1.next=list2;
                return list1;
            }else {
                list2.next=list1;
                return list2;
            }

        }
        ListNode list3=null,list4=null;
        int b=0;

            while (true){
                if (list1.val <= list2.val) {
                    if (b==0){list3=list1;list4=list3;}
                    else{list3.next = list1;}
                    if (list1.next==null){break;}
                    else {list1 = list1.next;}
                } else {
                    if (b==0){list3=list2;list4=list3;}
                    else{list3.next = list2;}
                    if (list2.next==null){break;}
                    else{list2 = list2.next;}
                }
                if (b==0){b=1;}
                else {list3=list3.next;}
                /*
                System.out.println();
                show(list1);
                System.out.println("==L1");
                show(list2);
                System.out.println("==L2");
                show(list3);
                System.out.println("==l3");
                show(list4);
                System.out.println("==L3");
                */
            }
            if (b==0){b=1;}
            else {list3=list3.next;}
            /*
            System.out.println();
            show(list1);
            System.out.println("==L1");
            show(list2);
            System.out.println("==L2");
            show(list4);
            System.out.println("==L3");
            System.out.println(list3.toString());
            System.out.println(list1.toString());
            System.out.println(list2.toString());
            */

                if ( list3.toString().equals(list2.toString())) {
                    list3.next = list1;
                } else {
                    list3.next = list2;
                }

        return list4;
        }
}

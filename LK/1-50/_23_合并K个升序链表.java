public class _23_合并K个升序链表 {
        public static class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

        public static void main( String[] args) {
            ListNode L1=new ListNode(1);
            L1.next=new ListNode(4);
            L1.next.next=new ListNode(5);

            ListNode L2=new ListNode(1);
            L2.next=new ListNode(3);
            L2.next.next=new ListNode(4);

            ListNode L3=new ListNode(2);
            L3.next=new ListNode(6);

            ListNode[] list ={L1,L2,L3};

            ListNode rlist=mergeKLists(list);

            System.out.println();
            show(rlist);
        }
        public static void show(ListNode list3){
            ListNode a=list3;
            System.out.print(a.val+",");
            for (;a.next!=null;){
                a=a.next;
                System.out.print(a.val+",");
            }
        }

        public static ListNode mergeKLists(ListNode[] lists) {
            if (lists.length==0){
                return new ListNode();
            }
            if (lists.length==1){
                return lists[0];
            }
            ListNode sum=lists[0];
            for (int i=1;i<lists.length;i++){
                sum=mergeTwoLists(sum,lists[i]);
            }
            return sum;
        }
        public static ListNode mergeTwoLists(ListNode list1,ListNode list2) {
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

            }
            if (b==0){b=1;}
            else {list3=list3.next;}


            if ( list3.toString().equals(list2.toString())) {
                list3.next = list1;
            } else {
                list3.next = list2;
            }

            return list4;
        }
    }


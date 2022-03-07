public class _3_无重复字符的最长子串 {

        public static void main(String[] args) {
            String s = "baa";
            int rs = lengthOfLongestSubstring(s);
            System.out.println("***"+rs);
        }
    public static void show(ListNode list){
        System.out.print(list.val+",");
        for (;list.next!=null;){
            list=list.next;
            System.out.print(list.val+",");
        }
    }
        public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        }
        public static int pd(ListNode list,int s){
            System.out.println("//////////////////"+s+"*"+list.val+"/////////////////");
            if (s==list.val){
                return 0;
            }
            int i;
            for (i=1;list.next!=null;i++){
                list=list.next;
                if (s==list.val){
                    return i;
                }
            }
        return -1;
        }

        public static int lengthOfLongestSubstring(String s) {
            if (s.isEmpty())return 0;
            if (s.length()==1)return 1;
            int n=0;
            ListNode S =new ListNode();
            ListNode S_bottom=S;

            for (int i=0;i<s.length();i++){
                int a=s.charAt(i);
                int b=pd(S,a);
                for (int j=0;j<=b;j++){
                        S=S.next;
                    }

                System.out.print("\n<a><"+b+">------");
                show(S);
                System.out.println("---------------");

                S_bottom.val=a;
                S_bottom.next=new ListNode();
                S_bottom=S_bottom.next;
                System.out.print("\n***************<"+b+">");
                show(S);
                System.out.println("***************");

                   int m = 0;
                   ListNode legth = S;
                   while (legth.val!=0){
                       legth=legth.next;
                       m++;
                   }
                   System.out.println("<*"+m+"*>");
                   n = Math.max(n, m);

            }
            return n;
        }

    }


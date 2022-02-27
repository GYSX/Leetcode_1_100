import jdk.nashorn.internal.parser.Lexer;

public class _6_Z字形变换 {
    public static void main(String[] args) {
        String S = "AB";
        String rS = convert(S,1);
        System.out.println(rS);
    }
    public static void show(ListNode list){
        System.out.print(list.val+",");
        for (;list.next!=null;){
            list=list.next;
            System.out.print(list.val+",");
        }
    }
    public static class ListNode {
        char val;
        ListNode next;
        ListNode() {}
        ListNode(char val) { this.val = val; }
        ListNode(char val, ListNode next) { this.val = val; this.next = next; }
    }

    public static String convert(String s, int numRows) {
        ListNode[] S=new ListNode[numRows];
        ListNode[] S_top=new ListNode[numRows];
        for (int i=0;i<numRows;i++) {
            S[i]=new ListNode();
            S_top[i] = S[i];
        }
        int n=1;
        if (numRows>1) {
            n = (s.length() / (2 * numRows - 2)) + 1;
        }else {
            return s;
        }
        px(S,s,numRows,n);
/*
        for (int i=0;i<numRows;i++)
        {
            show(S_top[i]);
            System.out.println("<"+i+">");
        }
        System.out.println();*/

        String Str="";
        for (int i=0;i<numRows;i++) {
            Str=Str.concat("" + S_top[i].val);
            for (; S_top[i].next!= null; ) {
                S_top[i] = S_top[i].next;
                Str=Str.concat("" + S_top[i].val);
            }
        }


        return Str;
    }
    public static void px(ListNode[] S,String s, int numRows,int n) {
        int legth=s.length();
        S[ 0 ].val=s.charAt(0);
        for (int i=0;i<numRows-2;i++){
            if ((1+i)<legth) {
                S[i + 1].val = s.charAt(1 + i);
            }else {return;}
            if ((2 * numRows - 3 - i)<legth) {
                S[i + 1].next = new ListNode(s.charAt(2 * numRows - 3 - i));
                S[i + 1] = S[i + 1].next;
            }else {}
        }
        if ((numRows - 1)<legth) {
            S[numRows - 1].val = s.charAt(numRows - 1);
        }else {return;}


        for (int j=1;j<n;j++) {
            if ((0 + (2 * numRows - 2) * j)<legth) {
                S[0].next = new ListNode(s.charAt(0 + (2 * numRows - 2) * j));
                S[0] = S[0].next;
            }else {break;}
            for (int i = 0; i < numRows - 2; i++) {
                if ((1 + i + (2 * numRows - 2) * j)<legth) {
                    S[i + 1].next = new ListNode(s.charAt(1 + i + (2 * numRows - 2) * j));
                }else {break;}
                if ((2 * numRows - 3 - i + (2 * numRows - 2) * j)<legth) {
                    S[i + 1].next.next = new ListNode(s.charAt(2 * numRows - 3 - i + (2 * numRows - 2) * j));
                    S[i + 1] = S[i + 1].next.next;
                }else {}
            }
                if ((numRows - 1 + (2 * numRows - 2) * j)<legth) {
                    S[numRows - 1].next = new ListNode(s.charAt(numRows - 1 + (2 * numRows - 2) * j));
                    S[numRows - 1] = S[numRows - 1].next;
                }else {break;}
        }
    }
}

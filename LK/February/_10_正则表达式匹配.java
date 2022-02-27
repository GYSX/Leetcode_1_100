import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class _10_正则表达式匹配 {

    public static void main(String[] asgr) {
        // String s="mississippi";String p="mis*is*p*.";//false
        //String s="mississippi";String p="mis*is*ip*.c*";//true
        //String s="ab" ;String p=".*c";//false
        // String s="aaa";String p="a*a";//true
        // String s="aa" ;String p="a";//false
        // String s="aaa";String p="ab*a*c*a";//true
        //String s="aaaa";String p="a.a*";//true
        // String s="aaca";String p="ab*a*c*a";//true
        // String s="aa" ;String p=".";//false
        // String s="a" ;String p=".*..a*";//false
        //String s= "bbbba";String p= ".*a*a";//true
        String s="ab";String p=".*..";//true


        boolean a= isMatch(s,p);
        System.out.println( a );
    }
    public static void show(ListNode list3){
        ListNode a=list3;
        System.out.print(a.val+",");
        for (;a.next!=null;){
            a=a.next;
            System.out.print(a.val+",");
        }
    }
    public static class ListNode {
        char val;
        ListNode next;
        ListNode() {}
    }
    public static boolean isMatch(String s, String p) {
        ListNode P=csh(p);
        ListNode rP=P;
        System.out.println();
        show(P);
        System.out.println();

        int n=0,m=0;
        for (int i=0;P.next!=null;i++){

            if (P.val=='1'){            //.
                System.out.println("一位."+n);
                int l=-1;
                if (rP.val>=65&&rP.val<=90||rP.val=='0'){

                    if (P.next!=null) {
                        if (P.next.val >= 97 && P.next.val <= 122) {
                            if (P.next.val == s.charAt(n)) {
                            } else {
                                n = n + m + 1;
                                m = 0;
                            }
                        } else if (P.next.val >= 65 && P.next.val <= 90) {
                            if (P.next.val + 32 == s.charAt(n)) {
                            } else {
                                n = n + m + 1;
                                m = 0;
                            }
                        } else if (P.next.val == '0') {
                        } else if (P.next.val == '1') {
                            ListNode c = P.next;
                            int q=1;
                            for (;c.next != null;q++) {
                                if (c.val != '1') {
                                    if (c.val >= 97 && c.val <= 122) {
                                        if (P.next.val == s.charAt(n)) {break;
                                        } else {
                                            n = n + m + 1;
                                            m = 0;
                                            break;
                                        }
                                    } else if (c.val >= 65 && c.val <= 90) {
                                        if (c.val + 32 == s.charAt(n)) {break;
                                        } else {
                                            n = n + m + 1;
                                            m = 0;
                                            break;
                                        }
                                    } else if (c.val == '0') {break;
                                    }
                                }
                                c = c.next;
                            }
                            l=q;
                        }
                    }else {l=1;}
                }else {
                    n = n + m + 1;
                    m = 0;
                }
                if (l>0){
                    if (s.length()-n==l)return true;
                }
                if (n>s.length())return false;

            }
            if (P.val=='0'){            //.*
                System.out.println("一个.*"+n);
                rP = P;
                m=Math.max(m,s.length()-n);
            }
            if (P.val>=97&&P.val<=122){ //a
                System.out.println("一位确定字"+n);
                if (P.val==rP.val+32){
                    n=n+m;
                    if (n==s.length()) {
                        m = 0;
                    }else {
                        m--;
                    }
                }else {
                    n=n+m;
                    int j = n;
                    for (; j < s.length(); j++) {
                        char s_c = s.charAt(j);
                        if (s_c == P.val) {
                            m = 0;
                            n = j;

                            n++;

                            break;
                        }
                    }
                    if (j==s.length())return false;
                }
            }
            if (P.val>=65&&P.val<=90){  //a*
                System.out.println("一个字*"+n+(char)(P.val+32));
                int j=n;
                for (;j<n+1+m&&j<s.length();j++){
                    char s_c=s.charAt(j);
                    if (s_c==(P.val+32)) {
                        System.out.println("<"+j+"*>");
                        int I=j;
                        for (;I<s.length();I++){
                            if (s.charAt(I)!=(char)(P.val+32)){

                                break;
                            }
                        }
                        System.out.println("<*"+m+":"+(I-j)+">");
                        if (rP.val=='0'){}
                        else {
                            m = m + (I - j);
                        }

                        if ((I-j)!=0) {
                            rP = P;
                        }
                        break;
                    }
                }

            }

            P=P.next;
            System.out.println("<第"+i+"次命令-"+n+":"+m+">");
        }

        System.out.println("<结果-"+n+":"+m+">");
            if ((n+m)==s.length()){
                return true;
            }else {
                return false;
            }
    }

    public static ListNode csh(String p){
        ListNode P=new ListNode();
        ListNode P_top=P;
        int i;
        for (i=0;i+1<p.length();i++){
            char p_c=p.charAt(i);
            if (p_c>=97&&p_c<=122){
                if (p.charAt(i+1)==42){
                    P.val= (char) (p_c-32);
                    i++;
                }else {
                    P.val= (char) (p_c);
                }
            }
            if (p_c==46){
                if (p.charAt(i+1)==42){
                    P.val= '0';
                    i++;
                }else {
                    P.val= '1';
                }
            }
            P.next=new ListNode();
            P=P.next;
        }
        if (i!=p.length()) {
            char p_c=p.charAt(p.length()-1);
            if (p_c >= 97 && p_c <= 122) {
                P.val = (char) (p_c);
            }
            if (p_c == 46) {
                P.val = '1';
            }
            P.next=new ListNode();
        }else {}
        return P_top;
    }
}

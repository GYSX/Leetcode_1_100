import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class _10_正则表达式匹配 {

    public static void main(String[] asgr) {
        //"mississippi""mis*is*p*."
        //"mississippi""mis*is*ip*."
        //"ab" ".*c"
        //"aaa""a*a"
        //"aa" "a"
        String s="mississippi";
        String p="mis*is*p*.";
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

        System.out.println();
        show(P);
        System.out.println();

        int n=0,m=0;
        for (int i=0;P.next!=null;i++){

            if (P.val=='1'){            //.
                m=0;
                if (P.next.next!=null) {
                    n = n + 1;
                }
            }
            if (P.val=='0'){            //.*
                m=Math.max(m,s.length()-n);
            }
            if (P.val>=97&&P.val<=122){ //a
                System.out.println("一位确定字"+n);
                int j=n;
                for (;j<s.length();j++){
                    char s_c=s.charAt(j);
                    if (s_c==P.val) {
                        m=0;
                        n = j;
                        if (P.next.next!=null) {
                            n++;
                        }
                        break;
                    }
                }
                if (j==s.length())return false;
            }
            if (P.val>=65&&P.val<=90){  //a*
                int j=n;
                for (;j<n+1;j++){
                    char s_c=s.charAt(j);
                    if (s_c==(P.val+32)) {
                        System.out.println("<"+j+"*>");
                        int I=j;
                        for (;I<s.length();I++){
                            if (s.charAt(I)!=(char)(P.val+32)||I==s.length()-1) {
                                n=I;
                                break;
                            }
                        }
                        System.out.println("<*"+m+":"+(I-j)+">");
                        m=m+(I-j);
                        break;
                    }
                }

            }
            P=P.next;
            System.out.println("<第"+i+"次命令-"+n+":"+m+">");
        }

        System.out.println("<结果-"+n+":"+m+">");
            if (m==0&&n==s.length()-1)return true;
            if ((n+m)>=s.length()){
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

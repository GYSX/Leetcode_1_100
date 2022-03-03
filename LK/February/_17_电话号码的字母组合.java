import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _17_电话号码的字母组合 {
    public static void main(String[] args){
        String a=
                ""
                ;
        List<String> zu = letterCombinations( a );

        for (int i=0;i<zu.size();i++) {
            System.out.println("["+(i+1)+"]" +zu.get(i));
        }
    }
    public static class jd{
        char zm;
        jd[] next;
        jd(){this.next=new jd[1];this.next[0]=null;}
        void set_jd(int i){
            this.next=new jd[i];
        }
        jd(char zm , jd Next) {
            this.next=new jd[1];
            this.zm=zm;
            this.next[0]=Next;
        }
    }
    public static List<String> letterCombinations(String digits) {
        if (digits.length()==0){return new ArrayList<String>();}
        jd root =new jd();
        js(root,digits);

        String S="";
        List<String> s=new ArrayList<String>();
        bl(root,S,s);

        return s;
    }
    public static void bl(jd nuber,String S,List<String> s){
        String rS=S;
     for (int i=0;i<nuber.next.length;i++) {

         rS = rS + nuber.next[i].zm;

         if (nuber.next[0].next[0].next[0] == null) {
             s.add(rS);
         } else {
             bl(nuber.next[0].next[0], rS, s);
         }

         rS = S;
     }
    }
    public static void js(jd nuber,String digits){
        Map<Character,char[]> B=biao();
        for (int i=0;i<digits.length();i++){
            char n=digits.charAt(i);
            char[] zmz = B.get(n);
            nuber.set_jd(zmz.length);
            jd Next=new jd();
            for (int j=0;j<zmz.length;j++)
            {
                nuber.next[j]= new jd(zmz[j],Next);
            }
            nuber= Next;
        }
    }
    public static Map<Character,char[]> biao(){
        Map<Character, char[]> map= new HashMap<>();
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[]{'d', 'e', 'f'});
        map.put('4', new char[]{'g', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});
        map.put('7', new char[]{'p', 'q', 'r','s'});
        map.put('8', new char[]{'t', 'u', 'v'});
        map.put('9', new char[]{'w', 'x', 'y', 'z'});
        return map;
    }
}

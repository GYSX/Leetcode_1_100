import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _567_字符串的排列_暴力遍历超时 {
    public static void main(String[] args) {
        System.out.println(checkInclusion("hello","ooolleoooleh"));
    }
    public static boolean checkInclusion(String s1, String s2) {
        //制作s1的散列表
        Map<Character,Integer> s1Map=new HashMap<>();
        for (int i=0;i<s1.length();i++){
            char t =s1.charAt(i);
            if (s1Map.containsKey(t)){
                s1Map.put(t,s1Map.get(t)+1);
            }else {
                s1Map.put(t,1);
            }
        }
        System.out.println(s1Map);
        //遍历s2
        for (int i=0;i<s2.length();i++){
            char t=s2.charAt(i);
            System.out.println("起点判断："+t);
            if (s1Map.containsKey(t)){
                System.out.println(t+"进行后续判断");
                //进行后续比较
                Map<Character,Integer> T=new HashMap<>(s1Map);
                List<Character> a=new ArrayList<>();
                List<Integer> A=new ArrayList<>();
                for (int j=i;j<i+s1.length()&&j<s2.length();j++){
                    char y=s2.charAt(j);
                    System.out.println("仔细判断："+y);
                    if (T.containsKey(y)){
                        if (T.get(y)==0){
                            //出现超出数量的字符
                            i=A.get(a.indexOf(y));
                            break;
                        }else {
                            T.put(y, T.get(y)- 1);
                            if (!a.contains(y)){
                                a.add(y);
                                A.add(j);
                            }
                        }
                    }else {
                        break;
                    }
                }
                boolean F=true;
                for (int k:T.values()){
                    if (k!=0){
                        F=false;
                        break;
                    }
                }
                if (F){
                    return true;
                }else {
                }
            }else {
                //跳过
            }
        }
        return false;
    }
}

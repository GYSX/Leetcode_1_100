import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _49_字母异位词分组 {
    public static void main(String[] args){
        String[] strs={
                "acc","caa"
        };

        List<List<String>> jg=groupAnagrams(strs);
        System.out.println("结果集：");
        for (int i=0;i<jg.size();i++) {
            System.out.print("[");
            for (int j=0;j<jg.get(i).size();j++) {
                System.out.print( "\""+jg.get(i).get(j)+"\",");
            }
            System.out.println("]");
        }

    }
    public static List<List<String>> groupAnagrams(String[] strs) {


        boolean[] flags = new boolean[strs.length];
        List<List<String>> result=new ArrayList<>();
        for (int i=0;i<strs.length;i++){
            if (flags[i]){}
            else {
                flags[i]=true;
                Map<Character,Integer> map=new HashMap<>();
                for (int a=0;a<strs[i].length();a++){
                    char zm=strs[i].charAt(a);
                    if (map.get(zm)==null) {
                        map.put(zm, 1);
                    }else {
                        map.put(zm, map.get(zm)+1);
                    }
                }
                List<String> one_result=new ArrayList<>();
                one_result.add(strs[i]);
                for (int b=i+1;b<strs.length;b++){
                    if (flags[b]||strs[i].length()!=strs[b].length()){}
                    else {
                        boolean flag = false;
                        Map<Character, Integer> temporary_map = new HashMap<>();
                        for (int c = 0; c < strs[b].length(); c++) {
                            char zm = strs[b].charAt(c);
                            if (temporary_map.get(zm) == null) {
                                temporary_map.put(zm, 1);
                            } else {
                                temporary_map.put(zm, temporary_map.get(zm) + 1);
                            }
                            if (map.get(zm) == null || temporary_map.get(zm) > map.get(zm)) {
                                flag = false;
                                break;
                            } else {
                                flag = true;
                            }
                        }
                        if (map.isEmpty()&&temporary_map.isEmpty()){
                            flags[b] = true;
                            one_result.add(strs[b]);
                        }
                        if (flag) {
                                flags[b] = true;
                                one_result.add(strs[b]);
                        }
                    }

                }
                result.add(one_result);
            }
        }

    return result;
    }
}

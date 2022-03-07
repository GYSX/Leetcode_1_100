import java.util.ArrayList;
import java.util.List;

public class _47_全排列_II {
        public static void main(String[] args){
            int[] nums={
                    1,1,2
            };

            List<List<Integer>> rnums=permuteUnique(nums);

            System.out.println("结果集：");
            for (int i=0;i<rnums.size();i++) {
                System.out.print("[");
                for (int j=0;j<rnums.get(i).size();j++) {
                    System.out.print( "\""+rnums.get(i).get(j)+"\",");
                }
                System.out.println("]");
            }
        }

        /**
         * length=n的数组全排列的集合是在length=n-1的数组的全排列集合的每一项的每一间隔插入新的数（nums[n-1]）得到
         * @param nums
         * @return
         */
        public static List<List<Integer>> permuteUnique(int[] nums) {
            List<List<Integer>> result=new ArrayList<>();
            //a用于注入第一个集合
            List<Integer> a=new ArrayList<>();
            a.add(nums[0]);
            result.add(a);
            //用于动态规划下一项结果时记录阶段结果，防止覆写
            List<List<Integer>> next_result=new ArrayList<>();
            //控制求解次数
            for (int i = 1; i < nums.length; i++) {
                //遍历上一结果集
                for (int j = 0; j < result.size(); j++) {
                    List<Integer> one_result1 = result.get(j);
                    boolean flag=false;
                    //枚举所有可能
                    for (int k = 0; k <= one_result1.size(); k++) {
                        if (flag){
                            if (k<one_result1.size()) {
                                if (nums[i] == one_result1.get(k)) {
                                    flag = true;
                                }
                            }
                            continue;
                        }
                        //进行深拷贝，上一项可以分出多个下一项
                        List<Integer> one_result2 =new ArrayList<>();
                        for (int l = 0; l < one_result1.size(); l++) {
                            one_result2.add(one_result1.get(l));
                        }
                        one_result2.add(k, nums[i]);
                        next_result.add(one_result2);
                        //判断是否是重复元素
                        if (k<one_result1.size()) {
                            if (nums[i] == one_result1.get(k)) {
                                flag = true;
                            }
                        }
                    }
                }
                //丢弃旧结果集，为新结果集开辟空间
                result.clear();
                result = next_result;
                next_result = new ArrayList<>();
            }
            return result;
        }
}

import java.util.*;

public class _90_子集_II {
    public static void main(String[] args) {
        int[] nums = new int[]{
                1, 2, 2
        };
        List<List<Integer>> a = subsetsWithDup(nums);
        for (List<Integer> i : a) {
            System.out.println(Arrays.toString(i.toArray()));
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> oneResult = new ArrayList<>();
        Subsets(0, nums.length, nums.length, nums, oneResult, result);
        result.add(new ArrayList<>());
        return result;
    }

    public static void Subsets(int start, int end, int k, int[] nums, List<Integer> oneResult, List<List<Integer>> result) {
        if (k == 0) {
            return;
        }
        for (int i = start; i < end; i++) {
            List<Integer> temporary = new ArrayList<>();
            temporary.addAll(oneResult);
            temporary.add(nums[i]);
            if (sc(temporary,result)) {
                result.add(temporary);
            }
            Subsets(i + 1, end, k - 1, nums, temporary, result);
        }

    }
    public static boolean sc(List<Integer> branch, List<List<Integer>> mate) {

        for (List<Integer> i : mate) {
            if (branch.size() == i.size()) {
                if (branch.containsAll(i) && i.containsAll(branch)) {
                    Map<Integer, Integer> A = new HashMap<>();
                    Map<Integer, Integer> B = new HashMap<>();
                    for (int a : branch) {
                        if (A.get(a) == null) {
                            A.put(a, 1);
                        } else {
                            A.put(a, A.get(a) + 1);
                        }
                    }
                    for (int b : i) {
                        if (B.get(b) == null) {
                            B.put(b, 1);
                        } else {
                            B.put(b, B.get(b) + 1);
                        }
                    }
                    boolean flag = true;
                    for (int k : branch) {
                        if (A.get(k) != B.get(k)) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}

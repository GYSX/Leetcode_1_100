import java.util.*;

public class _40_组合数 {
        public static void main(String[] args) {
            int[] nums = {
                    48, 22, 49, 24, 26, 47, 33, 40, 37, 39, 31, 46, 36, 43, 45, 34, 28, 20, 29, 25, 41, 32, 23

            };

            List<List<Integer>> rnums =  combinationSum2(nums, 69);

            System.out.println("结果集：");
            for (int i = 0; i < rnums.size(); i++) {
                System.out.print("[");
                for (int j = 0; j < rnums.get(i).size(); j++) {
                    System.out.print("\"" + rnums.get(i).get(j) + "\",");
                }
                System.out.println("]");
            }
        }

        public static List<List<Integer>>  combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<List<Integer>> mate = new ArrayList<>();

            Map<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < candidates.length; i++) {
                if (candidates[i] > target) break;

                if (map.get(candidates[i]) == null) {
                    map.put(candidates[i], 1);
                } else {
                    map.put(candidates[i], map.get(candidates[i]) + 1);
                }

                if (candidates[i] == target) {
                    List<Integer> branch = new ArrayList<>();
                    branch.add(candidates[i]);
                    if (sc(branch, mate)) {
                        mate.add(branch);
                    }
                }
            }


            List<Integer> branch = new ArrayList<>();
            sr(target , map, branch, mate);


            return mate;
        }

        public static void sr(int target, Map<Integer,Integer> map, List<Integer> branch, List<List<Integer>> mate) {
            for (Integer date : map.keySet()) {
                if (date < target&&map.get(date)>0) {

                    List<Integer> temporary = new ArrayList<>();
                    for (int i : branch) {
                        temporary.add(i);
                    }
                    temporary.add(date);

                    Map<Integer,Integer> t_map=new HashMap<>();
                    for (Integer date2 : map.keySet()) {
                        t_map.put(date2,map.get(date2));
                    }

                    t_map.put(date,t_map.get(date)-1);

                    sr(target - date, t_map, temporary, mate);
                } else if (date == target&&map.get(date)>0) {
                    List<Integer> temporary = new ArrayList<>();
                    for (int i : branch) {
                        temporary.add(i);
                    }
                    temporary.add(date);
                    if (sc(temporary, mate)) {
                        mate.add(temporary);
                    }
                }

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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _85_最大矩形_暴力扫描超时 {
    public static void main(String[] args) {
        char[][] matrix = new char[][]{
                new char[]{'0', '0', '1', '0'},
                new char[]{'1', '1', '1', '1'},
                new char[]{'1', '1', '1', '1'},
                new char[]{'1', '1', '1', '0'},
                new char[]{'1', '1', '0', '0'},
                new char[]{'1', '1', '1', '1'},
                new char[]{'1', '1', '1', '0'}
//                new char[]{'1', '0', '1', '0', '0'},
//                new char[]{'1', '0', '1', '1', '1'},
//                new char[]{'1', '1', '1', '1', '1'},
//                new char[]{'1', '0', '0', '1', '0'}
//                new char[]{'1','1','1','1','1','1','1','1'},
//                new char[]{'1','1','1','1','1','1','1','0'},
//                new char[]{'1','1','1','1','1','1','1','0'},
//                new char[]{'1','1','1','1','1','0','0','0'},
//                new char[]{'0','1','1','1','1','0','0','0'}
//                new char[]{'1', '0', '1', '1', '0', '1'},
//                new char[]{'1', '1', '1', '1', '1', '1'},
//                new char[]{'0', '1', '1', '0', '1', '1'},
//                new char[]{'1', '1', '1', '0', '1', '0'},
//                new char[]{'0', '1', '1', '1', '1', '1'},
//                new char[]{'1', '1', '0', '1', '1', '1'}
        };
        System.out.println(maximalRectangle(matrix));
    }

    public static int maximalRectangle(char[][] matrix) {

        int x = matrix.length;
        if (x == 0) {
            return 0;
        }
        int y = matrix[0].length;
        Set<String> set = new HashSet<>();
        List<int[]> areaSet = new ArrayList<>();
        int maxArea = 0;
        for (int i = 0; i < x; i++) {
            List<Integer>wz =new ArrayList<>();
            boolean flag = true;
            List<int[]> layer = new ArrayList<>();
            //单一层的判断
            for (int j = 0; j < y; j++) {
                if (matrix[i][j] == '1') {
                    flag = false;
                    int k;
                    for (k = j; matrix[i][k] == '1'; k++) {
                        if (k + 1 == y) {
                            k++;
                            break;
                        }
                    }
                    int[] oneArea = new int[3];
                    oneArea[0] = j;
                    oneArea[1] = k - 1;
                    //计算当前矩形一行面积
                    oneArea[2] = 0;
                    String s = j + "-" + (k - 1);
                    if (set.contains(s)) {
                    } else {
//                        System.out.println(set.toString()+"<-"+s);
//                        System.out.println("加入跟进第"+i+"层>"+oneArea[0]+"-"+oneArea[1]+"="+oneArea[2]);
                        set.add(s);
                        wz .add( areaSet.size());
                        areaSet.add(oneArea);

                    }
                    layer.add(oneArea);
                    j = k;
                }
            }
            //更新正在跟进的矩形集合的数据
            //暂时记录待回收的数据索引
            Set<Integer> remove = new HashSet<>();
            int w = 0;
            for (int[] N : layer) {
                int sz=0;
                int J = N[0];
                int K = N[1];
                int r = 0;
                for (; w < areaSet.size(); w++) {
                    int[] n = areaSet.get(w);
                    if (K < n[0]) {
                        break;
                    }
                    if (J <= n[0] && n[1] <= K) {
                        //可以继续跟进
                        n[2] += (n[1] - n[0] + 1);
                    } else if ((n[0] <= J && K < n[1]) || (n[0] < J && K <= n[1])) {
                        int t = n[2] / (n[1] - n[0] + 1);
                        System.out.println(wz.get(sz));
                        areaSet.get(wz.get(sz))[2] += (K - J + 1) * t;
                        maxArea = Math.max(maxArea, n[2]);
                        remove.add(r);
                    } else {
                        //矩形结束
                        maxArea = Math.max(maxArea, n[2]);
//                        System.out.println("需要结束"+n[0]+"-"+n[1]+"="+n[2]);
                        remove.add(r);
                    }
                    r++;
                }
                sz++;
            }

            if (!remove.isEmpty()) {
                //根据数据索引失效回收数据
                int p = 0;
                for (int R : remove) {
                    int[] n = areaSet.get(R - p);
                    String S = n[0] + "-" + n[1];
//                    System.out.println("删除["+S+"]");
                    set.remove(S);
                    areaSet.remove(R - p);
                    p++;
                }
            }

            if (flag) {
                //一整层没有 1
                if (!areaSet.isEmpty()) {
                    for (int[] n : areaSet) {
                        //结束所有矩形
                        maxArea = Math.max(maxArea, n[2]);
                    }
                }
                areaSet.clear();
                set.clear();
            }
        }

        if (!areaSet.isEmpty()) {
            for (int[] n : areaSet) {
                //数组结束，结束所有矩形
                maxArea = Math.max(maxArea, n[2]);
            }
        }
        return maxArea;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _56_合并区间 {
    public static void main(String[] args){
        int[][] intervals=new int[][]{
          new int[]{1,4},
          new int[]{0,5},
        };
        int[][] m=merge(intervals);

        for (int[] a: m){
            System.out.println(Arrays.toString(a));
        }

    }
    public static int[][] merge(int[][] intervals) {
        List<int[]> jg=new ArrayList<>();
        boolean[] flags=new boolean[intervals.length];

        for (int j=0;j<intervals.length;j++ ) {
            if (flags[j]){
                continue;
            }
            int[] one = new int[2];
            one = intervals[j];
            boolean flag = false;
            while (!flag) {
                flag = true;
                for (int i = 0; i < intervals.length; i++) {
                    if (!flags[i]) {
                        //左拓展
                        if (intervals[i][0] <= one[0] && intervals[i][1] <= one[1] && intervals[i][1] >= one[0]) {
                            one[0] = intervals[i][0];
                            flag = false;
                            flags[i] = true;
                        }
                        //右拓展
                        if (intervals[i][1] >= one[1] && intervals[i][0] >= one[0] && intervals[i][0] <= one[1]) {
                            one[1] = intervals[i][1];
                            flag = false;
                            flags[i] = true;
                        }
                        //被包含
                        if (intervals[i][0] <= one[0]&&intervals[i][1] >= one[1]){
                            one[0] = intervals[i][0];
                            one[1] = intervals[i][1];
                            flag = false;
                            flags[i] = true;
                        }
                        //包含
                        if (intervals[i][0] >= one[0]&&intervals[i][1] <= one[1]){
                            flags[i] = true;
                        }
                    }
                }
            }
            jg.add(one);
        }
        return  jg.toArray(new int[jg.size()][2]);
    }
}
